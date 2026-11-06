package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = Collections.newSetFromMap(new ConcurrentHashMap());
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        super(false);
        fileDescriptor.getClass();
        this.fileDescriptor = fileDescriptor;
        this.offset = j;
        this.length = j2;
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j) {
        try {
            Os.lseek(fileDescriptor, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new DataSourceException(e, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new DataSourceException(e, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        long j;
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j2 = this.length;
            if (j2 != -1 && dataSpec.position > j2) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j3 = this.length;
            if (j3 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                    j = -1;
                } else {
                    j = size - channel.position();
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                j = j3 - dataSpec.position;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long j4 = dataSpec.length;
            if (j4 != -1) {
                if (j != -1) {
                    j4 = Math.min(j, j4);
                }
                this.bytesRemaining = j4;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j5 = dataSpec.length;
            return j5 != -1 ? j5 : this.bytesRemaining;
        } catch (DataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new DataSourceException(e2, e2 instanceof FileNotFoundException ? PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int read = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - read;
            }
            bytesTransferred(read);
            return read;
        } catch (IOException e) {
            throw new DataSourceException(e, 2000);
        }
    }
}

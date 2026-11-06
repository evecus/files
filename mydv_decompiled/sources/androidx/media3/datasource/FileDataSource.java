package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import defpackage.r7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements DataSource.Factory {
        private TransferListener listener;

        @Override // androidx.media3.datasource.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }

        public Factory setListener(TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) {
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e.getCause() instanceof ErrnoException) || ((ErrnoException) e.getCause()).errno != OsConstants.EACCES) {
                    i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
                }
                throw new FileDataSourceException(e, i);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder F = r7.F("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            F.append(fragment);
            throw new FileDataSourceException(F.toString(), e, 1004);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.file = null;
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
        Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        RandomAccessFile openLocalFile = openLocalFile(uri);
        this.file = openLocalFile;
        try {
            openLocalFile.seek(dataSpec.position);
            long j = dataSpec.length;
            if (j == -1) {
                j = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = j;
            if (j < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i, (int) Math.min(this.bytesRemaining, i2));
            if (read > 0) {
                this.bytesRemaining -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }
}

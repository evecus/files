package androidx.media3.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AtomicFile {
    private static final String TAG = "AtomicFile";
    private final File backupName;
    private final File baseName;

    public AtomicFile(File file) {
        this.baseName = file;
        this.backupName = new File(file.getPath() + ".bak");
    }

    private void restoreBackup() {
        if (this.backupName.exists()) {
            this.baseName.delete();
            this.backupName.renameTo(this.baseName);
        }
    }

    public void delete() {
        this.baseName.delete();
        this.backupName.delete();
    }

    public void endWrite(OutputStream outputStream) {
        outputStream.close();
        this.backupName.delete();
    }

    public boolean exists() {
        return this.baseName.exists() || this.backupName.exists();
    }

    public InputStream openRead() {
        restoreBackup();
        return new FileInputStream(this.baseName);
    }

    public OutputStream startWrite() {
        if (this.baseName.exists()) {
            boolean exists = this.backupName.exists();
            File file = this.baseName;
            if (exists) {
                file.delete();
            } else if (!file.renameTo(this.backupName)) {
                Log.w(TAG, "Couldn't rename file " + this.baseName + " to backup file " + this.backupName);
            }
        }
        try {
            return new AtomicFileOutputStream(this.baseName);
        } catch (FileNotFoundException e) {
            File parentFile = this.baseName.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.baseName, e);
            }
            try {
                return new AtomicFileOutputStream(this.baseName);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.baseName, e2);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class AtomicFileOutputStream extends OutputStream {
        private boolean closed = false;
        private final FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(File file) {
            this.fileOutputStream = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            flush();
            try {
                this.fileOutputStream.getFD().sync();
            } catch (IOException e) {
                Log.w(AtomicFile.TAG, "Failed to sync file descriptor:", e);
            }
            this.fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.fileOutputStream.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.fileOutputStream.write(bArr, i, i2);
        }
    }
}

package coil3.decode;

import coil3.decode.ImageSource;
import coil3.util.UtilsKt;
import defpackage.ke1;
import defpackage.mz;
import defpackage.ok3;
import defpackage.s04;
import defpackage.sv2;
import defpackage.zy;
import java.io.Closeable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileImageSource implements ImageSource {
    private final AutoCloseable closeable;
    private final String diskCacheKey;
    private final ok3 file;
    private final ke1 fileSystem;
    private boolean isClosed;
    private final Object lock = new Object();
    private final ImageSource.Metadata metadata;
    private mz source;

    public FileImageSource(ok3 ok3Var, ke1 ke1Var, String str, AutoCloseable autoCloseable, ImageSource.Metadata metadata) {
        this.file = ok3Var;
        this.fileSystem = ke1Var;
        this.diskCacheKey = str;
        this.closeable = autoCloseable;
        this.metadata = metadata;
    }

    private final void assertNotClosed() {
        if (this.isClosed) {
            zy.i("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                mz mzVar = this.source;
                if (mzVar != null) {
                    UtilsKt.closeQuietly((Closeable) mzVar);
                }
                AutoCloseable autoCloseable = this.closeable;
                if (autoCloseable != null) {
                    UtilsKt.closeQuietly(autoCloseable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil3.decode.ImageSource
    public ok3 file() {
        ok3 ok3Var;
        synchronized (this.lock) {
            assertNotClosed();
            ok3Var = this.file;
        }
        return ok3Var;
    }

    @Override // coil3.decode.ImageSource
    public ok3 fileOrNull() {
        return file();
    }

    public final String getDiskCacheKey$io_coil_kt_coil3_coil_core() {
        return this.diskCacheKey;
    }

    public final ok3 getFile$io_coil_kt_coil3_coil_core() {
        return this.file;
    }

    @Override // coil3.decode.ImageSource
    public ke1 getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.decode.ImageSource
    public ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    @Override // coil3.decode.ImageSource
    public mz source() {
        synchronized (this.lock) {
            assertNotClosed();
            mz mzVar = this.source;
            if (mzVar != null) {
                return mzVar;
            }
            s04 m = sv2.m(getFileSystem().source(this.file));
            this.source = m;
            return m;
        }
    }

    @Override // coil3.decode.ImageSource
    public mz sourceOrNull() {
        mz mzVar;
        synchronized (this.lock) {
            assertNotClosed();
            mzVar = this.source;
        }
        return mzVar;
    }
}

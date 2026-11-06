package coil3.decode;

import coil3.decode.ImageSource;
import coil3.util.FileSystemsKt;
import coil3.util.UtilsKt;
import defpackage.ke1;
import defpackage.mz;
import defpackage.ok3;
import defpackage.q04;
import defpackage.s04;
import defpackage.sv2;
import defpackage.zy;
import java.io.Closeable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SourceImageSource implements ImageSource {
    private ok3 file;
    private final ke1 fileSystem;
    private boolean isClosed;
    private final Object lock = new Object();
    private final ImageSource.Metadata metadata;
    private mz source;

    public SourceImageSource(mz mzVar, ke1 ke1Var, ImageSource.Metadata metadata) {
        this.fileSystem = ke1Var;
        this.metadata = metadata;
        this.source = mzVar;
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
                ok3 ok3Var = this.file;
                if (ok3Var != null) {
                    getFileSystem().delete(ok3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil3.decode.ImageSource
    public ok3 file() {
        Throwable th;
        synchronized (this.lock) {
            assertNotClosed();
            ok3 ok3Var = this.file;
            if (ok3Var != null) {
                return ok3Var;
            }
            ok3 createTempFile = FileSystemsKt.createTempFile(getFileSystem());
            q04 l = sv2.l(getFileSystem().sink(createTempFile, false));
            try {
                mz mzVar = this.source;
                mzVar.getClass();
                l.q(mzVar);
                try {
                    l.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    l.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            this.source = null;
            this.file = createTempFile;
            return createTempFile;
        }
    }

    @Override // coil3.decode.ImageSource
    public ok3 fileOrNull() {
        ok3 ok3Var;
        synchronized (this.lock) {
            assertNotClosed();
            ok3Var = this.file;
        }
        return ok3Var;
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
            ke1 fileSystem = getFileSystem();
            ok3 ok3Var = this.file;
            ok3Var.getClass();
            s04 m = sv2.m(fileSystem.source(ok3Var));
            this.source = m;
            return m;
        }
    }

    @Override // coil3.decode.ImageSource
    public mz sourceOrNull() {
        return source();
    }
}

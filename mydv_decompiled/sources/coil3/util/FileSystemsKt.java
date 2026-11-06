package coil3.util;

import defpackage.b4;
import defpackage.eg5;
import defpackage.f04;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.li4;
import defpackage.ok3;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileSystemsKt {
    public static final void createFile(ke1 ke1Var, ok3 ok3Var, boolean z) {
        if (z) {
            UtilsKt.closeQuietly((Closeable) ke1Var.sink(ok3Var, true));
        } else {
            if (ke1Var.exists(ok3Var)) {
                return;
            }
            UtilsKt.closeQuietly((Closeable) ke1Var.sink(ok3Var));
        }
    }

    public static /* synthetic */ void createFile$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        createFile(ke1Var, ok3Var, z);
    }

    public static final ok3 createTempFile(ke1 ke1Var) {
        ok3 f;
        do {
            ok3 ok3Var = ke1.SYSTEM_TEMPORARY_DIRECTORY;
            b4 b4Var = f04.I;
            f = ok3Var.f("tmp_".concat(li4.t(10, eg5.B())));
        } while (ke1Var.exists(f));
        createFile(ke1Var, f, true);
        return f;
    }

    public static final void deleteContents(ke1 ke1Var, ok3 ok3Var) {
        try {
            IOException iOException = null;
            for (ok3 ok3Var2 : ke1Var.list(ok3Var)) {
                try {
                    if (ke1Var.metadata(ok3Var2).b) {
                        deleteContents(ke1Var, ok3Var2);
                    }
                    ke1Var.delete(ok3Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String getExtension(ok3 ok3Var) {
        return jx4.b0('.', ok3Var.b(), "");
    }
}

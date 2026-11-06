package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class q72 extends ke1 {
    public static ArrayList e(ok3 ok3Var, boolean z) {
        File file = ok3Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
            }
            zl1.g(r7.y(ok3Var, "failed to list "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(ok3Var.f(str));
        }
        t70.G0(arrayList);
        return arrayList;
    }

    @Override // defpackage.ke1
    public void createDirectory(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        if (ok3Var.toFile().mkdir()) {
            return;
        }
        he1 metadataOrNull = metadataOrNull(ok3Var);
        if (metadataOrNull == null || !metadataOrNull.b) {
            zl1.g(r7.y(ok3Var, "failed to create directory: "));
        } else if (z) {
            zy.f(ok3Var, " already exists.");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

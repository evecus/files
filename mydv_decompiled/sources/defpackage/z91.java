package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class z91 {
    public static final String a = fr2.h("EnqueueRunnable");

    public static void a(gx5 gx5Var) {
        boolean z;
        ux5 ux5Var = gx5Var.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(gx5Var.e);
        HashSet b = gx5.b(gx5Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(gx5Var.e);
                z = false;
                break;
            } else if (b.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            zy.l(gx5Var, ")", "WorkContinuation has cycles (");
            return;
        }
        WorkDatabase workDatabase = ux5Var.c;
        uf0 uf0Var = ux5Var.b;
        workDatabase.b();
        try {
            e41.x(workDatabase, uf0Var, gx5Var);
            boolean b2 = b(gx5Var);
            workDatabase.p();
            if (b2) {
                pa4.b(uf0Var, ux5Var.c, ux5Var.e);
            }
        } finally {
            workDatabase.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.gx5 r26) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z91.b(gx5):boolean");
    }
}

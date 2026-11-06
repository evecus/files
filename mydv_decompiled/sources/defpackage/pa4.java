package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class pa4 {
    public static final String a = fr2.h("Schedulers");

    public static void a(oy5 oy5Var, j81 j81Var, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oy5Var.g(((ky5) it.next()).a, currentTimeMillis);
            }
        }
    }

    public static void b(uf0 uf0Var, WorkDatabase workDatabase, List list) {
        List list2;
        if (list == null || list.size() == 0) {
            return;
        }
        oy5 w = workDatabase.w();
        workDatabase.b();
        try {
            byte b = 1;
            if (Build.VERSION.SDK_INT >= 24) {
                list2 = (List) g4.V(w.a, true, false, new m45((byte) 28));
                a(w, uf0Var.d, list2);
            } else {
                list2 = null;
            }
            List list3 = (List) g4.V(w.a, true, false, new ia((byte) 10, uf0Var.f));
            a(w, uf0Var.d, list3);
            if (list2 != null) {
                list3.addAll(list2);
            }
            List list4 = (List) g4.V(w.a, true, false, new ny5(b));
            workDatabase.p();
            workDatabase.l();
            if (list3.size() > 0) {
                ky5[] ky5VarArr = (ky5[]) list3.toArray(new ky5[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    na4 na4Var = (na4) it.next();
                    if (na4Var.c()) {
                        na4Var.e(ky5VarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                ky5[] ky5VarArr2 = (ky5[]) list4.toArray(new ky5[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    na4 na4Var2 = (na4) it2.next();
                    if (!na4Var2.c()) {
                        na4Var2.e(ky5VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}

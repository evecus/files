package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nd0 extends RuntimeException {
    public final e43 I;
    public final e43 J;
    public final m22 K;
    public final int L;

    public nd0(e43 e43Var, e43 e43Var2, m22 m22Var, int i, Exception exc) {
        super(exc);
        this.I = e43Var;
        this.J = e43Var2;
        this.K = m22Var;
        this.L = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        pj4 n = oh4.n(new md0(this, null));
        if (n.hasNext()) {
            Object next = n.next();
            if (n.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (n.hasNext()) {
                    arrayList.add(n.next());
                }
                list = arrayList;
            } else {
                list = p70.j0(next);
            }
        } else {
            list = o91.I;
        }
        return kx4.q("\n            |Failed to execute op number " + this.L + ":\n            |" + o70.Z0(o70.m1(50, list), "\n", null, null, 0, null, 62) + "\n            ");
    }
}

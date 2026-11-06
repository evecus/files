package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@t83("dialog")
/* loaded from: classes.dex */
public final class sw0 extends u83 {
    @Override // defpackage.u83
    public final i73 a() {
        tc0 tc0Var = ad0.a;
        return new rw0(this);
    }

    @Override // defpackage.u83
    public final void d(List list, d83 d83Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((p63) it.next());
        }
    }

    @Override // defpackage.u83
    public final void e(p63 p63Var, boolean z) {
        b().e(p63Var, z);
        int W0 = o70.W0((Iterable) ((fw4) b().f.I).getValue(), p63Var);
        int i = 0;
        for (Object obj : (Iterable) ((fw4) b().f.I).getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            p63 p63Var2 = (p63) obj;
            if (i > W0) {
                b().c(p63Var2);
            }
            i = i2;
        }
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@t83("composable")
/* loaded from: classes.dex */
public final class jd0 extends u83 {
    public final jk3 c = ad4.w(Boolean.FALSE);

    @Override // defpackage.u83
    public final i73 a() {
        return new id0(this, wc0.a);
    }

    @Override // defpackage.u83
    public final void d(List list, d83 d83Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p63 p63Var = (p63) it.next();
            w63 b = b();
            w43 w43Var = b.e.I;
            p63Var.getClass();
            fw4 fw4Var = b.c;
            Iterable iterable = (Iterable) fw4Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((p63) it2.next()) == p63Var) {
                        Iterable iterable2 = (Iterable) ((fw4) w43Var).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((p63) it3.next()) == p63Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            p63 p63Var2 = (p63) o70.b1((List) ((fw4) w43Var).getValue());
            if (p63Var2 != null) {
                fw4Var.i(null, zk4.v((Set) fw4Var.getValue(), p63Var2));
            }
            fw4Var.i(null, zk4.v((Set) fw4Var.getValue(), p63Var));
            b.f(p63Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.u83
    public final void e(p63 p63Var, boolean z) {
        b().e(p63Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(p63 p63Var) {
        w63 b = b();
        p63Var.getClass();
        fw4 fw4Var = b.c;
        fw4Var.i(null, zk4.v((Set) fw4Var.getValue(), p63Var));
        a73 a73Var = b.h.b;
        a73Var.getClass();
        if (a73Var.f.contains(p63Var)) {
            p63Var.a(ki2.L);
        } else {
            zy.i("Cannot transition entry that is not in the back stack");
        }
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class u83 {
    public w63 a;
    public boolean b;

    public abstract i73 a();

    public final w63 b() {
        w63 w63Var = this.a;
        if (w63Var != null) {
            return w63Var;
        }
        zy.i("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, d83 d83Var) {
        Iterator it = new se1(new ep1(new v70(list, (byte) 0), new tf2(this, d83Var, (byte) 14)), new yv3((byte) 19), (byte) 0).iterator();
        while (true) {
            re1 re1Var = (re1) it;
            if (!re1Var.hasNext()) {
                return;
            }
            b().f((p63) re1Var.next());
        }
    }

    public void e(p63 p63Var, boolean z) {
        List list = (List) ((fw4) b().e.I).getValue();
        if (!list.contains(p63Var)) {
            s83.n("popBackStack was called with ", p63Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        p63 p63Var2 = null;
        while (f()) {
            p63Var2 = (p63) listIterator.previous();
            if (j42.c(p63Var2, p63Var)) {
                break;
            }
        }
        if (p63Var2 != null) {
            b().d(p63Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public i73 c(i73 i73Var) {
        return i73Var;
    }
}

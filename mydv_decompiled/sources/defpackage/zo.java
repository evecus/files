package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zo extends k1 {
    @Override // defpackage.ap
    public final void a(int i, Object obj) {
    }

    @Override // defpackage.ap
    public final void d(int i, int i2, int i3) {
        ArrayList m = m();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = m.subList(i, i3 + i);
            ArrayList s1 = o70.s1(subList);
            subList.clear();
            m.addAll(i4, s1);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            m.set(i, m.set(i2, m.get(i)));
        } else {
            m.add(i4, m.remove(i));
        }
    }

    @Override // defpackage.ap
    public final void f(int i, int i2) {
        ArrayList m = m();
        if (i2 == 1) {
            m.remove(i);
        } else {
            m.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.ap
    public final void h(int i, Object obj) {
        k71 k71Var = (k71) obj;
        Object obj2 = this.c;
        obj2.getClass();
        int i2 = ((v71) obj2).a;
        if (i2 > 0) {
            if (k71Var instanceof v71) {
                ((v71) k71Var).a = i2 - 1;
            }
            m().add(i, k71Var);
            return;
        }
        Object obj3 = this.a;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((v71) obj3).a).toString());
    }

    public final ArrayList m() {
        k71 k71Var = (k71) this.c;
        if (k71Var instanceof v71) {
            return ((v71) k71Var).b;
        }
        zy.i("Current node cannot accept children");
        return null;
    }
}

package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ry1 extends tx1 {
    @Override // defpackage.ux1
    public final /* bridge */ /* synthetic */ ux1 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final sy1 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = sy1.K;
            return e34.R;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            sy1 n = sy1.n(i, objArr);
            this.b = n.size();
            this.c = true;
            return n;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = sy1.K;
        return new dq4(obj);
    }
}

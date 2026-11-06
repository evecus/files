package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hd2 extends d1 {
    public final dd2 c;
    public final pe2 d;
    public final int e;
    public final /* synthetic */ pe2 f;
    public final /* synthetic */ wd2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd2(dd2 dd2Var, pe2 pe2Var, int i, wd2 wd2Var, int i2, int i3, long j) {
        super((byte) 3);
        this.f = pe2Var;
        this.g = wd2Var;
        this.h = i2;
        this.i = i3;
        this.j = j;
        this.c = dd2Var;
        this.d = pe2Var;
        this.e = i;
    }

    public final md2 o(int i, int i2, int i3, long j, int i4) {
        int i5;
        dd2 dd2Var = this.c;
        Object c = dd2Var.c(i);
        Object u = dd2Var.b.u(i);
        List l = l(this.d, i, j);
        if (dh0.f(j)) {
            i5 = dh0.j(j);
        } else {
            if (!dh0.e(j)) {
                t02.a("does not have fixed height");
            }
            i5 = dh0.i(j);
        }
        da2 layoutDirection = this.f.J.getLayoutDirection();
        ie2 ie2Var = this.g.m;
        return new md2(i, c, i5, i4, layoutDirection, this.h, this.i, l, this.j, u, ie2Var, j, i2, i3);
    }
}

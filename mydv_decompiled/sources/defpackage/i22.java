package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i22 extends ht3 {
    public static final i22 c = new i22(x22.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        g22 g22Var = (g22) obj;
        g22Var.getClass();
        g22Var.e(le0Var.o(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new g22(iArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        me0Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).A(this.b, i2, iArr[i2]);
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i50 extends ht3 {
    public static final i50 c = new i50(w50.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        g50 g50Var = (g50) obj;
        g50Var.getClass();
        g50Var.e(le0Var.i(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new g50(cArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        me0Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).v(this.b, i2, cArr[i2]);
        }
    }
}

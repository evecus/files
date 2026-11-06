package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sy0 extends ht3 {
    public static final sy0 c = new sy0(xy0.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        qy0 qy0Var = (qy0) obj;
        qy0Var.getClass();
        qy0Var.e(le0Var.z(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return new qy0(dArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        me0Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).w(this.b, i2, dArr[i2]);
        }
    }
}

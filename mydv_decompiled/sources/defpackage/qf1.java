package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qf1 extends ht3 {
    public static final qf1 c = new qf1(tf1.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        of1 of1Var = (of1) obj;
        of1Var.getClass();
        of1Var.e(le0Var.j(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new of1(fArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        me0Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).y(this.b, i2, fArr[i2]);
        }
    }
}

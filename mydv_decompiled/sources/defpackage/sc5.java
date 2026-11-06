package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sc5 extends ht3 {
    public static final sc5 c = new sc5(tc5.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        return ((qc5) obj).I.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        rc5 rc5Var = (rc5) obj;
        rc5Var.getClass();
        rc5Var.e(le0Var.d(this.b, i).B());
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        return new rc5(((qc5) obj).I);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new qc5(new byte[0]);
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        byte[] bArr = ((qc5) obj).I;
        me0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).z(this.b, i2).g(bArr[i2]);
        }
    }
}

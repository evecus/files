package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class un4 extends ht3 {
    public static final un4 c = new un4(vn4.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        tn4 tn4Var = (tn4) obj;
        tn4Var.getClass();
        tn4Var.e(le0Var.n(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new tn4(sArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        me0Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).D(this.b, i2, sArr[i2]);
        }
    }
}

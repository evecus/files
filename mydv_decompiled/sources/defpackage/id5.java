package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class id5 extends ht3 {
    public static final id5 c = new id5(jd5.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        return ((gd5) obj).I.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        hd5 hd5Var = (hd5) obj;
        hd5Var.getClass();
        hd5Var.e(le0Var.d(this.b, i).C());
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        return new hd5(((gd5) obj).I);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new gd5(new short[0]);
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        short[] sArr = ((gd5) obj).I;
        me0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).z(this.b, i2).f(sArr[i2]);
        }
    }
}

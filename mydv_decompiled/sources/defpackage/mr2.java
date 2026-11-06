package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mr2 extends ht3 {
    public static final mr2 c = new mr2(zr2.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        kr2 kr2Var = (kr2) obj;
        kr2Var.getClass();
        kr2Var.e(le0Var.h(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return new kr2(jArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        me0Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).B(this.b, i2, jArr[i2]);
        }
    }
}

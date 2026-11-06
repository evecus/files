package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xz extends ht3 {
    public static final xz c = new xz(zz.a);

    @Override // defpackage.x1
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.m70, defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        wz wzVar = (wz) obj;
        wzVar.getClass();
        wzVar.e(le0Var.l(this.b, i));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new wz(bArr);
    }

    @Override // defpackage.ht3
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.ht3
    public final void k(me0 me0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        me0Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).u(this.b, i2, bArr[i2]);
        }
    }
}

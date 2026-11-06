package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ky0 implements zf1 {
    public final zf1 I;

    public ky0(zf1 zf1Var) {
        this.I = zf1Var;
    }

    @Override // defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        r24 r24Var = new r24();
        r24Var.I = p70.x;
        Object collect = this.I.collect(new jy0(this, r24Var, ag1Var), fj0Var);
        return collect == el0.I ? collect : wd5.a;
    }
}

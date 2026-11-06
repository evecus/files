package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ue3 extends k13 implements cx2 {
    public tm1 I;
    public long J;

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return true;
    }

    @Override // defpackage.cx2
    public final void i(long j) {
        if (z22.b(this.J, j)) {
            return;
        }
        this.I.invoke(new z22(j));
        this.J = j;
    }
}

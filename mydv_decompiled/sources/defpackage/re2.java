package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class re2 implements cw4 {
    public final byte I;
    public final short J;
    public final jk3 K;
    public int L;

    /* JADX WARN: Multi-variable type inference failed */
    public re2(int i, int i2, int i3) {
        this.I = i2;
        this.J = i3;
        int i4 = (i / i2) * i2;
        this.K = new jk3(ut0.c0(Math.max(i4 - i3, 0), i4 + i2 + i3), q8.B0);
        this.L = i;
    }

    public final void c(int i) {
        if (i != this.L) {
            this.L = i;
            byte b = this.I;
            int i2 = (i / b) * b;
            short s = this.J;
            this.K.setValue(ut0.c0(Math.max(i2 - s, 0), i2 + b + s));
        }
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return (u22) this.K.getValue();
    }
}

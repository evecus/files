package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v81 implements u81 {
    public final int I;
    public int J = -1;
    public int K = -1;

    public v81(int i) {
        this.I = i;
    }

    @Override // defpackage.u81
    public final boolean h(CharSequence charSequence, int i, int i2, ec5 ec5Var) {
        int i3 = this.I;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.J = i;
        this.K = i2;
        return false;
    }

    @Override // defpackage.u81
    public final Object b() {
        return this;
    }
}

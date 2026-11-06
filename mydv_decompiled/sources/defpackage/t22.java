package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t22 extends l22 {
    public final int I;
    public final int J;
    public boolean K;
    public int L;

    public t22(int i, int i2, int i3) {
        this.I = i3;
        this.J = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.K = z;
        this.L = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K;
    }

    @Override // defpackage.l22
    public final int nextInt() {
        int i = this.L;
        if (i != this.J) {
            this.L = this.I + i;
            return i;
        }
        if (this.K) {
            this.K = false;
            return i;
        }
        zy.k();
        return 0;
    }
}

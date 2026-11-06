package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a16 extends f04 implements Serializable {
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;

    @Override // defpackage.f04
    public final int a(int i) {
        return (b() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.f04
    public final int b() {
        int i = this.J;
        int i2 = i ^ (i >>> 2);
        this.J = this.K;
        this.K = this.L;
        this.L = this.M;
        int i3 = this.N;
        this.M = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.N = i4;
        int i5 = this.O + 362437;
        this.O = i5;
        return i4 + i5;
    }
}

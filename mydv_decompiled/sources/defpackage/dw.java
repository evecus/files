package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dw extends rj3 {
    public final tw1 I;
    public final long J;
    public int K = 1;
    public final long L;
    public float M;
    public c80 N;

    public dw(tw1 tw1Var, long j) {
        int i;
        this.I = tw1Var;
        this.J = j;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0) {
            dd ddVar = (dd) tw1Var;
            if (i2 <= ddVar.a.getWidth() && i <= ddVar.a.getHeight()) {
                this.L = j;
                this.M = 1.0f;
                return;
            }
        }
        s83.t("Failed requirement.");
        throw null;
    }

    @Override // defpackage.rj3
    public final boolean applyAlpha(float f) {
        this.M = f;
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyColorFilter(c80 c80Var) {
        this.N = c80Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return j42.c(this.I, dwVar.I) && r22.a(0L, 0L) && z22.b(this.J, dwVar.J) && this.K == dwVar.K;
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo43getIntrinsicSizeNHjbRc() {
        return ut0.b0(this.L);
    }

    public final int hashCode() {
        return ((i82.Q(this.J) + ((i82.Q(0L) + (this.I.hashCode() * 31)) * 31)) * 31) + this.K;
    }

    @Override // defpackage.rj3
    public final void onDraw(y31 y31Var) {
        r7.h(y31Var, this.I, 0L, this.J, 0L, (Math.round(Float.intBitsToFloat((int) (y31Var.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (y31Var.c() & 4294967295L))) & 4294967295L), this.M, this.N, this.K, 328);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.I + ", srcOffset=" + r22.d(0L) + ", srcSize=" + z22.c(this.J) + ", filterQuality=" + qe1.a(this.K) + ")";
    }
}

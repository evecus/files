package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hh5 extends yg5 {
    public final yr1 b;
    public String c;
    public boolean d;
    public final s31 e;
    public rm1 f;
    public final jk3 g;
    public hw h;
    public final jk3 i;
    public long j;
    public float k;
    public float l;
    public final gh5 m;

    public hh5(yr1 yr1Var) {
        this.b = yr1Var;
        yr1Var.i = new gh5(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new s31();
        this.f = new tg5((byte) 1);
        this.g = ad4.w(null);
        this.i = ad4.w(new fq4(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new gh5(this, (byte) 1);
    }

    @Override // defpackage.yg5
    public final void a(y31 y31Var) {
        e(y31Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.y31 r37, float r38, defpackage.c80 r39) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh5.e(y31, float, c80):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        jk3 jk3Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((fq4) jk3Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((fq4) jk3Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}

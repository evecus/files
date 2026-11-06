package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xz4 extends yz4 {
    public final om1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz4(hm1 hm1Var, String str) {
        super(hm1Var, str);
        hm1Var.getClass();
        str.getClass();
        this.L = hm1Var.n(str);
    }

    @Override // defpackage.q84
    public final String H(int i) {
        e();
        lq2.l0(21, "no row");
        throw null;
    }

    @Override // defpackage.q84
    public final boolean T() {
        e();
        this.L.J.execute();
        return false;
    }

    @Override // defpackage.q84
    public final void b(int i, long j) {
        e();
        this.L.b(i, j);
    }

    @Override // defpackage.q84
    public final void c(int i, byte[] bArr) {
        e();
        this.L.c(i, bArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.L.close();
        this.K = true;
    }

    @Override // defpackage.q84
    public final void d(int i) {
        e();
        this.L.d(i);
    }

    @Override // defpackage.q84
    public final byte[] getBlob(int i) {
        e();
        lq2.l0(21, "no row");
        throw null;
    }

    @Override // defpackage.q84
    public final int getColumnCount() {
        e();
        return 0;
    }

    @Override // defpackage.q84
    public final String getColumnName(int i) {
        e();
        lq2.l0(21, "no row");
        throw null;
    }

    @Override // defpackage.q84
    public final long getLong(int i) {
        e();
        lq2.l0(21, "no row");
        throw null;
    }

    @Override // defpackage.q84
    public final boolean isNull(int i) {
        e();
        lq2.l0(21, "no row");
        throw null;
    }

    @Override // defpackage.q84
    public final void v(int i, String str) {
        str.getClass();
        e();
        this.L.j(i, str);
    }

    @Override // defpackage.q84
    public final void reset() {
    }
}

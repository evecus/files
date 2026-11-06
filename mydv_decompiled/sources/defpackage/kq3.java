package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kq3 implements q84 {
    public final q84 I;
    public final long J;
    public final /* synthetic */ rq3 K;

    public kq3(rq3 rq3Var, q84 q84Var) {
        q84Var.getClass();
        this.K = rq3Var;
        this.I = q84Var;
        this.J = hc4.t();
    }

    @Override // defpackage.q84
    public final String H(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.H(i);
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final boolean T() {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.T();
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final void b(int i, long j) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.b(i, j);
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final void c(int i, byte[] bArr) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.c(i, bArr);
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.close();
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final void d(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.d(i);
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final byte[] getBlob(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.getBlob(i);
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final int getColumnCount() {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.getColumnCount();
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final String getColumnName(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.getColumnName(i);
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final long getLong(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.getLong(i);
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final boolean isNull(int i) {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            return this.I.isNull(i);
        }
        lq2.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.q84
    public final void reset() {
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.reset();
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final void v(int i, String str) {
        str.getClass();
        if (this.K.d.get()) {
            lq2.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.J == hc4.t()) {
            this.I.v(i, str);
        } else {
            lq2.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final boolean x() {
        return getLong(0) != 0;
    }
}

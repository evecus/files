package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class hl1 implements ut4 {
    private final ut4 delegate;

    public hl1(ut4 ut4Var) {
        ut4Var.getClass();
        this.delegate = ut4Var;
    }

    @su0
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final ut4 m198deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final ut4 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ut4
    public long read(cz czVar, long j) {
        czVar.getClass();
        return this.delegate.read(czVar, j);
    }

    @Override // defpackage.ut4
    public u75 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}

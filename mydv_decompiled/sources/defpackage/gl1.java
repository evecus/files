package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class gl1 implements eq4 {
    private final eq4 delegate;

    public gl1(eq4 eq4Var) {
        eq4Var.getClass();
        this.delegate = eq4Var;
    }

    @su0
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final eq4 m197deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final eq4 delegate() {
        return this.delegate;
    }

    @Override // defpackage.eq4, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // defpackage.eq4
    public u75 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.eq4
    public void write(cz czVar, long j) {
        czVar.getClass();
        this.delegate.write(czVar, j);
    }
}

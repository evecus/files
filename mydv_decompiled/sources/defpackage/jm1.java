package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jm1 extends RuntimeException {
    public final km1 I;
    public final Throwable J;

    public jm1(km1 km1Var, Throwable th) {
        super(th);
        this.I = km1Var;
        this.J = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.J;
    }
}

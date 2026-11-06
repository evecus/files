package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hs implements f10 {
    public final gs[] a;

    public hs(gs[] gsVarArr) {
        this.a = gsVarArr;
    }

    @Override // defpackage.f10
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (gs gsVar : this.a) {
            cy0 cy0Var = gsVar.N;
            if (cy0Var == null) {
                j42.g0("handle");
                throw null;
            }
            cy0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}

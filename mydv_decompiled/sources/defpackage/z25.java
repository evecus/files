package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z25 implements w25 {
    public final long I;
    public final /* synthetic */ a35 J;

    public z25(a35 a35Var, long j) {
        this.J = a35Var;
        this.I = j;
    }

    @Override // defpackage.w25
    public final v25 G() {
        return kb4.l(this.J);
    }

    @Override // defpackage.w25
    public final long a(ca2 ca2Var) {
        ca2 ca2Var2 = (ca2) this.J.L.getValue();
        if (ca2Var2 != null) {
            if (ca2Var2.h()) {
                return ca2Var.mo37screenToLocalMKHz9U(ca2Var2.mo36localToScreenMKHz9U(this.I));
            }
            return 0L;
        }
        t02.d("Tried to open context menu before the anchor was placed.");
        zy.n();
        return 0L;
    }

    @Override // defpackage.w25
    public final m14 d(ca2 ca2Var) {
        return sv2.g(a(ca2Var), 0L);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class bt extends z0 {
    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.Q(z, 49, this.I);
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        int i = z ? 4 : 3;
        for (e0 e0Var : this.I) {
            i += e0Var.d().q(true);
        }
        return i;
    }
}

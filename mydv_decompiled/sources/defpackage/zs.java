package defpackage;

/* loaded from: classes2.dex */
public final class zs extends x0 {
    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.Q(z, 48, this.I);
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        int i = z ? 4 : 3;
        int length = this.I.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.I[i2].d().q(true);
        }
        return i;
    }
}

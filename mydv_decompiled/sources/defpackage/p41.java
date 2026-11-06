package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p41 extends rj3 {
    public final dn4 I;
    public final g12 J;

    public p41(dn4 dn4Var, zm4 zm4Var, g12 g12Var) {
        this.I = dn4Var;
        this.J = g12Var;
    }

    @Override // defpackage.rj3
    public final boolean applyAlpha(float f) {
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyColorFilter(c80 c80Var) {
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyLayoutDirection(da2 da2Var) {
        return true;
    }

    @Override // defpackage.rj3
    public final void onDraw(y31 y31Var) {
        g12 g12Var = this.J;
        dn4 dn4Var = this.I;
        long c = y31Var.c();
        da2 layoutDirection = y31Var.getLayoutDirection();
        synchronized (g12Var) {
            ff ffVar = (ff) g12Var.K;
            if (ffVar == null) {
                ff ffVar2 = new ff(mw2.j, 0L, da2.I, 1.0f, null);
                g12Var.K = ffVar2;
                ffVar = ffVar2;
            }
            ffVar.a = dn4Var;
            ffVar.b = c;
            ffVar.c = layoutDirection;
            ffVar.d = y31Var.getDensity();
            throw null;
        }
    }
}

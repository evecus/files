package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v43 implements kw4 {
    public u43 I;

    public final void a(int i, boolean z) {
        ns4 h;
        int i2 = z ? i : 0;
        int i3 = ((u43) ws4.f(this.I)).c;
        int i4 = ((~i) & i3) | i2;
        if (i3 != i4) {
            u43 u43Var = this.I;
            synchronized (ws4.c) {
                h = ws4.h();
                ((u43) ws4.x(u43Var, this, h)).c = i4;
            }
            ws4.m(h, this);
        }
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.I;
    }

    @Override // defpackage.kw4
    public final mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        return null;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        this.I = (u43) mw4Var;
    }
}

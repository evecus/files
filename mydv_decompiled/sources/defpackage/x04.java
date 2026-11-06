package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x04 {
    public y04 a;
    public int b;
    public bo1 c;
    public hn1 d;
    public int e;
    public a43 f;
    public n43 g;

    public x04(y04 y04Var) {
        this.a = y04Var;
    }

    public final boolean a() {
        if (this.a != null) {
            bo1 bo1Var = this.c;
            if (bo1Var != null ? bo1Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final c52 b(Object obj) {
        c52 c;
        y04 y04Var = this.a;
        return (y04Var == null || (c = y04Var.c(this, obj)) == null) ? c52.I : c;
    }

    public final void c() {
        y04 y04Var = this.a;
        if (y04Var != null) {
            y04Var.a();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(hn1 hn1Var) {
        this.d = hn1Var;
    }
}

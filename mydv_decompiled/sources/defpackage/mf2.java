package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mf2 implements fe2 {
    public final ag2 a;

    public mf2(ag2 ag2Var) {
        this.a = ag2Var;
    }

    @Override // defpackage.fe2
    public final int a() {
        return this.a.h().o;
    }

    @Override // defpackage.fe2
    public final int b() {
        return Math.min(a() - 1, ((vf2) o70.a1(this.a.h().l)).a);
    }

    @Override // defpackage.fe2
    public final int c() {
        int i;
        ag2 ag2Var = this.a;
        if (ag2Var.h().l.isEmpty()) {
            return 0;
        }
        uf2 h = ag2Var.h();
        int g = (int) (h.p == pg3.I ? h.g() & 4294967295L : h.g() >> 32);
        int v0 = k21.v0(ag2Var.h());
        if (v0 != 0 && (i = g / v0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.fe2
    public final boolean d() {
        return !this.a.h().l.isEmpty();
    }

    @Override // defpackage.fe2
    public final int e() {
        return Math.max(0, ((gk3) this.a.e.b).h());
    }
}

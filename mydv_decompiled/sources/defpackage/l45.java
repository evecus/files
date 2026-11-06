package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l45 {
    public static final da g = sp0.Z(new fa4(24), new ol4(29));
    public final fk3 a;
    public final fk3 b = new fk3(0.0f);
    public final gk3 c = new gk3(0);
    public m14 d = m14.e;
    public long e = d65.b;
    public final jk3 f;

    public l45(pg3 pg3Var, float f) {
        this.a = new fk3(f);
        this.f = new jk3(pg3Var, q8.B0);
    }

    public final void a(pg3 pg3Var, m14 m14Var, int i, int i2) {
        float f = i2 - i;
        this.b.i(f);
        float f2 = m14Var.a;
        float f3 = m14Var.b;
        m14 m14Var2 = this.d;
        float f4 = m14Var2.a;
        fk3 fk3Var = this.a;
        if (f2 != f4 || f3 != m14Var2.b) {
            boolean z = pg3Var == pg3.I;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? m14Var.d : m14Var.c;
            float h = fk3Var.h();
            float f6 = i;
            float f7 = h + f6;
            fk3Var.i(fk3Var.h() + ((f5 <= f7 && (f2 >= h || f5 - f2 <= f6)) ? (f2 >= h || f5 - f2 > f6) ? 0.0f : f2 - h : f5 - f7));
            this.d = m14Var;
        }
        fk3Var.i(ut0.q(fk3Var.h(), 0.0f, f));
        this.c.i(i);
    }
}

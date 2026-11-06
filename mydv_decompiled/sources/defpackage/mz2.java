package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mz2 {
    public static mz2 h;
    public final da2 a;
    public final m65 b;
    public final lu0 c;
    public final kj1 d;
    public final m65 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public mz2(da2 da2Var, m65 m65Var, lu0 lu0Var, kj1 kj1Var) {
        this.a = da2Var;
        this.b = m65Var;
        this.c = lu0Var;
        this.d = kj1Var;
        this.e = ad4.z(m65Var, da2Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = nz2.a;
            m65 m65Var = this.e;
            o91 o91Var = o91.I;
            kj1 kj1Var = this.d;
            lu0 lu0Var = this.c;
            td tdVar = new td(new xd(str, m65Var, o91Var, o91Var, kj1Var, lu0Var, false), 1, 1, eh0.b(0, 0, 0, 0, 15));
            i3 = 1;
            float f3 = new td(new xd(nz2.b, m65Var, o91Var, o91Var, this.d, lu0Var, true), 2, 1, eh0.b(0, 0, 0, 0, 15)).f;
            float f4 = tdVar.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i3) {
            int round = Math.round((f2 * (i - 1)) + f);
            i2 = round >= 0 ? round : 0;
            int g = dh0.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = dh0.i(j);
        }
        return eh0.a(dh0.j(j), dh0.h(j), i2, dh0.g(j));
    }
}

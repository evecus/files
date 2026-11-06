package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qr4 {
    public final byte a;
    public final z60 b;
    public final fk3 c;
    public tm1 e;
    public final float[] g;
    public final gk3 h;
    public final gk3 i;
    public boolean j;
    public final jk3 k;
    public final gk3 l;
    public final gk3 m;
    public final pg3 n;
    public final jk3 o;
    public final iy3 p;
    public final fk3 q;
    public final fk3 r;
    public final pr4 s;
    public final k53 t;
    public final qr4 d = this;
    public final boolean f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public qr4(float f, int i, z60 z60Var) {
        float[] fArr;
        this.a = i;
        this.b = z60Var;
        this.c = new fk3(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = new gk3(0);
        this.i = new gk3(0);
        Boolean bool = Boolean.FALSE;
        this.k = ad4.w(bool);
        this.l = new gk3(0);
        this.m = new gk3(0);
        this.n = pg3.J;
        this.o = ad4.w(bool);
        this.p = new iy3(this, (byte) 8);
        z60 z60Var2 = this.b;
        float f2 = z60Var2.a;
        float f3 = z60Var2.b - f2;
        this.q = new fk3(vt0.G(0.0f, 0.0f, ut0.q(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.r = new fk3(0.0f);
        this.s = new pr4(this);
        this.t = new k53();
    }

    public final void a(float f) {
        float max;
        float min;
        if (c()) {
            float h = this.i.h();
            gk3 gk3Var = this.m;
            max = Math.max(h - (gk3Var.h() / 2.0f), 0.0f);
            min = Math.min(gk3Var.h() / 2.0f, max);
        } else {
            float h2 = this.h.h();
            gk3 gk3Var2 = this.l;
            max = Math.max(h2 - (gk3Var2.h() / 2.0f), 0.0f);
            min = Math.min(gk3Var2.h() / 2.0f, max);
        }
        fk3 fk3Var = this.q;
        float h3 = fk3Var.h() + f;
        fk3 fk3Var2 = this.r;
        fk3Var.i(fk3Var2.h() + h3);
        fk3Var2.i(0.0f);
        float f2 = or4.f(fk3Var.h(), min, max, this.g);
        z60 z60Var = this.b;
        float f3 = max - min;
        float G = vt0.G(z60Var.a, z60Var.b, ut0.q(f3 == 0.0f ? 0.0f : (f2 - min) / f3, 0.0f, 1.0f));
        if (G == this.c.h()) {
            return;
        }
        tm1 tm1Var = this.e;
        if (tm1Var != null) {
            tm1Var.invoke(Float.valueOf(G));
        } else {
            d(G);
        }
    }

    public final float b() {
        z60 z60Var = this.b;
        float f = z60Var.a;
        float f2 = z60Var.b;
        float q = ut0.q(this.c.h(), f, f2);
        float f3 = f2 - f;
        return ut0.q(f3 == 0.0f ? 0.0f : (q - f) / f3, 0.0f, 1.0f);
    }

    public final boolean c() {
        return this.n == pg3.I;
    }

    public final void d(float f) {
        if (this.f) {
            z60 z60Var = this.b;
            float f2 = z60Var.a;
            float f3 = z60Var.b;
            f = or4.f(ut0.q(f, f2, f3), f2, f3, this.g);
        }
        this.c.i(f);
    }
}

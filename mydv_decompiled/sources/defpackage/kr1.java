package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class kr1 extends q13 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final dn4 f;
    public final boolean g;
    public final long h;
    public final long i;
    public final w92 j;

    public kr1(float f, float f2, float f3, float f4, long j, dn4 dn4Var, boolean z, long j2, long j3, w92 w92Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = dn4Var;
        this.g = z;
        this.h = j2;
        this.i = j3;
        this.j = w92Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        hp4 hp4Var = new hp4();
        hp4Var.I = this.a;
        hp4Var.J = this.b;
        hp4Var.K = this.c;
        hp4Var.L = this.d;
        hp4Var.M = 8.0f;
        hp4Var.N = this.e;
        hp4Var.O = this.f;
        hp4Var.P = this.g;
        hp4Var.Q = this.h;
        hp4Var.R = this.i;
        hp4Var.S = (byte) 3;
        hp4Var.T = this.j;
        hp4Var.U = new i9(hp4Var, (byte) 25);
        return hp4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr1)) {
            return false;
        }
        kr1 kr1Var = (kr1) obj;
        if (Float.compare(this.a, kr1Var.a) != 0 || Float.compare(this.b, kr1Var.b) != 0 || Float.compare(this.c, kr1Var.c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.d, kr1Var.d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(8.0f, 8.0f) != 0 || !r95.a(this.e, kr1Var.e) || !j42.c(this.f, kr1Var.f) || this.g != kr1Var.g) {
            return false;
        }
        long j = kr1Var.h;
        int i = x70.h;
        return zc5.a(this.h, j) && zc5.a(this.i, kr1Var.i) && j42.c(this.j, kr1Var.j);
    }

    public final int hashCode() {
        int o = jp0.o(8.0f, jp0.o(0.0f, jp0.o(0.0f, jp0.o(0.0f, jp0.o(this.d, jp0.o(0.0f, jp0.o(0.0f, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = r95.c;
        int o2 = (pt1.o(this.g) + ((this.f.hashCode() + ((i82.Q(this.e) + o) * 31)) * 31)) * 961;
        int i2 = x70.h;
        return this.j.hashCode() + ((((i82.Q(this.i) + pt1.l(o2, 31, this.h)) * 961) + 3) * 961);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("graphicsLayer");
        z12Var.b().b(Float.valueOf(this.a), "scaleX");
        z12Var.b().b(Float.valueOf(this.b), "scaleY");
        z12Var.b().b(Float.valueOf(this.c), "alpha");
        fq b = z12Var.b();
        Float valueOf = Float.valueOf(0.0f);
        b.b(valueOf, "translationX");
        z12Var.b().b(valueOf, "translationY");
        z12Var.b().b(Float.valueOf(this.d), "shadowElevation");
        z12Var.b().b(valueOf, "rotationX");
        z12Var.b().b(valueOf, "rotationY");
        z12Var.b().b(valueOf, "rotationZ");
        z12Var.b().b(Float.valueOf(8.0f), "cameraDistance");
        z12Var.b().b(new r95(this.e), "transformOrigin");
        z12Var.b().b(this.f, "shape");
        z12Var.b().b(Boolean.valueOf(this.g), "clip");
        z12Var.b().b(null, "renderEffect");
        z12Var.b().b(new x70(this.h), "ambientShadowColor");
        z12Var.b().b(new x70(this.i), "spotShadowColor");
        z12Var.b().b(new pe0(), "compositingStrategy");
        z12Var.b().b(new gw(), "blendMode");
        z12Var.b().b(null, "colorFilter");
        z12Var.b().b(this.j, "outsets");
    }

    public final String toString() {
        String b = r95.b(this.e);
        String i = x70.i(this.h);
        String i2 = x70.i(this.i);
        String a = gw.a(3);
        StringBuilder B = hf1.B("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        B.append(this.c);
        B.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        B.append(this.d);
        B.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        B.append(b);
        B.append(", shape=");
        B.append(this.f);
        B.append(", clip=");
        B.append(this.g);
        B.append(", renderEffect=null, ambientShadowColor=");
        B.append(i);
        B.append(", spotShadowColor=");
        r7.N(B, i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", a, ", colorFilter=null, outsets=");
        B.append(this.j);
        B.append(")");
        return B.toString();
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        hp4 hp4Var = (hp4) k13Var;
        hp4Var.I = this.a;
        hp4Var.J = this.b;
        hp4Var.K = this.c;
        hp4Var.L = this.d;
        hp4Var.M = 8.0f;
        hp4Var.N = this.e;
        hp4Var.O = this.f;
        hp4Var.P = this.g;
        hp4Var.Q = this.h;
        hp4Var.R = this.i;
        hp4Var.S = (byte) 3;
        hp4Var.T = this.j;
        sp0.r0(hp4Var, hp4Var.U);
    }
}

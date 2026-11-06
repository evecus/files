package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bn4 extends q13 {
    public final float a;
    public final dn4 b;
    public final boolean c;
    public final long d;
    public final long e;

    public bn4(float f, dn4 dn4Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = dn4Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new kw(new tf2(this, (byte) 25));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn4)) {
            return false;
        }
        bn4 bn4Var = (bn4) obj;
        if (!r11.c(this.a, bn4Var.a) || !j42.c(this.b, bn4Var.b) || this.c != bn4Var.c) {
            return false;
        }
        long j = bn4Var.d;
        int i = x70.h;
        return zc5.a(this.d, j) && zc5.a(this.e, bn4Var.e);
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        int i = x70.h;
        return i82.Q(this.e) + pt1.l(hashCode, 31, this.d);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "shadow";
        fq fqVar = z12Var.c;
        fqVar.b(new r11(this.a), "elevation");
        fqVar.b(this.b, "shape");
        fqVar.b(Boolean.valueOf(this.c), "clip");
        fqVar.b(new x70(this.d), "ambientColor");
        fqVar.b(new x70(this.e), "spotColor");
    }

    public final String toString() {
        String d = r11.d(this.a);
        String i = x70.i(this.d);
        String i2 = x70.i(this.e);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(d);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        sb.append(i);
        sb.append(", spotColor=");
        return hf1.z(sb, i2, ")");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        kw kwVar = (kw) k13Var;
        tf2 tf2Var = new tf2(this, (byte) 25);
        kwVar.I = tf2Var;
        sp0.r0(kwVar, tf2Var);
    }
}

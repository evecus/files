package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dx extends q13 {
    public final float a;
    public final rt4 b;
    public final dn4 c;

    public dx(float f, rt4 rt4Var, dn4 dn4Var) {
        this.a = f;
        this.b = rt4Var;
        this.c = dn4Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new cx(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return r11.c(this.a, dxVar.a) && this.b.equals(dxVar.b) && j42.c(this.c, dxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("border");
        z12Var.b().b(new r11(this.a), "width");
        fq b = z12Var.b();
        long j = this.b.a;
        b.b(new x70(j), TtmlNode.ATTR_TTS_COLOR);
        z12Var.e(new x70(j));
        z12Var.b().b(this.c, "shape");
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + r11.d(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        cx cxVar = (cx) k13Var;
        float f = cxVar.L;
        k00 k00Var = cxVar.O;
        float f2 = this.a;
        if (!r11.c(f, f2)) {
            cxVar.L = f2;
            k00Var.j0();
        }
        rt4 rt4Var = cxVar.M;
        rt4 rt4Var2 = this.b;
        if (!j42.c(rt4Var, rt4Var2)) {
            cxVar.M = rt4Var2;
            k00Var.j0();
        }
        dn4 dn4Var = cxVar.N;
        dn4 dn4Var2 = this.c;
        if (j42.c(dn4Var, dn4Var2)) {
            return;
        }
        cxVar.N = dn4Var2;
        k00Var.j0();
        ut0.U(cxVar).I();
    }
}

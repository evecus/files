package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.pu;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
abstract class mu<N extends pu> extends q13 {
    public final void d(z12 z12Var) {
        fq fqVar = z12Var.c;
        fqVar.b(new x70(e()), TtmlNode.ATTR_TTS_COLOR);
        fqVar.b(new x70(h()), "trackColor");
        fqVar.b(g(), "stroke");
        fqVar.b(i(), "trackStroke");
        fqVar.b(new r11(f()), "gapSize");
        fqVar.b(new r11(k()), "wavelength");
        fqVar.b(new r11(j()), "waveSpeed");
    }

    public abstract long e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu)) {
            return false;
        }
        long e = e();
        mu muVar = (mu) obj;
        long e2 = muVar.e();
        int i = x70.h;
        return zc5.a(e, e2) && zc5.a(h(), muVar.h()) && j42.c(g(), muVar.g()) && j42.c(i(), muVar.i()) && r11.c(f(), muVar.f()) && r11.c(k(), muVar.k()) && r11.c(j(), muVar.j());
    }

    public abstract float f();

    public abstract rx4 g();

    public abstract long h();

    public int hashCode() {
        long e = e();
        int i = x70.h;
        return Float.floatToIntBits(j()) + jp0.o(k(), jp0.o(f(), (i().hashCode() + ((g().hashCode() + pt1.l(i82.Q(e) * 31, 31, h())) * 31)) * 31, 31), 31);
    }

    public abstract rx4 i();

    public abstract float j();

    public abstract float k();

    public final void l(pu puVar) {
        long e = e();
        long j = puVar.K;
        int i = x70.h;
        if (!zc5.a(j, e)) {
            puVar.K = e;
            puVar.m0();
        }
        long h = h();
        if (!zc5.a(puVar.L, h)) {
            puVar.L = h;
            puVar.m0();
        }
        rx4 g = g();
        if (!j42.c(puVar.M, g)) {
            puVar.M = g;
            puVar.n0();
        }
        rx4 i2 = i();
        if (!j42.c(puVar.N, i2)) {
            puVar.N = i2;
            puVar.n0();
        }
        float f = f();
        if (!r11.c(puVar.O, f)) {
            puVar.O = f;
            puVar.n0();
        }
        float k = k();
        if (!r11.c(puVar.P, k)) {
            puVar.P = k;
            puVar.p0();
            puVar.n0();
        }
        float j2 = j();
        if (r11.c(puVar.Q, j2)) {
            return;
        }
        puVar.Q = j2;
        puVar.p0();
        puVar.n0();
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h65 extends q13 {
    public final String a;
    public final m65 b;
    public final kj1 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final g80 h;

    public h65(String str, m65 m65Var, kj1 kj1Var, int i, boolean z, int i2, int i3, g80 g80Var) {
        this.a = str;
        this.b = m65Var;
        this.c = kj1Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = g80Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        k65 k65Var = new k65();
        k65Var.I = this.a;
        k65Var.J = this.b;
        k65Var.K = this.c;
        k65Var.L = this.d;
        k65Var.M = this.e;
        k65Var.N = this.f;
        k65Var.O = this.g;
        k65Var.P = this.h;
        return k65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h65)) {
            return false;
        }
        h65 h65Var = (h65) obj;
        return j42.c(this.h, h65Var.h) && j42.c(this.a, h65Var.a) && j42.c(this.b, h65Var.b) && j42.c(this.c, h65Var.c) && this.d == h65Var.d && this.e == h65Var.e && this.f == h65Var.f && this.g == h65Var.g;
    }

    public final int hashCode() {
        int o = (((((pt1.o(this.e) + ((((this.c.hashCode() + nt3.j(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31;
        g80 g80Var = this.h;
        return o + (g80Var != null ? g80Var.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.a.b(r0.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // defpackage.q13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(defpackage.k13 r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h65.update(k13):void");
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

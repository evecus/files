package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t55 {
    public final oj a;
    public final m65 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final iu0 g;
    public final da2 h;
    public final kj1 i;
    public final long j;

    public t55(oj ojVar, m65 m65Var, List list, int i, boolean z, int i2, iu0 iu0Var, da2 da2Var, kj1 kj1Var, long j) {
        this.a = ojVar;
        this.b = m65Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = iu0Var;
        this.h = da2Var;
        this.i = kj1Var;
        this.j = j;
    }

    public final iu0 a() {
        return this.g;
    }

    public final m65 b() {
        return this.b;
    }

    public final oj c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t55)) {
            return false;
        }
        t55 t55Var = (t55) obj;
        return j42.c(this.a, t55Var.a) && j42.c(this.b, t55Var.b) && j42.c(this.c, t55Var.c) && this.d == t55Var.d && this.e == t55Var.e && this.f == t55Var.f && j42.c(this.g, t55Var.g) && this.h == t55Var.h && j42.c(this.i, t55Var.i) && dh0.b(this.j, t55Var.j);
    }

    public final int hashCode() {
        return i82.Q(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((((((this.c.hashCode() + nt3.j(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid") + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + dh0.l(this.j) + ")";
    }

    public /* synthetic */ t55(oj ojVar, m65 m65Var, int i, boolean z, int i2, iu0 iu0Var, da2 da2Var, kj1 kj1Var, long j) {
        this(ojVar, m65Var, o91.I, i, z, i2, iu0Var, da2Var, kj1Var, j);
    }
}

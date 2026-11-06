package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d55 {
    public final oj a;
    public final long b;
    public final d65 c;

    public d55(oj ojVar, long j, d65 d65Var) {
        d65 d65Var2;
        this.a = ojVar;
        this.b = ui4.g(ojVar.J.length(), j);
        if (d65Var != null) {
            d65Var2 = new d65(ui4.g(ojVar.J.length(), d65Var.a));
        } else {
            d65Var2 = null;
        }
        this.c = d65Var2;
    }

    public static d55 a(d55 d55Var, oj ojVar, long j, int i) {
        if ((i & 1) != 0) {
            ojVar = d55Var.a;
        }
        if ((i & 2) != 0) {
            j = d55Var.b;
        }
        d65 d65Var = (i & 4) != 0 ? d55Var.c : null;
        d55Var.getClass();
        return new d55(ojVar, j, d65Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d55)) {
            return false;
        }
        d55 d55Var = (d55) obj;
        return d65.b(this.b, d55Var.b) && j42.c(this.c, d55Var.c) && j42.c(this.a, d55Var.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d65.c;
        int Q = (i82.Q(this.b) + hashCode) * 31;
        d65 d65Var = this.c;
        return Q + (d65Var != null ? i82.Q(d65Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + d65.h(this.b) + ", composition=" + this.c + ")";
    }

    public d55(int i, String str, long j) {
        this(new oj((i & 1) != 0 ? "" : str), (i & 2) != 0 ? d65.b : j, (d65) null);
    }
}

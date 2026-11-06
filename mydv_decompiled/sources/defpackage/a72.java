package defpackage;

import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a72 extends d {
    public final boolean I;
    public final String J;

    public a72(String str, boolean z) {
        str.getClass();
        this.I = z;
        this.J = str.toString();
    }

    @Override // kotlinx.serialization.json.d
    public final String c() {
        return this.J;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean d() {
        return this.I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a72.class != obj.getClass()) {
            return false;
        }
        a72 a72Var = (a72) obj;
        return this.I == a72Var.I && j42.c(this.J, a72Var.J);
    }

    public final int hashCode() {
        return this.J.hashCode() + (pt1.o(this.I) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z = this.I;
        String str = this.J;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ex4.a(sb, str);
        return sb.toString();
    }
}

package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l15 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public l15(int i, String str, String str2, String str3, boolean z, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = jx4.D(upperCase, "INT", false) ? 3 : (jx4.D(upperCase, "CHAR", false) || jx4.D(upperCase, "CLOB", false) || jx4.D(upperCase, "TEXT", false)) ? 2 : jx4.D(upperCase, "BLOB", false) ? 5 : (jx4.D(upperCase, "REAL", false) || jx4.D(upperCase, "FLOA", false) || jx4.D(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l15) {
                boolean z = this.d > 0;
                l15 l15Var = (l15) obj;
                byte b = l15Var.f;
                if (z == (l15Var.d > 0) && j42.c(this.a, l15Var.a) && this.c == l15Var.c) {
                    String str = l15Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || hc4.v(str2, str)) && ((b2 != 2 || b != 1 || str == null || hc4.v(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : hc4.v(str2, str))) && this.g == l15Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return kx4.o(kx4.q(sb.toString()), "    ");
    }
}

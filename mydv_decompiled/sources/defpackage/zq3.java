package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zq3 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public zq3(boolean z, yg4 yg4Var, boolean z2) {
        i51 i51Var = pe.a;
        int i = !z ? 262152 : 262144;
        i = yg4Var == yg4.J ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = yg4Var == yg4.I;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq3)) {
            return false;
        }
        zq3 zq3Var = (zq3) obj;
        return this.a == zq3Var.a && this.b == zq3Var.b && this.c == zq3Var.c && this.d == zq3Var.d && this.e == zq3Var.e && this.f == zq3Var.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + 1237) * 31) + this.f) * 31;
    }

    public zq3(int i) {
        this((i & 1) == 0, yg4.I, true);
    }
}

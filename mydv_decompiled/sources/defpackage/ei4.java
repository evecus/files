package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ei4 {
    public final is1 a;
    public final long b;
    public final di4 c;
    public final boolean d;

    public ei4(is1 is1Var, long j, di4 di4Var, boolean z) {
        this.a = is1Var;
        this.b = j;
        this.c = di4Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei4)) {
            return false;
        }
        ei4 ei4Var = (ei4) obj;
        return this.a == ei4Var.a && pd3.c(this.b, ei4Var.b) && this.c == ei4Var.c && this.d == ei4Var.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((i82.Q(this.b) + (this.a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + pd3.h(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}

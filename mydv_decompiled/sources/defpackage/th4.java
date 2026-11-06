package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class th4 {
    public final sh4 a;
    public final sh4 b;
    public final boolean c;

    public th4(sh4 sh4Var, sh4 sh4Var2, boolean z) {
        this.a = sh4Var;
        this.b = sh4Var2;
        this.c = z;
    }

    public static th4 a(th4 th4Var, sh4 sh4Var, sh4 sh4Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            sh4Var = th4Var.a;
        }
        if ((i & 2) != 0) {
            sh4Var2 = th4Var.b;
        }
        th4Var.getClass();
        return new th4(sh4Var, sh4Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th4)) {
            return false;
        }
        th4 th4Var = (th4) obj;
        return j42.c(this.a, th4Var.a) && j42.c(this.b, th4Var.b) && this.c == th4Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}

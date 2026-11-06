package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z55 {
    public final yt4 a;
    public final yt4 b;
    public final yt4 c;
    public final yt4 d;

    public z55(yt4 yt4Var, yt4 yt4Var2, yt4 yt4Var3, yt4 yt4Var4) {
        this.a = yt4Var;
        this.b = yt4Var2;
        this.c = yt4Var3;
        this.d = yt4Var4;
    }

    public final yt4 a() {
        return this.b;
    }

    public final yt4 b() {
        return this.c;
    }

    public final yt4 c() {
        return this.d;
    }

    public final yt4 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z55)) {
            return false;
        }
        z55 z55Var = (z55) obj;
        return j42.c(this.a, z55Var.a) && j42.c(this.b, z55Var.b) && j42.c(this.c, z55Var.c) && j42.c(this.d, z55Var.d);
    }

    public final int hashCode() {
        yt4 yt4Var = this.a;
        int hashCode = (yt4Var != null ? yt4Var.hashCode() : 0) * 31;
        yt4 yt4Var2 = this.b;
        int hashCode2 = (hashCode + (yt4Var2 != null ? yt4Var2.hashCode() : 0)) * 31;
        yt4 yt4Var3 = this.c;
        int hashCode3 = (hashCode2 + (yt4Var3 != null ? yt4Var3.hashCode() : 0)) * 31;
        yt4 yt4Var4 = this.d;
        return hashCode3 + (yt4Var4 != null ? yt4Var4.hashCode() : 0);
    }

    public /* synthetic */ z55(yt4 yt4Var) {
        this(yt4Var, null, null, null);
    }
}

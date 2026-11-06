package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ff {
    public dn4 a;
    public long b;
    public da2 c;
    public float d;

    public ff(dn4 dn4Var, long j, da2 da2Var, float f, zm4 zm4Var) {
        this.a = dn4Var;
        this.b = j;
        this.c = da2Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return j42.c(this.a, ffVar.a) && fq4.a(this.b, ffVar.b) && this.c == ffVar.c && Float.compare(this.d, ffVar.d) == 0 && j42.c(null, null);
    }

    public final int hashCode() {
        return jp0.o(this.d, (this.c.hashCode() + ((i82.Q(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + fq4.d(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + ((Object) null) + ")";
    }
}

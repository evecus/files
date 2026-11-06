package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wv2 {
    public final String a;
    public final u22 b;

    public wv2(String str, u22 u22Var) {
        this.a = str;
        this.b = u22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv2)) {
            return false;
        }
        wv2 wv2Var = (wv2) obj;
        return this.a.equals(wv2Var.a) && this.b.equals(wv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}

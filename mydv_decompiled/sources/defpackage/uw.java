package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uw {
    public dd a = null;
    public aa b = null;
    public r10 c = null;
    public yd d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return j42.c(this.a, uwVar.a) && j42.c(this.b, uwVar.b) && j42.c(this.c, uwVar.c) && j42.c(this.d, uwVar.d);
    }

    public final yd g() {
        yd ydVar = this.d;
        if (ydVar != null) {
            return ydVar;
        }
        yd a = ae.a();
        this.d = a;
        return a;
    }

    public final int hashCode() {
        dd ddVar = this.a;
        int hashCode = (ddVar == null ? 0 : ddVar.hashCode()) * 31;
        aa aaVar = this.b;
        int hashCode2 = (hashCode + (aaVar == null ? 0 : aaVar.hashCode())) * 31;
        r10 r10Var = this.c;
        int hashCode3 = (hashCode2 + (r10Var == null ? 0 : r10Var.hashCode())) * 31;
        yd ydVar = this.d;
        return hashCode3 + (ydVar != null ? ydVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}

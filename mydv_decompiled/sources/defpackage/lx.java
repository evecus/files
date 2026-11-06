package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lx {
    public final rc2 a;
    public final int b;
    public final int c;

    public lx(rc2 rc2Var, int i, int i2) {
        this.a = rc2Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return this.a == lxVar.a && this.b == lxVar.b && this.c == lxVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) r8.b(this.b)) + ", verticalAlignment=" + ((Object) s8.b(this.c)) + ')';
    }
}

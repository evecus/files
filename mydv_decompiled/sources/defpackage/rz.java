package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rz {
    public final i80 a;
    public final i80 b;

    public rz(i80 i80Var, i80 i80Var2) {
        this.a = i80Var;
        this.b = i80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rz.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rz rzVar = (rz) obj;
        return j42.c(this.a, rzVar.a) && j42.c(this.b, rzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aa5 implements z95 {
    public final Object a;
    public final Object b;

    public aa5(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.z95
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.z95
    public final boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(d());
    }

    @Override // defpackage.z95
    public final Object d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z95)) {
            return false;
        }
        z95 z95Var = (z95) obj;
        return j42.c(this.a, z95Var.b()) && j42.c(this.b, z95Var.d());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bi0 {
    public final jy a;
    public final k10 b;

    public bi0(jy jyVar, k10 k10Var) {
        this.a = jyVar;
        this.b = k10Var;
    }

    public final String toString() {
        k10 k10Var = this.b;
        String str = ((zk0) k10Var.M.get(zk0.I)) != null ? "Room Invalidation Tracker Refresh" : null;
        int hashCode = hashCode();
        o7.k(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return "Request@" + num + (str != null ? r7.C("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + k10Var + ")";
    }
}

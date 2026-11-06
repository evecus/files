package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pq4 implements rq4, bt3 {
    public final Set a;

    public pq4(Set set) {
        this.a = set;
        if (set.isEmpty()) {
            s83.t("The set of sizes cannot be empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pq4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((pq4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.a + ')';
    }
}

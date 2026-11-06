package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ml2 extends nl2 {
    public final dp0 a;

    public ml2(dp0 dp0Var) {
        this.a = dp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ml2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ml2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ml2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}

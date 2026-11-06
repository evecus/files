package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wg3 extends yg3 {
    public final m14 a;

    public wg3(m14 m14Var) {
        this.a = m14Var;
    }

    @Override // defpackage.yg3
    public final m14 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg3) {
            return this.a.equals(((wg3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

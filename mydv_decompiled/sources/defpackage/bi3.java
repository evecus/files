package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bi3 implements i60 {
    public final Class I;

    public bi3(Class cls) {
        cls.getClass();
        this.I = cls;
    }

    @Override // defpackage.i60
    public final Class a() {
        return this.I;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi3) {
            return j42.c(this.I, ((bi3) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return this.I.toString() + " (Kotlin reflection is not available)";
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zc {
    public final int a;

    public zc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc) && this.a == ((zc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return r7.z("AndroidFontResolveInterceptor(fontWeightAdjustment=", this.a, ")");
    }
}

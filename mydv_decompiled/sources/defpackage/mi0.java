package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mi0 {
    public final int a;

    public static String a(int i) {
        return "ContentScale(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mi0) {
            return this.a == ((mi0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s8 {
    public final int a;

    public /* synthetic */ s8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ s8 a(int i) {
        return new s8(i);
    }

    public static String b(int i) {
        return "Vertical(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s8) {
            return this.a == ((s8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return b(this.a);
    }
}

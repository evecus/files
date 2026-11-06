package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r8 {
    public final int a;

    public /* synthetic */ r8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ r8 a(int i) {
        return new r8(i);
    }

    public static String b(int i) {
        return "Horizontal(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r8) {
            return this.a == ((r8) obj).a;
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

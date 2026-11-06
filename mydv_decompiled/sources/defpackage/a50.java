package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a50 {
    public static final z40 b = new z40();
    public final Object a;

    public /* synthetic */ a50(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof z40) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a50) {
            return j42.c(this.a, ((a50) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof y40) {
            return ((y40) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

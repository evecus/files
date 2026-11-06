package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h54 implements Serializable {
    public final Object I;

    public /* synthetic */ h54(Object obj) {
        this.I = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof g54) {
            return ((g54) obj).I;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h54) {
            return j42.c(this.I, ((h54) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.I;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.I;
        if (obj instanceof g54) {
            return ((g54) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}

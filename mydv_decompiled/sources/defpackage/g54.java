package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class g54 implements Serializable {
    public final Throwable I;

    public g54(Throwable th) {
        th.getClass();
        this.I = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g54) {
            return j42.c(this.I, ((g54) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.I + ')';
    }
}

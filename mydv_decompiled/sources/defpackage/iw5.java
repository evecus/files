package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iw5 {
    public final List a;

    public iw5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !iw5.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((iw5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o70.Z0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, 56);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vr {
    public final int a;

    public /* synthetic */ vr(int i) {
        this.a = i;
    }

    public static final /* synthetic */ vr a(int i) {
        return new vr(i);
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr) {
            return this.a == ((vr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return r7.z("AutoClearFocusBehavior(value=", this.a, ")");
    }
}

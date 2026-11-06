package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i91 implements wy1 {
    public final boolean I;

    public i91(boolean z) {
        this.I = z;
    }

    @Override // defpackage.wy1
    public final pa3 b() {
        return null;
    }

    @Override // defpackage.wy1
    public final boolean isActive() {
        return this.I;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.I ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

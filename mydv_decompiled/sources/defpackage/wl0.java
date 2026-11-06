package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wl0 extends j42 {
    public final tv y;

    public wl0(tv tvVar) {
        this.y = tvVar;
    }

    @Override // defpackage.j42
    public final int a(int i, int i2, da2 da2Var) {
        return this.y.a(i2, i, da2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl0) && j42.c(this.y, ((wl0) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.y + ")";
    }
}

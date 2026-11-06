package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vn3 {
    public static final vn3 c = new vn3(0, false);
    public final boolean a;
    public final int b;

    public vn3() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn3)) {
            return false;
        }
        vn3 vn3Var = (vn3) obj;
        return this.a == vn3Var.a && this.b == vn3Var.b;
    }

    public final int hashCode() {
        return (pt1.o(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + y81.a(this.b) + ")";
    }

    public vn3(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}

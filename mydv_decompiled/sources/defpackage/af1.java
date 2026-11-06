package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class af1 implements vu5 {
    @Override // defpackage.vu5
    public final int a(iu0 iu0Var) {
        return iu0Var.X(0.0f);
    }

    @Override // defpackage.vu5
    public final int b(iu0 iu0Var, da2 da2Var) {
        return iu0Var.X(0.0f);
    }

    @Override // defpackage.vu5
    public final int c(iu0 iu0Var) {
        return iu0Var.X(32.0f);
    }

    @Override // defpackage.vu5
    public final int d(iu0 iu0Var, da2 da2Var) {
        return iu0Var.X(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af1) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f) && r11.c(32.0f, 32.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(32.0f) + jp0.o(0.0f, jp0.o(0.0f, Float.floatToIntBits(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String d = r11.d(0.0f);
        String d2 = r11.d(0.0f);
        String d3 = r11.d(0.0f);
        String d4 = r11.d(32.0f);
        StringBuilder F = r7.F("Insets(left=", d, ", top=", d2, ", right=");
        F.append(d3);
        F.append(", bottom=");
        F.append(d4);
        F.append(")");
        return F.toString();
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y82 {
    public static final y82 b = new y82(127);
    public final int a;

    public y82(int i) {
        this.a = (i & 8) != 0 ? -1 : 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y82) && this.a == ((y82) obj).a;
    }

    public final int hashCode() {
        return (((-31) * 31 * 31) + this.a) * 29791;
    }

    public final String toString() {
        return hf1.x("KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=", vt0.a0(0), ", imeAction=", lx1.a(this.a), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}

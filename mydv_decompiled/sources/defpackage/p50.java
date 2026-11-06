package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p50 extends n50 {
    public final char I;
    public final char J;

    public p50(char c, char c2) {
        this.I = c;
        this.J = c2;
    }

    @Override // defpackage.u50
    public final boolean b(char c) {
        return c == this.I || c == this.J;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + u50.d(this.I) + u50.d(this.J) + "\")";
    }
}

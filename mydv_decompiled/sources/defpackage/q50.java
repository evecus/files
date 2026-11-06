package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q50 extends n50 {
    public final char I;

    public q50(char c) {
        this.I = c;
    }

    @Override // defpackage.u50
    public final boolean b(char c) {
        return c != this.I;
    }

    @Override // defpackage.n50, defpackage.u50
    public final u50 c() {
        return new o50(this.I);
    }

    public final String toString() {
        return "CharMatcher.isNot('" + u50.d(this.I) + "')";
    }
}

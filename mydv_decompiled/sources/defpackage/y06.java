package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y06 implements jt5 {
    public final ht5 I;

    public y06(ht5 ht5Var) {
        ht5Var.getClass();
        this.I = ht5Var;
        w80.a("XYZ");
    }

    public final x06 a(Number number, Number number2, Number number3, Number number4) {
        return new x06(number.floatValue(), number2.floatValue(), number3.floatValue(), number4.floatValue(), this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y06) {
            return j42.c(this.I, ((y06) obj).I);
        }
        return false;
    }

    @Override // defpackage.jt5
    public final ht5 h() {
        throw null;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return "XYZColorSpace(" + this.I + ')';
    }
}

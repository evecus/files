package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class hq extends q13 {
    public final float a;
    public final boolean b;

    public hq(float f, boolean z) {
        this.a = f;
        this.b = z;
        if (f > 0.0f) {
            return;
        }
        o02.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.q13
    public final k13 create() {
        iq iqVar = new iq();
        iqVar.I = this.a;
        iqVar.J = this.b;
        return iqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hq hqVar = obj instanceof hq ? (hq) obj : null;
        if (hqVar != null && this.a == hqVar.a) {
            return this.b == ((hq) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return pt1.o(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        iq iqVar = (iq) k13Var;
        iqVar.I = this.a;
        iqVar.J = this.b;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

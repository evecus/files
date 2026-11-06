package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class jx extends q13 {
    public final u8 a;
    public final boolean b;

    public jx(u8 u8Var, boolean z) {
        this.a = u8Var;
        this.b = z;
    }

    @Override // defpackage.q13
    public final k13 create() {
        kx kxVar = new kx();
        kxVar.I = this.a;
        kxVar.J = this.b;
        return kxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jx jxVar = obj instanceof jx ? (jx) obj : null;
        return jxVar != null && j42.c(this.a, jxVar.a) && this.b == jxVar.b;
    }

    public final int hashCode() {
        return pt1.o(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        kx kxVar = (kx) k13Var;
        kxVar.I = this.a;
        kxVar.J = this.b;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

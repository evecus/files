package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class xe5 extends q13 {
    @Override // defpackage.q13
    public final k13 create() {
        ye5 ye5Var = new ye5();
        ye5Var.I = 280.0f;
        ye5Var.J = 56.0f;
        return ye5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xe5) && r11.c(280.0f, 280.0f) && r11.c(56.0f, 56.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(56.0f) + (Float.floatToIntBits(280.0f) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "defaultMinSize";
        fq fqVar = z12Var.c;
        fqVar.b(new r11(280.0f), "minWidth");
        fqVar.b(new r11(56.0f), "minHeight");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ye5 ye5Var = (ye5) k13Var;
        ye5Var.I = 280.0f;
        ye5Var.J = 56.0f;
    }
}

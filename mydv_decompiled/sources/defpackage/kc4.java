package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kc4 implements rb4 {
    public final /* synthetic */ oc4 a;
    public final /* synthetic */ mc4 b;

    public kc4(oc4 oc4Var, mc4 mc4Var) {
        this.a = oc4Var;
        this.b = mc4Var;
    }

    @Override // defpackage.rb4
    public final float a(float f) {
        float abs = Math.abs(f);
        oc4 oc4Var = this.a;
        if (abs != 0.0f && !((Boolean) oc4Var.h.invoke()).booleanValue()) {
            throw new lf1("The fling animation was cancelled");
        }
        return oc4Var.e(oc4Var.h(this.b.a(2, oc4Var.f(oc4Var.i(f)))));
    }
}

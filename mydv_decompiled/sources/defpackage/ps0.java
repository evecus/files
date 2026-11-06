package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ps0 implements rb4 {
    public final /* synthetic */ qs0 a;

    public ps0(qs0 qs0Var) {
        this.a = qs0Var;
    }

    @Override // defpackage.rb4
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        qs0 qs0Var = this.a;
        float floatValue = ((Number) qs0Var.a.invoke(Float.valueOf(f))).floatValue();
        qs0Var.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        qs0Var.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}

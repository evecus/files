package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd extends tn1 implements tm1 {
    public final /* synthetic */ hh2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(hh2 hh2Var) {
        super(1, i42.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.I = hh2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        float[] fArr = ((nw2) obj).a;
        ca2 ca2Var = (ca2) this.I.L.getValue();
        if (ca2Var != null) {
            if (!ca2Var.h()) {
                ca2Var = null;
            }
            if (ca2Var != null) {
                ca2Var.i(fArr);
            }
        }
        return wd5.a;
    }
}

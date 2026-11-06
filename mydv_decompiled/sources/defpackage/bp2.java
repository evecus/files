package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bp2 extends tn1 implements rm1 {
    public final /* synthetic */ t43 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp2(t43 t43Var) {
        super(0, i42.class, "togglePauseState", "LiveScreen$lambda$48$togglePauseState(Landroidx/compose/runtime/MutableState;)V", 0);
        this.I = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        this.I.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
        return wd5.a;
    }
}

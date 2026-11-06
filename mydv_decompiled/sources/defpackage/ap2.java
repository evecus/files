package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap2 extends tn1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ is0 J;
    public final /* synthetic */ cw4 K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ hk3 M;
    public final /* synthetic */ t43 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap2(is0 is0Var, cw4 cw4Var, dl0 dl0Var, hk3 hk3Var, t43 t43Var, byte b) {
        super(0, i42.class, "navigateUp", "LiveScreen$lambda$48$navigateUp(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/runtime/State;JLkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/State;)V", 0);
        this.I = b;
        switch (b) {
            case 1:
                this.J = is0Var;
                this.K = cw4Var;
                this.L = dl0Var;
                this.M = hk3Var;
                this.N = t43Var;
                super(0, i42.class, "navigateDown", "LiveScreen$lambda$48$navigateDown(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/runtime/State;JLkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/State;)V", 0);
                break;
            default:
                this.J = is0Var;
                this.K = cw4Var;
                this.L = dl0Var;
                this.M = hk3Var;
                this.N = t43Var;
                break;
        }
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.N;
        hk3 hk3Var = this.M;
        dl0 dl0Var = this.L;
        cw4 cw4Var = this.K;
        is0 is0Var = this.J;
        switch (b) {
            case 0:
                qg5.w(dl0Var, hk3Var, t43Var, is0Var, ((Boolean) cw4Var.getValue()).booleanValue() ? is0Var.d.b.h() + 1 : r5.b.h() - 1);
                break;
            default:
                qg5.w(dl0Var, hk3Var, t43Var, is0Var, ((Boolean) cw4Var.getValue()).booleanValue() ? r5.b.h() - 1 : is0Var.d.b.h() + 1);
                break;
        }
        return wd5Var;
    }
}

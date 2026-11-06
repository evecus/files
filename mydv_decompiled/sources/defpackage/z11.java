package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z11 implements tm1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ n24 J;

    public /* synthetic */ z11(uu2 uu2Var, b21 b21Var, n24 n24Var) {
        this.J = n24Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        ka5 ka5Var = ka5.I;
        n24 n24Var = this.J;
        switch (b) {
            case 0:
                b21 b21Var = (b21) obj;
                if (!b21Var.isAttached()) {
                    return ka5.J;
                }
                if (b21Var.J != null) {
                    q02.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                b21Var.J = null;
                n24Var.I = n24Var.I;
                return ka5Var;
            default:
                if (!((lv1) obj).K) {
                    return ka5Var;
                }
                n24Var.I = false;
                return ka5.K;
        }
    }

    public /* synthetic */ z11(n24 n24Var) {
        this.J = n24Var;
    }
}

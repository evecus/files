package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ja1 extends r92 implements rm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ on4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(on4 on4Var, byte b) {
        super(0);
        this.J = b;
        this.K = on4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.J;
        on4 on4Var = this.K;
        switch (b) {
            case 0:
                return on4Var;
            default:
                jk3 jk3Var = on4Var.b;
                Boolean bool = Boolean.FALSE;
                jk3Var.setValue(bool);
                on4Var.c(false);
                s95 s95Var = on4Var.c;
                s95Var.a.setValue(bool);
                s95Var.c.setValue(bool);
                s95Var.e.setValue(bool);
                s95Var.g.setValue(bool);
                on4Var.e = x70.f;
                on4Var.f = 1.0f;
                on4Var.g = 1.0f;
                li5 li5Var = on4Var.j;
                if (li5Var != null) {
                    li5Var.d();
                }
                on4Var.h = r95.b;
                on4Var.i = 0L;
                return wd5.a;
        }
    }
}

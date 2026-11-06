package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yh extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ zh K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh(zh zhVar, long j, byte b) {
        super(1);
        this.J = b;
        this.K = zhVar;
        this.L = j;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ve1 ve1Var;
        byte b = this.J;
        long j = this.L;
        zh zhVar = this.K;
        switch (b) {
            case 0:
                z95 z95Var = (z95) obj;
                if (!j42.c(z95Var.b(), zhVar.K.b())) {
                    cw4 cw4Var = (cw4) zhVar.K.d.g(z95Var.b());
                    j = cw4Var != null ? ((z22) cw4Var.getValue()).a : 0L;
                } else if (!z22.b(zhVar.R, -9223372034707292160L)) {
                    j = zhVar.R;
                }
                cw4 cw4Var2 = (cw4) zhVar.K.d.g(z95Var.d());
                r1 = cw4Var2 != null ? ((z22) cw4Var2.getValue()).a : 0L;
                uq4 uq4Var = (uq4) zhVar.J.getValue();
                return (uq4Var == null || (ve1Var = (ve1) ((vq4) uq4Var).a.invoke(new z22(j), new z22(r1))) == null) ? qb.g0(0.0f, 400.0f, null, 5) : ve1Var;
            default:
                if (j42.c(obj, zhVar.K.b())) {
                    r1 = z22.b(zhVar.R, -9223372034707292160L) ? j : zhVar.R;
                } else {
                    cw4 cw4Var3 = (cw4) zhVar.K.d.g(obj);
                    if (cw4Var3 != null) {
                        r1 = ((z22) cw4Var3.getValue()).a;
                    }
                }
                return new z22(r1);
        }
    }
}

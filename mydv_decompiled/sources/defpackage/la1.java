package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class la1 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ tm1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la1(tm1 tm1Var, byte b) {
        super(1);
        this.J = b;
        this.K = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.J;
        tm1 tm1Var = this.K;
        switch (b) {
            case 0:
                return new r22(((Number) tm1Var.invoke(Integer.valueOf((int) (((z22) obj).a >> 32)))).intValue() << 32);
            case 1:
                return new r22(((Number) tm1Var.invoke(Integer.valueOf((int) (((z22) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 2:
                return new r22(((Number) tm1Var.invoke(Integer.valueOf((int) (((z22) obj).a >> 32)))).intValue() << 32);
            default:
                return new r22(((Number) tm1Var.invoke(Integer.valueOf((int) (((z22) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}

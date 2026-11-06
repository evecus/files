package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m31 extends k05 implements in1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m31(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((pd3) obj2).a;
                new m31(i, (fj0) obj3, (byte) 0).invokeSuspend(wd5Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new m31(i, (fj0) obj3, (byte) 1).invokeSuspend(wd5Var);
                break;
            default:
                long j2 = ((pd3) obj2).a;
                new m31(i, (fj0) obj3, (byte) 2).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                mu0.V(obj);
                break;
            case 1:
                mu0.V(obj);
                break;
            default:
                mu0.V(obj);
                break;
        }
        return wd5Var;
    }
}

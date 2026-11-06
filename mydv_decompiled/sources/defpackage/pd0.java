package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pd0 extends k05 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd0(Object obj, fj0 fj0Var, byte b) {
        super(3, fj0Var);
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                new pd0((n24) obj4, (fj0) obj3, (byte) 0).invokeSuspend(wd5Var);
                break;
            default:
                ((Number) obj2).floatValue();
                new pd0((qr4) obj4, (fj0) obj3, (byte) 1).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                ((n24) obj2).I = true;
                break;
            default:
                mu0.V(obj);
                ((qr4) obj2).p.invoke();
                break;
        }
        return wd5Var;
    }
}

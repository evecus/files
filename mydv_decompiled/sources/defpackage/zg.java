package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zg extends k05 implements tm1 {
    public final /* synthetic */ bh I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(bh bhVar, Object obj, fj0 fj0Var) {
        super(1, fj0Var);
        this.I = bhVar;
        this.J = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new zg(this.I, this.J, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        zg zgVar = (zg) create((fj0) obj);
        wd5 wd5Var = wd5.a;
        zgVar.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        bh bhVar = this.I;
        bhVar.c();
        Object b = bhVar.b(this.J);
        bhVar.c.J.setValue(b);
        bhVar.e.setValue(b);
        return wd5.a;
    }
}

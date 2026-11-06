package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nu extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public /* synthetic */ float K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(bh bhVar, float f, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = bhVar;
        this.K = f;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new nu((bh) obj2, this.K, fj0Var);
            default:
                nu nuVar = new nu((td0) obj2, fj0Var);
                nuVar.K = ((Number) obj).floatValue();
                return nuVar;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((nu) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((nu) create(Float.valueOf(((Number) obj).floatValue()), (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        el0 el0Var = el0.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                bh bhVar = (bh) obj2;
                float f = this.K;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    Float f2 = new Float(f);
                    qb5 qb5Var = ((Number) bhVar.d()).floatValue() < f ? xs5.a : xs5.b;
                    this.J = true;
                    if (bh.a(bhVar, f2, qb5Var, null, null, this, 12) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            default:
                td0 td0Var = (td0) obj2;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    float f3 = this.K;
                    Object g = td0Var.a.d.I.g(ii4.e);
                    hn1 hn1Var = (hn1) (g != null ? g : null);
                    if (hn1Var == null) {
                        throw r7.t("Required value was null.");
                    }
                    pd3 pd3Var = new pd3((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    this.J = true;
                    obj = hn1Var.invoke(pd3Var, this);
                    if (obj == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((pd3) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(td0 td0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = td0Var;
    }
}

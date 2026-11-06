package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lr0 extends k05 implements hn1 {
    public o24 I;
    public cj J;
    public boolean K;
    public final /* synthetic */ float L;
    public final /* synthetic */ mr0 M;
    public final /* synthetic */ kc4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(float f, mr0 mr0Var, kc4 kc4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = f;
        this.M = mr0Var;
        this.N = kc4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new lr0(this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((lr0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        float f;
        o24 o24Var;
        cj cjVar;
        boolean z = this.K;
        if (!z) {
            mu0.V(obj);
            f = this.L;
            if (Math.abs(f) > 1.0f) {
                o24 o24Var2 = new o24();
                o24Var2.I = f;
                o24 o24Var3 = new o24();
                cj a = o7.a(0.0f, f, 28);
                try {
                    mr0 mr0Var = this.M;
                    up0 up0Var = mr0Var.a;
                    m6 m6Var = new m6(o24Var3, this.N, o24Var2, mr0Var);
                    this.I = o24Var2;
                    this.J = a;
                    this.K = true;
                    Object c = ad4.c(a, up0Var, false, m6Var, this);
                    el0 el0Var = el0.I;
                    if (c == el0Var) {
                        return el0Var;
                    }
                    o24Var = o24Var2;
                } catch (CancellationException unused) {
                    o24Var = o24Var2;
                    cjVar = a;
                    o24Var.I = ((Number) cjVar.c()).floatValue();
                    f = o24Var.I;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cjVar = this.J;
        o24Var = this.I;
        try {
            mu0.V(obj);
        } catch (CancellationException unused2) {
            o24Var.I = ((Number) cjVar.c()).floatValue();
            f = o24Var.I;
            return new Float(f);
        }
        f = o24Var.I;
        return new Float(f);
    }
}

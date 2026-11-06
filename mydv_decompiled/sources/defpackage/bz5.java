package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bz5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ dz5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz5(dz5 dz5Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = dz5Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        dz5 dz5Var = this.K;
        switch (b) {
            case 0:
                return new bz5(dz5Var, fj0Var, (byte) 0);
            default:
                return new bz5(dz5Var, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((bz5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object xy5Var;
        byte b = this.I;
        el0 el0Var = el0.I;
        dz5 dz5Var = this.K;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    Object c = dz5Var.c(this);
                    return c == el0Var ? el0Var : c;
                }
                if (z) {
                    mu0.V(obj);
                    return obj;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.J;
                try {
                    if (!z2) {
                        mu0.V(obj);
                        x52 x52Var = dz5Var.m;
                        bz5 bz5Var = new bz5(dz5Var, fj0Var, (byte) 0);
                        this.J = true;
                        obj = p70.D0(x52Var, bz5Var, this);
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
                    xy5Var = (az5) obj;
                } catch (vy5 e) {
                    xy5Var = new zy5(e.I);
                } catch (CancellationException unused) {
                    xy5Var = new xy5();
                } catch (Throwable th) {
                    fr2.e().d(ez5.a, "Unexpected error in WorkerWrapper", th);
                    xy5Var = new xy5();
                }
                Object n = dz5Var.h.n(new lp0(xy5Var, dz5Var, (byte) 2));
                n.getClass();
                return n;
        }
    }
}

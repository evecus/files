package defpackage;

import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mt0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ t43 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt0(t43 t43Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new mt0(this.K, fj0Var, (byte) 0);
            case 1:
                return new mt0(this.K, fj0Var, (byte) 1);
            case 2:
                return new mt0(this.K, fj0Var, (byte) 2);
            default:
                return new mt0(this.K, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                return ((mt0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                ((mt0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            case 2:
                ((mt0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0Var;
            default:
                return ((mt0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        long s;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        t43 t43Var = this.K;
        fj0 fj0Var = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    m90 m90Var = new m90((byte) 8);
                    this.J = true;
                    if (ut0.E(getContext()).E(m90Var, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 1:
                boolean z2 = this.J;
                if (z2 && !z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                do {
                    LocalTime now = LocalTime.now();
                    DateTimeFormatter dateTimeFormatter = ro3.a;
                    t43Var.setValue(now);
                    this.J = true;
                } while (rt0.n(1000L, this) != el0Var);
                return el0Var;
            case 2:
                boolean z3 = this.J;
                if (z3 && !z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                do {
                    LocalDateTime now2 = LocalDateTime.now();
                    DateTimeFormatter dateTimeFormatter2 = fv4.a;
                    t43Var.setValue(now2);
                    s = ut0.s(60000 - ((((LocalDateTime) t43Var.getValue()).getNano() / 1000000) + (((LocalDateTime) t43Var.getValue()).getSecond() * 1000)), 1000L, 60000L);
                    this.J = true;
                } while (rt0.n(s, this) != el0Var);
                return el0Var;
            default:
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                w84 w = wi4.w(new il4(t43Var, (byte) 18));
                jm4 jm4Var = new jm4(t43Var, fj0Var, b2);
                this.J = true;
                return ut0.x(w, jm4Var, this) == el0Var ? el0Var : wd5Var;
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nr4 extends k05 implements in1 {
    public byte I;
    public /* synthetic */ Object J;
    public /* synthetic */ long K;
    public final /* synthetic */ t33 L;
    public final /* synthetic */ qr4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr4(t33 t33Var, qr4 qr4Var, fj0 fj0Var) {
        super(3, fj0Var);
        this.L = t33Var;
        this.M = qr4Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((pd3) obj2).a;
        nr4 nr4Var = new nr4(this.L, this.M, (fj0) obj3);
        nr4Var.J = (ts3) obj;
        nr4Var.K = j;
        return nr4Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        byte b = this.I;
        vs3 vs3Var = null;
        t33 t33Var = this.L;
        el0 el0Var = el0.I;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (b == 0) {
            mu0.V(obj);
            ts3 ts3Var = (ts3) this.J;
            long j = this.K;
            vs3 vs3Var2 = new vs3(j);
            try {
                t33Var.b(vs3Var2);
                qr4 qr4Var = this.M;
                qr4Var.r.i((qr4Var.c() ? Float.intBitsToFloat((int) (j & 4294967295L)) : qr4Var.j ? qr4Var.h.h() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - qr4Var.q.h());
                this.J = vs3Var2;
                this.I = (byte) 1;
                obj = ts3Var.f(this);
                if (obj != el0Var) {
                    vs3Var = vs3Var2;
                }
            } catch (Throwable th3) {
                th = th3;
                vs3Var = vs3Var2;
                if (vs3Var == null) {
                    throw th;
                }
                us3 us3Var = new us3(vs3Var);
                this.J = th;
                this.I = (byte) 3;
                if (t33Var.a(us3Var, this) != el0Var) {
                    th = th;
                    throw th;
                }
                return el0Var;
            }
            return el0Var;
        }
        if (b != 1) {
            if (b == 2) {
                mu0.V(obj);
                return wd5.a;
            }
            if (b != 3) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.J;
            mu0.V(obj);
            throw th;
        }
        vs3Var = (vs3) this.J;
        mu0.V(obj);
        t33Var.b(((Boolean) obj).booleanValue() ? new ws3(vs3Var) : new us3(vs3Var));
        return wd5.a;
    }
}

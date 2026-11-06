package defpackage;

import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m72 extends f54 implements in1 {
    public boolean J;
    public /* synthetic */ xp0 K;
    public final /* synthetic */ o72 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(o72 o72Var, fj0 fj0Var) {
        super(3, fj0Var);
        this.L = o72Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m72 m72Var = new m72(this.L, (fj0) obj3);
        m72Var.K = (xp0) obj;
        return m72Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        o72 o72Var = this.L;
        c8 c8Var = o72Var.a;
        xp0 xp0Var = this.K;
        boolean z = this.J;
        if (!z) {
            mu0.V(obj);
            byte E = c8Var.E();
            if (E == 1) {
                return o72Var.d(true);
            }
            if (E == 0) {
                return o72Var.d(false);
            }
            if (E != 6) {
                if (E == 8) {
                    return o72Var.b();
                }
                c8.s(c8Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.K = null;
            this.J = true;
            obj = o72Var.c(xp0Var, this);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return (b) obj;
    }
}

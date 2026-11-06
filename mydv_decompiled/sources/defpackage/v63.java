package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class v63 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ q73 J;

    public /* synthetic */ v63(q73 q73Var, byte b) {
        this.I = b;
        this.J = q73Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        int i;
        byte b = this.I;
        q73 q73Var = this.J;
        switch (b) {
            case 0:
                jt jtVar = q73Var.f;
                boolean z = false;
                if (q73Var.g) {
                    pp ppVar = q73Var.b.f;
                    if (ppVar == null || !ppVar.isEmpty()) {
                        Iterator it = ppVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((p63) it.next()).J instanceof k73) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                jtVar.f(z);
                return wd5.a;
            default:
                return new a83(q73Var.a, q73Var.b.t);
        }
    }
}

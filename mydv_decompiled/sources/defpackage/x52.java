package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class x52 extends e62 implements rb0 {
    public final boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x52(v52 v52Var) {
        super(true);
        boolean z = true;
        K(v52Var);
        Unsafe unsafe = gq.a;
        long j = e62.J;
        c60 c60Var = (c60) unsafe.getObjectVolatile(this, j);
        d60 d60Var = c60Var instanceof d60 ? (d60) c60Var : null;
        if (d60Var != null) {
            e62 j2 = d60Var.j();
            while (!j2.C()) {
                c60 c60Var2 = (c60) gq.a.getObjectVolatile(j2, j);
                d60 d60Var2 = c60Var2 instanceof d60 ? (d60) c60Var2 : null;
                if (d60Var2 != null) {
                    j2 = d60Var2.j();
                }
            }
            this.L = z;
        }
        z = false;
        this.L = z;
    }

    @Override // defpackage.e62
    public final boolean C() {
        return this.L;
    }

    @Override // defpackage.e62
    public final boolean D() {
        return true;
    }
}

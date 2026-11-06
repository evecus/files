package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class xo1 implements Cloneable {
    public final bp1 I;
    public bp1 J;
    public boolean K = false;

    public xo1(bp1 bp1Var) {
        this.I = bp1Var;
        this.J = (bp1) bp1Var.d(4);
    }

    public static void d(bp1 bp1Var, bp1 bp1Var2) {
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        tx3Var.a(bp1Var.getClass()).f(bp1Var, bp1Var2);
    }

    public final bp1 a() {
        bp1 b = b();
        if (b.g()) {
            return b;
        }
        throw new vb0((byte) 5);
    }

    public final bp1 b() {
        boolean z = this.K;
        bp1 bp1Var = this.J;
        if (z) {
            return bp1Var;
        }
        bp1Var.getClass();
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        tx3Var.a(bp1Var.getClass()).a(bp1Var);
        this.K = true;
        return this.J;
    }

    public final void c() {
        if (this.K) {
            bp1 bp1Var = (bp1) this.J.d(4);
            d(bp1Var, this.J);
            this.J = bp1Var;
            this.K = false;
        }
    }

    public final Object clone() {
        xo1 xo1Var = (xo1) this.I.d(5);
        bp1 b = b();
        xo1Var.c();
        d(xo1Var.J, b);
        return xo1Var;
    }
}

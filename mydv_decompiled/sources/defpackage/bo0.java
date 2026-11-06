package defpackage;

/* loaded from: classes2.dex */
public abstract class bo0 {
    public static final pn0 a;
    public static final qn0 b;

    static {
        pn0 pn0Var = new pn0();
        pn0Var.L = -1;
        a = pn0Var;
        qn0 qn0Var = new qn0();
        qn0Var.M = -1;
        b = qn0Var;
    }

    public static pn0 a(f0 f0Var) {
        if (f0Var.b < 1) {
            return a;
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 1);
        pn0Var.L = -1;
        return pn0Var;
    }
}

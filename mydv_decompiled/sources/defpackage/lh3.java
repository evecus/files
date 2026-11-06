package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class lh3 {
    public static final mf0 a = new mf0(new u73((byte) 5));

    public static final l13 a(l13 l13Var) {
        return l13Var.then(new mh3());
    }

    public static final sc b(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(282942128);
        tc tcVar = (tc) go1Var.k(a);
        if (tcVar == null) {
            go1Var.q(false);
            return null;
        }
        boolean g = go1Var.g(tcVar);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            sc scVar = new sc(tcVar.a, tcVar.b, tcVar.c, tcVar.d);
            go1Var.o0(scVar);
            Q = scVar;
        }
        sc scVar2 = (sc) Q;
        go1Var.q(false);
        return scVar2;
    }
}

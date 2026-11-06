package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qk1 implements Comparable {
    public static final qk1 J;
    public static final qk1 K;
    public static final qk1 L;
    public static final qk1 M;
    public static final qk1 N;
    public static final qk1 O;
    public static final qk1 P;
    public static final qk1 Q;
    public static final qk1 R;
    public final int I;

    static {
        qk1 qk1Var = new qk1(100);
        qk1 qk1Var2 = new qk1(200);
        qk1 qk1Var3 = new qk1(300);
        qk1 qk1Var4 = new qk1(400);
        J = qk1Var4;
        qk1 qk1Var5 = new qk1(500);
        K = qk1Var5;
        qk1 qk1Var6 = new qk1(600);
        L = qk1Var6;
        qk1 qk1Var7 = new qk1(700);
        qk1 qk1Var8 = new qk1(800);
        qk1 qk1Var9 = new qk1(900);
        M = qk1Var4;
        N = qk1Var5;
        O = qk1Var6;
        P = qk1Var7;
        Q = qk1Var8;
        R = qk1Var9;
        p70.k0(qk1Var, qk1Var2, qk1Var3, qk1Var4, qk1Var5, qk1Var6, qk1Var7, qk1Var8, qk1Var9);
    }

    public qk1(int i) {
        this.I = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        r02.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qk1 qk1Var) {
        return j42.m(this.I, qk1Var.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qk1) {
            return this.I == ((qk1) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return this.I;
    }

    public final String toString() {
        return r7.z("FontWeight(weight=", this.I, ")");
    }
}

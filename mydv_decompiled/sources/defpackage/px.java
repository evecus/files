package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class px {
    public static final n43 a = b(true);
    public static final n43 b = b(false);
    public static final ox c = ox.b;

    public static final void a(l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-211209833);
        byte b2 = 2;
        int i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            l13 x0 = i42.x0(go1Var, l13Var);
            am3 m = go1Var.m();
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new y1(l13Var, i, b2);
        }
    }

    public static final n43 b(boolean z) {
        n43 n43Var = new n43(9);
        vv vvVar = q8.J;
        n43Var.m(vvVar, new sx(vvVar, z));
        vv vvVar2 = q8.K;
        n43Var.m(vvVar2, new sx(vvVar2, z));
        vv vvVar3 = q8.L;
        n43Var.m(vvVar3, new sx(vvVar3, z));
        vv vvVar4 = q8.M;
        n43Var.m(vvVar4, new sx(vvVar4, z));
        vv vvVar5 = q8.N;
        n43Var.m(vvVar5, new sx(vvVar5, z));
        vv vvVar6 = q8.O;
        n43Var.m(vvVar6, new sx(vvVar6, z));
        vv vvVar7 = q8.P;
        n43Var.m(vvVar7, new sx(vvVar7, z));
        vv vvVar8 = q8.Q;
        n43Var.m(vvVar8, new sx(vvVar8, z));
        vv vvVar9 = q8.R;
        n43Var.m(vvVar9, new sx(vvVar9, z));
        return n43Var;
    }

    public static final uw2 c(u8 u8Var, boolean z) {
        uw2 uw2Var = (uw2) (z ? a : b).g(u8Var);
        return uw2Var == null ? new sx(u8Var, z) : uw2Var;
    }

    public static final void d(an3 an3Var, bn3 bn3Var, pw2 pw2Var, da2 da2Var, int i, int i2, u8 u8Var) {
        u8 u8Var2;
        Object z = pw2Var.z();
        kx kxVar = z instanceof kx ? (kx) z : null;
        an3.h(an3Var, bn3Var, ((kxVar == null || (u8Var2 = kxVar.I) == null) ? u8Var : u8Var2).a((bn3Var.I << 32) | (bn3Var.J & 4294967295L), (i << 32) | (i2 & 4294967295L), da2Var));
    }
}

package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class yz5 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        xz5 xz5Var = new xz5((byte) 9);
        xz5 xz5Var2 = new xz5((byte) 14);
        xz5 xz5Var3 = new xz5((byte) 15);
        xz5 xz5Var4 = new xz5((byte) 16);
        xz5 xz5Var5 = new xz5((byte) 17);
        xz5 xz5Var6 = new xz5((byte) 18);
        xz5 xz5Var7 = new xz5((byte) 19);
        xz5 xz5Var8 = new xz5((byte) 20);
        xz5 xz5Var9 = new xz5((byte) 21);
        c84 c84Var = new c84((byte) 29);
        xz5 xz5Var10 = new xz5((byte) 0);
        xz5 xz5Var11 = new xz5((byte) 1);
        xz5 xz5Var12 = new xz5((byte) 2);
        xz5 xz5Var13 = new xz5((byte) 3);
        xz5 xz5Var14 = new xz5((byte) 4);
        xz5 xz5Var15 = new xz5((byte) 5);
        xz5 xz5Var16 = new xz5((byte) 6);
        xz5 xz5Var17 = new xz5((byte) 7);
        xz5 xz5Var18 = new xz5((byte) 8);
        xz5 xz5Var19 = new xz5((byte) 10);
        xz5 xz5Var20 = new xz5((byte) 11);
        xz5 xz5Var21 = new xz5((byte) 12);
        xz5 xz5Var22 = new xz5((byte) 13);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        b("prime192v1", f06.A, xz5Var);
        b("prime192v2", f06.B, xz5Var2);
        b("prime192v3", f06.C, xz5Var3);
        b("prime239v1", f06.D, xz5Var4);
        b("prime239v2", f06.E, xz5Var5);
        b("prime239v3", f06.F, xz5Var6);
        b("prime256v1", f06.G, xz5Var7);
        b("c2pnb163v1", f06.k, xz5Var8);
        b("c2pnb163v2", f06.l, xz5Var9);
        b("c2pnb163v3", f06.m, c84Var);
        b("c2pnb176w1", f06.n, xz5Var10);
        b("c2tnb191v1", f06.o, xz5Var11);
        b("c2tnb191v2", f06.p, xz5Var12);
        b("c2tnb191v3", f06.q, xz5Var13);
        b("c2pnb208w1", f06.r, xz5Var14);
        b("c2tnb239v1", f06.s, xz5Var15);
        b("c2tnb239v2", f06.t, xz5Var16);
        b("c2tnb239v3", f06.u, xz5Var17);
        b("c2pnb272w1", f06.v, xz5Var18);
        b("c2pnb304w1", f06.w, xz5Var19);
        b("c2tnb359v1", f06.x, xz5Var20);
        b("c2pnb368w1", f06.y, xz5Var21);
        b("c2tnb431r1", f06.z, xz5Var22);
    }

    public static d06 a(v51 v51Var, String str) {
        d06 d06Var = new d06(v51Var, et1.b(str));
        qg5.N(d06Var.m());
        return d06Var;
    }

    public static void b(String str, q0 q0Var, c06 c06Var) {
        a.put(str, q0Var);
        c.put(q0Var, str);
        b.put(q0Var, c06Var);
    }

    public static BigInteger c(String str) {
        return new BigInteger(1, et1.b(str));
    }
}

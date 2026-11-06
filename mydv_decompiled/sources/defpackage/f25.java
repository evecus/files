package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class f25 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        c84 c84Var = new c84((byte) 20);
        c84 c84Var2 = new c84((byte) 21);
        c84 c84Var3 = new c84((byte) 22);
        c84 c84Var4 = new c84((byte) 23);
        c84 c84Var5 = new c84((byte) 24);
        c84 c84Var6 = new c84((byte) 25);
        c84 c84Var7 = new c84((byte) 26);
        c84 c84Var8 = new c84((byte) 27);
        c84 c84Var9 = new c84((byte) 28);
        c84 c84Var10 = new c84((byte) 15);
        c84 c84Var11 = new c84((byte) 16);
        c84 c84Var12 = new c84((byte) 17);
        c84 c84Var13 = new c84((byte) 18);
        c84 c84Var14 = new c84((byte) 19);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        b("brainpoolP160r1", g25.a, c84Var);
        b("brainpoolP160t1", g25.b, c84Var2);
        b("brainpoolP192r1", g25.c, c84Var3);
        b("brainpoolP192t1", g25.d, c84Var4);
        b("brainpoolP224r1", g25.e, c84Var5);
        b("brainpoolP224t1", g25.f, c84Var6);
        b("brainpoolP256r1", g25.g, c84Var7);
        b("brainpoolP256t1", g25.h, c84Var8);
        b("brainpoolP320r1", g25.i, c84Var9);
        b("brainpoolP320t1", g25.j, c84Var10);
        b("brainpoolP384r1", g25.k, c84Var11);
        b("brainpoolP384t1", g25.l, c84Var12);
        b("brainpoolP512r1", g25.m, c84Var13);
        b("brainpoolP512t1", g25.n, c84Var14);
    }

    public static d06 a(v51 v51Var, String str) {
        d06 d06Var = new d06(v51Var, et1.b(str));
        qg5.N(d06Var.m());
        return d06Var;
    }

    public static void b(String str, q0 q0Var, c06 c06Var) {
        a.put(ix4.b(str), q0Var);
        c.put(q0Var, str);
        b.put(q0Var, c06Var);
    }

    public static BigInteger c(String str) {
        return new BigInteger(1, et1.b(str));
    }
}

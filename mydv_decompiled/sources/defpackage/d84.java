package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class d84 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        vm0 vm0Var = new vm0((byte) 22);
        c84 c84Var = new c84((byte) 3);
        c84 c84Var2 = new c84((byte) 8);
        c84 c84Var3 = new c84((byte) 9);
        c84 c84Var4 = new c84((byte) 10);
        c84 c84Var5 = new c84((byte) 11);
        c84 c84Var6 = new c84((byte) 12);
        c84 c84Var7 = new c84((byte) 13);
        c84 c84Var8 = new c84((byte) 14);
        vm0 vm0Var2 = new vm0((byte) 12);
        vm0 vm0Var3 = new vm0((byte) 13);
        vm0 vm0Var4 = new vm0((byte) 14);
        vm0 vm0Var5 = new vm0((byte) 15);
        vm0 vm0Var6 = new vm0((byte) 16);
        vm0 vm0Var7 = new vm0((byte) 17);
        vm0 vm0Var8 = new vm0((byte) 18);
        vm0 vm0Var9 = new vm0((byte) 19);
        vm0 vm0Var10 = new vm0((byte) 20);
        vm0 vm0Var11 = new vm0((byte) 21);
        vm0 vm0Var12 = new vm0((byte) 23);
        vm0 vm0Var13 = new vm0((byte) 24);
        vm0 vm0Var14 = new vm0((byte) 25);
        vm0 vm0Var15 = new vm0((byte) 26);
        vm0 vm0Var16 = new vm0((byte) 27);
        vm0 vm0Var17 = new vm0((byte) 28);
        vm0 vm0Var18 = new vm0((byte) 29);
        c84 c84Var9 = new c84((byte) 0);
        c84 c84Var10 = new c84((byte) 1);
        c84 c84Var11 = new c84((byte) 2);
        c84 c84Var12 = new c84((byte) 4);
        c84 c84Var13 = new c84((byte) 5);
        c84 c84Var14 = new c84((byte) 6);
        c84 c84Var15 = new c84((byte) 7);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        b("secp112r1", e84.f, vm0Var);
        b("secp112r2", e84.g, c84Var);
        b("secp128r1", e84.t, c84Var2);
        b("secp128r2", e84.u, c84Var3);
        b("secp160k1", e84.i, c84Var4);
        b("secp160r1", e84.h, c84Var5);
        b("secp160r2", e84.v, c84Var6);
        b("secp192k1", e84.w, c84Var7);
        b("secp192r1", e84.F, c84Var8);
        b("secp224k1", e84.x, vm0Var2);
        b("secp224r1", e84.y, vm0Var3);
        b("secp256k1", e84.j, vm0Var4);
        b("secp256r1", e84.G, vm0Var5);
        b("secp384r1", e84.z, vm0Var6);
        b("secp521r1", e84.A, vm0Var7);
        b("sect113r1", e84.d, vm0Var8);
        b("sect113r2", e84.e, vm0Var9);
        b("sect131r1", e84.n, vm0Var10);
        b("sect131r2", e84.o, vm0Var11);
        b("sect163k1", e84.a, vm0Var12);
        b("sect163r1", e84.b, vm0Var13);
        b("sect163r2", e84.k, vm0Var14);
        b("sect193r1", e84.p, vm0Var15);
        b("sect193r2", e84.q, vm0Var16);
        b("sect233k1", e84.r, vm0Var17);
        b("sect233r1", e84.s, vm0Var18);
        b("sect239k1", e84.c, c84Var9);
        b("sect283k1", e84.l, c84Var10);
        b("sect283r1", e84.m, c84Var11);
        b("sect409k1", e84.B, c84Var12);
        b("sect409r1", e84.C, c84Var13);
        b("sect571k1", e84.D, c84Var14);
        b("sect571r1", e84.E, c84Var15);
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

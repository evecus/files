package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class b61 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        vm0 vm0Var = new vm0((byte) 3);
        vm0 vm0Var2 = new vm0((byte) 4);
        vm0 vm0Var3 = new vm0((byte) 5);
        vm0 vm0Var4 = new vm0((byte) 6);
        vm0 vm0Var5 = new vm0((byte) 7);
        vm0 vm0Var6 = new vm0((byte) 8);
        vm0 vm0Var7 = new vm0((byte) 9);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        b("GostR3410-2001-CryptoPro-A", fm0.b, vm0Var);
        b("GostR3410-2001-CryptoPro-B", fm0.c, vm0Var2);
        b("GostR3410-2001-CryptoPro-C", fm0.d, vm0Var3);
        b("GostR3410-2001-CryptoPro-XchA", fm0.e, vm0Var);
        b("GostR3410-2001-CryptoPro-XchB", fm0.f, vm0Var3);
        b("Tc26-Gost-3410-12-256-paramSetA", g74.c, vm0Var4);
        b("Tc26-Gost-3410-12-256-paramSetB", g74.d, vm0Var);
        b("Tc26-Gost-3410-12-256-paramSetC", g74.e, vm0Var2);
        b("Tc26-Gost-3410-12-256-paramSetD", g74.f, vm0Var3);
        b("Tc26-Gost-3410-12-512-paramSetA", g74.g, vm0Var5);
        b("Tc26-Gost-3410-12-512-paramSetB", g74.h, vm0Var6);
        b("Tc26-Gost-3410-12-512-paramSetC", g74.i, vm0Var7);
    }

    public static d06 a(v51 v51Var, BigInteger bigInteger, BigInteger bigInteger2) {
        g61 c2 = v51Var.c(bigInteger, bigInteger2);
        qg5.N(c2);
        return new d06(c2);
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

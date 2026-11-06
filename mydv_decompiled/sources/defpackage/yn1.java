package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class yn1 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        vm0 vm0Var = new vm0((byte) 10);
        vm0 vm0Var2 = new vm0((byte) 11);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        a("wapip192v1", zn1.b, vm0Var2);
        a("wapi192v1", zn1.c, vm0Var2);
        a("sm2p256v1", zn1.a, vm0Var);
    }

    public static void a(String str, q0 q0Var, c06 c06Var) {
        a.put(ix4.b(str), q0Var);
        c.put(q0Var, str);
        b.put(q0Var, c06Var);
    }

    public static BigInteger b(String str) {
        return new BigInteger(1, et1.b(str));
    }
}

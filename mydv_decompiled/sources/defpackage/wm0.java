package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes2.dex */
public abstract class wm0 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;
    public static final Hashtable d;
    public static final Vector e;

    static {
        v vVar = new v((byte) 11);
        v vVar2 = new v((byte) 22);
        v vVar3 = new v((byte) 26);
        v vVar4 = new v((byte) 27);
        v vVar5 = new v((byte) 28);
        v vVar6 = new v((byte) 29);
        vm0 vm0Var = new vm0((byte) 0);
        vm0 vm0Var2 = new vm0((byte) 1);
        vm0 vm0Var3 = new vm0((byte) 2);
        v vVar7 = new v((byte) 1);
        v vVar8 = new v((byte) 2);
        v vVar9 = new v((byte) 3);
        v vVar10 = new v((byte) 4);
        v vVar11 = new v((byte) 5);
        v vVar12 = new v((byte) 6);
        v vVar13 = new v((byte) 7);
        v vVar14 = new v((byte) 8);
        v vVar15 = new v((byte) 9);
        v vVar16 = new v((byte) 10);
        v vVar17 = new v((byte) 12);
        v vVar18 = new v((byte) 13);
        v vVar19 = new v((byte) 14);
        v vVar20 = new v((byte) 15);
        v vVar21 = new v((byte) 16);
        v vVar22 = new v((byte) 17);
        v vVar23 = new v((byte) 18);
        v vVar24 = new v((byte) 19);
        v vVar25 = new v((byte) 20);
        v vVar26 = new v((byte) 21);
        v vVar27 = new v((byte) 23);
        v vVar28 = new v((byte) 24);
        v vVar29 = new v((byte) 25);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        d = new Hashtable();
        e = new Vector();
        c("curve25519", dm0.a, vVar);
        c("secp128r1", e84.t, vVar2);
        c("secp160k1", e84.i, vVar3);
        c("secp160r1", e84.h, vVar4);
        c("secp160r2", e84.v, vVar5);
        c("secp192k1", e84.w, vVar6);
        q0 q0Var = e84.F;
        c("secp192r1", q0Var, vm0Var);
        c("secp224k1", e84.x, vm0Var2);
        q0 q0Var2 = e84.y;
        c("secp224r1", q0Var2, vm0Var3);
        c("secp256k1", e84.j, vVar7);
        q0 q0Var3 = e84.G;
        c("secp256r1", q0Var3, vVar8);
        q0 q0Var4 = e84.z;
        c("secp384r1", q0Var4, vVar9);
        q0 q0Var5 = e84.A;
        c("secp521r1", q0Var5, vVar10);
        c("sect113r1", e84.d, vVar11);
        c("sect113r2", e84.e, vVar12);
        c("sect131r1", e84.n, vVar13);
        c("sect131r2", e84.o, vVar14);
        q0 q0Var6 = e84.a;
        c("sect163k1", q0Var6, vVar15);
        c("sect163r1", e84.b, vVar16);
        q0 q0Var7 = e84.k;
        c("sect163r2", q0Var7, vVar17);
        c("sect193r1", e84.p, vVar18);
        c("sect193r2", e84.q, vVar19);
        q0 q0Var8 = e84.r;
        c("sect233k1", q0Var8, vVar20);
        q0 q0Var9 = e84.s;
        c("sect233r1", q0Var9, vVar21);
        c("sect239k1", e84.c, vVar22);
        q0 q0Var10 = e84.l;
        c("sect283k1", q0Var10, vVar23);
        q0 q0Var11 = e84.m;
        c("sect283r1", q0Var11, vVar24);
        q0 q0Var12 = e84.B;
        c("sect409k1", q0Var12, vVar25);
        q0 q0Var13 = e84.C;
        c("sect409r1", q0Var13, vVar26);
        q0 q0Var14 = e84.D;
        c("sect571k1", q0Var14, vVar27);
        q0 q0Var15 = e84.E;
        c("sect571r1", q0Var15, vVar28);
        c("sm2p256v1", zn1.a, vVar29);
        b("B-163", q0Var7);
        b("B-233", q0Var9);
        b("B-283", q0Var11);
        b("B-409", q0Var13);
        b("B-571", q0Var15);
        b("K-163", q0Var6);
        b("K-233", q0Var8);
        b("K-283", q0Var10);
        b("K-409", q0Var12);
        b("K-571", q0Var14);
        b("P-192", q0Var);
        b("P-224", q0Var2);
        b("P-256", q0Var3);
        b("P-384", q0Var4);
        b("P-521", q0Var5);
    }

    public static d06 a(v51 v51Var, String str) {
        d06 d06Var = new d06(v51Var, et1.b(str));
        qg5.N(d06Var.m());
        return d06Var;
    }

    public static void b(String str, q0 q0Var) {
        Object obj = c.get(q0Var);
        if (obj == null) {
            s83.r();
            return;
        }
        String b2 = ix4.b(str);
        b.put(b2, q0Var);
        a.put(b2, obj);
    }

    public static void c(String str, q0 q0Var, c06 c06Var) {
        e.addElement(str);
        d.put(q0Var, str);
        c.put(q0Var, c06Var);
        String b2 = ix4.b(str);
        b.put(b2, q0Var);
        a.put(b2, c06Var);
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sx3 {
    public static final sx3 c = new sx3();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final uu2 a = new uu2((byte) 0);

    public final qa4 a(Class cls) {
        nc1 nc1Var;
        qa4 z;
        Class cls2;
        p32.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        qa4 qa4Var = (qa4) concurrentHashMap.get(cls);
        if (qa4Var != null) {
            return qa4Var;
        }
        Class cls3 = sa4.a;
        if (!ap1.class.isAssignableFrom(cls) && (cls2 = sa4.a) != null && !cls2.isAssignableFrom(cls)) {
            s83.t("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        i04 a = ((su2) this.a.I).a(cls);
        if ((a.d & 2) == 2) {
            if (ap1.class.isAssignableFrom(cls)) {
                z = new fz2(sa4.c, pc1.a, a.a);
            } else {
                be5 be5Var = sa4.b;
                nc1 nc1Var2 = pc1.b;
                if (nc1Var2 == null) {
                    zy.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                z = new fz2(be5Var, nc1Var2, a.a);
            }
        } else if (ap1.class.isAssignableFrom(cls)) {
            z = dz2.z(a, aa3.b, sk2.b, sa4.c, pt1.F(a.a()) != 1 ? pc1.a : null, jv2.b);
        } else {
            y93 y93Var = aa3.a;
            rk2 rk2Var = sk2.a;
            be5 be5Var2 = sa4.b;
            if (pt1.F(a.a()) != 1) {
                nc1 nc1Var3 = pc1.b;
                if (nc1Var3 == null) {
                    zy.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                nc1Var = nc1Var3;
            } else {
                nc1Var = null;
            }
            z = dz2.z(a, y93Var, rk2Var, be5Var2, nc1Var, jv2.a);
        }
        qa4 qa4Var2 = (qa4) concurrentHashMap.putIfAbsent(cls, z);
        return qa4Var2 != null ? qa4Var2 : z;
    }
}

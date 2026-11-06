package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tx3 {
    public static final tx3 c = new tx3();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final uu2 a = new uu2((byte) 1);

    public final ra4 a(Class cls) {
        ra4 t;
        Class cls2;
        r32.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        ra4 ra4Var = (ra4) concurrentHashMap.get(cls);
        if (ra4Var != null) {
            return ra4Var;
        }
        Class cls3 = ta4.a;
        if (!bp1.class.isAssignableFrom(cls) && (cls2 = ta4.a) != null && !cls2.isAssignableFrom(cls)) {
            s83.t("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        j04 a = ((tu2) this.a.I).a(cls);
        if ((a.d & 2) == 2) {
            if (bp1.class.isAssignableFrom(cls)) {
                t = new gz2(ta4.d, qc1.a, a.a);
            } else {
                ce5 ce5Var = ta4.b;
                oc1 oc1Var = qc1.b;
                if (oc1Var == null) {
                    zy.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                t = new gz2(ce5Var, oc1Var, a.a);
            }
        } else if (bp1.class.isAssignableFrom(cls)) {
            t = (a.d & 1) == 1 ? ez2.t(a, ba3.b, qk2.b, ta4.d, qc1.a, kv2.b) : ez2.t(a, ba3.b, qk2.b, ta4.d, null, kv2.b);
        } else if ((a.d & 1) == 1) {
            z93 z93Var = ba3.a;
            ok2 ok2Var = qk2.a;
            ce5 ce5Var2 = ta4.b;
            oc1 oc1Var2 = qc1.b;
            if (oc1Var2 == null) {
                zy.i("Protobuf runtime is not correctly loaded.");
                return null;
            }
            t = ez2.t(a, z93Var, ok2Var, ce5Var2, oc1Var2, kv2.a);
        } else {
            t = ez2.t(a, ba3.a, qk2.a, ta4.c, null, kv2.a);
        }
        ra4 ra4Var2 = (ra4) concurrentHashMap.putIfAbsent(cls, t);
        return ra4Var2 != null ? ra4Var2 : t;
    }
}

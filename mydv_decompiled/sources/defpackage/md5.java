package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class md5 {
    public static nd5 a(String str) {
        Object obj;
        za1 za1Var = nd5.O;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            if (!o.hasNext()) {
                obj = null;
                break;
            }
            obj = o.next();
            if (((nd5) obj).J.equals(str)) {
                break;
            }
        }
        nd5 nd5Var = (nd5) obj;
        return nd5Var == null ? nd5.K : nd5Var;
    }
}

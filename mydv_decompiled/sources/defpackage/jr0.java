package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jr0 {
    public static final pt0 a;

    static {
        String str;
        pt0 pt0Var;
        int i = h15.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            os0 os0Var = sx0.a;
            ns1 ns1Var = ju2.a;
            ns1 ns1Var2 = ns1Var.L;
            pt0Var = ns1Var;
            if (ns1Var == null) {
                pt0Var = ir0.Q;
            }
        } else {
            pt0Var = ir0.Q;
        }
        a = pt0Var;
    }
}

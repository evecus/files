package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class zp {
    public static final int a;

    static {
        Object g54Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            g54Var = property != null ? qx4.A(property) : null;
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        Integer num = (Integer) (g54Var instanceof g54 ? null : g54Var);
        a = num != null ? num.intValue() : 2097152;
    }
}

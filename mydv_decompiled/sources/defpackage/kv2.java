package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class kv2 {
    public static final iv2 a;
    public static final iv2 b;

    static {
        iv2 iv2Var = null;
        try {
            iv2Var = (iv2) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = iv2Var;
        b = new iv2();
    }
}

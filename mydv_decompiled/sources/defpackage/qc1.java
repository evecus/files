package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qc1 {
    public static final oc1 a = new oc1();
    public static final oc1 b;

    static {
        oc1 oc1Var = null;
        try {
            oc1Var = (oc1) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = oc1Var;
    }
}

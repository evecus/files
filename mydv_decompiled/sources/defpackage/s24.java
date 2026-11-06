package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class s24 {
    public static final t24 a;

    static {
        t24 t24Var = null;
        try {
            t24Var = (t24) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (t24Var == null) {
            t24Var = new t24();
        }
        a = t24Var;
    }

    public static k60 a(Class cls) {
        a.getClass();
        return new k60(cls);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class l74 {
    public static final k74 a;

    static {
        vl3 vl3Var = new vl3(50.0f);
        a = new k74(vl3Var, vl3Var, vl3Var, vl3Var);
    }

    public static final k74 a(float f) {
        s11 s11Var = new s11(f);
        return new k74(s11Var, s11Var, s11Var, s11Var);
    }

    public static k74 b(int i) {
        return new k74(new s11((i & 1) != 0 ? 0.0f : 28.0f), new s11((i & 2) != 0 ? 0.0f : 28.0f), new s11((i & 4) != 0 ? 0.0f : 28.0f), new s11((i & 8) != 0 ? 0.0f : 28.0f));
    }
}

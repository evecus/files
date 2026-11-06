package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class qd1 {
    public static final List a;

    static {
        Float valueOf = Float.valueOf(0.0f);
        uj3 uj3Var = new uj3(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        a = p70.k0(uj3Var, new uj3(valueOf2, valueOf2));
    }

    public static final long a(pd1 pd1Var) {
        pd1Var.getClass();
        List list = pd1Var.a;
        return rf1.a((((km0) o70.a1(list)).a() + ((km0) o70.T0(list)).a[0]) / 2.0f, (((km0) o70.a1(list)).b() + ((km0) o70.T0(list)).a[1]) / 2.0f);
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rk2 {
    public static n32 a(long j, Object obj) {
        n32 n32Var = (n32) ve5.j(j, obj);
        if (((e4) n32Var).I) {
            return n32Var;
        }
        int size = n32Var.size();
        n32 a = n32Var.a(size == 0 ? 10 : size * 2);
        ve5.q(obj, j, a);
        return a;
    }
}

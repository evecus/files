package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hv2 {
    public static fv2 a(Object obj, Object obj2) {
        fv2 fv2Var = (fv2) obj;
        fv2 fv2Var2 = (fv2) obj2;
        if (!fv2Var2.isEmpty()) {
            if (!fv2Var.I) {
                fv2Var = fv2Var.c();
            }
            fv2Var.b();
            if (!fv2Var2.isEmpty()) {
                fv2Var.putAll(fv2Var2);
            }
        }
        return fv2Var;
    }
}

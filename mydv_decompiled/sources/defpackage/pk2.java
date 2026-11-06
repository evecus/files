package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pk2 extends qk2 {
    @Override // defpackage.qk2
    public final void a(long j, Object obj) {
        ((f4) ((o32) we5.j(j, obj))).I = false;
    }

    @Override // defpackage.qk2
    public final void b(bp1 bp1Var, Object obj, long j) {
        o32 o32Var = (o32) we5.j(j, bp1Var);
        o32 o32Var2 = (o32) we5.j(j, obj);
        int size = o32Var.size();
        int size2 = o32Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((f4) o32Var).I) {
                o32Var = o32Var.a(size2 + size);
            }
            o32Var.addAll(o32Var2);
        }
        if (size > 0) {
            o32Var2 = o32Var;
        }
        we5.p(bp1Var, j, o32Var2);
    }

    @Override // defpackage.qk2
    public final List c(long j, Object obj) {
        o32 o32Var = (o32) we5.j(j, obj);
        if (((f4) o32Var).I) {
            return o32Var;
        }
        int size = o32Var.size();
        o32 a = o32Var.a(size == 0 ? 10 : size * 2);
        we5.p(obj, j, a);
        return a;
    }
}

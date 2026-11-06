package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tu2 implements bz2 {
    public bz2[] a;

    @Override // defpackage.bz2
    public final j04 a(Class cls) {
        for (bz2 bz2Var : this.a) {
            if (bz2Var.b(cls)) {
                return bz2Var.a(cls);
            }
        }
        zy.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.bz2
    public final boolean b(Class cls) {
        for (bz2 bz2Var : this.a) {
            if (bz2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}

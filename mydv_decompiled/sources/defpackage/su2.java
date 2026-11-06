package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class su2 implements az2 {
    public az2[] a;

    @Override // defpackage.az2
    public final i04 a(Class cls) {
        for (az2 az2Var : this.a) {
            if (az2Var.b(cls)) {
                return az2Var.a(cls);
            }
        }
        zy.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.az2
    public final boolean b(Class cls) {
        for (az2 az2Var : this.a) {
            if (az2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}

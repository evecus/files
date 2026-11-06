package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ay1 extends s2 {
    public final dy1 K;

    public ay1(int i, dy1 dy1Var) {
        super(dy1Var.size(), i);
        this.K = dy1Var;
    }

    @Override // defpackage.s2
    public final Object a(int i) {
        return this.K.get(i);
    }
}

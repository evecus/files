package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class yz4 implements q84 {
    public final hm1 I;
    public final String J;
    public boolean K;

    public yz4(hm1 hm1Var, String str) {
        this.I = hm1Var;
        this.J = str;
    }

    public final void e() {
        if (this.K) {
            lq2.l0(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.q84
    public final boolean x() {
        return getLong(0) != 0;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ni1 extends k13 implements mi1 {
    public ki1 I;

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        this.I.a.c(this);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.I.a.k(this);
        super.onDetach();
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ay extends k13 {
    public kg I;
    public final i9 J = new i9(this, (byte) 4);

    public ay(kg kgVar) {
        this.I = kgVar;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        this.I.invoke(this.J);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.I.invoke(null);
    }
}

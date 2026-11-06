package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gy extends k13 {
    public fy I;

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        fy fyVar = this.I;
        if (fyVar != null) {
            fyVar.a.k(this);
        }
        if (fyVar != null) {
            fyVar.a.c(this);
        }
        this.I = fyVar;
    }

    @Override // defpackage.k13
    public final void onDetach() {
        fy fyVar = this.I;
        if (fyVar != null) {
            fyVar.a.k(this);
        }
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xx0 extends k13 implements w31 {
    public ie2 I;

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        ArrayList arrayList = (ArrayList) this.I.h;
        if (arrayList.size() <= 0) {
            ((ya2) zh0Var).a();
        } else {
            r7.K(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx0) && j42.c(this.I, ((xx0) obj).I);
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // defpackage.k13
    public final void onAttach() {
        this.I.getClass();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        ie2 ie2Var = this.I;
        ie2Var.d();
        ie2Var.c = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.I + ")";
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}

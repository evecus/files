package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ea2 extends q13 {
    public final in1 a;

    public ea2(in1 in1Var) {
        this.a = in1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ma2 ma2Var = new ma2();
        ma2Var.I = this.a;
        return ma2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ea2) {
            return this.a == ((ea2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d(TtmlNode.TAG_LAYOUT);
        z12Var.b().b(this.a, "measure");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((ma2) k13Var).I = this.a;
    }
}

package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ky4 extends q13 {
    public final w11 a;

    public ky4(w11 w11Var) {
        this.a = w11Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new ly4(wx5.o0, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky4)) {
            return false;
        }
        ky4 ky4Var = (ky4) obj;
        ge geVar = wx5.o0;
        return geVar.equals(geVar) && j42.c(this.a, ky4Var.a);
    }

    public final int hashCode() {
        int i = ((AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED * 31) + 1237) * 31;
        w11 w11Var = this.a;
        return i + (w11Var == null ? 0 : w11Var.hashCode());
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "stylusHoverIcon";
        fq fqVar = z12Var.c;
        fqVar.b(wx5.o0, "icon");
        fqVar.b(Boolean.FALSE, "overrideDescendants");
        fqVar.b(this.a, "touchBoundsExpansion");
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + wx5.o0 + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ly4 ly4Var = (ly4) k13Var;
        ge geVar = wx5.o0;
        if (!j42.c(ly4Var.J, geVar)) {
            ly4Var.J = geVar;
            if (ly4Var.K) {
                ly4Var.l0();
            }
        }
        ly4Var.I = this.a;
    }
}

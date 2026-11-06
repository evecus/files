package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hp4 extends k13 implements na2, pi4 {
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public long N;
    public dn4 O;
    public boolean P;
    public long Q;
    public long R;
    public byte S;
    public w92 T;
    public i9 U;

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        if (this.P) {
            aj4.d(cj4Var, this.O);
        }
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return false;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(j);
        return ww2Var.A(u.I, u.J, p91.I, new m1(u, this, (byte) 18));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    public final String toString() {
        float f = this.I;
        float f2 = this.J;
        float f3 = this.K;
        float f4 = this.L;
        float f5 = this.M;
        String b = r95.b(this.N);
        dn4 dn4Var = this.O;
        boolean z = this.P;
        String i = x70.i(this.Q);
        String i2 = x70.i(this.R);
        String a = gw.a(this.S);
        w92 w92Var = this.T;
        StringBuilder B = hf1.B("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        B.append(f3);
        B.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        B.append(f4);
        B.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        B.append(f5);
        B.append(", transformOrigin=");
        B.append(b);
        B.append(", shape=");
        B.append(dn4Var);
        B.append(", clip=");
        B.append(z);
        B.append(", renderEffect=null, ambientShadowColor=");
        r7.N(B, i, ", spotShadowColor=", i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        B.append(a);
        B.append(", colorFilter=nulloutsets=");
        B.append(w92Var);
        B.append(")");
        return B.toString();
    }
}

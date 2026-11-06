package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fz1 extends pu {
    public rm1 W;
    public rm1 X;
    public rm1 Y;
    public rm1 Z;
    public float a0;
    public final float[] b0;
    public final k00 c0;

    public fz1(float f, float f2, float f3, float f4, long j, long j2, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, rx4 rx4Var, rx4 rx4Var2) {
        super(j, j2, rx4Var, rx4Var2, f2, f3, f4);
        this.W = rm1Var;
        this.X = rm1Var2;
        this.Y = rm1Var3;
        this.Z = rm1Var4;
        f = f < 0.0f ? 0.0f : f;
        this.a0 = f > 1.0f ? 1.0f : f;
        this.b0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        k00 k00Var = new k00(new m00(), new ez1(this, (byte) 0));
        j0(k00Var);
        this.c0 = k00Var;
    }

    @Override // defpackage.pu
    public final void m0() {
        mu0.I(this.c0);
    }

    @Override // defpackage.pu
    public final void n0() {
        this.c0.j0();
    }
}

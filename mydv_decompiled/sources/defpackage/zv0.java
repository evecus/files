package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zv0 extends pu {
    public rm1 W;
    public tm1 X;
    public float Y;
    public final float[] Z;
    public final k00 a0;

    public zv0(float f, float f2, float f3, float f4, long j, long j2, rm1 rm1Var, tm1 tm1Var, rx4 rx4Var, rx4 rx4Var2) {
        super(j, j2, rx4Var, rx4Var2, f2, f3, f4);
        this.W = rm1Var;
        this.X = tm1Var;
        this.Y = f;
        this.Z = new float[]{0.0f, 0.0f};
        k00 k00Var = new k00(new m00(), new yv0(this, (byte) 0));
        j0(k00Var);
        this.a0 = k00Var;
    }

    @Override // defpackage.pu
    public final void m0() {
        mu0.I(this.a0);
    }

    @Override // defpackage.pu
    public final void n0() {
        this.a0.j0();
    }

    public final float[] q0() {
        float[] fArr = this.Z;
        fArr[0] = 0.0f;
        float floatValue = ((Number) this.W.invoke()).floatValue();
        float f = floatValue >= 0.0f ? floatValue : 0.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }
}

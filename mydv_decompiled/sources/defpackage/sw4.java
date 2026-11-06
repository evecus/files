package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sw4 implements oy {
    public final rm1 b;
    public final da2 c;
    public final boolean d;
    public final oy e;

    public sw4(rm1 rm1Var, da2 da2Var, boolean z, oy oyVar) {
        this.b = rm1Var;
        this.c = da2Var;
        this.d = z;
        this.e = oyVar;
    }

    @Override // defpackage.oy
    public final float a(float f, float f2, float f3) {
        float intValue = ((Number) this.b.invoke()).intValue();
        boolean z = this.c == da2.J;
        if (this.d || !z) {
            f -= intValue;
        }
        return this.e.a(f, f2, f3 - intValue);
    }

    @Override // defpackage.oy
    public final ku4 b() {
        oy.a.getClass();
        return ny.b;
    }
}

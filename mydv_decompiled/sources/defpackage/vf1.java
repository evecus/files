package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vf1 implements nf1 {
    public final float a;
    public final ju4 b;

    public vf1(float f, float f2, float f3) {
        this.a = f3;
        ju4 ju4Var = new ju4();
        ju4Var.a = 1.0f;
        ju4Var.b = Math.sqrt(50.0d);
        ju4Var.c = 1.0f;
        if (f < 0.0f) {
            lr3.a("Damping ratio must be non-negative");
        }
        ju4Var.c = f;
        double d = ju4Var.b;
        if (((float) (d * d)) <= 0.0f) {
            lr3.a("Spring stiffness constant must be positive.");
        }
        ju4Var.b = Math.sqrt(f2);
        this.b = ju4Var;
    }

    @Override // defpackage.nf1, defpackage.bj
    public final /* synthetic */ ts0 a(ub5 ub5Var) {
        return jp0.j(this);
    }

    @Override // defpackage.nf1
    public final float b(long j, float f, float f2, float f3) {
        ju4 ju4Var = this.b;
        ju4Var.a = f2;
        return Float.intBitsToFloat((int) (ju4Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    @Override // defpackage.nf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf1.c(float, float, float):long");
    }

    @Override // defpackage.nf1
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.nf1
    public final float e(long j, float f, float f2, float f3) {
        ju4 ju4Var = this.b;
        ju4Var.a = f2;
        return Float.intBitsToFloat((int) (ju4Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.bj
    public final /* bridge */ /* synthetic */ xh5 a(ub5 ub5Var) {
        ts0 a;
        a = a(ub5Var);
        return a;
    }

    public /* synthetic */ vf1(float f, float f2) {
        this(f, f2, 0.01f);
    }
}

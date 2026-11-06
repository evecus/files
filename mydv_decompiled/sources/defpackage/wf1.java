package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wf1 implements nf1 {
    public final int a;
    public final l61 b;
    public final long c;
    public final long d;

    public wf1(int i, int i2, l61 l61Var) {
        this.a = i;
        this.b = l61Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.nf1, defpackage.bj
    public final /* synthetic */ ts0 a(ub5 ub5Var) {
        return jp0.j(this);
    }

    @Override // defpackage.nf1
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.nf1
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.nf1
    public final /* synthetic */ float d(float f, float f2, float f3) {
        return jp0.c(this, f, f2, f3);
    }

    @Override // defpackage.nf1
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float a = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.bj
    public final /* bridge */ /* synthetic */ xh5 a(ub5 ub5Var) {
        ts0 a;
        a = a(ub5Var);
        return a;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rt4 extends wy implements t32 {
    public final long a;

    public rt4(long j) {
        this.a = j;
    }

    @Override // defpackage.wy
    public final void a(float f, long j, qj3 qj3Var) {
        pd pdVar = (pd) qj3Var;
        pdVar.d(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = x70.c(j2, x70.d(j2) * f);
        }
        pdVar.f(j2);
        if (pdVar.c != null) {
            pdVar.i(null);
        }
    }

    @Override // defpackage.t32
    public final Object b(Object obj, float f) {
        if (obj == null) {
            int i = x70.h;
            obj = new rt4(x70.f);
        }
        if (!(obj instanceof rt4)) {
            return null;
        }
        return new rt4(qb.T(this.a, ((rt4) obj).a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt4)) {
            return false;
        }
        long j = ((rt4) obj).a;
        int i = x70.h;
        return zc5.a(this.a, j);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.a);
    }

    public final String toString() {
        return r7.C("SolidColor(value=", x70.i(this.a), ")");
    }
}

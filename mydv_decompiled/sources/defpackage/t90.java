package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t90 implements g55 {
    public final long a;

    public t90(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        r02.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.g55
    public final long a() {
        return this.a;
    }

    @Override // defpackage.g55
    public final /* synthetic */ g55 b(g55 g55Var) {
        return hf1.d(this, g55Var);
    }

    @Override // defpackage.g55
    public final g55 c(rm1 rm1Var) {
        return !equals(f55.a) ? this : (g55) rm1Var.invoke();
    }

    @Override // defpackage.g55
    public final wy d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        long j = ((t90) obj).a;
        int i = x70.h;
        return zc5.a(this.a, j);
    }

    @Override // defpackage.g55
    public final float getAlpha() {
        return x70.d(this.a);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.a);
    }

    public final String toString() {
        return r7.C("ColorStyle(value=", x70.i(this.a), ")");
    }
}

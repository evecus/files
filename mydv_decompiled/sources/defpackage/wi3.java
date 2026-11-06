package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wi3 implements me2 {
    public final is0 a;
    public final mu0 b;
    public final tl c;

    public wi3(is0 is0Var, vi3 vi3Var, tl tlVar) {
        this.a = is0Var;
        this.b = vi3Var;
        this.c = tlVar;
    }

    @Override // defpackage.me2
    public final int a() {
        return this.b.z().a;
    }

    @Override // defpackage.me2
    public final void b(int i, Object obj, fe0 fe0Var, int i2) {
        int i3;
        Object obj2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1201380429);
        byte b = 2;
        int i4 = (go1Var.e(i) ? 4 : 2) | i2 | (go1Var.i(obj) ? 32 : 16) | (go1Var.g(this) ? 256 : 128);
        if (go1Var.T(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            vt0.c(obj2, i3, this.a.A, p70.u0(1142237095, new lk5(this, i, b), go1Var), go1Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qc0(this, i3, obj2, i2);
        }
    }

    @Override // defpackage.me2
    public final Object c(int i) {
        Object e = this.c.e(i);
        return e == null ? this.b.A(i) : e;
    }

    @Override // defpackage.me2
    public final Object d(int i) {
        return null;
    }

    @Override // defpackage.me2
    public final int e(Object obj) {
        return this.c.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi3)) {
            return false;
        }
        return j42.c(this.b, ((wi3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

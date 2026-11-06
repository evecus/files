package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dd2 implements me2 {
    public final wd2 a;
    public final cd2 b;
    public final tl c;

    public dd2(wd2 wd2Var, cd2 cd2Var, tl tlVar) {
        this.a = wd2Var;
        this.b = cd2Var;
        this.c = tlVar;
    }

    @Override // defpackage.me2
    public final int a() {
        return this.b.z().a;
    }

    @Override // defpackage.me2
    public final void b(int i, Object obj, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1493551140);
        int i3 = (go1Var.e(i) ? 4 : 2) | i2 | (go1Var.i(obj) ? 32 : 16) | (go1Var.g(this) ? 256 : 128);
        byte b = 1;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            vt0.c(obj, i, this.a.q, p70.u0(726189336, new zu0(this, i, b), go1Var), go1Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj(this, i, obj, i2, (byte) 6);
        }
    }

    @Override // defpackage.me2
    public final Object c(int i) {
        Object e = this.c.e(i);
        return e == null ? this.b.A(i) : e;
    }

    @Override // defpackage.me2
    public final Object d(int i) {
        return this.b.u(i);
    }

    @Override // defpackage.me2
    public final int e(Object obj) {
        return this.c.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd2)) {
            return false;
        }
        return j42.c(this.b, ((dd2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

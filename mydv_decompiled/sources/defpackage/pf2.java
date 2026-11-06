package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pf2 implements me2 {
    public final ag2 a;
    public final of2 b;
    public final zd2 c;
    public final tl d;

    public pf2(ag2 ag2Var, of2 of2Var, zd2 zd2Var, tl tlVar) {
        this.a = ag2Var;
        this.b = of2Var;
        this.c = zd2Var;
        this.d = tlVar;
    }

    @Override // defpackage.me2
    public final int a() {
        return this.b.z().a;
    }

    @Override // defpackage.me2
    public final void b(int i, Object obj, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-462424778);
        byte b = 2;
        int i3 = (go1Var.e(i) ? 4 : 2) | i2 | (go1Var.i(obj) ? 32 : 16) | (go1Var.g(this) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            vt0.c(obj, i, this.a.s, p70.u0(-824725566, new zu0(this, i, b), go1Var), go1Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj(this, i, obj, i2, (byte) 7);
        }
    }

    @Override // defpackage.me2
    public final Object c(int i) {
        Object e = this.d.e(i);
        return e == null ? this.b.A(i) : e;
    }

    @Override // defpackage.me2
    public final Object d(int i) {
        return this.b.u(i);
    }

    @Override // defpackage.me2
    public final int e(Object obj) {
        return this.d.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf2)) {
            return false;
        }
        return j42.c(this.b, ((pf2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

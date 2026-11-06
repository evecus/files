package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gf2 implements ff2 {
    public final /* synthetic */ is0 a;
    public final /* synthetic */ boolean b;

    public gf2(is0 is0Var, boolean z) {
        this.a = is0Var;
        this.b = z;
    }

    @Override // defpackage.ff2
    public final int a() {
        is0 is0Var = this.a;
        return (int) (is0Var.k().e == pg3.I ? is0Var.k().g() & 4294967295L : is0Var.k().g() >> 32);
    }

    @Override // defpackage.ff2
    public final float b() {
        return rt0.m(this.a);
    }

    @Override // defpackage.ff2
    public final Object c(int i, ou ouVar) {
        Object t = jj3.t(this.a, i, ouVar);
        return t == el0.I ? t : wd5.a;
    }

    @Override // defpackage.ff2
    public final int d() {
        is0 is0Var = this.a;
        return (-is0Var.k().f) + is0Var.k().d;
    }

    @Override // defpackage.ff2
    public final float e() {
        is0 is0Var = this.a;
        return nj3.a(is0Var.k(), is0Var.l());
    }

    @Override // defpackage.ff2
    public final l70 f() {
        boolean z = this.b;
        is0 is0Var = this.a;
        return z ? new l70(is0Var.l(), 1) : new l70(1, is0Var.l());
    }
}

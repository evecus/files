package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gg2 implements ff2 {
    public final /* synthetic */ wd2 a;

    public gg2(wd2 wd2Var) {
        this.a = wd2Var;
    }

    @Override // defpackage.ff2
    public final int a() {
        wd2 wd2Var = this.a;
        return (int) (wd2Var.g().r == pg3.I ? wd2Var.g().g() & 4294967295L : wd2Var.g().g() >> 32);
    }

    @Override // defpackage.ff2
    public final float b() {
        wd2 wd2Var = this.a;
        return (((gk3) wd2Var.d.b).h() * 500) + ((gk3) wd2Var.d.c).h();
    }

    @Override // defpackage.ff2
    public final Object c(int i, ou ouVar) {
        da daVar = wd2.w;
        wd2 wd2Var = this.a;
        wd2Var.getClass();
        Object d = wd2Var.d(d53.I, new vd2(wd2Var, i, null, (byte) 0), ouVar);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (d != el0Var) {
            d = wd5Var;
        }
        return d == el0Var ? d : wd5Var;
    }

    @Override // defpackage.ff2
    public final int d() {
        wd2 wd2Var = this.a;
        return (-wd2Var.g().o) + wd2Var.g().s;
    }

    @Override // defpackage.ff2
    public final float e() {
        wd2 wd2Var = this.a;
        int h = ((gk3) wd2Var.d.b).h();
        int h2 = ((gk3) wd2Var.d.c).h();
        return wd2Var.c() ? (h * 500) + h2 + 100.0f : (h * 500) + h2;
    }

    @Override // defpackage.ff2
    public final l70 f() {
        return new l70(-1, -1);
    }
}

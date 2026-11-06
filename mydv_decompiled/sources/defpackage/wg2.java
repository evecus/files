package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wg2 implements ff2 {
    public final /* synthetic */ zg2 a;

    public wg2(zg2 zg2Var) {
        this.a = zg2Var;
    }

    @Override // defpackage.ff2
    public final int a() {
        zg2 zg2Var = this.a;
        return (int) (zg2Var.g().u == pg3.I ? zg2Var.g().n & 4294967295L : zg2Var.g().n >> 32);
    }

    @Override // defpackage.ff2
    public final float b() {
        zg2 zg2Var = this.a;
        return (zg2Var.c.c.h() * 500) + zg2Var.c.e.h();
    }

    @Override // defpackage.ff2
    public final Object c(int i, ou ouVar) {
        Object i2 = zg2.i(this.a, i, ouVar);
        return i2 == el0.I ? i2 : wd5.a;
    }

    @Override // defpackage.ff2
    public final int d() {
        zg2 zg2Var = this.a;
        return zg2Var.g().q + zg2Var.g().r;
    }

    @Override // defpackage.ff2
    public final float e() {
        zg2 zg2Var = this.a;
        int h = zg2Var.c.c.h();
        int h2 = zg2Var.c.e.h();
        return zg2Var.c() ? (h * 500) + h2 + 100.0f : (h * 500) + h2;
    }

    @Override // defpackage.ff2
    public final l70 f() {
        return new l70(-1, -1);
    }
}

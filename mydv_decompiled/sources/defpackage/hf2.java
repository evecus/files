package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hf2 implements ff2 {
    public final wu0 a;
    public final /* synthetic */ ag2 b;
    public final /* synthetic */ boolean c;

    public hf2(ag2 ag2Var, boolean z) {
        this.b = ag2Var;
        this.c = z;
        this.a = dt4.b(new d40(ag2Var, (byte) 1));
    }

    @Override // defpackage.ff2
    public final int a() {
        ag2 ag2Var = this.b;
        return (int) (ag2Var.h().p == pg3.I ? ag2Var.h().g() & 4294967295L : ag2Var.h().g() >> 32);
    }

    @Override // defpackage.ff2
    public final float b() {
        ag2 ag2Var = this.b;
        return (((gk3) ag2Var.e.b).h() * 500) + ((gk3) ag2Var.e.c).h();
    }

    @Override // defpackage.ff2
    public final Object c(int i, ou ouVar) {
        Object j = ag2.j(this.b, i, ouVar);
        return j == el0.I ? j : wd5.a;
    }

    @Override // defpackage.ff2
    public final int d() {
        ag2 ag2Var = this.b;
        return (-ag2Var.h().m) + ag2Var.h().q;
    }

    @Override // defpackage.ff2
    public final float e() {
        ag2 ag2Var = this.b;
        int h = ((gk3) ag2Var.e.b).h();
        int h2 = ((gk3) ag2Var.e.c).h();
        return ag2Var.c() ? (h * 500) + h2 + 100.0f : (h * 500) + h2;
    }

    @Override // defpackage.ff2
    public final l70 f() {
        boolean z = this.c;
        wu0 wu0Var = this.a;
        return z ? new l70(((Number) wu0Var.getValue()).intValue(), 1) : new l70(1, ((Number) wu0Var.getValue()).intValue());
    }
}

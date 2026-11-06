package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fa1 extends r92 implements tm1 {
    public final /* synthetic */ on4 J;
    public final /* synthetic */ cw4 K;
    public final /* synthetic */ cw4 L;
    public final /* synthetic */ cw4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa1(on4 on4Var, x95 x95Var, x95 x95Var2, x95 x95Var3) {
        super(1);
        this.J = on4Var;
        this.K = x95Var;
        this.L = x95Var2;
        this.M = x95Var3;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        n54 n54Var = (n54) obj;
        cw4 cw4Var = this.K;
        float floatValue = cw4Var != null ? ((Number) cw4Var.getValue()).floatValue() : 1.0f;
        on4 on4Var = this.J;
        s95 s95Var = on4Var.c;
        fk3 fk3Var = s95Var.d;
        float h = floatValue * ((on4Var.b() && ((Boolean) s95Var.a.getValue()).booleanValue()) ? s95Var.b.h() : 1.0f);
        if (on4Var.b()) {
            on4Var.f = h;
        }
        n54Var.b(h);
        cw4 cw4Var2 = this.L;
        float floatValue2 = cw4Var2 != null ? ((Number) cw4Var2.getValue()).floatValue() : 1.0f;
        boolean z = on4Var.b() && ((Boolean) s95Var.c.getValue()).booleanValue();
        float h2 = floatValue2 * (z ? fk3Var.h() : 1.0f);
        if (on4Var.b()) {
            on4Var.g = h2;
            if (z) {
                fk3Var.h();
            }
            if (z) {
                li5 li5Var = on4Var.j;
                if (li5Var == null) {
                    li5Var = new li5(false);
                    on4Var.j = li5Var;
                }
                li5Var.a(t41.d(o75.a(on4Var.d)), h2);
            }
        }
        n54Var.l(h2);
        n54Var.o(h2);
        cw4 cw4Var3 = this.M;
        long j = cw4Var3 != null ? ((r95) cw4Var3.getValue()).a : r95.b;
        if (on4Var.b() && ((Boolean) s95Var.e.getValue()).booleanValue()) {
            j = ((r95) s95Var.f.getValue()).a;
        }
        if (on4Var.b()) {
            on4Var.h = j;
        }
        n54Var.u(j);
        return wd5.a;
    }
}

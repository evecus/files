package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oa1 extends r92 implements tm1 {
    public final /* synthetic */ sa1 J;
    public final /* synthetic */ cw4 K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;
    public final /* synthetic */ bn3 N;
    public final /* synthetic */ long O;
    public final /* synthetic */ fa1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(sa1 sa1Var, x95 x95Var, long j, long j2, long j3, bn3 bn3Var, long j4, fa1 fa1Var) {
        super(1);
        this.J = sa1Var;
        this.K = x95Var;
        this.L = j2;
        this.M = j3;
        this.N = bn3Var;
        this.O = j4;
        this.P = fa1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        an3 an3Var = (an3) obj;
        sa1 sa1Var = this.J;
        on4 on4Var = sa1Var.O;
        cw4 cw4Var = this.K;
        long j = cw4Var != null ? ((r22) cw4Var.getValue()).a : 0L;
        on4Var.b();
        on4Var.b();
        long c = r22.c(j, 0L);
        if (on4Var.b()) {
            on4Var.i = c;
        }
        u8 u8Var = sa1Var.S;
        long c2 = r22.c(u8Var != null ? u8Var.a(this.L, this.M, da2.I) : 0L, c);
        long j2 = this.O;
        long j3 = ((((int) (c2 >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (c2 & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
        bn3 bn3Var = this.N;
        an3Var.f(bn3Var);
        bn3Var.d0(r22.c(j3, bn3Var.M), 0.0f, this.P);
        return wd5.a;
    }
}

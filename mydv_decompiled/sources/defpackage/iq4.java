package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iq4 extends r92 implements tm1 {
    public final /* synthetic */ long J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ ww2 M;
    public final /* synthetic */ bn3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq4(jq4 jq4Var, long j, int i, int i2, ww2 ww2Var, bn3 bn3Var) {
        super(1);
        this.J = j;
        this.K = i;
        this.L = i2;
        this.M = ww2Var;
        this.N = bn3Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        an3 an3Var = (an3) obj;
        long j = (this.K << 32) | (this.L & 4294967295L);
        da2 layoutDirection = this.M.getLayoutDirection();
        long j2 = this.J;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == da2.I ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        an3.h(an3Var, this.N, (Math.round(f4) & 4294967295L) | (round << 32));
        return wd5.a;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mg extends wu5 {
    public final /* synthetic */ ir5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(ir5 ir5Var) {
        super(1);
        this.K = ir5Var;
    }

    @Override // defpackage.wu5
    public final yv5 c(yv5 yv5Var, List list) {
        return this.K.m(yv5Var);
    }

    @Override // defpackage.wu5
    public final da d(ev5 ev5Var, da daVar) {
        x02 x02Var = this.K.k0.n0.c;
        if (x02Var.h()) {
            long U = sv2.U(x02Var.M(0L));
            int i = (int) (U >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (U & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long o = mu0.q(x02Var).o();
            int i3 = (int) (o >> 32);
            int i4 = (int) (o & 4294967295L);
            long j = x02Var.K;
            long U2 = sv2.U(x02Var.M((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
            int i5 = i3 - ((int) (U2 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (U2 & 4294967295L));
            int i7 = i6 >= 0 ? i6 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                return new da(qg.k((o12) daVar.J, i, i2, i5, i7), qg.k((o12) daVar.K, i, i2, i5, i7), (byte) 15);
            }
        }
        return daVar;
    }
}

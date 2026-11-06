package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bv implements f35 {
    public final tc0 a;
    public final k53 b = new k53();
    public final jk3 c = ad4.w(null);

    public bv(tc0 tc0Var) {
        this.a = tc0Var;
    }

    @Override // defpackage.f35
    public final Object a(w25 w25Var, k05 k05Var) {
        Object o0 = i42.o0(new nu1(this.b, new pf(this, new av(w25Var), null, (byte) 1), null), k05Var);
        return o0 == el0.I ? o0 : wd5.a;
    }

    public final void b(final rm1 rm1Var, fe0 fe0Var, final int i) {
        final rm1 rm1Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(723898654);
        int i2 = (go1Var.g(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            av avVar = (av) this.c.getValue();
            if (avVar == null) {
                x04 u = go1Var.u();
                if (u != null) {
                    u.d = new hn1(this, rm1Var, i, b) { // from class: zu
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ bv J;
                        public final /* synthetic */ rm1 K;

                        {
                            this.I = b;
                            this.J = this;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.I;
                            wd5 wd5Var = wd5.a;
                            rm1 rm1Var3 = this.K;
                            bv bvVar = this.J;
                            fe0 fe0Var2 = (fe0) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    bvVar.b(rm1Var3, fe0Var2, mu0.X(7));
                                    break;
                                default:
                                    bvVar.b(rm1Var3, fe0Var2, mu0.X(7));
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    return;
                }
                return;
            }
            rm1Var2 = rm1Var;
            this.a.e(avVar, avVar.a, rm1Var2, go1Var, Integer.valueOf(RendererCapabilities.DECODER_SUPPORT_MASK));
        } else {
            rm1Var2 = rm1Var;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1(this, rm1Var2, i, b2) { // from class: zu
                public final /* synthetic */ byte I;
                public final /* synthetic */ bv J;
                public final /* synthetic */ rm1 K;

                {
                    this.I = b2;
                    this.J = this;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.I;
                    wd5 wd5Var = wd5.a;
                    rm1 rm1Var3 = this.K;
                    bv bvVar = this.J;
                    fe0 fe0Var2 = (fe0) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            bvVar.b(rm1Var3, fe0Var2, mu0.X(7));
                            break;
                        default:
                            bvVar.b(rm1Var3, fe0Var2, mu0.X(7));
                            break;
                    }
                    return wd5Var;
                }
            };
        }
    }
}

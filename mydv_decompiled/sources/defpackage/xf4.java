package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class xf4 extends p51 {
    public static final e41[] i = {new wf4(n51.b)};
    public final h61 h;

    public xf4() {
        super(113, 9, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 1);
        this.b = new wf4(new BigInteger(1, et1.b("003088250CA6E7C7FE649CE85820F7")));
        this.c = new wf4(new BigInteger(1, et1.b("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, et1.b("0100000000000000D9CCEC8A39E56F"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.r(i3, ((wf4) g61Var.b).r, jArr);
            jl2.r(i3 + 2, ((wf4) g61Var.c).r, jArr);
            i3 += 4;
        }
        return new qm0(this, i2, jArr, (byte) 14);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 1);
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.v51
    public final boolean p(int i2) {
        return i2 == 6;
    }
}

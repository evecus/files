package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class xg4 extends p51 {
    public static final e41[] i = {new ug4(n51.b)};
    public static final ug4 j;
    public static final ug4 k;
    public final h61 h;

    static {
        ug4 ug4Var = new ug4(new BigInteger(1, et1.b("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        j = ug4Var;
        k = (ug4) ug4Var.p0();
    }

    public xg4() {
        super(571, 2, 5, 10);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 18);
        this.b = new ug4(BigInteger.valueOf(1L));
        this.c = j;
        this.d = new BigInteger(1, et1.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new xg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 18];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.u(i3, ((ug4) g61Var.b).r, jArr);
            jl2.u(i3 + 9, ((ug4) g61Var.c).r, jArr);
            i3 += 18;
        }
        return new vg4(this, i2, jArr, (byte) 1);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 18);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new ug4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 571;
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

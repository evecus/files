package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class sg4 extends p51 {
    public static final e41[] i = {new rg4(n51.b)};
    public final h61 h;

    public sg4() {
        super(409, 87, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 15);
        this.b = new rg4(BigInteger.valueOf(0L));
        this.c = new rg4(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, et1.b("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.e = BigInteger.valueOf(4L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new sg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            il2.p(i3, ((rg4) g61Var.b).r, jArr);
            il2.p(i3 + 7, ((rg4) g61Var.c).r, jArr);
            i3 += 14;
        }
        return new qm0(this, i2, jArr, (byte) 28);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 15);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new rg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 409;
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

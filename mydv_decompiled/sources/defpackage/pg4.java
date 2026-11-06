package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class pg4 extends p51 {
    public static final e41[] i = {new og4(n51.b)};
    public final h61 h;

    public pg4() {
        super(283, 5, 7, 12);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 13);
        this.b = new og4(BigInteger.valueOf(0L));
        this.c = new og4(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, et1.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new pg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            dq2.y(i3, ((og4) g61Var.b).r, jArr);
            dq2.y(i3 + 5, ((og4) g61Var.c).r, jArr);
            i3 += 10;
        }
        return new qm0(this, i2, jArr, (byte) 26);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 13);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new og4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 283;
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

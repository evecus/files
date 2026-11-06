package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class kg4 extends p51 {
    public static final e41[] i = {new jg4(n51.b)};
    public final h61 h;

    public kg4() {
        super(233, 74, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 10);
        this.b = new jg4(BigInteger.valueOf(0L));
        this.c = new jg4(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, et1.b("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.e = BigInteger.valueOf(4L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new kg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.t(i3, ((jg4) g61Var.b).r, jArr);
            jl2.t(i3 + 4, ((jg4) g61Var.c).r, jArr);
            i3 += 8;
        }
        return new qm0(this, i2, jArr, (byte) 23);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 10);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new jg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 233;
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

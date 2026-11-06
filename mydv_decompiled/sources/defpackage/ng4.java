package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ng4 extends p51 {
    public static final e41[] i = {new mg4(n51.b)};
    public final h61 h;

    public ng4() {
        super(239, 158, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 12);
        this.b = new mg4(BigInteger.valueOf(0L));
        this.c = new mg4(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, et1.b("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.e = BigInteger.valueOf(4L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new ng4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.t(i3, ((mg4) g61Var.b).r, jArr);
            jl2.t(i3 + 4, ((mg4) g61Var.c).r, jArr);
            i3 += 8;
        }
        return new qm0(this, i2, jArr, (byte) 25);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 12);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new mg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 239;
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

package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class dg4 extends p51 {
    public static final e41[] i = {new cg4(n51.b)};
    public final h61 h;

    public dg4() {
        super(163, 3, 6, 7);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 5);
        cg4 cg4Var = new cg4(BigInteger.valueOf(1L));
        this.b = cg4Var;
        this.c = cg4Var;
        this.d = new BigInteger(1, et1.b("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new dg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 6];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            lq2.w(i3, ((cg4) g61Var.b).r, jArr);
            lq2.w(i3 + 3, ((cg4) g61Var.c).r, jArr);
            i3 += 6;
        }
        return new qm0(this, i2, jArr, (byte) 18);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 5);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new cg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 163;
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

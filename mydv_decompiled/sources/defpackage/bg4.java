package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class bg4 extends p51 {
    public static final e41[] i = {new zf4(n51.b)};
    public final h61 h;

    public bg4() {
        super(131, 2, 3, 8);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 4);
        this.b = new zf4(new BigInteger(1, et1.b("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = new zf4(new BigInteger(1, et1.b("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, et1.b("0400000000000000016954A233049BA98F"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new bg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 6];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            lq2.w(i3, ((zf4) g61Var.b).r, jArr);
            lq2.w(i3 + 3, ((zf4) g61Var.c).r, jArr);
            i3 += 6;
        }
        return new qm0(this, i2, jArr, (byte) 17);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 4);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new zf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 131;
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

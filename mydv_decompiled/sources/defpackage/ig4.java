package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ig4 extends p51 {
    public static final e41[] i = {new gg4(n51.b)};
    public final h61 h;

    public ig4() {
        super(193, 15, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 9);
        this.b = new gg4(new BigInteger(1, et1.b("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = new gg4(new BigInteger(1, et1.b("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, et1.b("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new ig4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.t(i3, ((gg4) g61Var.b).r, jArr);
            jl2.t(i3 + 4, ((gg4) g61Var.c).r, jArr);
            i3 += 8;
        }
        return new qm0(this, i2, jArr, (byte) 22);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 9);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new gg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 193;
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

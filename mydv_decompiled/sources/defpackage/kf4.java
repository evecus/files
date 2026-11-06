package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class kf4 extends q51 {
    public static final BigInteger i = lf4.s;
    public static final e41[] j = {new lf4(n51.b)};
    public final tm0 h;

    public kf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 9);
        this.b = new lf4(n51.a);
        this.c = new lf4(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, et1.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new kf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            il2.n(i3, ((lf4) g61Var.b).r, iArr);
            il2.n(i3 + 7, ((lf4) g61Var.c).r, iArr);
            i3 += 14;
        }
        return new qm0(this, i2, iArr, (byte) 8);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 9);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new lf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 28;
    }

    @Override // defpackage.v51
    public final int j() {
        return 224;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[7];
        do {
            byte[] bArr = new byte[28];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 7);
            } while (dq2.j0(7, iArr, qg5.z) == 0);
        } while (dq2.D(7, iArr) != 0);
        return new lf4(iArr);
    }

    @Override // defpackage.v51
    public final boolean p(int i2) {
        return i2 == 2;
    }

    @Override // defpackage.q51
    public final BigInteger q() {
        return i;
    }
}

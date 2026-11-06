package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class uf4 extends q51 {
    public static final BigInteger i = vf4.s;
    public static final e41[] j = {new vf4(n51.b)};
    public final tm0 h;

    public uf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 14);
        this.b = new vf4(new BigInteger(1, et1.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new vf4(new BigInteger(1, et1.b("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, et1.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new uf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 34];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            System.arraycopy(((vf4) g61Var.b).r, 0, iArr, i3, 17);
            System.arraycopy(((vf4) g61Var.c).r, 0, iArr, i3 + 17, 17);
            i3 += 34;
        }
        return new qm0(this, i2, iArr, (byte) 13);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 14);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new vf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 66;
    }

    @Override // defpackage.v51
    public final int j() {
        return 521;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[17];
        do {
            byte[] bArr = new byte[68];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 17);
                iArr[16] = iArr[16] & 511;
            } while (dq2.j0(17, iArr, eu5.K) == 0);
        } while (dq2.D(17, iArr) != 0);
        return new vf4(iArr);
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

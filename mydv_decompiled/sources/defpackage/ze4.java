package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class ze4 extends q51 {
    public static final BigInteger i = af4.s;
    public static final e41[] j = {new af4(n51.b)};
    public final tm0 h;

    public ze4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 3);
        this.b = new af4(new BigInteger(1, et1.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new af4(new BigInteger(1, et1.b("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, et1.b("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new ze4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.p(i3, ((af4) g61Var.b).r, iArr);
            jl2.p(i3 + 4, ((af4) g61Var.c).r, iArr);
            i3 += 8;
        }
        return new qm0(this, i2, iArr, (byte) 2);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 3);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new af4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 16;
    }

    @Override // defpackage.v51
    public final int j() {
        return 128;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[4];
        do {
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 4);
            } while (dq2.j0(4, iArr, j16.i0) == 0);
        } while (dq2.D(4, iArr) != 0);
        return new af4(iArr);
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

package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class cf4 extends q51 {
    public static final BigInteger i = df4.s;
    public static final e41[] j = {new df4(n51.b)};
    public final tm0 h;

    public cf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 5);
        this.b = new df4(new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = new df4(new BigInteger(1, et1.b("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, et1.b("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new cf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            dq2.w(i3, ((df4) g61Var.b).r, iArr);
            dq2.w(i3 + 5, ((df4) g61Var.c).r, iArr);
            i3 += 10;
        }
        return new qm0(this, i2, iArr, (byte) 4);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 5);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new df4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 20;
    }

    @Override // defpackage.v51
    public final int j() {
        return 160;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[5];
        do {
            byte[] bArr = new byte[20];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 5);
            } while (dq2.j0(5, iArr, qg5.w) == 0);
        } while (dq2.D(5, iArr) != 0);
        return new df4(iArr);
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

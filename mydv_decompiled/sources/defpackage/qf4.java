package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class qf4 extends q51 {
    public static final BigInteger i = rf4.s;
    public static final e41[] j = {new rf4(n51.b)};
    public final tm0 h;

    public qf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 12);
        this.b = new rf4(new BigInteger(1, et1.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new rf4(new BigInteger(1, et1.b("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.d = new BigInteger(1, et1.b("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new qf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 16];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.q(i3, ((rf4) g61Var.b).r, iArr);
            jl2.q(i3 + 8, ((rf4) g61Var.c).r, iArr);
            i3 += 16;
        }
        return new qm0(this, i2, iArr, (byte) 11);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 12);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new rf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 32;
    }

    @Override // defpackage.v51
    public final int j() {
        return 256;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 8);
            } while (dq2.j0(8, iArr, j16.o0) == 0);
        } while (dq2.D(8, iArr) != 0);
        return new rf4(iArr);
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

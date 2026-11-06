package defpackage;

import androidx.media3.common.util.Log;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class rm0 extends q51 {
    public static final BigInteger i = sm0.s;
    public static final BigInteger j;
    public static final BigInteger k;
    public static final e41[] l;
    public final tm0 h;

    static {
        BigInteger bigInteger = new BigInteger(1, et1.b("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        j = bigInteger;
        k = new BigInteger(1, et1.b("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        l = new e41[]{new sm0(n51.b), new sm0(bigInteger)};
    }

    public rm0() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 0);
        this.b = new sm0(j);
        this.c = new sm0(k);
        this.d = new BigInteger(1, et1.b("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = (byte) 4;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new rm0();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 16];
        byte b = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.q(i3, ((sm0) g61Var.b).r, iArr);
            jl2.q(i3 + 8, ((sm0) g61Var.c).r, iArr);
            i3 += 16;
        }
        return new qm0(this, i2, iArr, b);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, (byte) 0);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new sm0(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return i.bitLength();
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
                iArr[7] = iArr[7] & Log.LOG_LEVEL_OFF;
            } while (dq2.j0(8, iArr, wx5.p) == 0);
        } while (dq2.D(8, iArr) != 0);
        return new sm0(iArr);
    }

    @Override // defpackage.v51
    public final boolean p(int i2) {
        return i2 == 4;
    }
}

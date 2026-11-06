package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class l84 extends q51 {
    public static final BigInteger i = m84.s;
    public static final e41[] j = {new m84(n51.b)};
    public final tm0 h;

    public l84() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 2);
        this.b = new m84(new BigInteger(1, et1.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.c = new m84(new BigInteger(1, et1.b("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, et1.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new l84();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 16];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.q(i3, ((m84) g61Var.b).r, iArr);
            jl2.q(i3 + 8, ((m84) g61Var.c).r, iArr);
            i3 += 16;
        }
        return new qm0(this, i2, iArr, (byte) 1);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, (byte) 2);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new m84(bigInteger);
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
            } while (dq2.j0(8, iArr, qg5.u) == 0);
        } while (dq2.D(8, iArr) != 0);
        return new m84(iArr);
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

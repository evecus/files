package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class sf4 extends q51 {
    public static final BigInteger i = tf4.s;
    public static final e41[] j = {new tf4(n51.b)};
    public final tm0 h;

    public sf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 13);
        this.b = new tf4(new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.c = new tf4(new BigInteger(1, et1.b("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.d = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new sf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 24];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte b = 12;
            if (i3 >= i2) {
                return new qm0(this, i2, iArr, b);
            }
            g61 g61Var = g61VarArr[i3];
            System.arraycopy(((tf4) g61Var.b).r, 0, iArr, i4, 12);
            System.arraycopy(((tf4) g61Var.c).r, 0, iArr, i4 + 12, 12);
            i4 += 24;
            i3++;
        }
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 13);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new tf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 48;
    }

    @Override // defpackage.v51
    public final int j() {
        return RendererCapabilities.DECODER_SUPPORT_MASK;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[12];
        do {
            byte[] bArr = new byte[48];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 12);
            } while (dq2.j0(12, iArr, qg5.C) == 0);
        } while (dq2.D(12, iArr) != 0);
        return new tf4(iArr);
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

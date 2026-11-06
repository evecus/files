package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class if4 extends q51 {
    public static final BigInteger i = jf4.s;
    public static final e41[] j = {new jf4(n51.b)};
    public final tm0 h;

    public if4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 8);
        this.b = new jf4(new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = new jf4(new BigInteger(1, et1.b("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new if4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 12];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            lq2.v(i3, ((jf4) g61Var.b).r, iArr);
            lq2.v(i3 + 6, ((jf4) g61Var.c).r, iArr);
            i3 += 12;
        }
        return new qm0(this, i2, iArr, (byte) 7);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 8);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new jf4(bigInteger);
    }

    @Override // defpackage.v51
    public final int i() {
        return 24;
    }

    @Override // defpackage.v51
    public final int j() {
        return PsExtractor.AUDIO_STREAM;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.q51, defpackage.v51
    public final e41 o(SecureRandom secureRandom) {
        int[] iArr = new int[6];
        do {
            byte[] bArr = new byte[24];
            do {
                secureRandom.nextBytes(bArr);
                dq2.l0(bArr, iArr, 6);
            } while (dq2.j0(6, iArr, j16.l0) == 0);
        } while (dq2.D(6, iArr) != 0);
        return new jf4(iArr);
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

package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class gf4 extends q51 {
    public static final BigInteger i = hf4.s;
    public static final e41[] j = {new hf4(n51.b)};
    public final tm0 h;

    public gf4() {
        super(i);
        e41 e41Var = null;
        this.h = new tm0(this, e41Var, e41Var, (byte) 7);
        this.b = new hf4(n51.a);
        this.c = new hf4(BigInteger.valueOf(3L));
        this.d = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1L);
        this.f = (byte) 2;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new gf4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        int[] iArr = new int[i2 * 12];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            lq2.v(i3, ((hf4) g61Var.b).r, iArr);
            lq2.v(i3 + 6, ((hf4) g61Var.c).r, iArr);
            i3 += 12;
        }
        return new qm0(this, i2, iArr, (byte) 6);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, j, (byte) 7);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new hf4(bigInteger);
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
            } while (dq2.j0(6, iArr, wx5.g0) == 0);
        } while (dq2.D(6, iArr) != 0);
        return new hf4(iArr);
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

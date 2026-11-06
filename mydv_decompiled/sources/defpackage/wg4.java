package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class wg4 extends p51 {
    public static final e41[] i = {new ug4(n51.b)};
    public final h61 h;

    public wg4() {
        super(571, 2, 5, 10);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 17);
        this.b = new ug4(BigInteger.valueOf(0L));
        this.c = new ug4(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, et1.b("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new wg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 18];
        byte b = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            jl2.u(i3, ((ug4) g61Var.b).r, jArr);
            jl2.u(i3 + 9, ((ug4) g61Var.c).r, jArr);
            i3 += 18;
        }
        return new vg4(this, i2, jArr, b);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 17);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new ug4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 571;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.h;
    }

    @Override // defpackage.v51
    public final boolean p(int i2) {
        return i2 == 6;
    }
}

package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class tg4 extends p51 {
    public static final e41[] i = {new rg4(n51.b)};
    public final h61 h;

    public tg4() {
        super(409, 87, 0, 0);
        e41 e41Var = null;
        this.h = new h61(this, e41Var, e41Var, (byte) 16);
        this.b = new rg4(BigInteger.valueOf(1L));
        this.c = new rg4(new BigInteger(1, et1.b("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, et1.b("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.e = BigInteger.valueOf(2L);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        return new tg4();
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i2) {
        long[] jArr = new long[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            g61 g61Var = g61VarArr[i4];
            il2.p(i3, ((rg4) g61Var.b).r, jArr);
            il2.p(i3 + 7, ((rg4) g61Var.c).r, jArr);
            i3 += 14;
        }
        return new qm0(this, i2, jArr, (byte) 29);
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 16);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        return new rg4(bigInteger);
    }

    @Override // defpackage.v51
    public final int j() {
        return 409;
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

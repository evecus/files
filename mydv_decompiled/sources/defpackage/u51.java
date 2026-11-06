package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u51 extends q51 {
    public static final Set k = DesugarCollections.synchronizedSet(new HashSet());
    public static final yv l = new yv((byte) 0);
    public BigInteger h;
    public BigInteger i;
    public tm0 j;

    /* JADX WARN: Code restructure failed: missing block: B:138:0x022d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u51(java.math.BigInteger r19, java.math.BigInteger r20, java.math.BigInteger r21, java.math.BigInteger r22, java.math.BigInteger r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u51.<init>(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, boolean):void");
    }

    @Override // defpackage.v51
    public final v51 a() {
        BigInteger bigInteger = this.h;
        BigInteger bigInteger2 = this.i;
        e41 e41Var = this.b;
        e41 e41Var2 = this.c;
        BigInteger bigInteger3 = this.d;
        BigInteger bigInteger4 = this.e;
        u51 u51Var = new u51(bigInteger);
        u51Var.h = bigInteger;
        u51Var.i = bigInteger2;
        e41 e41Var3 = null;
        u51Var.j = new tm0(u51Var, e41Var3, e41Var3, (byte) 1);
        u51Var.b = e41Var;
        u51Var.c = e41Var2;
        u51Var.d = bigInteger3;
        u51Var.e = bigInteger4;
        u51Var.f = (byte) 4;
        return u51Var;
    }

    @Override // defpackage.v51
    public final g61 d(e41 e41Var, e41 e41Var2) {
        return new tm0(this, e41Var, e41Var2, (byte) 1);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.h;
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(bigInteger2) < 0) {
            return new a61(bigInteger2, this.i, bigInteger);
        }
        s83.t("x value invalid for Fp field element");
        return null;
    }

    @Override // defpackage.v51
    public final int j() {
        return this.h.bitLength();
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.j;
    }

    @Override // defpackage.v51
    public final g61 l(g61 g61Var) {
        byte b;
        return (this == g61Var.a || this.f != 2 || g61Var.i() || !((b = g61Var.a.f) == 2 || b == 3 || b == 4)) ? super.l(g61Var) : new tm0(this, h(g61Var.b.w0()), h(g61Var.c.w0()), new e41[]{h(g61Var.d[0].w0())}, (byte) 1);
    }

    @Override // defpackage.v51
    public final boolean p(int i) {
        return i == 0 || i == 1 || i == 2 || i == 4;
    }

    @Override // defpackage.q51
    public final BigInteger q() {
        return this.h;
    }
}

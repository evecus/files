package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class xn0 {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;

    public xn0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        if (i2 != 0) {
            if (i2 >= bigInteger.bitLength()) {
                s83.t("when l value specified, it must be less than bitlength(p)");
                throw null;
            }
            if (i2 < i) {
                s83.t("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        if (i >= bigInteger.bitLength() && !ox3.c("org.bouncycastle.dh.allow_unsafe_p_value")) {
            s83.t("unsafe p value so small specific l required");
            throw null;
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xn0)) {
            return false;
        }
        xn0 xn0Var = (xn0) obj;
        BigInteger bigInteger = xn0Var.c;
        BigInteger bigInteger2 = this.c;
        if (bigInteger2 != null) {
            if (!bigInteger2.equals(bigInteger)) {
                return false;
            }
        } else if (bigInteger != null) {
            return false;
        }
        return xn0Var.b.equals(this.b) && xn0Var.a.equals(this.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ hashCode;
    }
}

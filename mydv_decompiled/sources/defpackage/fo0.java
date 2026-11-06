package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class fo0 {
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;
    public final ho0 d;

    public fo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ho0 ho0Var) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = ho0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fo0)) {
            return false;
        }
        fo0 fo0Var = (fo0) obj;
        return fo0Var.c.equals(this.c) && fo0Var.b.equals(this.b) && fo0Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (this.c.hashCode() ^ this.b.hashCode());
    }
}

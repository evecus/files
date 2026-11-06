package defpackage;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class yn0 extends jq implements Destroyable {
    public xn0 J;
    public BigInteger K;
    public volatile boolean L;
    public int M;

    public final boolean a(Object obj) {
        if (!(obj instanceof yn0)) {
            return false;
        }
        xn0 xn0Var = this.J;
        xn0 xn0Var2 = ((yn0) obj).J;
        return xn0Var == null ? xn0Var2 == null : xn0Var.equals(xn0Var2);
    }

    public final int b() {
        int i = !this.I ? 1 : 0;
        xn0 xn0Var = this.J;
        return xn0Var != null ? xn0Var.hashCode() ^ i : i;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.L) {
            try {
                this.M = hashCode();
            } catch (RuntimeException unused) {
                this.M = -1;
            }
            this.L = true;
            this.K = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        BigInteger bigInteger = this.K;
        BigInteger bigInteger2 = yn0Var.K;
        return (this.L || yn0Var.L || bigInteger == null || bigInteger2 == null || !bigInteger2.equals(bigInteger) || !a(obj)) ? false : true;
    }

    public final synchronized int hashCode() {
        BigInteger bigInteger = this.K;
        if (bigInteger == null) {
            return this.M;
        }
        xn0 xn0Var = this.J;
        return xn0Var.a.modPow(bigInteger, xn0Var.b).hashCode() ^ b();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.L;
    }
}

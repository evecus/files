package defpackage;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class i71 extends jq implements Destroyable {
    public h71 J;
    public BigInteger K;
    public volatile boolean L;
    public int M;

    public final boolean a(Object obj) {
        if (!(obj instanceof i71)) {
            return false;
        }
        h71 h71Var = this.J;
        h71 h71Var2 = ((i71) obj).J;
        return h71Var == null ? h71Var2 == null : h71Var.equals(h71Var2);
    }

    public final int b() {
        h71 h71Var = this.J;
        if (h71Var != null) {
            return h71Var.hashCode();
        }
        return 0;
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
        if (!(obj instanceof i71)) {
            return false;
        }
        i71 i71Var = (i71) obj;
        BigInteger bigInteger = this.K;
        BigInteger bigInteger2 = i71Var.K;
        if (this.L || i71Var.L || bigInteger == null || bigInteger2 == null || !bigInteger2.equals(bigInteger)) {
            return false;
        }
        return a(obj);
    }

    public final synchronized int hashCode() {
        BigInteger bigInteger = this.K;
        if (bigInteger == null) {
            return this.M;
        }
        h71 h71Var = this.J;
        return h71Var.a.modPow(bigInteger, h71Var.b).hashCode() ^ b();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.L;
    }
}

package defpackage;

import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class j61 extends jq implements Destroyable {
    public final w51 J;
    public BigInteger K;
    public volatile boolean L;

    public j61(BigInteger bigInteger, w51 w51Var) {
        super(true);
        this.J = w51Var;
        if (bigInteger.compareTo(n51.b) < 0 || bigInteger.compareTo(w51Var.i) >= 0) {
            s83.t("Scalar is not in the interval [1, n - 1]");
            throw null;
        }
        this.K = bigInteger;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.L) {
            this.L = true;
            this.K = null;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.L;
    }
}

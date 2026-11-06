package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class h71 {
    public BigInteger a;
    public BigInteger b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof h71)) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return h71Var.b.equals(this.b) && h71Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}

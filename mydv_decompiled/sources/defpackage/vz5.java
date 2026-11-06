package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class vz5 implements Serializable {
    public final transient d20 I;

    public vz5(byte[] bArr) {
        try {
            int i = c20.a;
            u0 s = u0.s(bArr);
            if (s == null) {
                throw new IOException("no content found");
            }
            d20 m = d20.m(s);
            this.I = m;
            xc1 xc1Var = m.J.S;
        } catch (RuntimeException e) {
            hn3.j("malformed data: ", e.getMessage(), e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vz5) {
            return this.I.equals(((vz5) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }
}

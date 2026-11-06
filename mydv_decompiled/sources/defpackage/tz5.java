package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class tz5 implements Serializable {
    public final transient br I;

    public tz5(byte[] bArr) {
        try {
            int i = c20.a;
            u0 s = u0.s(bArr);
            if (s == null) {
                throw new IOException("no content found");
            }
            br m = br.m(s);
            this.I = m;
            xc1 xc1Var = m.I.Q;
        } catch (ClassCastException e) {
            hn3.j("malformed data: ", e.getMessage(), e);
            throw null;
        } catch (IllegalArgumentException e2) {
            hn3.j("malformed data: ", e2.getMessage(), e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tz5) {
            return this.I.equals(((tz5) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }
}

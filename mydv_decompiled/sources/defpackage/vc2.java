package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class vc2 implements Enumeration {
    public k0 a;
    public u0 b;

    public final u0 a() {
        try {
            return this.a.n();
        } catch (IOException e) {
            throw new t0("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        u0 u0Var = this.b;
        if (u0Var != null) {
            this.b = a();
            return u0Var;
        }
        zy.k();
        return null;
    }
}

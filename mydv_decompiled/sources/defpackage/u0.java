package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class u0 extends n0 {
    public static u0 s(byte[] bArr) {
        k0 k0Var = new k0(bArr);
        try {
            u0 n = k0Var.n();
            if (k0Var.available() == 0) {
                return n;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException e) {
            throw k21.Z("cannot recognise object in stream", e);
        }
    }

    @Override // defpackage.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && m(((e0) obj).d());
    }

    @Override // defpackage.n0
    public int hashCode() {
        return -1;
    }

    public boolean m(u0 u0Var) {
        return u0Var instanceof m0;
    }

    public void n(uu2 uu2Var, boolean z) {
        uu2Var.P(kn0.K, 5, z);
    }

    public boolean o() {
        return false;
    }

    public final void p(OutputStream outputStream) {
        new nn0(outputStream).V(this);
    }

    public int q(boolean z) {
        return uu2.z(1, z);
    }

    public final boolean r(u0 u0Var) {
        return this == u0Var || m(u0Var);
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this;
    }

    public u0 t() {
        return this;
    }

    public u0 u() {
        return this;
    }
}

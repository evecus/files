package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class r0 extends u0 implements s0 {
    public static final y J = new y(r0.class, (byte) 14);
    public static final byte[] K = new byte[0];
    public final byte[] I;

    public r0(byte[] bArr) {
        if (bArr != null) {
            this.I = bArr;
        } else {
            zy.m("'string' cannot be null");
            throw null;
        }
    }

    public static r0 v(Object obj) {
        if (obj == null || (obj instanceof r0)) {
            return (r0) obj;
        }
        if (obj instanceof e0) {
            u0 d = ((e0) obj).d();
            if (d instanceof r0) {
                return (r0) d;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (r0) J.g((byte[]) obj);
            } catch (IOException e) {
                throw k21.V("failed to construct OCTET STRING from byte[]", e);
            }
        }
        s83.t("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // defpackage.s0
    public final InputStream c() {
        return new ByteArrayInputStream(this.I);
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof r0) {
            return Arrays.equals(this.I, ((r0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public u0 t() {
        return new mn0(this.I);
    }

    public final String toString() {
        bu buVar = et1.a;
        byte[] bArr = this.I;
        return "#".concat(ix4.a(et1.c(bArr.length, bArr)));
    }

    @Override // defpackage.u0
    public u0 u() {
        return new mn0(this.I);
    }

    @Override // defpackage.uy1
    public final u0 j() {
        return this;
    }
}

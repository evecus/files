package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class a0 extends u0 implements b1, b0 {
    public static final y J = new y(a0.class, 1);
    public static final byte[] K = {0};
    public static final char[] L = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] I;

    public a0(byte[] bArr, int i) {
        if (bArr == null) {
            zy.m("'data' cannot be null");
            throw null;
        }
        if (i > 7 || i < 0) {
            s83.t("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            s83.t("zero length data with non-zero pad bits");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.I = bArr2;
    }

    public static a0 v(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new zn0(bArr);
                    }
                }
            }
            return new dn0(bArr);
        }
        str = "truncated BIT STRING detected";
        s83.t(str);
        return null;
    }

    public static a0 x(Object obj) {
        if (obj == null || (obj instanceof a0)) {
            return (a0) obj;
        }
        if (obj instanceof e0) {
            u0 d = ((e0) obj).d();
            if (d instanceof a0) {
                return (a0) d;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (a0) J.g((byte[]) obj);
            } catch (IOException e) {
                throw k21.V("failed to construct BIT STRING from byte[]", e);
            }
        }
        s83.t("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // defpackage.b1
    public final String e() {
        try {
            byte[] l = l();
            StringBuilder sb = new StringBuilder((l.length * 2) + 1);
            sb.append('#');
            for (int i = 0; i != l.length; i++) {
                byte b = l[i];
                char[] cArr = L;
                sb.append(cArr[(b >>> 4) & 15]);
                sb.append(cArr[b & 15]);
            }
            return sb.toString();
        } catch (IOException e) {
            throw new t0("Internal error encoding BitString", e);
        }
    }

    @Override // defpackage.b0
    public final InputStream f() {
        byte[] bArr = this.I;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.b0
    public final int h() {
        return this.I[0] & 255;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        byte[] bArr = this.I;
        if (bArr.length < 2) {
            return 1;
        }
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = (byte) ((255 << i) & bArr[i2]);
        while (true) {
            i2--;
            if (i2 < 0) {
                return (length * TsExtractor.TS_STREAM_TYPE_AIT) ^ b;
            }
            length = (length * TsExtractor.TS_STREAM_TYPE_AIT) ^ bArr[i2];
        }
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (!(u0Var instanceof a0)) {
            return false;
        }
        byte[] bArr = ((a0) u0Var).I;
        byte[] bArr2 = this.I;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // defpackage.u0
    public u0 t() {
        return new dn0(this.I);
    }

    public final String toString() {
        return e();
    }

    @Override // defpackage.u0
    public u0 u() {
        return new zn0(this.I);
    }

    public final byte[] w() {
        byte[] bArr = this.I;
        if (bArr.length == 1) {
            return r0.K;
        }
        int i = bArr[0] & 255;
        byte[] x = g4.x(bArr, 1, bArr.length);
        int length = x.length - 1;
        x[length] = (byte) (((byte) (255 << i)) & x[length]);
        return x;
    }

    public final byte[] y() {
        byte[] bArr = this.I;
        if (bArr[0] == 0) {
            return bArr.length == 1 ? r0.K : g4.x(bArr, 1, bArr.length);
        }
        zy.i("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // defpackage.uy1
    public final u0 j() {
        return this;
    }

    public a0(byte[] bArr) {
        this.I = bArr;
    }
}

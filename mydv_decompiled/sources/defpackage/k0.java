package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class k0 extends FilterInputStream {
    public final int I;
    public final int J;
    public final boolean K;
    public final byte[] L;

    public k0(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, Math.max(0, ox3.a(64, "org.bouncycastle.asn1.max_cons_depth")), i, z, new byte[16]);
    }

    public static u0 g(int i, nt0 nt0Var, byte[] bArr) {
        boolean z = true;
        try {
            switch (i) {
                case 1:
                    if (nt0Var.g() != 1) {
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    }
                    byte read = (byte) nt0Var.read();
                    return read == 0 ? c0.K : read == -1 ? c0.L : new c0(read);
                case 2:
                    return new l0(nt0Var.t());
                case 3:
                    return a0.v(nt0Var.t());
                case 4:
                    return new mn0(nt0Var.t());
                case 5:
                    if (nt0Var.g() == 0) {
                        return kn0.J;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    y yVar = q0.K;
                    int g = nt0Var.g();
                    q0.w(g);
                    if (g > bArr.length) {
                        z = false;
                    }
                    if (z) {
                        nt0Var.n(bArr);
                    } else {
                        bArr = nt0Var.t();
                    }
                    return q0.x(bArr, g, z);
                case 7:
                    return new o0(new in0(nt0Var.t()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return g0.v(nt0Var);
                case 12:
                    return new sn0(nt0Var.t());
                case 13:
                    y yVar2 = v0.K;
                    int g2 = nt0Var.g();
                    if (g2 > 4096) {
                        throw new IllegalArgumentException("exceeded relative OID contents length limit");
                    }
                    if (g2 > bArr.length) {
                        z = false;
                    }
                    if (z) {
                        nt0Var.n(bArr);
                    } else {
                        bArr = nt0Var.t();
                    }
                    return v0.v(bArr, g2, z);
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new ln0(nt0Var.t());
                case 19:
                    return new on0(nt0Var.t());
                case 20:
                    return new rn0(nt0Var.t());
                case 21:
                    return new un0(nt0Var.t());
                case 22:
                    return new jn0(nt0Var.t());
                case 23:
                    return c1.v(nt0Var.t());
                case 24:
                    return i0.x(nt0Var.t());
                case 25:
                    return new in0(nt0Var.t());
                case 26:
                    return new vn0(nt0Var.t());
                case 27:
                    return new gn0(nt0Var.t());
                case 28:
                    return new tn0(nt0Var.t());
                case 30:
                    if ((nt0Var.g() & 1) == 0) {
                        return new cn0(nt0Var.t());
                    }
                    zl1.g("malformed BMPString encoding encountered");
                    return null;
            }
        } catch (IllegalArgumentException e) {
            throw new h0(e.getMessage(), e, (byte) 0);
        } catch (IllegalStateException e2) {
            throw new h0(e2.getMessage(), e2, (byte) 0);
        }
    }

    public static int t(InputStream inputStream, int i) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read >= 31) {
            int i3 = read & 127;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 < 0) {
                            throw new EOFException("EOF found inside tag value.");
                        }
                        i3 = i4 | (read2 & 127);
                        read = read2;
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i3;
            }
            str = "corrupted stream - invalid high tag number found";
        } else {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            str = "corrupted stream - high tag number < 31 found";
        }
        zl1.g(str);
        return 0;
    }

    public final u0 e(int i, int i2, int i3) {
        int i4 = this.J;
        if (i3 > i4) {
            throw new h0(r7.x(i3, i4, "corrupted stream - out of bounds length found: ", " > "), (byte) 0);
        }
        nt0 nt0Var = new nt0(this, i3, i3);
        if ((i & 224) == 0) {
            return g(i2, nt0Var, this.L);
        }
        int i5 = i & PsExtractor.AUDIO_STREAM;
        int i6 = 3;
        int i7 = 4;
        if (i5 != 0) {
            if ((i & 32) == 0) {
                return new ct(i7, i5, i2, new mn0(nt0Var.t()), (byte) 2);
            }
            f0 y = y(nt0Var);
            return y.b == 1 ? new ct(i6, i5, i2, y.c(0), (byte) 2) : new ct(i7, i5, i2, bo0.a(y), (byte) 2);
        }
        int i8 = 0;
        if (i2 == 3) {
            f0 y2 = y(nt0Var);
            int i9 = y2.b;
            a0[] a0VarArr = new a0[i9];
            while (i8 != i9) {
                e0 c = y2.c(i8);
                if (!(c instanceof a0)) {
                    j0.j(c.getClass(), "unknown object encountered in constructed BIT STRING: ");
                    return null;
                }
                a0VarArr[i8] = (a0) c;
                i8++;
            }
            return new us(a0VarArr);
        }
        if (i2 == 4) {
            f0 y3 = y(nt0Var);
            int i10 = y3.b;
            r0[] r0VarArr = new r0[i10];
            while (i8 != i10) {
                e0 c2 = y3.c(i8);
                if (!(c2 instanceof r0)) {
                    j0.j(c2.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
                r0VarArr[i8] = (r0) c2;
                i8++;
            }
            return new xs(xs.w(r0VarArr), r0VarArr);
        }
        if (i2 == 8) {
            return new fn0(bo0.a(y(nt0Var)), (byte) 1);
        }
        if (i2 == 16) {
            if (nt0Var.g() < 1) {
                return bo0.a;
            }
            if (!this.K) {
                return bo0.a(y(nt0Var));
            }
            byte[] t = nt0Var.t();
            int i11 = this.I;
            if (i11 > 0) {
                return new xc2(t, i11 - 1);
            }
            throw new h0("maximum nested construction level reached", (byte) 0);
        }
        if (i2 != 17) {
            zl1.g(r7.z("unknown tag ", i2, " encountered"));
            return null;
        }
        f0 y4 = y(nt0Var);
        pn0 pn0Var = bo0.a;
        if (y4.b < 1) {
            return bo0.b;
        }
        qn0 qn0Var = new qn0(y4);
        qn0Var.M = -1;
        return qn0Var;
    }

    public final u0 n() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            zl1.g("unexpected end-of-contents marker");
            return null;
        }
        int t = t(this, read);
        int read2 = read();
        if ((read2 >>> 7) != 0) {
            if (128 == read2) {
                read2 = -1;
            } else {
                if (read2 < 0) {
                    throw new EOFException("EOF found when length expected");
                }
                if (255 == read2) {
                    zl1.g("invalid long form definite-length 0xFF");
                    return null;
                }
                int i = read2 & 127;
                int i2 = 0;
                int i3 = 0;
                do {
                    int read3 = read();
                    if (read3 < 0) {
                        throw new EOFException("EOF found reading length");
                    }
                    if ((i2 >>> 23) != 0) {
                        zl1.g("long form definite-length more than 31 bits");
                        return null;
                    }
                    i2 = (i2 << 8) + read3;
                    i3++;
                } while (i3 < i);
                read2 = i2;
            }
        }
        if (read2 >= 0) {
            try {
                return e(read, t, read2);
            } catch (IllegalArgumentException e) {
                throw new h0("corrupted stream detected", e, (byte) 0);
            }
        }
        if ((read & 32) == 0) {
            zl1.g("indefinite-length primitive encoding encountered");
            return null;
        }
        int i4 = this.J;
        az1 az1Var = new az1(this, i4);
        int i5 = this.I;
        if (i5 <= 0) {
            throw new h0("maximum nested construction level reached", (byte) 0);
        }
        a1 a1Var = new a1(az1Var, i5 - 1, i4, this.L);
        int i6 = read & PsExtractor.AUDIO_STREAM;
        if (i6 != 0) {
            return a1Var.l(i6, t);
        }
        if (t == 3) {
            return vs.a(a1Var);
        }
        if (t == 4) {
            return new xs(fb4.P(new jh0(a1Var)), null);
        }
        if (t == 8) {
            return at.a(a1Var);
        }
        if (t == 16) {
            return new zs(a1Var.o());
        }
        if (t == 17) {
            return new bt(a1Var.o());
        }
        zl1.g("unknown BER object encountered");
        return null;
    }

    public final f0 y(nt0 nt0Var) {
        int g = nt0Var.g();
        if (g < 1) {
            return new f0(0);
        }
        int i = this.I;
        if (i <= 0) {
            throw new h0("maximum nested construction level reached", (byte) 0);
        }
        k0 k0Var = new k0(nt0Var, i - 1, g, this.K, this.L);
        u0 n = k0Var.n();
        if (n == null) {
            return new f0(0);
        }
        f0 f0Var = new f0();
        do {
            f0Var.a(n);
            n = k0Var.n();
        } while (n != null);
        return f0Var;
    }

    public k0(InputStream inputStream, int i, int i2, boolean z, byte[] bArr) {
        super(inputStream);
        this.I = i;
        this.J = i2;
        this.K = z;
        this.L = bArr;
    }

    public k0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public k0(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), i, bArr.length, true, new byte[16]);
    }
}

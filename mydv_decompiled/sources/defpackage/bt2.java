package defpackage;

import androidx.media3.container.MdtaMetadataEntry;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class bt2 extends zs2 implements Destroyable {
    public final byte[] K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public final byte[] O;
    public final byte[] P;
    public volatile boolean Q;

    public bt2(at2 at2Var, byte[] bArr, ct2 ct2Var) {
        super(true, at2Var);
        bt2 bt2Var;
        String str;
        ys2 ys2Var = ys2.g[at2Var.b - 2];
        if (bArr.length != 64 && bArr.length != ys2Var.f + ys2Var.e + 64) {
            s83.t("'encoding' has invalid length");
            throw null;
        }
        if (bArr.length == 64) {
            byte[] x = g4.x(bArr, 0, 32);
            byte[] x2 = g4.x(bArr, 32, bArr.length);
            ys2 ys2Var2 = (ys2) ys2Var.a.I;
            int i = ys2Var2.b;
            int i2 = ys2Var2.c;
            g73 g73Var = new g73((byte) 6, i);
            g73[] g73VarArr = (g73[]) g73Var.J;
            g73 g73Var2 = new g73((byte) 6, i);
            g73[] g73VarArr2 = (g73[]) g73Var2.J;
            byte[] bArr2 = new byte[64];
            int length = x.length;
            byte[] bArr3 = new byte[length + 1];
            str = "'encoding' has invalid length";
            System.arraycopy(x, 0, bArr3, 0, length);
            bArr3[length] = (byte) i;
            g84 g84Var = new g84(512);
            g84Var.update(bArr3, 0, bArr3.length);
            g84Var.a(0, bArr2);
            g73[] g73VarArr3 = new g73[i];
            for (int i3 = 0; i3 < i; i3++) {
                g73VarArr3[i3] = new g73((byte) 6, i);
            }
            i84 i84Var = new i84(128);
            byte[] bArr4 = new byte[506];
            int i4 = 0;
            while (i4 < i) {
                g73[] g73VarArr4 = g73VarArr3;
                int i5 = 0;
                while (true) {
                    g73 g73Var3 = g73Var2;
                    if (i5 < i) {
                        i84Var.i(i84Var.e);
                        g73[] g73VarArr5 = g73VarArr2;
                        i84Var.update(bArr2, 0, 32);
                        i84Var.b((byte) i5);
                        i84Var.b((byte) i4);
                        int i6 = 504;
                        i84Var.k(bArr4, 0, 504);
                        g73 g73Var4 = ((g73[]) g73VarArr4[i4].J)[i5];
                        int i7 = i5;
                        int i8 = i4;
                        int E = uu2.E(g73Var4, 0, 256, bArr4, 504);
                        for (int i9 = 256; E < i9; i9 = 256) {
                            int i10 = i6 % 3;
                            for (int i11 = 0; i11 < i10; i11++) {
                                bArr4[i11] = bArr4[(i6 - i10) + i11];
                            }
                            i84Var.k(bArr4, i10, 336);
                            i6 = i10 + 168;
                            E += uu2.E(((g73[]) g73VarArr4[i8].J)[i7], E, 256 - E, bArr4, i6);
                        }
                        i5 = i7 + 1;
                        g73Var2 = g73Var3;
                        g73VarArr2 = g73VarArr5;
                        i4 = i8;
                    }
                }
                i4++;
                g73VarArr3 = g73VarArr4;
            }
            g73[] g73VarArr6 = g73VarArr3;
            g73 g73Var5 = g73Var2;
            g73[] g73VarArr7 = g73VarArr2;
            i84 i84Var2 = new i84(256);
            if (ys2Var2.d == 2) {
                int i12 = 0;
                byte b = 0;
                while (i12 < i) {
                    g73VarArr[i12].m(i84Var2, bArr2, b);
                    i12++;
                    b = (byte) (b + 1);
                }
                int i13 = 0;
                while (i13 < i) {
                    g73VarArr7[i13].m(i84Var2, bArr2, b);
                    i13++;
                    b = (byte) (b + 1);
                }
            } else {
                int i14 = 0;
                byte b2 = 0;
                while (i14 < i) {
                    g73VarArr[i14].n(i84Var2, bArr2, b2);
                    i14++;
                    b2 = (byte) (b2 + 1);
                }
                int i15 = 0;
                while (i15 < i) {
                    g73VarArr7[i15].n(i84Var2, bArr2, b2);
                    i15++;
                    b2 = (byte) (b2 + 1);
                }
            }
            g73Var.r();
            g73Var5.r();
            g73 g73Var6 = new g73((byte) 6, i);
            g73[] g73VarArr8 = (g73[]) g73Var6.J;
            int i16 = 0;
            while (i16 < i) {
                g73 g73Var7 = g73VarArr8[i16];
                g73 g73Var8 = g73VarArr6[i16];
                int i17 = i16;
                short[] sArr = new short[256];
                g73 g73Var9 = ((g73[]) g73Var8.J)[0];
                g73 g73Var10 = g73VarArr[0];
                for (int i18 = 0; i18 < 64; i18++) {
                    short[] sArr2 = (short[]) g73Var7.J;
                    int i19 = i18 * 4;
                    short[] sArr3 = (short[]) g73Var9.J;
                    short s = sArr3[i19];
                    int i20 = i19 + 1;
                    short s2 = sArr3[i20];
                    short[] sArr4 = (short[]) g73Var10.J;
                    short s3 = sArr4[i19];
                    short s4 = sArr4[i20];
                    short[] sArr5 = qg5.q;
                    int i21 = i18 + 64;
                    qg5.I(sArr2, i19, s, s2, s3, s4, sArr5[i21]);
                    short[] sArr6 = (short[]) g73Var7.J;
                    int i22 = i19 + 2;
                    short[] sArr7 = (short[]) g73Var9.J;
                    short s5 = sArr7[i22];
                    int i23 = i19 + 3;
                    short s6 = sArr7[i23];
                    short[] sArr8 = (short[]) g73Var10.J;
                    qg5.I(sArr6, i22, s5, s6, sArr8[i22], sArr8[i23], (short) (sArr5[i21] * (-1)));
                }
                int i24 = 1;
                while (i24 < i) {
                    g73 g73Var11 = ((g73[]) g73Var8.J)[i24];
                    g73 g73Var12 = g73VarArr[i24];
                    int i25 = i24;
                    for (int i26 = 0; i26 < 64; i26++) {
                        int i27 = i26 * 4;
                        short[] sArr9 = (short[]) g73Var11.J;
                        short s7 = sArr9[i27];
                        int i28 = i27 + 1;
                        short s8 = sArr9[i28];
                        short[] sArr10 = (short[]) g73Var12.J;
                        short s9 = sArr10[i27];
                        short s10 = sArr10[i28];
                        short[] sArr11 = qg5.q;
                        int i29 = i26 + 64;
                        qg5.I(sArr, i27, s7, s8, s9, s10, sArr11[i29]);
                        int i30 = i27 + 2;
                        short[] sArr12 = (short[]) g73Var11.J;
                        short s11 = sArr12[i30];
                        int i31 = i27 + 3;
                        short s12 = sArr12[i31];
                        short[] sArr13 = (short[]) g73Var12.J;
                        qg5.I(sArr, i30, s11, s12, sArr13[i30], sArr13[i31], (short) (sArr11[i29] * (-1)));
                    }
                    for (int i32 = 0; i32 < 256; i32++) {
                        short[] sArr14 = (short[]) g73Var7.J;
                        sArr14[i32] = (short) (sArr14[i32] + sArr[i32]);
                    }
                    g73Var7.getClass();
                    i24 = i25 + 1;
                }
                g73Var7.v();
                short[] sArr15 = (short[]) g73VarArr8[i17].J;
                for (int i33 = 0; i33 < 256; i33++) {
                    sArr15[i33] = lq2.U(sArr15[i33] * 1353);
                }
                i16 = i17 + 1;
            }
            for (int i34 = 0; i34 < g73VarArr8.length; i34++) {
                g73 g73Var13 = g73VarArr8[i34];
                g73 g73Var14 = g73VarArr7[i34];
                for (int i35 = 0; i35 < 256; i35++) {
                    short[] sArr16 = (short[]) g73Var13.J;
                    sArr16[i35] = (short) (sArr16[i35] + ((short[]) g73Var14.J)[i35]);
                }
                g73Var13.getClass();
            }
            for (g73 g73Var15 : g73VarArr8) {
                g73Var15.v();
            }
            byte[] bArr5 = new byte[ys2Var2.e];
            g73Var6.D(bArr5);
            System.arraycopy(bArr2, 0, bArr5, i2, 32);
            byte[] bArr6 = new byte[i2];
            g73Var.D(bArr6);
            byte[][] bArr7 = {bArr5, bArr6};
            int i36 = ys2Var.f;
            byte[] bArr8 = new byte[i36];
            System.arraycopy(bArr7[1], 0, bArr8, 0, i36);
            byte[] bArr9 = new byte[32];
            byte[] bArr10 = bArr7[0];
            int length2 = bArr10.length;
            g84 g84Var2 = new g84(256);
            g84Var2.update(bArr10, 0, length2);
            g84Var2.a(0, bArr9);
            int i37 = ys2Var.e;
            byte[] bArr11 = new byte[i37];
            System.arraycopy(bArr7[0], 0, bArr11, 0, i37);
            int i38 = i37 - 32;
            byte[] x3 = g4.x(bArr11, 0, i38);
            byte[] x4 = g4.x(bArr11, i38, i37);
            byte[] bArr12 = new byte[x.length + x2.length];
            System.arraycopy(x, 0, bArr12, 0, x.length);
            System.arraycopy(x2, 0, bArr12, x.length, x2.length);
            byte[][] bArr13 = {x3, x4, bArr8, bArr9, x2, bArr12};
            bt2Var = this;
            bt2Var.K = bArr13[2];
            bt2Var.L = bArr13[3];
            bt2Var.M = bArr13[4];
            bt2Var.N = bArr13[0];
            bt2Var.O = bArr13[1];
            bt2Var.P = bArr13[5];
        } else {
            bt2Var = this;
            str = "'encoding' has invalid length";
            int i39 = ys2Var.f;
            int i40 = ys2Var.e;
            bt2Var.K = g4.x(bArr, 0, i39);
            int i41 = ys2Var.f;
            bt2Var.N = g4.x(bArr, i41, (i41 + i40) - 32);
            int i42 = (i40 - 32) + i41;
            int i43 = i42 + 32;
            bt2Var.O = g4.x(bArr, i42, i43);
            int i44 = i42 + 64;
            bt2Var.L = g4.x(bArr, i43, i44);
            bt2Var.M = g4.x(bArr, i44, i42 + 96);
            bt2Var.P = null;
        }
        ys2 ys2Var3 = ys2.g[bt2Var.J.b - 2];
        byte[] a = bt2Var.a();
        byte b3 = ys2Var3.b;
        int i45 = b3 * 384;
        int i46 = b3 * MdtaMetadataEntry.AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED;
        if (i46 + 96 != a.length) {
            s83.t(str);
            throw null;
        }
        byte[] bArr14 = new byte[32];
        g84 g84Var3 = new g84(256);
        g84Var3.update(a, i45, i45 + 32);
        int i47 = 0;
        g84Var3.a(0, bArr14);
        int i48 = i46 + 32;
        if (i48 > a.length - 32) {
            zy.o("'bOff' value invalid for specified length");
            throw null;
        }
        for (int i49 = 0; i49 < 32; i49++) {
            i47 |= bArr14[i49] ^ a[i48 + i49];
        }
        if (i47 != 0) {
            s83.t("'encoding' fails hash check");
            throw null;
        }
        if (ct2Var != null) {
            if (g4.w(bt2Var.N, ct2Var.K) && g4.w(bt2Var.O, ct2Var.L)) {
                return;
            }
            s83.t("passed in public key does not match private values");
            throw null;
        }
    }

    public final byte[] a() {
        byte[] s = g4.s(g4.v(new byte[][]{this.K, this.N, this.O, this.L, this.M}));
        if (!this.Q) {
            return s;
        }
        zy.i("key destroyed");
        return null;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.Q) {
            this.Q = true;
            g4.q(this.K);
            g4.q(this.L);
            g4.q(this.M);
            g4.q(this.N);
            g4.q(this.O);
            g4.q(this.P);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.Q;
    }
}

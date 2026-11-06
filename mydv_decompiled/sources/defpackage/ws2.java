package defpackage;

import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class ws2 extends k92 implements Destroyable {
    public final byte[] J;
    public final byte[] K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public final byte[] O;
    public final byte[] P;
    public final byte[] Q;
    public volatile boolean R;

    public ws2(vs2 vs2Var, byte[] bArr, xs2 xs2Var) {
        super(true);
        byte[] a0;
        Throwable th;
        us2 us2Var = new us2(vs2Var.a);
        byte b = us2Var.d;
        byte b2 = us2Var.c;
        short s = us2Var.b;
        int i = b2 * 416;
        int i2 = ((b + b2) * s) + 128 + i;
        if (bArr.length != 32 && bArr.length != i2) {
            s83.t("'encoding' has invalid length");
            throw null;
        }
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[64];
            byte[] bArr6 = new byte[32];
            g73 g73Var = new g73(us2Var);
            g73 g73Var2 = new g73(us2Var, (int) b);
            x81[] x81VarArr = (x81[]) g73Var2.J;
            g73 g73Var3 = new g73(us2Var, (int) b2);
            g73 g73Var4 = new g73(us2Var, (int) b2);
            g73 g73Var5 = new g73(us2Var, (int) b2);
            i84 i84Var = us2Var.a;
            i84Var.update(bArr, 0, 32);
            i84Var.b(b2);
            i84Var.b(b);
            i84Var.k(bArr2, 0, 128);
            i84Var.i(i84Var.e);
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 64);
            System.arraycopy(bArr2, 96, bArr6, 0, 32);
            g73Var.i(bArr4);
            g73Var2.F(bArr5, (short) 0);
            g73Var3.F(bArr5, b);
            g73 g73Var6 = new g73(us2Var, (int) b);
            for (int i3 = 0; i3 < x81VarArr.length; i3++) {
                System.arraycopy((int[]) x81VarArr[i3].b, 0, (int[]) ((x81[]) g73Var6.J)[i3].b, 0, 256);
            }
            g73Var6.r();
            g73Var.q(g73Var4, g73Var6);
            g73Var4.v();
            g73Var4.o();
            g73Var4.b(g73Var3);
            g73Var4.g();
            g73 g73Var7 = g73Var5;
            g73Var4.s(g73Var7);
            byte[] a02 = lq2.a0(g73Var4, us2Var);
            i84Var.update(bArr4, 0, 32);
            i84Var.update(a02, 0, a02.length);
            i84Var.k(bArr3, 0, 64);
            i84Var.i(i84Var.e);
            byte[][] bArr7 = new byte[6][];
            bArr7[0] = bArr4;
            bArr7[1] = bArr6;
            bArr7[2] = bArr3;
            bArr7[3] = new byte[b * s];
            for (int i4 = 0; i4 < b; i4++) {
                x81VarArr[i4].o(i4 * s, bArr7[3]);
            }
            bArr7[4] = new byte[b2 * s];
            for (int i5 = 0; i5 < b2; i5++) {
                ((x81[]) g73Var3.J)[i5].o(i5 * s, bArr7[4]);
            }
            bArr7[5] = new byte[i];
            for (int i6 = 0; i6 < b2; i6++) {
                x81 x81Var = ((x81[]) g73Var7.J)[i6];
                byte[] bArr8 = bArr7[5];
                int i7 = i6 * 416;
                int[] iArr = (int[]) x81Var.b;
                int i8 = 0;
                while (i8 < 32) {
                    int i9 = i8 * 8;
                    g73 g73Var8 = g73Var7;
                    int[] iArr2 = {4096 - iArr[i9], 4096 - iArr[i9 + 1], 4096 - iArr[i9 + 2], 4096 - iArr[i9 + 3], 4096 - iArr[i9 + 4], 4096 - iArr[i9 + 5], 4096 - iArr[i9 + 6], 4096 - iArr[i9 + 7]};
                    int i10 = (i8 * 13) + i7;
                    int i11 = iArr2[0];
                    bArr8[i10] = (byte) i11;
                    int i12 = i10 + 1;
                    byte b3 = (byte) (i11 >> 8);
                    bArr8[i12] = b3;
                    int i13 = iArr2[1];
                    bArr8[i12] = (byte) (b3 | ((byte) (i13 << 5)));
                    bArr8[i10 + 2] = (byte) (i13 >> 3);
                    int i14 = i10 + 3;
                    byte b4 = (byte) (i13 >> 11);
                    bArr8[i14] = b4;
                    int i15 = iArr2[2];
                    bArr8[i14] = (byte) (b4 | ((byte) (i15 << 2)));
                    int i16 = i10 + 4;
                    byte b5 = (byte) (i15 >> 6);
                    bArr8[i16] = b5;
                    int i17 = iArr2[3];
                    bArr8[i16] = (byte) (b5 | ((byte) (i17 << 7)));
                    bArr8[i10 + 5] = (byte) (i17 >> 1);
                    int i18 = i10 + 6;
                    byte b6 = (byte) (i17 >> 9);
                    bArr8[i18] = b6;
                    int i19 = iArr2[4];
                    bArr8[i18] = (byte) (b6 | ((byte) (i19 << 4)));
                    bArr8[i10 + 7] = (byte) (i19 >> 4);
                    int i20 = i10 + 8;
                    byte b7 = (byte) (i19 >> 12);
                    bArr8[i20] = b7;
                    int i21 = iArr2[5];
                    bArr8[i20] = (byte) (b7 | ((byte) (i21 << 1)));
                    int i22 = i10 + 9;
                    byte b8 = (byte) (i21 >> 7);
                    bArr8[i22] = b8;
                    int i23 = iArr2[6];
                    bArr8[i22] = (byte) (b8 | ((byte) (i23 << 6)));
                    bArr8[i10 + 10] = (byte) (i23 >> 2);
                    int i24 = i10 + 11;
                    byte b9 = (byte) (i23 >> 10);
                    bArr8[i24] = b9;
                    int i25 = iArr2[7];
                    bArr8[i24] = (byte) (b9 | ((byte) (i25 << 3)));
                    bArr8[i10 + 12] = (byte) (i25 >> 5);
                    i8++;
                    g73Var7 = g73Var8;
                }
            }
            byte[][] bArr9 = {bArr7[0], bArr7[1], bArr7[2], bArr7[3], bArr7[4], bArr7[5], a02, bArr};
            this.J = bArr9[0];
            this.K = bArr9[1];
            this.L = bArr9[2];
            this.M = bArr9[3];
            this.N = bArr9[4];
            this.O = bArr9[5];
            a0 = bArr9[6];
            this.P = a0;
            this.Q = bArr9[7];
            th = null;
        } else {
            byte[] x = g4.x(bArr, 0, 32);
            this.J = x;
            this.K = g4.x(bArr, 32, 64);
            this.L = g4.x(bArr, 64, 128);
            int i26 = (b * s) + 128;
            byte[] x2 = g4.x(bArr, 128, i26);
            this.M = x2;
            int i27 = (b2 * s) + i26;
            byte[] x3 = g4.x(bArr, i26, i27);
            this.N = x3;
            byte[] x4 = g4.x(bArr, i27, i + i27);
            this.O = x4;
            g73 g73Var9 = new g73(us2Var);
            x81[] x81VarArr2 = (x81[]) new g73(us2Var, (int) b).J;
            g73 g73Var10 = new g73(us2Var, (int) b2);
            g73 g73Var11 = new g73(us2Var, (int) b2);
            g73 g73Var12 = new g73(us2Var, (int) b2);
            for (int i28 = 0; i28 < b; i28++) {
                x81VarArr2[i28].p(i28 * s, x2);
            }
            for (int i29 = 0; i29 < b2; i29++) {
                ((x81[]) g73Var10.J)[i29].p(i29 * s, x3);
            }
            for (int i30 = 0; i30 < b2; i30++) {
                int i31 = i30 * 416;
                int[] iArr3 = (int[]) ((x81[]) g73Var12.J)[i30].b;
                int i32 = 0;
                while (i32 < 32) {
                    int i33 = (i32 * 13) + i31;
                    int i34 = i32 * 8;
                    int i35 = x4[i33] & 255;
                    byte[] bArr10 = x4;
                    int i36 = bArr10[i33 + 1] & 255;
                    iArr3[i34] = (i35 | (i36 << 8)) & 8191;
                    int i37 = i34 + 1;
                    int i38 = (i36 >> 5) | ((bArr10[i33 + 2] & 255) << 3);
                    int i39 = bArr10[i33 + 3] & 255;
                    iArr3[i37] = (i38 | (i39 << 11)) & 8191;
                    int i40 = i34 + 2;
                    int i41 = i39 >> 2;
                    int i42 = bArr10[i33 + 4] & 255;
                    iArr3[i40] = (i41 | (i42 << 6)) & 8191;
                    int i43 = i34 + 3;
                    int i44 = (i42 >> 7) | ((bArr10[i33 + 5] & 255) << 1);
                    int i45 = bArr10[i33 + 6] & 255;
                    iArr3[i43] = (i44 | (i45 << 9)) & 8191;
                    int i46 = i34 + 4;
                    int i47 = (i45 >> 4) | ((bArr10[i33 + 7] & 255) << 4);
                    int i48 = bArr10[i33 + 8] & 255;
                    iArr3[i46] = (i47 | (i48 << 12)) & 8191;
                    int i49 = i34 + 5;
                    int i50 = i48 >> 1;
                    int i51 = bArr10[i33 + 9] & 255;
                    iArr3[i49] = (i50 | (i51 << 7)) & 8191;
                    int i52 = i34 + 6;
                    int i53 = (i51 >> 6) | ((bArr10[i33 + 10] & 255) << 2);
                    int i54 = bArr10[i33 + 11] & 255;
                    iArr3[i52] = (i53 | (i54 << 10)) & 8191;
                    int i55 = i34 + 7;
                    iArr3[i55] = ((i54 >> 3) | ((bArr10[i33 + 12] & 255) << 5)) & 8191;
                    iArr3[i34] = 4096 - iArr3[i34];
                    iArr3[i37] = 4096 - iArr3[i37];
                    iArr3[i40] = 4096 - iArr3[i40];
                    iArr3[i43] = 4096 - iArr3[i43];
                    iArr3[i46] = 4096 - iArr3[i46];
                    iArr3[i49] = 4096 - iArr3[i49];
                    iArr3[i52] = 4096 - iArr3[i52];
                    iArr3[i55] = 4096 - iArr3[i55];
                    i32++;
                    x4 = bArr10;
                }
            }
            g73Var9.i(x);
            g73 g73Var13 = new g73(us2Var, (int) b);
            for (int i56 = 0; i56 < x81VarArr2.length; i56++) {
                System.arraycopy((int[]) x81VarArr2[i56].b, 0, (int[]) ((x81[]) g73Var13.J)[i56].b, 0, 256);
            }
            g73Var13.r();
            g73Var9.q(g73Var11, g73Var13);
            g73Var11.v();
            g73Var11.o();
            g73Var11.b(g73Var10);
            g73Var11.g();
            g73Var11.s(g73Var12);
            a0 = lq2.a0(g73Var11, us2Var);
            this.P = a0;
            th = null;
            this.Q = null;
        }
        if (xs2Var == null || g4.w(a0, g4.s(xs2Var.J))) {
            return;
        }
        s83.t("passed in public key does not match private values");
        throw th;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.R) {
            this.R = true;
            g4.q(this.J);
            g4.q(this.K);
            g4.q(this.L);
            g4.q(this.M);
            g4.q(this.N);
            g4.q(this.O);
            g4.q(this.P);
            g4.q(this.Q);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.R;
    }
}

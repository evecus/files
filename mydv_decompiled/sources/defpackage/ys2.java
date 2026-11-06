package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* loaded from: classes2.dex */
public final class ys2 {
    public static final ys2[] g = {new ys2(at2.c.b), new ys2(at2.d.b), new ys2(at2.e.b)};
    public final uu2 a;
    public final byte b;
    public final int c;
    public final byte d;
    public final int e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public ys2(int i) {
        this.b = i;
        if (i == 2) {
            this.d = (byte) 3;
        } else if (i == 3) {
            this.d = (byte) 2;
        } else {
            if (i != 4) {
                s83.t(r7.z("K: ", i, " is not supported for ML-KEM"));
                throw null;
            }
            this.d = (byte) 2;
        }
        int i2 = i * RendererCapabilities.DECODER_SUPPORT_MASK;
        this.c = i2;
        this.e = i2 + 32;
        this.f = i2;
        this.a = new uu2(this);
    }

    public final boolean a(byte[] bArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = i2 * RendererCapabilities.DECODER_SUPPORT_MASK;
            int i4 = -1;
            for (int i5 = 0; i5 < 128; i5++) {
                int i6 = (i5 * 3) + i3;
                int i7 = bArr[i6] & 255;
                int i8 = bArr[i6 + 1] & 255;
                i4 = i4 & (((short) ((i7 | (i8 << 8)) & 4095)) - 3329) & (((short) ((((bArr[i6 + 2] & 255) << 4) | (i8 >> 4)) & 4095)) - 3329);
            }
            i &= i4;
        }
        return i < 0;
    }
}

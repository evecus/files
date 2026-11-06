package defpackage;

import androidx.media3.extractor.ts.TsExtractor;

/* loaded from: classes2.dex */
public final class p0 {
    public final byte[] a;
    public final int b;
    public final int c;

    public p0(byte[] bArr, int i) {
        int i2;
        this.a = bArr;
        this.b = i;
        if (bArr == null) {
            i2 = 0;
        } else {
            int i3 = i + 1;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                } else {
                    i3 = (i3 * TsExtractor.TS_STREAM_TYPE_AIT) ^ bArr[i];
                }
            }
            i2 = i3;
        }
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return g4.i(this.a, this.b, 0, p0Var.a, p0Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}

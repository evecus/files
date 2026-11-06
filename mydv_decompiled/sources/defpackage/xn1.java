package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class xn1 {
    public final int[] a;

    public xn1(int[] iArr) {
        this.a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xn1) {
            return Arrays.equals(this.a, ((xn1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * TsExtractor.TS_STREAM_TYPE_AIT) ^ iArr[length];
        }
    }
}

package okhttp3.internal;

import defpackage.cz;
import defpackage.mz;
import defpackage.s04;
import java.io.EOFException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(mz mzVar, long j) {
        mzVar.getClass();
        try {
            s04 peek = mzVar.peek();
            for (long j2 = 0; j2 < j; j2++) {
                if (peek.p()) {
                    return true;
                }
                peek.U(1L);
                cz czVar = peek.J;
                byte y = czVar.y(0L);
                if ((y & 224) == 192) {
                    peek.U(2L);
                } else if ((y & 240) == 224) {
                    peek.U(3L);
                } else if ((y & 248) == 240) {
                    peek.U(4L);
                }
                int R = czVar.R();
                if (Character.isISOControl(R) && !Character.isWhitespace(R)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(mz mzVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return isProbablyUtf8(mzVar, j);
    }
}

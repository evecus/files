package defpackage;

import androidx.media3.common.util.Log;
import java.io.InputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wb1 extends sb1 {
    public wb1(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.I.mark(Log.LOG_LEVEL_OFF);
        } else {
            s83.t("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void g(long j) {
        int i = this.J;
        if (i > j) {
            this.J = 0;
            this.I.reset();
        } else {
            j -= i;
        }
        e((int) j);
    }

    public wb1(byte[] bArr) {
        super(bArr);
        this.I.mark(Log.LOG_LEVEL_OFF);
    }
}

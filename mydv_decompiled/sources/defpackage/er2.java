package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class er2 extends Writer {
    public final StringBuilder I = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void e() {
        StringBuilder sb = this.I;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        e();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                e();
            } else {
                this.I.append(c);
            }
        }
    }
}

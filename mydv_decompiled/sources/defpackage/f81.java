package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f81 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = f95.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (c81.d()) {
                c81.a().e();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = f95.a;
            Trace.endSection();
            throw th;
        }
    }
}

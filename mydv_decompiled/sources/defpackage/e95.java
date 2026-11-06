package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class e95 {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}

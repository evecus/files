package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.StaticLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ls1 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static final void c(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }
}

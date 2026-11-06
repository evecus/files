package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g95 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT < 29 || !a.get()) {
            return;
        }
        io.m();
    }
}

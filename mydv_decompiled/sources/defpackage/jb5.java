package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jb5 {
    public static boolean a(Context context) {
        context.getClass();
        return Build.VERSION.SDK_INT >= 26 && context.getPackageManager().resolveContentProvider("android.media.tv", 0) != null;
    }
}

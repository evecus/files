package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class nz {
    public static /* synthetic */ int a() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}

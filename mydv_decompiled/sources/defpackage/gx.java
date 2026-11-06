package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gx {
    public static final /* synthetic */ gx a = new gx();
    public static final String b = hx.class.getSimpleName();

    public static hx a() {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? ix.I : i >= 29 ? k04.N : i >= 28 ? k04.M : i >= 24 ? k04.L : k04.K;
    }
}

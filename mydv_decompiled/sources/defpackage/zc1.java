package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class zc1 {
    public static final String a = s24.a(zc1.class).c();

    public static int a() {
        pi5 pi5Var = pi5.I;
        pi5 pi5Var2 = eu5.e;
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (pi5Var2 != pi5Var) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (pi5Var2 != pi5Var) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (pi5Var2 != pi5Var) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}

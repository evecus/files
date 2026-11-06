package defpackage;

import android.os.Build;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b94 {
    public final ClassLoader a;
    public final WindowExtensions b;

    public b94(ClassLoader classLoader) {
        this.a = classLoader;
        this.b = new c94(classLoader).a();
    }

    public final WindowAreaComponent a() {
        ClassLoader classLoader = this.a;
        try {
            WindowExtensions windowExtensions = this.b;
            if (windowExtensions == null || !il2.i0("WindowExtensions#getWindowAreaComponent is not valid", new jt2((Object) windowExtensions, (Object) this, (byte) 13)) || Build.VERSION.SDK_INT < 29) {
                return null;
            }
            Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.area.WindowAreaComponent");
            loadClass.getClass();
            if (!du5.c(loadClass, zc1.a())) {
                return null;
            }
            Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaStatus");
            loadClass2.getClass();
            if (!du5.b(loadClass2, zc1.a())) {
                return null;
            }
            Class<?> loadClass3 = classLoader.loadClass("androidx.window.extensions.area.ExtensionWindowAreaPresentation");
            loadClass3.getClass();
            if (du5.a(loadClass3, zc1.a())) {
                return this.b.getWindowAreaComponent();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

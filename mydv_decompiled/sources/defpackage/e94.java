package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e94 {
    public final ClassLoader a;
    public final uu2 b;
    public final c94 c;

    public e94(ClassLoader classLoader, uu2 uu2Var) {
        this.a = classLoader;
        this.b = uu2Var;
        this.c = new c94(classLoader);
    }

    public static final boolean d(e94 e94Var) {
        Class<?> loadClass = e94Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            if (Modifier.isPublic(method2.getModifiers())) {
                return true;
            }
        }
        return false;
    }

    public final WindowLayoutComponent a() {
        int a;
        c94 c94Var = this.c;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        try {
            c94Var.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            byte b = 4;
            if (il2.i0("WindowExtensionsProvider#getWindowExtensions is not valid", new iy3(c94Var, b)) && il2.i0("WindowExtensions#getWindowLayoutComponent is not valid", new d94(this, z ? (byte) 1 : (byte) 0)) && il2.i0("FoldingFeature class is not valid", new d94(this, (byte) 1)) && (a = zc1.a()) >= 1) {
                if (a == 1) {
                    z = c();
                } else if (a < 5) {
                    z = b();
                } else if (b() && il2.i0("DisplayFoldFeature is not valid", new d94(this, (byte) 3)) && il2.i0("SupportedWindowFeatures is not valid", new d94(this, (byte) 2)) && il2.i0("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new d94(this, b))) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return il2.i0(sb.toString(), new d94(this, (byte) 6));
    }

    public final boolean c() {
        return il2.i0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d94(this, (byte) 5));
    }
}

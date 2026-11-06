package defpackage;

import androidx.window.area.reflectionguard.ExtensionWindowAreaStatusRequirements;
import androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class du5 {
    public static boolean a(Class cls, int i) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaPresentation.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (il2.i0(cls.getName() + '#' + method.getName() + " is not valid", new jt2(cls, method, (byte) 12))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(Class cls, int i) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaStatusRequirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (il2.i0(cls.getName() + '#' + method.getName() + " is not valid", new jt2(cls, method, (byte) 12))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(Class cls, int i) {
        if (i > 2) {
            Method[] methods = WindowAreaComponentApi3Requirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (il2.i0(cls.getName() + '#' + method.getName() + " is not valid", new jt2(cls, method, (byte) 12))) {
                }
            }
            return true;
        }
        return false;
    }
}

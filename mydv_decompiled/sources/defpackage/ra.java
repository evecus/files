package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ra {
    public static View a(int i, View view) {
        Method method;
        if (Build.VERSION.SDK_INT < 29) {
            method = AndroidComposeView.getAccessibilityViewIdMethod;
            if (method == null) {
                method = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getAccessibilityViewId", null);
                AndroidComposeView.getAccessibilityViewIdMethod = method;
                method.setAccessible(true);
            }
            if (j42.c(method.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View a = a(i, viewGroup.getChildAt(i2));
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }

    public static boolean b() {
        Method method;
        Method method2;
        try {
            if (AndroidComposeView.systemPropertiesClass == null) {
                AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
            }
            method = AndroidComposeView.getBooleanMethod;
            if (method == null) {
                Class cls = AndroidComposeView.systemPropertiesClass;
                AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            method2 = AndroidComposeView.getBooleanMethod;
            Object invoke = method2 != null ? method2.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return j42.c(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }
}

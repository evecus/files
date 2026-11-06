package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class co4 {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            invoke.getClass();
            return ((Integer) invoke).intValue();
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int a = a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            return 0;
        }
        return a;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List list;
        o91 o91Var = o91.I;
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return list == null ? o91Var : list;
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            invoke.getClass();
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}

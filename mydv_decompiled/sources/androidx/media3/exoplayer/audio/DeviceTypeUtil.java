package androidx.media3.exoplayer.audio;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class DeviceTypeUtil {
    private DeviceTypeUtil() {
    }

    public static boolean isBluetoothDevice(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static boolean isBuiltInEarpiece(int i) {
        return i == 1;
    }

    public static boolean isBuiltInSpeaker(int i) {
        return i == 2;
    }

    public static boolean isHdmiArc(int i) {
        return i == 10;
    }

    public static boolean isHdmiEarc(int i) {
        return Build.VERSION.SDK_INT >= 31 && i == 29;
    }

    public static boolean isUsbDevice(int i) {
        if (i == 11 || i == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i == 22;
    }
}

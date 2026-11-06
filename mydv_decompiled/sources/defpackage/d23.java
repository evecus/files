package defpackage;

import android.view.MotionEvent;
import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d23 {
    public static final d23 a = new d23();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Log.LOG_LEVEL_OFF) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Log.LOG_LEVEL_OFF) < 2139095040;
    }
}

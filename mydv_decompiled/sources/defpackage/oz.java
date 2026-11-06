package defpackage;

import android.os.Build;
import androidx.media3.common.PlaybackException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class oz {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            k5.a(30);
        }
        if (i >= 30) {
            k5.a(31);
        }
        if (i >= 30) {
            k5.a(33);
        }
        if (i >= 30) {
            k5.a(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
    }
}

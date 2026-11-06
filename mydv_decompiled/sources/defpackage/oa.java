package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oa implements hn1 {
    public final AndroidComposeView I;

    public oa(AndroidComposeView androidComposeView) {
        this.I = androidComposeView;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        int i = ((oh1) obj).a;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Integer c = yh1.c(i);
        if (c != null) {
            int intValue = c.intValue();
            this.I.playSoundEffect(Build.VERSION.SDK_INT >= 31 ? gk.a.a(intValue, booleanValue) : SoundEffectConstants.getContantForFocusDirection(intValue));
        }
        return wd5.a;
    }
}

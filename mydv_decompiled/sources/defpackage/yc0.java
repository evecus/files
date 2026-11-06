package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import coil3.network.internal.UtilsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yc0 implements kn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ yc0(byte b) {
        this.I = b;
    }

    @Override // defpackage.kn1
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                i35 i35Var = (i35) obj;
                w25 w25Var = (w25) obj2;
                rm1 rm1Var = (rm1) obj3;
                fe0 fe0Var = (fe0) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((go1) fe0Var).g(i35Var) : ((go1) fe0Var).i(i35Var) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? ((go1) fe0Var).g(w25Var) : ((go1) fe0Var).i(w25Var) ? 32 : 16;
                }
                if ((intValue & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i |= ((go1) fe0Var).i(rm1Var) ? 256 : 128;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i & 1, (i & 1171) != 1170)) {
                    go1Var.W();
                    break;
                } else {
                    at0.c((av) i35Var, w25Var, rm1Var, go1Var, i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    break;
                }
            case 1:
                i35 i35Var2 = (i35) obj;
                w25 w25Var2 = (w25) obj2;
                rm1 rm1Var2 = (rm1) obj3;
                fe0 fe0Var2 = (fe0) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((go1) fe0Var2).g(i35Var2) : ((go1) fe0Var2).i(i35Var2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? ((go1) fe0Var2).g(w25Var2) : ((go1) fe0Var2).i(w25Var2) ? 32 : 16;
                }
                if ((intValue2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i2 |= ((go1) fe0Var2).i(rm1Var2) ? 256 : 128;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
                    go1Var2.W();
                    break;
                } else {
                    at0.c((av) i35Var2, w25Var2, rm1Var2, go1Var2, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((d65) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(d65.f(j), d65.e(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(UtilsKt.MIME_TYPE_TEXT_PLAIN).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
        }
        return wd5Var;
    }
}

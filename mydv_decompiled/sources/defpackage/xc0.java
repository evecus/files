package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xc0 implements nn1 {
    @Override // defpackage.nn1
    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, go1 go1Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        xi0 xi0Var = (xi0) obj2;
        in1 in1Var = (in1) obj3;
        rm1 rm1Var = (rm1) obj4;
        int intValue = num.intValue();
        int i2 = intValue & 6;
        i13 i13Var = i13.a;
        if (i2 == 0) {
            i = (go1Var.g(i13Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= go1Var.g(str) ? 32 : 16;
        }
        if ((intValue & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i |= go1Var.h(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= go1Var.g(xi0Var) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= go1Var.i(in1Var) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= go1Var.i(rm1Var) ? 131072 : 65536;
        }
        if (go1Var.T(i & 1, (599187 & i) != 599186)) {
            cj0.c(str, booleanValue, xi0Var, i13Var, in1Var, rm1Var, go1Var, (i & 458752) | ((i >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | ((i << 9) & 7168) | (57344 & i));
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}

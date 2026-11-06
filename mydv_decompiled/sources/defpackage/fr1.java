package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fr1 {
    public static final fr1 a = new fr1();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return iw.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, mw2.R(i));
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        jp0.B();
        return er1.a(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, mw2.R(i));
    }

    public final SweepGradient c(long j, long[] jArr, float[] fArr) {
        jp0.v();
        return er1.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}

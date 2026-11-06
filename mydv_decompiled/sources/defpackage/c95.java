package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class c95 {
    public static final long a = fb4.M(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    public static final int a(long j, da2 da2Var) {
        if ((Long.MIN_VALUE & j) != 0 && da2Var != da2.I) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }

    public static final int b(long j, da2 da2Var) {
        if ((Long.MIN_VALUE & j) == 0 || da2Var == da2.I) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }

    public static final int c(long j) {
        return ((int) (j >> 45)) & 32767;
    }

    public static final int d(long j) {
        return ((int) (j >> 15)) & 32767;
    }
}

package defpackage;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b23 {
    public final long a;

    public /* synthetic */ b23(long j) {
        this.a = j;
    }

    public static final /* synthetic */ b23 a(long j) {
        return new b23(j);
    }

    public static long b(long j, long j2) {
        short intBitsToFloat = (short) Float.intBitsToFloat((int) (j2 >> 32));
        return ((j & 2147483647L) << 1) | 1 | (((((short) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 65535) | (intBitsToFloat << 16)) << 32);
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public static final long d(long j) {
        int i = (int) (j >>> 32);
        float f = (short) (i >>> 16);
        float f2 = (short) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long e(long j) {
        return (j >> 1) & 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b23) {
            return this.a == ((b23) obj).a;
        }
        return false;
    }

    public final /* synthetic */ long f() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ")";
    }
}

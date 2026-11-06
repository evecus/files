package coil3.util;

import defpackage.i82;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class IntPair {
    private final long value;

    private /* synthetic */ IntPair(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntPair m120boximpl(long j) {
        return new IntPair(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m121constructorimpl(int i, int i2) {
        return m122constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m123equalsimpl(long j, Object obj) {
        return (obj instanceof IntPair) && j == ((IntPair) obj).m129unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m124equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m125getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m126getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m127hashCodeimpl(long j) {
        return i82.Q(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m128toStringimpl(long j) {
        return "IntPair(value=" + j + ")";
    }

    public boolean equals(Object obj) {
        return m123equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m127hashCodeimpl(this.value);
    }

    public String toString() {
        return m128toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m129unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m122constructorimpl(long j) {
        return j;
    }
}

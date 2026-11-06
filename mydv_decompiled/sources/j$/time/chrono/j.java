package j$.time.chrono;

import j$.time.LocalTime;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface j extends j$.time.temporal.l, Comparable {
    a getChronology();

    j$.time.y getOffset();

    j$.time.x getZone();

    j k(j$.time.x xVar);

    long toEpochSecond();

    b toLocalDate();

    e toLocalDateTime();

    LocalTime toLocalTime();
}

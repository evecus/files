package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface b extends j$.time.temporal.l, j$.time.temporal.n, Comparable {
    @Override // j$.time.temporal.l
    b a(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.l
    b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.m
    boolean c(j$.time.temporal.p pVar);

    a getChronology();

    int hashCode();

    boolean isLeapYear();

    /* renamed from: j */
    b l(long j, TemporalUnit temporalUnit);

    int lengthOfYear();

    e n(LocalTime localTime);

    /* renamed from: p */
    int compareTo(b bVar);

    long toEpochDay();

    String toString();
}

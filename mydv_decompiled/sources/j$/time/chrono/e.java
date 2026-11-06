package j$.time.chrono;

import j$.time.LocalTime;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface e extends j$.time.temporal.l, j$.time.temporal.n, Comparable {
    j g(j$.time.y yVar);

    a getChronology();

    /* renamed from: o */
    int compareTo(e eVar);

    b toLocalDate();

    LocalTime toLocalTime();
}

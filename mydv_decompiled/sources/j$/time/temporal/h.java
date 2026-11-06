package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.d(31556952, 0)),
    QUARTER_YEARS("QuarterYears", Duration.d(7889238, 0));

    public final String a;
    public final Duration b;

    h(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l d(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return lVar.a(j$.time.a.S(lVar.d(r4), j), i.c);
        }
        if (i == 2) {
            return lVar.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}

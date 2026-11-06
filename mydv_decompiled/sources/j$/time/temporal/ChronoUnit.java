package j$.time.temporal;

import androidx.media3.common.C;
import j$.time.Duration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.e(1)),
    MICROS("Micros", Duration.e(1000)),
    MILLIS("Millis", Duration.e(1000000)),
    SECONDS("Seconds", Duration.d(1, 0)),
    MINUTES("Minutes", Duration.d(60, 0)),
    HOURS("Hours", Duration.d(3600, 0)),
    HALF_DAYS("HalfDays", Duration.d(43200, 0)),
    DAYS("Days", Duration.d(86400, 0)),
    WEEKS("Weeks", Duration.d(604800, 0)),
    MONTHS("Months", Duration.d(2629746, 0)),
    YEARS("Years", Duration.d(31556952, 0)),
    DECADES("Decades", Duration.d(315569520, 0)),
    CENTURIES("Centuries", Duration.d(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.d(31556952000L, 0)),
    ERAS("Eras", Duration.d(31556952000000000L, 0)),
    FOREVER("Forever", Duration.d(j$.time.a.S(Long.MAX_VALUE, j$.time.a.V(999999999, C.NANOS_PER_SECOND)), (int) j$.time.a.U(999999999, C.NANOS_PER_SECOND)));

    public final String a;
    public final Duration b;

    ChronoUnit(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l d(l lVar, long j) {
        return lVar.b(j, this);
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

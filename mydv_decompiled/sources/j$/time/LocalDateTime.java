package j$.time;

import androidx.media3.common.C;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.n, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = t(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = t(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime now() {
        b c0 = a.c0();
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return u(ofEpochMilli.a, ofEpochMilli.b, c0.a.q().d(ofEpochMilli));
    }

    public static LocalDateTime r(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDateTime) {
            return (LocalDateTime) mVar;
        }
        if (mVar instanceof b0) {
            return ((b0) mVar).a;
        }
        if (mVar instanceof p) {
            return ((p) mVar).a;
        }
        try {
            return new LocalDateTime(LocalDate.s(mVar), LocalTime.s(mVar));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName(), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDateTime t(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime u(long j, int i, y yVar) {
        Objects.a(yVar, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.i(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(a.V(j + yVar.b, 86400L)), LocalTime.u((((int) a.U(r5, 86400L)) * C.NANOS_PER_SECOND) + j2));
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? z((LocalDate) nVar, this.b) : nVar instanceof LocalTime ? z(this.a, (LocalTime) nVar) : nVar instanceof LocalDateTime ? (LocalDateTime) nVar : (LocalDateTime) nVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.d(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.l();
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() ? this.b.d(pVar) : this.a.d(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.e(this);
        }
        if (!((j$.time.temporal.a) pVar).l()) {
            return this.a.f(pVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.q.d(localTime, pVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j g(y yVar) {
        return b0.q(this, yVar, null);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.a getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public int getNano() {
        return this.b.d;
    }

    public int getSecond() {
        return this.b.getSecond();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().B(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.f ? this.a : a.x(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() ? this.b.m(pVar) : this.a.m(pVar) : pVar.f(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof LocalDateTime ? q((LocalDateTime) eVar) : a.i(this, eVar);
    }

    public final int q(LocalDateTime localDateTime) {
        int q = this.a.q(localDateTime.a);
        return q == 0 ? this.b.compareTo(localDateTime.b) : q;
    }

    public final boolean s(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return q((LocalDateTime) eVar) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = eVar.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.B() < eVar.toLocalTime().B();
        }
        return true;
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.d(this, j);
        }
        switch (i.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return x(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime z = z(this.a.z(j / 86400000000L), this.b);
                return z.x(z.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime z2 = z(this.a.z(j / 86400000), this.b);
                return z2.x(z2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return w(j);
            case 5:
                return x(this.a, 0L, j, 0L, 0L);
            case 6:
                return x(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime z3 = z(this.a.z(j / 256), this.b);
                return z3.x(z3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return z(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final LocalDateTime w(long j) {
        return x(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime x(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return z(localDate, localTime);
        }
        long j6 = j / 24;
        long j7 = ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * C.NANOS_PER_SECOND) + (j4 % 86400000000000L);
        long B = localTime.B();
        long j8 = ((j % 24) * 3600000000000L) + j7 + B;
        long V = a.V(j8, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long U = a.U(j8, 86400000000000L);
        return z(localDate.z(V), U == B ? this.b : LocalTime.u(U));
    }

    @Override // j$.time.temporal.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) pVar.h(this, j);
        }
        boolean l = ((j$.time.temporal.a) pVar).l();
        LocalDate localDate = this.a;
        return l ? z(localDate, this.b.a(j, pVar)) : z(localDate.a(j, pVar), this.b);
    }

    public final LocalDateTime z(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }
}

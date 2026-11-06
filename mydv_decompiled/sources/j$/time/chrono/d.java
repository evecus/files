package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class d implements b, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b q(a aVar, j$.time.temporal.l lVar) {
        b bVar = (b) lVar;
        if (aVar.equals(bVar.getChronology())) {
            return bVar;
        }
        j$.time.h.f("Chronology mismatch, expected: ", aVar.getId(), bVar.getChronology().getId());
        return null;
    }

    @Override // j$.time.temporal.l
    public b a(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
        }
        return q(getChronology(), pVar.h(this, j));
    }

    @Override // j$.time.temporal.l
    public b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return q(getChronology(), temporalUnit.d(this, j));
            }
            j$.time.h.b(temporalUnit, "Unsupported unit: ");
            return null;
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return s(j);
            case 2:
                return s(j$.time.a.W(j, 7L));
            case 3:
                return t(j);
            case 4:
                return u(j);
            case 5:
                return u(j$.time.a.W(j, 10L));
            case 6:
                return u(j$.time.a.W(j, 100L));
            case 7:
                return u(j$.time.a.W(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.time.a.S(m(aVar), j), (j$.time.temporal.p) aVar);
            default:
                j$.time.h.b(temporalUnit, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.m
    public /* synthetic */ boolean c(j$.time.temporal.p pVar) {
        return j$.time.a.t(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int d(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.time.a.h(this, (b) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public /* synthetic */ j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return j$.time.a.a(this, lVar);
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object i(j$.time.format.a aVar) {
        return j$.time.a.w(this, aVar);
    }

    @Override // j$.time.chrono.b
    public boolean isLeapYear() {
        return getChronology().isLeapYear(m(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public b l(long j, TemporalUnit temporalUnit) {
        return q(getChronology(), j$.time.temporal.q.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.chrono.b
    public e n(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // java.lang.Comparable
    /* renamed from: p */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.time.a.h(this, bVar);
    }

    public m r() {
        return getChronology().f(j$.time.temporal.q.a(this, j$.time.temporal.a.ERA));
    }

    public abstract b s(long j);

    public abstract b t(long j);

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        return m(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long m = m(j$.time.temporal.a.YEAR_OF_ERA);
        long m2 = m(j$.time.temporal.a.MONTH_OF_YEAR);
        long m3 = m(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(r());
        sb.append(" ");
        sb.append(m);
        sb.append(m2 < 10 ? "-0" : "-");
        sb.append(m2);
        sb.append(m3 < 10 ? "-0" : "-");
        sb.append(m3);
        return sb.toString();
    }

    public abstract b u(long j);

    @Override // j$.time.temporal.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public b e(j$.time.temporal.n nVar) {
        return q(getChronology(), nVar.h(this));
    }
}

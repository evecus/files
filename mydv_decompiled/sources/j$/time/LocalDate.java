package j$.time;

import androidx.media3.common.C;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.n, j$.time.chrono.b, Serializable {
    public static final LocalDate d = x(-999999999, 1, 1);
    public static final LocalDate e = x(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        x(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate C(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.s.c.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.i(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate r(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.c.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    h.e("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new c("Invalid date '" + l.t(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDate s(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        LocalDate localDate = (LocalDate) mVar.i(j$.time.temporal.q.f);
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName());
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    public static LocalDate x(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.i(i);
        j$.time.temporal.a.MONTH_OF_YEAR.i(i2);
        j$.time.temporal.a.DAY_OF_MONTH.i(i3);
        return r(i, i2, i3);
    }

    public final LocalDate A(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.b.a(a.V(j2, 12L), aVar), ((int) a.U(j2, 12L)) + 1, this.c);
    }

    public final LocalDate B(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDate) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.i(j);
        switch (g.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return x(this.a, this.b, i);
                }
                return this;
            case 2:
                return F((int) j);
            case 3:
                return z(a.W(j - m(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7L));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return G((int) j);
            case 5:
                return z(j - u().getValue());
            case 6:
                return z(j - m(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return z(j - m(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return z(a.W(j - m(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7L));
            case 10:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MONTH_OF_YEAR.i(i2);
                    return C(this.a, i2, this.c);
                }
                return this;
            case 11:
                return A(j - (((this.a * 12) + this.b) - 1));
            case 12:
                return G((int) j);
            case 13:
                if (m(j$.time.temporal.a.ERA) != j) {
                    return G(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? (LocalDate) nVar : (LocalDate) nVar.h(this);
    }

    public final LocalDate F(int i) {
        if (v() == i) {
            return this;
        }
        int i2 = this.a;
        long j = i2;
        j$.time.temporal.a.YEAR.i(j);
        j$.time.temporal.a.DAY_OF_YEAR.i(i);
        boolean isLeapYear = j$.time.chrono.s.c.isLeapYear(j);
        if (i == 366 && !isLeapYear) {
            h.e("Invalid date 'DayOfYear 366' as '", i2, "' is not a leap year");
            return null;
        }
        l t = l.t(((i - 1) / 31) + 1);
        if (i > (t.r(isLeapYear) + t.q(isLeapYear)) - 1) {
            t = l.a[(t.ordinal() + 13) % 12];
        }
        return new LocalDate(i2, t.getValue(), (i - t.q(isLeapYear)) + 1);
    }

    public final LocalDate G(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.i(i);
        return C(i, this.b, this.c);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return a.t(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? t(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && q((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.e(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.e(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.s.e(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? aVar.b : this.a <= 0 ? j$.time.temporal.s.e(1L, C.NANOS_PER_SECOND) : j$.time.temporal.s.e(1L, 999999999L);
        }
        return j$.time.temporal.s.e(1L, (l.t(this.b) != l.FEBRUARY || isLeapYear()) ? 5L : 4L);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return a.a(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.f ? this : a.w(this, aVar);
    }

    @Override // j$.time.chrono.b
    public final boolean isLeapYear() {
        return j$.time.chrono.s.c.isLeapYear(this.a);
    }

    public final int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.EPOCH_DAY ? toEpochDay() : pVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.a * 12) + this.b) - 1 : t(pVar) : pVar.f(this);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e n(LocalTime localTime) {
        return LocalDateTime.t(this, localTime);
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? q((LocalDate) bVar) : a.h(this, bVar);
    }

    public final int q(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    public final int t(j$.time.temporal.p pVar) {
        switch (g.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return v();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return u().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((v() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((v() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !isLeapYear() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    public final e u() {
        return e.q(((int) a.U(toEpochDay() + 3, 7L)) + 1);
    }

    public final int v() {
        return (l.t(this.b).q(isLeapYear()) + this.c) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate l(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    @Override // j$.time.temporal.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.d(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return z(j);
            case 2:
                return z(a.W(j, 7L));
            case 3:
                return A(j);
            case 4:
                return B(j);
            case 5:
                return B(a.W(j, 10L));
            case 6:
                return B(a.W(j, 100L));
            case 7:
                return B(a.W(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(a.S(m(aVar), j), aVar);
            default:
                h.b(temporalUnit, "Unsupported unit: ");
                return null;
        }
    }

    public final LocalDate z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long lengthOfMonth = lengthOfMonth();
                if (j2 <= lengthOfMonth) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - lengthOfMonth));
                }
                j$.time.temporal.a.YEAR.i(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - lengthOfMonth));
            }
        }
        return ofEpochDay(a.S(toEpochDay(), j));
    }
}

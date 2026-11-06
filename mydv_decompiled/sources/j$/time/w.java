package j$.time;

import androidx.media3.common.C;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class w implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.a0.EXCEEDS_PAD);
        sVar.c('-');
        sVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.q(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public w(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        int i = this.a - wVar.a;
        return i == 0 ? this.b - wVar.b : i;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return f(pVar).a(m(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        localDate.getClass();
        return (w) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.a == wVar.a && this.b == wVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        if (!a.R(lVar).equals(j$.time.chrono.s.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return lVar.a(q(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.b ? j$.time.chrono.s.c : aVar == j$.time.temporal.q.c ? ChronoUnit.MONTHS : j$.time.temporal.q.c(this, aVar);
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
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        int i2 = v.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return q();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    public final long q() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final w b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (w) temporalUnit.d(this, j);
        }
        switch (v.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return s(j);
            case 2:
                return t(j);
            case 3:
                return t(a.W(j, 10L));
            case 4:
                return t(a.W(j, 100L));
            case 5:
                return t(a.W(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(a.S(m(aVar), j), aVar);
            default:
                h.b(temporalUnit, "Unsupported unit: ");
                return null;
        }
    }

    public final w s(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return u(aVar.b.a(a.V(j2, 12L), aVar), ((int) a.U(j2, 12L)) + 1);
    }

    public final w t(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return u(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final String toString() {
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    public final w u(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new w(i, i2);
    }

    @Override // j$.time.temporal.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final w a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (w) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.i(j);
        int i = v.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.i(i2);
            return u(this.a, i2);
        }
        if (i == 2) {
            return s(j - q());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.i(i3);
            return u(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.i(i4);
            return u(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        if (m(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.i(i5);
        return u(i5, this.b);
    }
}

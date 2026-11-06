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
public final class u implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.a0.EXCEEDS_PAD);
        sVar.q(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public u(int i) {
        this.a = i;
    }

    public static u q(int i) {
        j$.time.temporal.a.YEAR.i(i);
        return new u(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((u) obj).a;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return f(pVar).a(m(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        localDate.getClass();
        return (u) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
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
        return lVar.a(this.a, j$.time.temporal.a.YEAR);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.b ? j$.time.chrono.s.c : aVar == j$.time.temporal.q.c ? ChronoUnit.YEARS : j$.time.temporal.q.c(this, aVar);
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
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        int i = t.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final u b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.d(this, j);
        }
        int i = t.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return s(j);
        }
        if (i == 2) {
            return s(a.W(j, 10L));
        }
        if (i == 3) {
            return s(a.W(j, 100L));
        }
        if (i == 4) {
            return s(a.W(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(a.S(m(aVar), j), aVar);
        }
        h.b(temporalUnit, "Unsupported unit: ");
        return null;
    }

    public final u s(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return q(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final u a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (u) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.i(j);
        int i = t.a[aVar.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return q((int) j);
        }
        if (i == 2) {
            return q((int) j);
        }
        if (i == 3) {
            return m(j$.time.temporal.a.ERA) == j ? this : q(1 - this.a);
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}

package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final y b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        y yVar = y.h;
        localDateTime.getClass();
        new p(localDateTime, yVar);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        y yVar2 = y.g;
        localDateTime2.getClass();
        new p(localDateTime2, yVar2);
    }

    public p(LocalDateTime localDateTime, y yVar) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(yVar, "offset");
        this.b = yVar;
    }

    public static p q(Instant instant, x xVar) {
        Objects.a(instant, "instant");
        Objects.a(xVar, "zone");
        y d = xVar.q().d(instant);
        return new p(LocalDateTime.u(instant.a, instant.b, d), d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (p) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = o.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? s(localDateTime.a(j, pVar), this.b) : s(localDateTime, y.x(aVar.b.a(j, aVar))) : q(Instant.s(j, localDateTime.getNano()), this.b);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        p pVar = (p) obj;
        boolean equals = this.b.equals(pVar.b);
        LocalDateTime localDateTime = this.a;
        if (equals) {
            compare = localDateTime.compareTo(pVar.a);
        } else {
            y yVar = this.b;
            localDateTime.getClass();
            long A = a.A(localDateTime, yVar);
            LocalDateTime localDateTime2 = pVar.a;
            y yVar2 = pVar.b;
            localDateTime2.getClass();
            compare = Long.compare(A, a.A(localDateTime2, yVar2));
            if (compare == 0) {
                compare = this.a.b.d - pVar.a.b.d;
            }
        }
        return compare == 0 ? this.a.compareTo(pVar.a) : compare;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.a(this, pVar);
        }
        int i = o.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.d(pVar) : this.b.b;
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        if (d.b(localDate)) {
            return s(this.a.e(localDate), this.b);
        }
        localDate.getClass();
        return (p) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : this.a.f(pVar) : pVar.e(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(this.a.a.toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(this.a.b.B(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (aVar == j$.time.temporal.q.a) {
            return null;
        }
        return aVar == j$.time.temporal.q.f ? this.a.a : aVar == j$.time.temporal.q.g ? this.a.b : aVar == j$.time.temporal.q.b ? j$.time.chrono.s.c : aVar == j$.time.temporal.q.c ? ChronoUnit.NANOS : aVar.a(this);
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
        int i = o.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.m(pVar) : this.b.b;
        }
        LocalDateTime localDateTime = this.a;
        y yVar = this.b;
        localDateTime.getClass();
        return a.A(localDateTime, yVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final p b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? s(this.a.b(j, temporalUnit), this.b) : (p) temporalUnit.d(this, j);
    }

    public final p s(LocalDateTime localDateTime, y yVar) {
        return (this.a == localDateTime && this.b.equals(yVar)) ? this : new p(localDateTime, yVar);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}

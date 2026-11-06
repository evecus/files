package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b0 implements j$.time.temporal.l, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final y b;
    public final x c;

    public b0(LocalDateTime localDateTime, x xVar, y yVar) {
        this.a = localDateTime;
        this.b = yVar;
        this.c = xVar;
    }

    public static b0 h(long j, int i, x xVar) {
        y d = xVar.q().d(Instant.s(j, i));
        return new b0(LocalDateTime.u(j, i, d), xVar, d);
    }

    public static b0 q(LocalDateTime localDateTime, x xVar, y yVar) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(xVar, "zone");
        if (xVar instanceof y) {
            return new b0(localDateTime, xVar, (y) xVar);
        }
        j$.time.zone.f q = xVar.q();
        List f = q.f(localDateTime);
        if (f.size() == 1) {
            yVar = (y) f.get(0);
        } else if (f.size() == 0) {
            Object e = q.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.w(Duration.d(bVar.d.b - bVar.c.b, 0).a);
            yVar = bVar.d;
        } else if (yVar == null || !f.contains(yVar)) {
            yVar = (y) f.get(0);
            Objects.a(yVar, "offset");
        }
        return new b0(localDateTime, xVar, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (b0) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = a0.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? q(this.a.a(j, pVar), this.c, this.b) : s(y.x(aVar.b.a(j, aVar))) : h(j, this.a.getNano(), this.c);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a.j(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return a.o(this, pVar);
        }
        int i = a0.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.d(pVar) : this.b.b;
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return d.b(localDate) ? q(LocalDateTime.t(localDate, this.a.b), this.c, this.b) : (b0) localDate.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.a.equals(b0Var.a) && this.b.equals(b0Var.b) && this.c.equals(b0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : this.a.f(pVar) : pVar.e(this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.a getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.chrono.j
    public final y getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final x getZone() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.f ? this.a.a : a.y(this, aVar);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j k(x xVar) {
        Objects.a(xVar, "zone");
        return this.c.equals(xVar) ? this : q(this.a, xVar, this.b);
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
        int i = a0.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.m(pVar) : this.b.b : a.B(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final b0 b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (b0) temporalUnit.d(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return q(this.a.b(j, temporalUnit), this.c, this.b);
        }
        LocalDateTime b = this.a.b(j, temporalUnit);
        y yVar = this.b;
        x xVar = this.c;
        Objects.a(b, "localDateTime");
        Objects.a(yVar, "offset");
        Objects.a(xVar, "zone");
        return xVar.q().f(b).contains(yVar) ? new b0(b, xVar, yVar) : h(a.A(b, yVar), b.getNano(), xVar);
    }

    public final b0 s(y yVar) {
        return (yVar.equals(this.b) || !this.c.q().f(this.a).contains(yVar)) ? this : new b0(this.a, this.c, yVar);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return a.B(this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        y yVar = this.b;
        x xVar = this.c;
        if (yVar == xVar) {
            return str;
        }
        return str + "[" + xVar.toString() + "]";
    }
}

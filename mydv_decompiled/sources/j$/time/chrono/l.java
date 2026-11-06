package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient j$.time.y b;
    public final transient j$.time.x c;

    public l(j$.time.x xVar, j$.time.y yVar, g gVar) {
        Objects.a(gVar, "dateTime");
        this.a = gVar;
        this.b = yVar;
        Objects.a(xVar, "zone");
        this.c = xVar;
    }

    public static l h(a aVar, j$.time.temporal.l lVar) {
        l lVar2 = (l) lVar;
        if (aVar.equals(lVar2.getChronology())) {
            return lVar2;
        }
        j$.time.h.f("Chronology mismatch, required: ", aVar.getId(), lVar2.getChronology().getId());
        return null;
    }

    public static l q(j$.time.x xVar, j$.time.y yVar, g gVar) {
        Objects.a(gVar, "localDateTime");
        Objects.a(xVar, "zone");
        if (xVar instanceof j$.time.y) {
            return new l(xVar, (j$.time.y) xVar, gVar);
        }
        j$.time.zone.f q = xVar.q();
        LocalDateTime r = LocalDateTime.r(gVar);
        List f = q.f(r);
        if (f.size() == 1) {
            yVar = (j$.time.y) f.get(0);
        } else if (f.size() == 0) {
            Object e = q.e(r);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            gVar = gVar.s(gVar.a, 0L, 0L, Duration.d(bVar.d.b - bVar.c.b, 0).a, 0L);
            yVar = bVar.d;
        } else {
            if (yVar == null || !f.contains(yVar)) {
                yVar = (j$.time.y) f.get(0);
            }
            gVar = gVar;
        }
        Objects.a(yVar, "offset");
        return new l(xVar, yVar, gVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return h(getChronology(), pVar.h(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.time.a.B(this), ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return q(this.c, this.b, this.a.a(j, pVar));
        }
        j$.time.y x = j$.time.y.x(aVar.b.a(j, aVar));
        g gVar = this.a;
        gVar.getClass();
        Instant s = Instant.s(j$.time.a.A(gVar, x), gVar.b.d);
        j$.time.x xVar = this.c;
        a chronology = getChronology();
        j$.time.y d = xVar.q().d(s);
        Objects.a(d, "offset");
        return new l(xVar, d, (g) chronology.h(LocalDateTime.u(s.a, s.b, d)));
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
        return j$.time.a.j(this, (j) obj);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int d(j$.time.temporal.p pVar) {
        return j$.time.a.o(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return h(getChronology(), localDate.h(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.time.a.j(this, (j) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : this.a.f(pVar) : pVar.e(this);
    }

    @Override // j$.time.chrono.j
    public final a getChronology() {
        return this.a.a.getChronology();
    }

    @Override // j$.time.chrono.j
    public final j$.time.y getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final j$.time.x getZone() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object i(j$.time.format.a aVar) {
        return j$.time.a.y(this, aVar);
    }

    @Override // j$.time.chrono.j
    public final j k(j$.time.x xVar) {
        return q(xVar, this.b, this.a);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        return h(getChronology(), j$.time.temporal.q.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.m(pVar) : this.b.b : j$.time.a.B(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return h(getChronology(), temporalUnit.d(this, j));
        }
        return h(getChronology(), this.a.b(j, temporalUnit).h(this));
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.time.a.B(this);
    }

    @Override // j$.time.chrono.j
    public final b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return ((g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        j$.time.y yVar = this.b;
        j$.time.x xVar = this.c;
        if (yVar == xVar) {
            return str;
        }
        return str + "[" + xVar.toString() + "]";
    }
}

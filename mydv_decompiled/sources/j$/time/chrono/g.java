package j$.time.chrono;

import androidx.media3.common.C;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class g implements e, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient LocalTime b;

    public g(b bVar, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = bVar;
        this.b = localTime;
    }

    public static g q(a aVar, j$.time.temporal.l lVar) {
        g gVar = (g) lVar;
        if (aVar.equals(gVar.a.getChronology())) {
            return gVar;
        }
        j$.time.h.f("Chronology mismatch, required: ", aVar.getId(), gVar.a.getChronology().getId());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
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
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() ? this.b.d(pVar) : this.a.d(pVar) : f(pVar).a(m(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        if (j$.time.d.b(localDate)) {
            return u(localDate, this.b);
        }
        a chronology = this.a.getChronology();
        localDate.getClass();
        return q(chronology, (g) j$.time.a.a(localDate, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.time.a.i(this, (e) obj) == 0;
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

    @Override // j$.time.chrono.e
    public final j g(j$.time.y yVar) {
        return l.q(yVar, null, this);
    }

    @Override // j$.time.chrono.e
    public final a getChronology() {
        return this.a.getChronology();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().B(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object i(j$.time.format.a aVar) {
        return j$.time.a.x(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        return q(this.a.getChronology(), j$.time.temporal.q.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() ? this.b.m(pVar) : this.a.m(pVar) : pVar.f(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.time.a.i(this, eVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final g b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return q(this.a.getChronology(), temporalUnit.d(this, j));
        }
        switch (f.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return s(this.a, 0L, 0L, 0L, j);
            case 2:
                g u = u(this.a.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return u.s(u.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g u2 = u(this.a.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return u2.s(u2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return s(this.a, 0L, 0L, j, 0L);
            case 5:
                return s(this.a, 0L, j, 0L, 0L);
            case 6:
                return s(this.a, j, 0L, 0L, 0L);
            case 7:
                g u3 = u(this.a.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return u3.s(u3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return u(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final g s(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return u(bVar, localTime);
        }
        long j6 = j / 24;
        long j7 = ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * C.NANOS_PER_SECOND) + (j4 % 86400000000000L);
        long B = localTime.B();
        long j8 = ((j % 24) * 3600000000000L) + j7 + B;
        long V = j$.time.a.V(j8, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long U = j$.time.a.U(j8, 86400000000000L);
        return u(bVar.b(V, (TemporalUnit) ChronoUnit.DAYS), U == B ? this.b : LocalTime.u(U));
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final g a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return q(this.a.getChronology(), pVar.h(this, j));
        }
        boolean l = ((j$.time.temporal.a) pVar).l();
        b bVar = this.a;
        return l ? u(bVar, this.b.a(j, pVar)) : u(bVar.a(j, pVar), this.b);
    }

    @Override // j$.time.chrono.e
    public final b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    public final g u(j$.time.temporal.l lVar, LocalTime localTime) {
        b bVar = this.a;
        return (bVar == lVar && this.b == localTime) ? this : new g(d.q(bVar.getChronology(), lVar), localTime);
    }
}

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
public final class q implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final y b;

    static {
        LocalTime localTime = LocalTime.e;
        y yVar = y.h;
        localTime.getClass();
        new q(localTime, yVar);
        LocalTime localTime2 = LocalTime.f;
        y yVar2 = y.g;
        localTime2.getClass();
        new q(localTime2, yVar2);
    }

    public q(LocalTime localTime, y yVar) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(yVar, "offset");
        this.b = yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (pVar != aVar) {
            return r(localTime.a(j, pVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) pVar;
        return r(localTime, y.x(aVar2.b.a(j, aVar2)));
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        boolean equals = this.b.equals(qVar.b);
        LocalTime localTime = this.a;
        if (equals) {
            return localTime.compareTo(qVar.a);
        }
        int compare = Long.compare(localTime.B() - (this.b.b * C.NANOS_PER_SECOND), qVar.a.B() - (qVar.b.b * C.NANOS_PER_SECOND));
        return compare == 0 ? this.a.compareTo(qVar.a) : compare;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        localDate.getClass();
        return (q) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a.equals(qVar.a) && this.b.equals(qVar.b)) {
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
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) pVar).b;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.q.d(localTime, pVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(this.a.B(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (((aVar == j$.time.temporal.q.a) || (aVar == j$.time.temporal.q.b)) || aVar == j$.time.temporal.q.f) {
            return null;
        }
        return aVar == j$.time.temporal.q.g ? this.a : aVar == j$.time.temporal.q.c ? ChronoUnit.NANOS : aVar.a(this);
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
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.b : this.a.m(pVar) : pVar.f(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final q b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? r(this.a.b(j, temporalUnit), this.b) : (q) temporalUnit.d(this, j);
    }

    public final q r(LocalTime localTime, y yVar) {
        return (this.a == localTime && this.b.equals(yVar)) ? this : new q(localTime, yVar);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}

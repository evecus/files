package j$.time;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        s(-31557014167219200L, 0L);
        s(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant ofEpochMilli(long j) {
        return q(a.V(j, 1000L), ((int) a.U(j, 1000L)) * PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }

    public static Instant q(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant r(j$.time.temporal.m mVar) {
        if (mVar instanceof Instant) {
            return (Instant) mVar;
        }
        Objects.a(mVar, "temporal");
        try {
            return s(mVar.m(j$.time.temporal.a.INSTANT_SECONDS), mVar.d(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName(), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant s(long j, long j2) {
        return q(a.S(j, a.V(j2, C.NANOS_PER_SECOND)), (int) a.U(j2, C.NANOS_PER_SECOND));
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.i(j);
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? q(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? q(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * PlaybackException.CUSTOM_ERROR_CODE_BASE;
            return i3 != this.b ? q(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? q(j, this.b) : this;
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.d(this, pVar).a(pVar.f(this), pVar);
        }
        int i = f.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / PlaybackException.CUSTOM_ERROR_CODE_BASE;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        localDate.getClass();
        return (Instant) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.c) {
            return ChronoUnit.NANOS;
        }
        if (aVar == j$.time.temporal.q.b || aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.f || aVar == j$.time.temporal.q.g) {
            return null;
        }
        return aVar.a(this);
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
        int i2 = f.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
            }
            i = this.b / PlaybackException.CUSTOM_ERROR_CODE_BASE;
        }
        return i;
    }

    public final Instant t(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return s(a.S(a.S(this.a, j), j2 / C.NANOS_PER_SECOND), this.b + (j2 % C.NANOS_PER_SECOND));
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? a.S(a.W(j, 1000L), this.b / PlaybackException.CUSTOM_ERROR_CODE_BASE) : a.S(a.W(j + 1, 1000L), (this.b / PlaybackException.CUSTOM_ERROR_CODE_BASE) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.d.a(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.d(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return t(0L, j);
            case 2:
                return t(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return t(j / 1000, (j % 1000) * 1000000);
            case 4:
                return t(j, 0L);
            case 5:
                return t(a.W(j, 60L), 0L);
            case 6:
                return t(a.W(j, 3600L), 0L);
            case 7:
                return t(a.W(j, 43200L), 0L);
            case 8:
                return t(a.W(j, 86400L), 0L);
            default:
                h.b(temporalUnit, "Unsupported unit: ");
                return null;
        }
    }
}

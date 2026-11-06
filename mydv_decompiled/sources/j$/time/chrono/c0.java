package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public c0(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 7, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b b(long j, TemporalUnit temporalUnit) {
        return (c0) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (c0) super.e(localDate);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.a.equals(((c0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.e(this);
        }
        if (!j$.time.a.t(this, pVar)) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = b0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.f(pVar);
        }
        if (i != 4) {
            return a0.c.m(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, w() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return a0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        a0.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: j */
    public final b l(long j, TemporalUnit temporalUnit) {
        return (c0) super.l(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        return (c0) super.l(j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        int i = b0.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 4) {
            int w = w();
            if (w < 1) {
                w = 1 - w;
            }
            return w;
        }
        if (i == 5) {
            return ((w() * 12) + this.a.b) - 1;
        }
        if (i == 6) {
            return w();
        }
        if (i != 7) {
            return this.a.m(pVar);
        }
        return w() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e n(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d
    public final m r() {
        return w() >= 1 ? d0.ROC : d0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d
    public final b s(long j) {
        return y(this.a.z(j));
    }

    @Override // j$.time.chrono.d
    public final b t(long j) {
        return y(this.a.A(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d
    public final b u(long j) {
        return y(this.a.B(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: v */
    public final b e(j$.time.temporal.n nVar) {
        return (c0) super.e(nVar);
    }

    public final int w() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.c0 a(long r8, j$.time.temporal.p r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.m(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.b0.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.a0 r10 = j$.time.chrono.a0.c
            j$.time.temporal.s r10 = r10.m(r0)
            r10.b(r8, r0)
            int r10 = r7.w()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.a
            short r2 = r10.b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r8 = r10.A(r8)
            j$.time.chrono.c0 r7 = r7.y(r8)
            return r7
        L49:
            j$.time.chrono.a0 r2 = j$.time.chrono.a0.c
            j$.time.temporal.s r2 = r2.m(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.LocalDate r0 = r7.a
            j$.time.LocalDate r8 = r0.a(r8, r10)
            j$.time.chrono.c0 r7 = r7.y(r8)
            return r7
        L6a:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.w()
            int r9 = 1912 - r9
            j$.time.LocalDate r8 = r8.G(r9)
            j$.time.chrono.c0 r7 = r7.y(r8)
            return r7
        L7b:
            j$.time.LocalDate r8 = r7.a
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.G(r2)
            j$.time.chrono.c0 r7 = r7.y(r8)
            return r7
        L88:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.w()
            r10 = 1
            if (r9 < r10) goto L94
            int r2 = r2 + 1911
            goto L96
        L94:
            int r2 = 1912 - r2
        L96:
            j$.time.LocalDate r8 = r8.G(r2)
            j$.time.chrono.c0 r7 = r7.y(r8)
            return r7
        L9f:
            j$.time.chrono.b r7 = super.a(r8, r10)
            j$.time.chrono.c0 r7 = (j$.time.chrono.c0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.c0.a(long, j$.time.temporal.p):j$.time.chrono.c0");
    }

    public final c0 y(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new c0(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l b(long j, TemporalUnit temporalUnit) {
        return (c0) super.b(j, temporalUnit);
    }
}

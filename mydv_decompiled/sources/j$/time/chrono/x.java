package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class x extends d {
    public static final LocalDate d = LocalDate.x(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient y b;
    public final transient int c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r6.toEpochDay() < r0.toEpochDay()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6.q(r0) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(j$.time.LocalDate r6) {
        /*
            r5 = this;
            r5.<init>()
            j$.time.LocalDate r0 = j$.time.chrono.x.d
            boolean r1 = j$.time.d.b(r0)
            r2 = 1
            if (r1 == 0) goto L16
            r6.getClass()
            int r0 = r6.q(r0)
            if (r0 >= 0) goto L24
            goto L22
        L16:
            long r3 = r6.toEpochDay()
            long r0 = r0.toEpochDay()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L24
        L22:
            r0 = r2
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3a
            j$.time.chrono.y r0 = j$.time.chrono.y.q(r6)
            r5.b = r0
            int r1 = r6.a
            j$.time.LocalDate r0 = r0.b
            int r0 = r0.a
            int r1 = r1 - r0
            int r1 = r1 + r2
            r5.c = r1
            r5.a = r6
            return
        L3a:
            j$.time.c r5 = new j$.time.c
            java.lang.String r6 = "JapaneseDate before Meiji 6 is not supported"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.x.<init>(j$.time.LocalDate):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isDateBased() : pVar != null && pVar.d(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (x) super.e(localDate);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.e(this);
        }
        if (!c(pVar)) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.e(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.s.e(1L, lengthOfYear());
        }
        if (i != 3) {
            return v.c.m(aVar);
        }
        y yVar = this.b;
        int i2 = yVar.b.a;
        return yVar.r() != null ? j$.time.temporal.s.e(1L, (r5.b.a - i2) + 1) : j$.time.temporal.s.e(1L, 999999999 - i2);
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return v.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: j */
    public final b l(long j, TemporalUnit temporalUnit) {
        return (x) super.l(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        return (x) super.l(j, chronoUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j$.time.chrono.d, j$.time.chrono.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lengthOfYear() {
        /*
            r4 = this;
            j$.time.chrono.y r0 = r4.b
            j$.time.chrono.y r0 = r0.r()
            r1 = 1
            if (r0 == 0) goto L19
            j$.time.LocalDate r0 = r0.b
            int r2 = r0.a
            j$.time.LocalDate r3 = r4.a
            int r3 = r3.a
            if (r2 != r3) goto L19
            int r0 = r0.v()
            int r0 = r0 - r1
            goto L1f
        L19:
            j$.time.LocalDate r0 = r4.a
            int r0 = r0.lengthOfYear()
        L1f:
            int r2 = r4.c
            if (r2 != r1) goto L2d
            j$.time.chrono.y r4 = r4.b
            j$.time.LocalDate r4 = r4.b
            int r4 = r4.v()
            int r4 = r4 - r1
            int r0 = r0 - r4
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.x.lengthOfYear():int");
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        switch (w.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.v() - this.b.b.v()) + 1 : localDate.v();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
            case 8:
                return this.b.a;
            default:
                return this.a.m(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e n(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d
    public final m r() {
        return this.b;
    }

    @Override // j$.time.chrono.d
    public final b s(long j) {
        return x(this.a.z(j));
    }

    @Override // j$.time.chrono.d
    public final b t(long j) {
        return x(this.a.A(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d
    public final b u(long j) {
        return x(this.a.B(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: v */
    public final b e(j$.time.temporal.n nVar) {
        return (x) super.e(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final x a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (x) super.a(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (m(aVar) == j) {
            return this;
        }
        int[] iArr = w.a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            int a = v.c.m(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return y(this.b, a);
            }
            if (i2 == 8) {
                return y(y.s(a), this.c);
            }
            if (i2 == 9) {
                return x(this.a.G(a));
            }
        }
        return x(this.a.a(j, pVar));
    }

    public final x x(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
    }

    public final x y(y yVar, int i) {
        v.c.getClass();
        if (yVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = yVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || yVar != y.q(LocalDate.x(i3, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return x(this.a.G(i3));
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }
}

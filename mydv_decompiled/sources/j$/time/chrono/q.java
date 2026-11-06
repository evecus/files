package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.m();
        if (i < oVar.e || i >= oVar.f) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(oVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int[] iArr = {oVar.r(binarySearch), ((oVar.g + binarySearch) % 12) + 1, (i - oVar.d[binarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final q a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) super.a(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.a.v(aVar).b(j, aVar);
        int i = (int) j;
        switch (p.a[aVar.ordinal()]) {
            case 1:
                return z(this.b, this.c, i);
            case 2:
                return s(Math.min(i, lengthOfYear()) - w());
            case 3:
                return s((j - m(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return s(j - (((int) j$.time.a.U(toEpochDay() + 3, 7L)) + 1));
            case 5:
                return s(j - m(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return s(j - m(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(this.a, j);
            case 8:
                return s((j - m(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return z(this.b, i, this.d);
            case 10:
                return t(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return z(i, this.c, this.d);
            case 12:
                return z(i, this.c, this.d);
            case 13:
                return z(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (q) super.e(localDate);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
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
        int i = p.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.v(aVar) : j$.time.temporal.s.e(1L, 5L) : j$.time.temporal.s.e(1L, lengthOfYear()) : j$.time.temporal.s.e(1L, this.a.t(this.b, this.c));
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean isLeapYear() {
        return this.a.isLeapYear(this.b);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: j */
    public final b l(long j, TemporalUnit temporalUnit) {
        return (q) super.l(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        return (q) super.l(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int lengthOfYear() {
        return this.a.w(this.b, 12);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        int i;
        int i2;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        switch (p.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                i = this.d;
                return i;
            case 2:
                i = w();
                return i;
            case 3:
                i2 = (this.d - 1) / 7;
                i = i2 + 1;
                return i;
            case 4:
                i2 = (int) j$.time.a.U(toEpochDay() + 3, 7L);
                i = i2 + 1;
                return i;
            case 5:
                i2 = (this.d - 1) % 7;
                i = i2 + 1;
                return i;
            case 6:
                i2 = (w() - 1) % 7;
                i = i2 + 1;
                return i;
            case 7:
                return toEpochDay();
            case 8:
                i2 = (w() - 1) / 7;
                i = i2 + 1;
                return i;
            case 9:
                i = this.c;
                return i;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                i = this.b;
                return i;
            case 12:
                i = this.b;
                return i;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e n(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d
    public final m r() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.s(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d
    public final b u(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return z(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: v */
    public final b e(j$.time.temporal.n nVar) {
        return (q) super.e(nVar);
    }

    public final int w() {
        return this.a.w(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final q s(long j) {
        return new q(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.d
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final q t(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        o oVar = this.a;
        long V = j$.time.a.V(j2, 12L);
        if (V >= oVar.r(0) && V <= oVar.r(oVar.d.length - 1) - 1) {
            return z((int) V, ((int) j$.time.a.U(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + V);
    }

    public final q z(int i, int i2, int i3) {
        int t = this.a.t(i, i2);
        if (i3 > t) {
            i3 = t;
        }
        return new q(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.s(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}

package j$.time.temporal;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class t implements p {
    public static final s f = s.e(1, 7);
    public static final s g = s.f(0, 4, 6);
    public static final s h = s.f(0, 52, 54);
    public static final s i = s.f(1, 52, 53);
    public final String a;
    public final u b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final s e;

    public t(String str, u uVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, s sVar) {
        this.a = str;
        this.b = uVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = sVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    public final int b(m mVar) {
        int d = mVar.d(a.DAY_OF_WEEK) - this.b.a.getValue();
        int i2 = d % 7;
        if (i2 == 0) {
            i2 = 0;
        } else if ((((d ^ 7) >> 31) | 1) <= 0) {
            i2 += 7;
        }
        return i2 + 1;
    }

    public final int c(m mVar) {
        int a;
        int b = b(mVar);
        a aVar = a.DAY_OF_YEAR;
        int d = mVar.d(aVar);
        int j = j(d, b);
        int a2 = a(j, d);
        return a2 == 0 ? c(j$.time.a.R(mVar).e(mVar).l(d, ChronoUnit.DAYS)) : (a2 <= 50 || a2 < (a = a(j, ((int) mVar.f(aVar).d) + this.b.b))) ? a2 : (a2 - a) + 1;
    }

    @Override // j$.time.temporal.p
    public final boolean d(m mVar) {
        if (!mVar.c(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return mVar.c(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return mVar.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == u.h) {
            return mVar.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return mVar.c(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final s e(m mVar) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return g(mVar, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return g(mVar, a.DAY_OF_YEAR);
        }
        if (temporalUnit == u.h) {
            return i(mVar);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    @Override // j$.time.temporal.p
    public final long f(m mVar) {
        int c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            c = b(mVar);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int b = b(mVar);
            int d = mVar.d(a.DAY_OF_MONTH);
            c = a(j(d, b), d);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int b2 = b(mVar);
            int d2 = mVar.d(a.DAY_OF_YEAR);
            c = a(j(d2, b2), d2);
        } else {
            if (temporalUnit != u.h) {
                if (temporalUnit != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
                int b3 = b(mVar);
                int d3 = mVar.d(a.YEAR);
                a aVar = a.DAY_OF_YEAR;
                int d4 = mVar.d(aVar);
                int j = j(d4, b3);
                int a = a(j, d4);
                if (a == 0) {
                    d3--;
                } else if (a >= a(j, ((int) mVar.f(aVar).d) + this.b.b)) {
                    d3++;
                }
                return d3;
            }
            c = c(mVar);
        }
        return c;
    }

    public final s g(m mVar, a aVar) {
        int j = j(mVar.d(aVar), b(mVar));
        s f2 = mVar.f(aVar);
        return s.e(a(j, (int) f2.a), a(j, (int) f2.d));
    }

    @Override // j$.time.temporal.p
    public final l h(l lVar, long j) {
        if (this.e.a(j, this) == lVar.d(this)) {
            return lVar;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return lVar.b(r0 - r1, this.c);
        }
        u uVar = this.b;
        int d = lVar.d(uVar.c);
        int d2 = lVar.d(uVar.e);
        j$.time.chrono.b d3 = j$.time.a.R(lVar).d((int) j);
        int j2 = j(1, b(d3));
        int i2 = d - 1;
        return d3.b(((Math.min(d2, a(j2, d3.lengthOfYear() + uVar.b) - 1) - 1) * 7) + i2 + (-j2), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final s i(m mVar) {
        a aVar = a.DAY_OF_YEAR;
        if (!mVar.c(aVar)) {
            return h;
        }
        int b = b(mVar);
        int d = mVar.d(aVar);
        int j = j(d, b);
        int a = a(j, d);
        if (a == 0) {
            return i(j$.time.a.R(mVar).e(mVar).l(d + 7, ChronoUnit.DAYS));
        }
        return a >= a(j, this.b.b + ((int) mVar.f(aVar).d)) ? i(j$.time.a.R(mVar).e(mVar).b((r0 - d) + 8, (TemporalUnit) ChronoUnit.DAYS)) : s.e(1L, r1 - 1);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public final int j(int i2, int i3) {
        int i4 = i2 - i3;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i5 = 0;
        } else if ((((i4 ^ 7) >> 31) | 1) <= 0) {
            i5 += 7;
        }
        return i5 + 1 > this.b.b ? 7 - i5 : -i5;
    }

    @Override // j$.time.temporal.p
    public final s range() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}

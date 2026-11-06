package j$.time.temporal;

import j$.time.LocalDate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final boolean d(m mVar) {
                if (!mVar.c(a.DAY_OF_YEAR) || !mVar.c(a.MONTH_OF_YEAR) || !mVar.c(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.time.a.R(mVar).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s e(m mVar) {
                if (!d(mVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long m = mVar.m(g.QUARTER_OF_YEAR);
                if (m == 1) {
                    return j$.time.chrono.s.c.isLeapYear(mVar.m(a.YEAR)) ? s.e(1L, 91L) : s.e(1L, 90L);
                }
                return m == 2 ? s.e(1L, 91L) : (m == 3 || m == 4) ? s.e(1L, 92L) : range();
            }

            @Override // j$.time.temporal.p
            public final long f(m mVar) {
                if (!d(mVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return mVar.d(a.DAY_OF_YEAR) - g.a[((mVar.d(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.c.isLeapYear(mVar.m(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l h(l lVar, long j) {
                long f = f(lVar);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.a((j - f) + lVar.m(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final s range() {
                return s.f(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final boolean d(m mVar) {
                if (!mVar.c(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.time.a.R(mVar).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s e(m mVar) {
                if (d(mVar)) {
                    return range();
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final long f(m mVar) {
                if (d(mVar)) {
                    return (mVar.m(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final l h(l lVar, long j) {
                long f = f(lVar);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.a(((j - f) * 3) + lVar.m(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final s range() {
                return s.e(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final boolean d(m mVar) {
                if (!mVar.c(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.time.a.R(mVar).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s e(m mVar) {
                if (d(mVar)) {
                    return s.e(1L, g.m(g.l(LocalDate.s(mVar))));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final long f(m mVar) {
                if (d(mVar)) {
                    return g.i(LocalDate.s(mVar));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final l h(l lVar, long j) {
                range().b(j, this);
                return lVar.b(j$.time.a.X(j, f(lVar)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.p
            public final s range() {
                return s.f(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final boolean d(m mVar) {
                if (!mVar.c(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.time.a.R(mVar).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.p
            public final s e(m mVar) {
                if (d(mVar)) {
                    return a.YEAR.b;
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final long f(m mVar) {
                if (d(mVar)) {
                    return g.l(LocalDate.s(mVar));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final l h(l lVar, long j) {
                if (!d(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate s = LocalDate.s(lVar);
                int d = s.d(a.DAY_OF_WEEK);
                int i = g.i(s);
                if (i == 53 && g.m(a2) == 52) {
                    i = 52;
                }
                return lVar.e(LocalDate.x(a2, 1, 4).z(((i - 1) * 7) + (d - r3.d(r6))));
            }

            @Override // j$.time.temporal.p
            public final s range() {
                return a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int i(LocalDate localDate) {
        int ordinal = localDate.u().ordinal();
        int v = localDate.v() - 1;
        int i = (3 - ordinal) + v;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (v < i3) {
            return (int) s.e(1L, m(l(localDate.F(180).B(-1L)))).d;
        }
        int i4 = ((v - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    public static int l(LocalDate localDate) {
        int i = localDate.a;
        int v = localDate.v();
        if (v <= 3) {
            return v - localDate.u().ordinal() < -2 ? i - 1 : i;
        }
        if (v >= 363) {
            return ((v - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.u().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int m(int i) {
        LocalDate x = LocalDate.x(i, 1, 1);
        if (x.u() != j$.time.e.THURSDAY) {
            return (x.u() == j$.time.e.WEDNESDAY && x.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }
}

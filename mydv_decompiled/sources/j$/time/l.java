package j$.time;

import j$.time.temporal.ChronoUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.n {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;
    public static final l[] a;
    public static final /* synthetic */ l[] b;

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        a = values();
    }

    public static l t(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        h.d("Invalid value for MonthOfYear: ", i);
        return null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) b.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.d(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? pVar.range() : j$.time.temporal.q.d(this, pVar);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        if (!a.R(lVar).equals(j$.time.chrono.s.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return lVar.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.b ? j$.time.chrono.s.c : aVar == j$.time.temporal.q.c ? ChronoUnit.MONTHS : j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        return pVar.f(this);
    }

    public final int q(boolean z) {
        switch (k.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int r(boolean z) {
        int i = k.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int s() {
        int i = k.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }
}

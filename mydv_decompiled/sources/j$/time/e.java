package j$.time;

import j$.time.temporal.ChronoUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e implements j$.time.temporal.m, j$.time.temporal.n {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;
    public static final e[] a;
    public static final /* synthetic */ e[] b;

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        a = values();
    }

    public static e q(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        h.d("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.d(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? pVar.range() : j$.time.temporal.q.d(this, pVar);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.c ? ChronoUnit.DAYS : j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        return pVar.f(this);
    }
}

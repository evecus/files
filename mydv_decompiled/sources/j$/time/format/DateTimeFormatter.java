package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter d;
    public final e a;
    public final Locale b;
    public final j$.time.chrono.a c;

    static {
        s sVar = new s();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        a0 a0Var = a0.EXCEEDS_PAD;
        sVar.m(aVar, 4, 10, a0Var);
        sVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        sVar.l(aVar2, 2);
        sVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        sVar.l(aVar3, 2);
        z zVar = z.STRICT;
        j$.time.chrono.s sVar2 = j$.time.chrono.s.c;
        DateTimeFormatter p = sVar.p(zVar, sVar2);
        s sVar3 = new s();
        n nVar = n.INSENSITIVE;
        sVar3.b(nVar);
        sVar3.a(p);
        k kVar = k.e;
        sVar3.b(kVar);
        sVar3.p(zVar, sVar2);
        s sVar4 = new s();
        sVar4.b(nVar);
        sVar4.a(p);
        sVar4.o();
        sVar4.b(kVar);
        sVar4.p(zVar, sVar2);
        s sVar5 = new s();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        sVar5.l(aVar4, 2);
        sVar5.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        sVar5.l(aVar5, 2);
        sVar5.o();
        sVar5.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        sVar5.l(aVar6, 2);
        sVar5.o();
        sVar5.b(new g(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true));
        DateTimeFormatter p2 = sVar5.p(zVar, null);
        s sVar6 = new s();
        sVar6.b(nVar);
        sVar6.a(p2);
        sVar6.b(kVar);
        sVar6.p(zVar, null);
        s sVar7 = new s();
        sVar7.b(nVar);
        sVar7.a(p2);
        sVar7.o();
        sVar7.b(kVar);
        sVar7.p(zVar, null);
        s sVar8 = new s();
        sVar8.b(nVar);
        sVar8.a(p);
        sVar8.c('T');
        sVar8.a(p2);
        DateTimeFormatter p3 = sVar8.p(zVar, sVar2);
        s sVar9 = new s();
        sVar9.b(nVar);
        sVar9.a(p3);
        n nVar2 = n.LENIENT;
        sVar9.b(nVar2);
        sVar9.b(kVar);
        n nVar3 = n.STRICT;
        sVar9.b(nVar3);
        DateTimeFormatter p4 = sVar9.p(zVar, sVar2);
        s sVar10 = new s();
        sVar10.a(p4);
        sVar10.o();
        sVar10.c('[');
        n nVar4 = n.SENSITIVE;
        sVar10.b(nVar4);
        a aVar7 = s.h;
        sVar10.b(new q(aVar7, "ZoneRegionId()"));
        sVar10.c(']');
        sVar10.p(zVar, sVar2);
        s sVar11 = new s();
        sVar11.a(p3);
        sVar11.o();
        sVar11.b(kVar);
        sVar11.o();
        sVar11.c('[');
        sVar11.b(nVar4);
        sVar11.b(new q(aVar7, "ZoneRegionId()"));
        sVar11.c(']');
        sVar11.p(zVar, sVar2);
        s sVar12 = new s();
        sVar12.b(nVar);
        sVar12.m(aVar, 4, 10, a0Var);
        sVar12.c('-');
        sVar12.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        sVar12.o();
        sVar12.b(kVar);
        sVar12.p(zVar, sVar2);
        s sVar13 = new s();
        sVar13.b(nVar);
        sVar13.m(j$.time.temporal.i.c, 4, 10, a0Var);
        sVar13.d("-W");
        sVar13.l(j$.time.temporal.i.b, 2);
        sVar13.c('-');
        j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_WEEK;
        sVar13.l(aVar8, 1);
        sVar13.o();
        sVar13.b(kVar);
        sVar13.p(zVar, sVar2);
        s sVar14 = new s();
        sVar14.b(nVar);
        sVar14.b(new h());
        d = sVar14.p(zVar, null);
        s sVar15 = new s();
        sVar15.b(nVar);
        sVar15.l(aVar, 4);
        sVar15.l(aVar2, 2);
        sVar15.l(aVar3, 2);
        sVar15.o();
        sVar15.b(nVar2);
        sVar15.f("+HHMMss", "Z");
        sVar15.b(nVar3);
        sVar15.p(zVar, sVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        s sVar16 = new s();
        sVar16.b(nVar);
        sVar16.b(nVar2);
        sVar16.o();
        sVar16.h(aVar8, hashMap);
        sVar16.d(", ");
        sVar16.n();
        sVar16.m(aVar3, 1, 2, a0.NOT_NEGATIVE);
        sVar16.c(' ');
        sVar16.h(aVar2, hashMap2);
        sVar16.c(' ');
        sVar16.l(aVar, 4);
        sVar16.c(' ');
        sVar16.l(aVar4, 2);
        sVar16.c(':');
        sVar16.l(aVar5, 2);
        sVar16.o();
        sVar16.c(':');
        sVar16.l(aVar6, 2);
        sVar16.n();
        sVar16.c(' ');
        sVar16.f("+HHMM", "GMT");
        sVar16.p(z.SMART, sVar2);
    }

    public DateTimeFormatter(e eVar, Locale locale, z zVar, j$.time.chrono.a aVar) {
        int i = y.a;
        this.a = eVar;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(zVar, "resolverStyle");
        this.c = aVar;
    }

    public static DateTimeFormatter ofPattern(String str) {
        s sVar = new s();
        sVar.g(str);
        return sVar.q(Locale.getDefault(), z.SMART, null);
    }

    public final String a(j$.time.temporal.m mVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.d(new u(mVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    public final String toString() {
        String eVar = this.a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        s sVar = new s();
        sVar.g(str);
        return sVar.q(locale, z.SMART, null);
    }
}

package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s {
    public static final a h = new a(0);
    public static final Map i;
    public s a;
    public final s b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public s() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        e eVar = dateTimeFormatter.a;
        if (eVar.b) {
            eVar = new e(eVar.a, false);
        }
        b(eVar);
    }

    public final int b(f fVar) {
        Objects.a(fVar, "pp");
        s sVar = this.a;
        int i2 = sVar.e;
        if (i2 > 0) {
            l lVar = new l(fVar, i2, sVar.f);
            sVar.e = 0;
            sVar.f = (char) 0;
            fVar = lVar;
        }
        ((ArrayList) sVar.c).add(fVar);
        this.a.g = -1;
        return ((ArrayList) r4.c).size() - 1;
    }

    public final void c(char c) {
        b(new d(c));
    }

    public final void d(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new i((byte) 1, str));
        }
    }

    public final void e(b0 b0Var) {
        Objects.a(b0Var, "style");
        if (b0Var == b0.FULL || b0Var == b0.SHORT) {
            b(new i((byte) 0, b0Var));
        } else {
            j$.time.h.c("Style must be either full or short");
        }
    }

    public final void f(String str, String str2) {
        b(new k(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0383 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.s.g(java.lang.String):void");
    }

    public final void h(j$.time.temporal.a aVar, Map map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        b0 b0Var = b0.FULL;
        b(new o(aVar, b0Var, new b(new w(Collections.singletonMap(b0Var, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.p pVar, b0 b0Var) {
        Objects.a(b0Var, "textStyle");
        b(new o(pVar, b0Var, x.c));
    }

    public final void j(j jVar) {
        j b;
        s sVar = this.a;
        int i2 = sVar.g;
        if (i2 < 0) {
            sVar.g = b(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) sVar.c).get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == a0.NOT_NEGATIVE) {
            b = jVar2.c(i4);
            b(jVar.b());
            this.a.g = i2;
        } else {
            b = jVar2.b();
            this.a.g = b(jVar);
        }
        ((ArrayList) this.a.c).set(i2, b);
    }

    public final void k(j$.time.temporal.p pVar) {
        j(new j(pVar, 1, 19, a0.NORMAL));
    }

    public final void l(j$.time.temporal.p pVar, int i2) {
        Objects.a(pVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.i("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            j(new j(pVar, i2, i2, a0.NOT_NEGATIVE));
        }
    }

    public final void m(j$.time.temporal.p pVar, int i2, int i3, a0 a0Var) {
        if (i2 == i3 && a0Var == a0.NOT_NEGATIVE) {
            l(pVar, i3);
            return;
        }
        Objects.a(pVar, "field");
        Objects.a(a0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.i("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.h.i("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            j(new j(pVar, i2, i3, a0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        s sVar = this.a;
        if (sVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) sVar.c).size();
        s sVar2 = this.a;
        if (size <= 0) {
            this.a = sVar2.b;
            return;
        }
        e eVar = new e(sVar2.c, sVar2.d);
        this.a = this.a.b;
        b(eVar);
    }

    public final void o() {
        s sVar = this.a;
        sVar.g = -1;
        this.a = new s(sVar);
    }

    public final DateTimeFormatter p(z zVar, j$.time.chrono.a aVar) {
        return q(Locale.getDefault(), zVar, aVar);
    }

    public final DateTimeFormatter q(Locale locale, z zVar, j$.time.chrono.a aVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        e eVar = new e(this.c, false);
        int i2 = y.a;
        return new DateTimeFormatter(eVar, locale, zVar, aVar);
    }

    public s(s sVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = sVar;
        this.d = true;
    }
}

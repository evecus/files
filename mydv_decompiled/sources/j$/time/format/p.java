package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p extends j {
    public final char g;
    public final int h;

    public p(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, a0.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new p(this.g, this.h, this.b, this.c, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        j$.time.temporal.t tVar;
        f fVar;
        Locale locale = uVar.b.b;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.u.g;
        Objects.a(locale, "locale");
        j$.time.temporal.u a = j$.time.temporal.u.a(j$.time.e.a[((((int) ((r0.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.e.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            tVar = a.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.t tVar2 = a.f;
                int i = this.h;
                if (i == 2) {
                    fVar = new m(tVar2, 2, 2, m.h, this.e);
                } else {
                    fVar = new j(tVar2, i, 19, i < 4 ? a0.NORMAL : a0.EXCEEDS_PAD, this.e);
                }
                return fVar.d(uVar, sb);
            }
            if (c == 'c' || c == 'e') {
                tVar = a.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                tVar = a.e;
            }
        }
        fVar = new j(tVar, this.b, this.c, a0.NOT_NEGATIVE, this.e);
        return fVar.d(uVar, sb);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? a0.NORMAL : a0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}

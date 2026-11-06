package j$.time.chrono;

import androidx.media3.extractor.text.ttml.TtmlNode;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class a implements Comparable {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static a i(String str) {
        Objects.a(str, TtmlNode.ATTR_ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            a aVar = (a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (a) b.get(str);
            }
            if (aVar != null) {
                return aVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(a.class).iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if (str.equals(aVar2.getId()) || str.equals(aVar2.getCalendarType())) {
                        return aVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            o oVar = o.l;
            oVar.getClass();
            l(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            l(vVar, "Japanese");
            a0 a0Var = a0.c;
            a0Var.getClass();
            l(a0Var, "Minguo");
            g0 g0Var = g0.c;
            g0Var.getClass();
            l(g0Var, "ThaiBuddhist");
            try {
                for (a aVar3 : Arrays.asList(new a[0])) {
                    if (!aVar3.getId().equals("ISO")) {
                        l(aVar3, aVar3.getId());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                l(sVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static a l(a aVar, String str) {
        String calendarType;
        a aVar2 = (a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (calendarType = aVar.getCalendarType()) != null) {
            b.putIfAbsent(calendarType, aVar);
        }
        return aVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((a) obj).getId());
    }

    public b d(int i) {
        return LocalDate.x(i, 1, 1);
    }

    public b e(j$.time.temporal.m mVar) {
        return LocalDate.s(mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    public m f(int i) {
        if (i == 1) {
            return r.AH;
        }
        throw new j$.time.c("invalid Hijrah era");
    }

    public String getCalendarType() {
        return "islamic-umalqura";
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    public e h(LocalDateTime localDateTime) {
        try {
            return e(localDateTime).n(LocalTime.s(localDateTime));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    public boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    public final String toString() {
        return getId();
    }
}

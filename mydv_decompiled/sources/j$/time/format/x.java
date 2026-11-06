package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class x {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 2);
    public static final v b = new v();
    public static final x c = new x();

    public String a(j$.time.chrono.a aVar, j$.time.temporal.p pVar, long j, b0 b0Var, Locale locale) {
        if (aVar == j$.time.chrono.s.c || !(pVar instanceof j$.time.temporal.a)) {
            return b(pVar, j, b0Var, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.p pVar, long j, b0 b0Var, Locale locale) {
        Object obj;
        long j2;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            if (pVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i = 0; i < eras.length; i++) {
                    if (!eras[i].isEmpty()) {
                        long j3 = i;
                        hashMap2.put(Long.valueOf(j3), eras[i]);
                        Long valueOf = Long.valueOf(j3);
                        String str = eras[i];
                        hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(b0.FULL, hashMap2);
                    hashMap.put(b0.SHORT, hashMap2);
                    hashMap.put(b0.NARROW, hashMap3);
                }
                obj = new w(hashMap);
            } else {
                long j4 = 1;
                if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                    int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (long j5 = 1; j5 <= length; j5++) {
                        String G = j$.time.a.G(j5, "LLLL", locale);
                        linkedHashMap.put(Long.valueOf(j5), G);
                        linkedHashMap2.put(Long.valueOf(j5), G.substring(0, Character.charCount(G.codePointAt(0))));
                        linkedHashMap3.put(Long.valueOf(j5), j$.time.a.G(j5, "LLL", locale));
                    }
                    if (length > 0) {
                        hashMap.put(b0.FULL_STANDALONE, linkedHashMap);
                        hashMap.put(b0.NARROW_STANDALONE, linkedHashMap2);
                        hashMap.put(b0.SHORT_STANDALONE, linkedHashMap3);
                        hashMap.put(b0.FULL, linkedHashMap);
                        hashMap.put(b0.NARROW, linkedHashMap2);
                        hashMap.put(b0.SHORT, linkedHashMap3);
                    }
                    obj = new w(hashMap);
                } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
                    int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                    long j6 = 1;
                    while (j6 <= length2) {
                        String F = j$.time.a.F(j6, "cccc", locale);
                        linkedHashMap4.put(Long.valueOf(j6), F);
                        Long valueOf2 = Long.valueOf(j6);
                        if (z) {
                            j2 = j4;
                            substring = new StringBuilder().appendCodePoint(F.codePointBefore(F.length())).toString();
                        } else {
                            j2 = j4;
                            substring = F.substring(0, Character.charCount(F.codePointAt(0)));
                        }
                        linkedHashMap5.put(valueOf2, substring);
                        linkedHashMap6.put(Long.valueOf(j6), j$.time.a.F(j6, "ccc", locale));
                        j6 += j2;
                        j4 = j2;
                    }
                    if (length2 > 0) {
                        hashMap.put(b0.FULL_STANDALONE, linkedHashMap4);
                        hashMap.put(b0.NARROW_STANDALONE, linkedHashMap5);
                        hashMap.put(b0.SHORT_STANDALONE, linkedHashMap6);
                        hashMap.put(b0.FULL, linkedHashMap4);
                        hashMap.put(b0.NARROW, linkedHashMap5);
                        hashMap.put(b0.SHORT, linkedHashMap6);
                    }
                    obj = new w(hashMap);
                } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap4 = new HashMap();
                    HashMap hashMap5 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                    for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                        if (!amPmStrings[i2].isEmpty()) {
                            long j7 = i2;
                            hashMap4.put(Long.valueOf(j7), amPmStrings[i2]);
                            Long valueOf3 = Long.valueOf(j7);
                            String str2 = amPmStrings[i2];
                            hashMap5.put(valueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                        }
                    }
                    if (!hashMap4.isEmpty()) {
                        hashMap.put(b0.FULL, hashMap4);
                        hashMap.put(b0.SHORT, hashMap4);
                        hashMap.put(b0.NARROW, hashMap5);
                    }
                    obj = new w(hashMap);
                } else {
                    obj = "";
                }
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            obj2 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj2 instanceof w) {
            return ((w) obj2).a(j, b0Var);
        }
        return null;
    }
}

package okhttp3;

import defpackage.er0;
import defpackage.jx4;
import defpackage.s83;
import defpackage.su0;
import defpackage.uj3;
import defpackage.w72;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import j$.util.DesugarDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.DateFormattingKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Headers implements Iterable<uj3>, w72 {
    public static final Companion Companion = new Companion(null);
    public static final Headers EMPTY = new Headers(new String[0]);
    private final String[] namesAndValues;

    public Headers(String[] strArr) {
        strArr.getClass();
        this.namesAndValues = strArr;
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    @su0
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m259deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return _HeadersCommonKt.commonEquals(this, obj);
    }

    public final String get(String str) {
        str.getClass();
        return _HeadersCommonKt.commonHeadersGet(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        str.getClass();
        String str2 = get(str);
        if (str2 != null) {
            return DateFormattingKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    public final Instant getInstant(String str) {
        str.getClass();
        Date date = getDate(str);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public final String[] getNamesAndValues$okhttp() {
        return this.namesAndValues;
    }

    public int hashCode() {
        return _HeadersCommonKt.commonHashCode(this);
    }

    @Override // java.lang.Iterable
    public Iterator<uj3> iterator() {
        return _HeadersCommonKt.commonIterator(this);
    }

    public final String name(int i) {
        return _HeadersCommonKt.commonName(this, i);
    }

    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        return _HeadersCommonKt.commonNewBuilder(this);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = name.toLowerCase(locale);
            lowerCase.getClass();
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        return _HeadersCommonKt.commonToString(this);
    }

    public final String value(int i) {
        return _HeadersCommonKt.commonValue(this, i);
    }

    public final List<String> values(String str) {
        str.getClass();
        return _HeadersCommonKt.commonValues(this, str);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        @su0
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m261deprecated_of(String... strArr) {
            strArr.getClass();
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            strArr.getClass();
            return _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        private Companion() {
        }

        @su0
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m260deprecated_of(Map<String, String> map) {
            map.getClass();
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            map.getClass();
            return _HeadersCommonKt.commonToHeaders(map);
        }
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            str.getClass();
            int I = jx4.I(str, ':', 0, 6);
            if (I != -1) {
                add(jx4.g0(str.substring(0, I)).toString(), str.substring(I + 1));
                return this;
            }
            s83.h("Unexpected header: ".concat(str));
            return null;
        }

        public final Builder addAll(Headers headers) {
            headers.getClass();
            return _HeadersCommonKt.commonAddAll(this, headers);
        }

        public final Builder addLenient$okhttp(String str) {
            str.getClass();
            int I = jx4.I(str, ':', 1, 4);
            if (I != -1) {
                addLenient$okhttp(str.substring(0, I), str.substring(I + 1));
                return this;
            }
            if (str.charAt(0) == ':') {
                addLenient$okhttp("", str.substring(1));
                return this;
            }
            addLenient$okhttp("", str);
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            str.getClass();
            str2.getClass();
            _HeadersCommonKt.headersCheckName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            return _HeadersCommonKt.commonBuild(this);
        }

        public final String get(String str) {
            str.getClass();
            return _HeadersCommonKt.commonGet(this, str);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            str.getClass();
            return _HeadersCommonKt.commonRemoveAll(this, str);
        }

        public final Builder set(String str, Instant instant) {
            str.getClass();
            instant.getClass();
            Date from = DesugarDate.from(instant);
            from.getClass();
            return set(str, from);
        }

        public final Builder set(String str, Date date) {
            str.getClass();
            date.getClass();
            return set(str, DateFormattingKt.toHttpDateString(date));
        }

        public final Builder set(String str, String str2) {
            str.getClass();
            str2.getClass();
            return _HeadersCommonKt.commonSet(this, str, str2);
        }

        public final Builder add(String str, String str2) {
            str.getClass();
            str2.getClass();
            return _HeadersCommonKt.commonAdd(this, str, str2);
        }

        public final Builder add(String str, Date date) {
            str.getClass();
            date.getClass();
            return add(str, DateFormattingKt.toHttpDateString(date));
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            str.getClass();
            str2.getClass();
            return _HeadersCommonKt.commonAddLenient(this, str, str2);
        }

        public final Builder add(String str, Instant instant) {
            str.getClass();
            instant.getClass();
            Date from = DesugarDate.from(instant);
            from.getClass();
            return add(str, from);
        }
    }
}

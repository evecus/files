package okhttp3.internal;

import defpackage.dq;
import defpackage.jx4;
import defpackage.o7;
import defpackage.o91;
import defpackage.s83;
import defpackage.sp0;
import defpackage.uj3;
import defpackage.v2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _HeadersCommonKt {
    public static final long HEADER_LIMIT = 262144;

    private static final String charCode(char c) {
        o7.k(16);
        String num = Integer.toString(c, 16);
        num.getClass();
        return num.length() < 2 ? "0".concat(num) : num;
    }

    public static final Headers.Builder commonAdd(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers.Builder commonAddAll(Headers.Builder builder, Headers headers) {
        builder.getClass();
        headers.getClass();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            commonAddLenient(builder, headers.name(i), headers.value(i));
        }
        return builder;
    }

    public static final Headers.Builder commonAddLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        builder.getNamesAndValues$okhttp().add(str);
        builder.getNamesAndValues$okhttp().add(jx4.g0(str2).toString());
        return builder;
    }

    public static final Headers commonBuild(Headers.Builder builder) {
        builder.getClass();
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(Headers headers, Object obj) {
        headers.getClass();
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues$okhttp(), ((Headers) obj).getNamesAndValues$okhttp());
    }

    public static final String commonGet(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int U = sp0.U(size, 0, -2);
        if (U > size) {
            return null;
        }
        while (!str.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(size))) {
            if (size == U) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final int commonHashCode(Headers headers) {
        headers.getClass();
        return Arrays.hashCode(headers.getNamesAndValues$okhttp());
    }

    public static final String commonHeadersGet(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        int length = strArr.length - 2;
        int U = sp0.U(length, 0, -2);
        if (U > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == U) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final Headers commonHeadersOf(String... strArr) {
        strArr.getClass();
        if (strArr.length % 2 != 0) {
            s83.t("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                s83.t("Headers cannot be null");
                return null;
            }
            strArr2[i2] = jx4.g0(strArr[i2]).toString();
        }
        int U = sp0.U(0, strArr2.length - 1, 2);
        if (U >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i == U) {
                    break;
                }
                i += 2;
            }
        }
        return new Headers(strArr2);
    }

    public static final Iterator<uj3> commonIterator(Headers headers) {
        headers.getClass();
        int size = headers.size();
        uj3[] uj3VarArr = new uj3[size];
        for (int i = 0; i < size; i++) {
            uj3VarArr[i] = new uj3(headers.name(i), headers.value(i));
        }
        return new v2(uj3VarArr, (byte) 1);
    }

    public static final String commonName(Headers headers, int i) {
        headers.getClass();
        String str = (String) dq.e1(i * 2, headers.getNamesAndValues$okhttp());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final Headers.Builder commonNewBuilder(Headers headers) {
        headers.getClass();
        Headers.Builder builder = new Headers.Builder();
        List<String> namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] namesAndValues$okhttp2 = headers.getNamesAndValues$okhttp();
        namesAndValues$okhttp.getClass();
        namesAndValues$okhttp2.getClass();
        List asList = Arrays.asList(namesAndValues$okhttp2);
        asList.getClass();
        namesAndValues$okhttp.addAll(asList);
        return builder;
    }

    public static final Headers.Builder commonRemoveAll(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int i = 0;
        while (i < builder.getNamesAndValues$okhttp().size()) {
            if (str.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(i))) {
                builder.getNamesAndValues$okhttp().remove(i);
                builder.getNamesAndValues$okhttp().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return builder;
    }

    public static final Headers.Builder commonSet(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        builder.removeAll(str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers commonToHeaders(Map<String, String> map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String obj = jx4.g0(key).toString();
            String obj2 = jx4.g0(value).toString();
            headersCheckName(obj);
            headersCheckValue(obj2, obj);
            strArr[i] = obj;
            strArr[i + 1] = obj2;
            i += 2;
        }
        return new Headers(strArr);
    }

    public static final String commonToString(Headers headers) {
        headers.getClass();
        StringBuilder sb = new StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            sb.append(name);
            sb.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final String commonValue(Headers headers, int i) {
        headers.getClass();
        String str = (String) dq.e1((i * 2) + 1, headers.getNamesAndValues$okhttp());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static final List<String> commonValues(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        int size = headers.size();
        List<String> list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i));
            }
        }
        if (arrayList != null) {
            list = DesugarCollections.unmodifiableList(arrayList);
            list.getClass();
        }
        return list == null ? o91.I : list;
    }

    public static final void headersCheckName(String str) {
        str.getClass();
        if (str.length() <= 0) {
            s83.t("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + charCode(charAt) + " at " + i + " in header name: " + str).toString());
            }
        }
    }

    public static final void headersCheckValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                sb.append(charCode(charAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(_UtilCommonKt.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}

package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import defpackage.c34;
import defpackage.hf1;
import defpackage.jp0;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static String buildRangeRequestHeader(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder A = hf1.A(j, "bytes=", "-");
        if (j2 != -1) {
            A.append((j + j2) - 1);
        }
        return A.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long getContentLength(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "]"
            java.lang.String r3 = "HttpUtil"
            if (r1 != 0) goto L25
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L27
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.util.Log.e(r3, r1)
        L25:
            r4 = -1
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L94
            java.util.regex.Pattern r1 = androidx.media3.datasource.HttpUtil.CONTENT_RANGE_WITH_START_AND_END
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L94
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L80
            r6.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L80
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L80
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L80
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L5d
            r4 = r6
            goto L94
        L5d:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L80
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = "] ["
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = r1.toString()     // Catch: java.lang.NumberFormatException -> L80
            androidx.media3.common.util.Log.w(r3, r10)     // Catch: java.lang.NumberFormatException -> L80
            long r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L80
            goto L94
        L80:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            androidx.media3.common.util.Log.e(r3, r10)
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.HttpUtil.getContentLength(java.lang.String, java.lang.String):long");
    }

    public static String getCookieHeader(String str, Map<String, List<String>> map, CookieHandler cookieHandler) {
        Map<String, List<String>> map2;
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        try {
            map2 = cookieHandler.get(new URI(str), map);
        } catch (Exception e) {
            Log.w(TAG, "Failed to read cookies from CookieHandler", e);
            map2 = c34.O;
        }
        StringBuilder sb = new StringBuilder();
        if (map2.containsKey("Cookie") && (list = map2.get("Cookie")) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        return jp0.u(sb.toString());
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static void storeCookiesFromHeaders(String str, Map<String, List<String>> map, CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e) {
            Log.w(TAG, "Failed to store cookies in CookieHandler", e);
        }
    }
}

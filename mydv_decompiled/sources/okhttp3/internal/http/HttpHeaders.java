package okhttp3.internal.http;

import defpackage.cz;
import defpackage.h00;
import defpackage.j42;
import defpackage.jp;
import defpackage.s83;
import defpackage.su0;
import defpackage.z50;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HttpHeaders {
    private static final h00 QUOTED_STRING_DELIMITERS;
    private static final h00 TOKEN_DELIMITERS;

    static {
        h00 h00Var = h00.L;
        QUOTED_STRING_DELIMITERS = jp.h("\"\\");
        TOKEN_DELIMITERS = jp.h("\t ,=");
    }

    @su0
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                cz czVar = new cz();
                czVar.k0(headers.value(i));
                try {
                    readChallengeHeader(czVar, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        response.getClass();
        if (j42.c(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(defpackage.cz r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb3
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.p()
            if (r7 != 0) goto L21
            goto Lb3
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            p91 r0 = defpackage.p91.I
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L62
            if (r6 != 0) goto L40
            boolean r2 = r7.p()
            if (r2 == 0) goto L62
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = defpackage.qx4.w(r5, r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L62:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            int r6 = r6 + r5
        L6c:
            if (r3 != 0) goto L7d
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb6
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            r6 = r5
        L7d:
            if (r6 == 0) goto Lb6
            r5 = 1
            if (r6 <= r5) goto L83
            goto Lb3
        L83:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8a
            goto Lb3
        L8a:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L97
            java.lang.String r5 = readQuotedString(r7)
            goto L9b
        L97:
            java.lang.String r5 = readToken(r7)
        L9b:
            if (r5 != 0) goto L9e
            goto Lb3
        L9e:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La7
            goto Lb3
        La7:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb4
            boolean r3 = r7.p()
            if (r3 != 0) goto Lb4
        Lb3:
            return
        Lb4:
            r3 = r0
            goto L6c
        Lb6:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(cz, java.util.List):void");
    }

    private static final String readQuotedString(cz czVar) {
        if (czVar.readByte() != 34) {
            s83.t("Failed requirement.");
            return null;
        }
        cz czVar2 = new cz();
        while (true) {
            long E = czVar.E(QUOTED_STRING_DELIMITERS);
            if (E == -1) {
                return null;
            }
            if (czVar.y(E) == 34) {
                czVar2.write(czVar, E);
                czVar.readByte();
                return czVar2.Q();
            }
            if (czVar.J == E + 1) {
                return null;
            }
            czVar2.write(czVar, E);
            czVar.readByte();
            czVar2.write(czVar, 1L);
        }
    }

    private static final String readToken(cz czVar) {
        long E = czVar.E(TOKEN_DELIMITERS);
        if (E == -1) {
            E = czVar.J;
        }
        if (E != 0) {
            return czVar.O(E, z50.a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(cz czVar) {
        boolean z = false;
        while (!czVar.p()) {
            byte y = czVar.y(0L);
            if (y != 44) {
                if (y != 32 && y != 9) {
                    break;
                }
                czVar.readByte();
            } else {
                czVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(cz czVar, byte b) {
        return !czVar.p() && czVar.y(0L) == b;
    }
}

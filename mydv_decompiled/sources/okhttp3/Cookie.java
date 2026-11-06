package okhttp3;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.o91;
import defpackage.qx4;
import defpackage.s83;
import defpackage.su0;
import defpackage.zy;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final String sameSite;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @su0
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m240deprecated_domain() {
        return this.domain;
    }

    @su0
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m241deprecated_expiresAt() {
        return this.expiresAt;
    }

    @su0
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m242deprecated_hostOnly() {
        return this.hostOnly;
    }

    @su0
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m243deprecated_httpOnly() {
        return this.httpOnly;
    }

    @su0
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m244deprecated_name() {
        return this.name;
    }

    @su0
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m245deprecated_path() {
        return this.path;
    }

    @su0
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m246deprecated_persistent() {
        return this.persistent;
    }

    @su0
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m247deprecated_secure() {
        return this.secure;
    }

    @su0
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m248deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return j42.c(cookie.name, this.name) && j42.c(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && j42.c(cookie.domain, this.domain) && j42.c(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && j42.c(cookie.sameSite, this.sameSite);
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        int n = hf1.n(hf1.n(527, 31, this.name), 31, this.value);
        long j = this.expiresAt;
        int n2 = (((((((hf1.n(hf1.n((n + ((int) (j ^ (j >>> 32)))) * 31, 31, this.domain), 31, this.path) + (this.secure ? 1231 : 1237)) * 31) + (this.httpOnly ? 1231 : 1237)) * 31) + (this.persistent ? 1231 : 1237)) * 31) + (this.hostOnly ? 1231 : 1237)) * 31;
        String str = this.sameSite;
        return n2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        httpUrl.getClass();
        if ((this.hostOnly ? j42.c(httpUrl.host(), this.domain) : Companion.domainMatch(httpUrl.host(), this.domain)) && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final String sameSite() {
        return this.sameSite;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DateFormattingKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        if (this.sameSite != null) {
            sb.append("; samesite=");
            sb.append(this.sameSite);
        }
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            return j42.c(str, str2) || (qx4.s(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(str));
        }

        private final String parseDomain(String str) {
            if (qx4.s(str, ".", false)) {
                s83.t("Failed requirement.");
                return null;
            }
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(jx4.S(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            s83.d();
            return null;
        }

        private final long parseExpires(String str, int i, int i2) {
            int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (dateCharacterOffset < i2) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i4 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    group4.getClass();
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    group5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = group5.toLowerCase(locale);
                    lowerCase.getClass();
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    pattern.getClass();
                    i6 = jx4.J(pattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 < 1601) {
                s83.t("Failed requirement.");
                return 0L;
            }
            if (i6 == -1) {
                s83.t("Failed requirement.");
                return 0L;
            }
            if (1 > i5 || i5 >= 32) {
                s83.t("Failed requirement.");
                return 0L;
            }
            if (i4 < 0 || i4 >= 24) {
                s83.t("Failed requirement.");
                return 0L;
            }
            if (i7 < 0 || i7 >= 60) {
                s83.t("Failed requirement.");
                return 0L;
            }
            if (i8 < 0 || i8 >= 60) {
                s83.t("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                Pattern compile = Pattern.compile("-?\\d+");
                compile.getClass();
                str.getClass();
                if (compile.matcher(str).matches()) {
                    return qx4.y(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (j42.c(encodedPath, str)) {
                return true;
            }
            return qx4.y(encodedPath, str, false) && (qx4.s(str, "/", false) || encodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            httpUrl.getClass();
            str.getClass();
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        public final Cookie parse$okhttp(long j, HttpUrl httpUrl, String str) {
            long j2;
            String str2;
            httpUrl.getClass();
            str.getClass();
            int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(str, '=', 0, delimiterOffset$default, 2, (Object) null);
            String str3 = null;
            if (delimiterOffset$default2 != delimiterOffset$default) {
                String trimSubstring$default = _UtilCommonKt.trimSubstring$default(str, 0, delimiterOffset$default2, 1, null);
                if (trimSubstring$default.length() != 0 && _UtilCommonKt.indexOfControlOrNonAscii(trimSubstring$default) == -1) {
                    String trimSubstring = _UtilCommonKt.trimSubstring(str, delimiterOffset$default2 + 1, delimiterOffset$default);
                    if (_UtilCommonKt.indexOfControlOrNonAscii(trimSubstring) == -1) {
                        int i = delimiterOffset$default + 1;
                        int length = str.length();
                        String str4 = null;
                        String str5 = null;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = true;
                        long j3 = -1;
                        long j4 = DateFormattingKt.MAX_DATE;
                        while (i < length) {
                            int delimiterOffset = _UtilCommonKt.delimiterOffset(str, ';', i, length);
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '=', i, delimiterOffset);
                            String trimSubstring2 = _UtilCommonKt.trimSubstring(str, i, delimiterOffset2);
                            String trimSubstring3 = delimiterOffset2 < delimiterOffset ? _UtilCommonKt.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset) : "";
                            if (qx4.t(trimSubstring2, "expires", true)) {
                                try {
                                    j4 = parseExpires(trimSubstring3, 0, trimSubstring3.length());
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (qx4.t(trimSubstring2, "max-age", true)) {
                                j3 = parseMaxAge(trimSubstring3);
                            } else {
                                if (qx4.t(trimSubstring2, "domain", true)) {
                                    str4 = parseDomain(trimSubstring3);
                                    z4 = false;
                                } else if (qx4.t(trimSubstring2, "path", true)) {
                                    str3 = trimSubstring3;
                                } else if (qx4.t(trimSubstring2, "secure", true)) {
                                    z3 = true;
                                } else if (qx4.t(trimSubstring2, "httponly", true)) {
                                    z = true;
                                } else if (qx4.t(trimSubstring2, "samesite", true)) {
                                    str5 = trimSubstring3;
                                }
                                i = delimiterOffset + 1;
                            }
                            z2 = true;
                            i = delimiterOffset + 1;
                        }
                        if (j3 == Long.MIN_VALUE) {
                            j2 = Long.MIN_VALUE;
                        } else if (j3 != -1) {
                            long j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                            j2 = (j5 < j || j5 > DateFormattingKt.MAX_DATE) ? 253402300799999L : j5;
                        } else {
                            j2 = j4;
                        }
                        String host = httpUrl.host();
                        if (str4 == null) {
                            str2 = host;
                        } else {
                            if (!domainMatch(host, str4)) {
                                return null;
                            }
                            str2 = str4;
                        }
                        if (host.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                            return null;
                        }
                        if (str3 == null || !qx4.y(str3, "/", false)) {
                            String encodedPath = httpUrl.encodedPath();
                            int M = jx4.M(encodedPath, '/', 0, 6);
                            str3 = M != 0 ? encodedPath.substring(0, M) : "/";
                        }
                        return new Cookie(trimSubstring$default, trimSubstring, j2, str2, str3, z3, z, z2, z4, str5, null);
                    }
                }
            }
            return null;
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            httpUrl.getClass();
            headers.getClass();
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            List<Cookie> list = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                list = DesugarCollections.unmodifiableList(arrayList);
                list.getClass();
            }
            return list == null ? o91.I : list;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path;
        private boolean persistent;
        private String sameSite;
        private boolean secure;
        private String value;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Cookie cookie) {
            this();
            cookie.getClass();
            this.name = cookie.name();
            this.value = cookie.value();
            this.expiresAt = cookie.expiresAt();
            this.domain = cookie.domain();
            this.path = cookie.path();
            this.secure = cookie.secure();
            this.httpOnly = cookie.httpOnly();
            this.persistent = cookie.persistent();
            this.hostOnly = cookie.hostOnly();
            this.sameSite = cookie.sameSite();
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                s83.t(hf1.w("unexpected domain: ", str));
                return null;
            }
            this.domain = canonicalHost;
            this.hostOnly = z;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                zy.m("builder.name == null");
                return null;
            }
            String str2 = this.value;
            if (str2 == null) {
                zy.m("builder.value == null");
                return null;
            }
            long j = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, this.sameSite, null);
            }
            zy.m("builder.domain == null");
            return null;
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DateFormattingKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            str.getClass();
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            str.getClass();
            if (j42.c(jx4.g0(str).toString(), str)) {
                this.name = str;
                return this;
            }
            s83.t("name is not trimmed");
            return null;
        }

        public final Builder path(String str) {
            str.getClass();
            if (qx4.y(str, "/", false)) {
                this.path = str;
                return this;
            }
            s83.t("path must start with '/'");
            return null;
        }

        public final Builder sameSite(String str) {
            str.getClass();
            if (j42.c(jx4.g0(str).toString(), str)) {
                this.sameSite = str;
                return this;
            }
            s83.t("sameSite is not trimmed");
            return null;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            str.getClass();
            if (j42.c(jx4.g0(str).toString(), str)) {
                this.value = str;
                return this;
            }
            s83.t("value is not trimmed");
            return null;
        }

        public final Builder domain(String str) {
            str.getClass();
            return domain(str, false);
        }

        public Builder() {
            this.expiresAt = DateFormattingKt.MAX_DATE;
            this.path = "/";
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, er0 er0Var) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }
}

package okhttp3;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.o91;
import defpackage.p70;
import defpackage.qx4;
import defpackage.s22;
import defpackage.s83;
import defpackage.sp0;
import defpackage.su0;
import defpackage.t91;
import defpackage.ut0;
import defpackage.zl1;
import defpackage.zy;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HttpUrl {
    public static final Companion Companion = new Companion(null);
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    private HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @su0
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m262deprecated_encodedFragment() {
        return encodedFragment();
    }

    @su0
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m263deprecated_encodedPassword() {
        return encodedPassword();
    }

    @su0
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m264deprecated_encodedPath() {
        return encodedPath();
    }

    @su0
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m265deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @su0
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m266deprecated_encodedQuery() {
        return encodedQuery();
    }

    @su0
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m267deprecated_encodedUsername() {
        return encodedUsername();
    }

    @su0
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m268deprecated_fragment() {
        return this.fragment;
    }

    @su0
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m269deprecated_host() {
        return this.host;
    }

    @su0
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m270deprecated_password() {
        return this.password;
    }

    @su0
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m271deprecated_pathSegments() {
        return this.pathSegments;
    }

    @su0
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m272deprecated_pathSize() {
        return pathSize();
    }

    @su0
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m273deprecated_port() {
        return this.port;
    }

    @su0
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m274deprecated_query() {
        return query();
    }

    @su0
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m275deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @su0
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m276deprecated_querySize() {
        return querySize();
    }

    @su0
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m277deprecated_scheme() {
        return this.scheme;
    }

    @su0
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m278deprecated_uri() {
        return uri();
    }

    @su0
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m279deprecated_url() {
        return url();
    }

    @su0
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m280deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(jx4.I(this.url, '#', 0, 6) + 1);
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(jx4.I(this.url, ':', this.scheme.length() + 3, 4) + 1, jx4.I(this.url, '@', 0, 6));
    }

    public final String encodedPath() {
        int I = jx4.I(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        return this.url.substring(I, _UtilCommonKt.delimiterOffset(str, "?#", I, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int I = jx4.I(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", I, str.length());
        ArrayList arrayList = new ArrayList();
        while (I < delimiterOffset) {
            int i = I + 1;
            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i, delimiterOffset);
            arrayList.add(this.url.substring(i, delimiterOffset2));
            I = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int I = jx4.I(this.url, '?', 0, 6) + 1;
        String str = this.url;
        return this.url.substring(I, _UtilCommonKt.delimiterOffset(str, '#', I, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && j42.c(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return j42.c(this.scheme, "https");
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        str.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        s22 Z = ut0.Z(ut0.c0(0, list.size()), 2);
        int i = Z.I;
        int i2 = Z.J;
        int i3 = Z.K;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(this.queryNamesAndValues.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return this.queryNamesAndValues.get(i + 1);
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        str.getClass();
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return t91.I;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        s22 Z = ut0.Z(ut0.c0(0, this.queryNamesAndValues.size()), 2);
        int i = Z.I;
        int i2 = Z.J;
        int i3 = Z.K;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                str.getClass();
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        str.getClass();
        if (this.queryNamesAndValues == null) {
            return o91.I;
        }
        ArrayList arrayList = new ArrayList(4);
        s22 Z = ut0.Z(ut0.c0(0, this.queryNamesAndValues.size()), 2);
        int i = Z.I;
        int i2 = Z.J;
        int i3 = Z.K;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (str.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        newBuilder.getClass();
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        str.getClass();
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile.getClass();
                builder.getClass();
                String replaceAll = compile.matcher(builder).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                zl1.k(e);
                return null;
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            zl1.k(e);
            return null;
        }
    }

    public final String username() {
        return this.username;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void toQueryString(List<String> list, StringBuilder sb) {
            s22 Z = ut0.Z(ut0.c0(0, list.size()), 2);
            int i = Z.I;
            int i2 = Z.J;
            int i3 = Z.K;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        @su0
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m281deprecated_get(String str) {
            str.getClass();
            return get(str);
        }

        @su0
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m284deprecated_parse(String str) {
            str.getClass();
            return parse(str);
        }

        public final int defaultPort(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @su0
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m283deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @su0
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m282deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        public final HttpUrl get(URL url) {
            url.getClass();
            String url2 = url.toString();
            url2.getClass();
            return parse(url2);
        }

        public final HttpUrl get(URI uri) {
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            return parse(uri2);
        }
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, er0 er0Var) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private String encodedFragment;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;
        private final List<String> encodedPathSegments = p70.n0("");

        private final Builder addPathSegments(String str, boolean z) {
            boolean z2;
            Builder builder;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i, str.length());
                if (delimiterOffset < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    builder = this;
                } else {
                    z2 = false;
                    builder = this;
                    str2 = str;
                    z3 = z;
                }
                builder.push(str2, i, delimiterOffset, z2, z3);
                i = delimiterOffset + 1;
                if (i > str2.length()) {
                    return builder;
                }
                this = builder;
                str = str2;
                z = z3;
            }
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return j42.c(str, ".") || qx4.t(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return j42.c(str, "..") || qx4.t(str, "%2e.", true) || qx4.t(str, ".%2e", true) || qx4.t(str, "%2e%2e", true);
        }

        private final int parsePort(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(_UrlKt.canonicalize$default(str, i, i2, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > parseInt || parseInt >= 65536) {
                return -1;
            }
            return parseInt;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r2.size() - 1, "");
            }
        }

        private final int portColonOffset(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$default = _UrlKt.canonicalize$default(str, i, i2, _UrlKt.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, 112, null);
            if (isDot(canonicalize$default)) {
                return;
            }
            if (isDotDot(canonicalize$default)) {
                pop();
                return;
            }
            int length = this.encodedPathSegments.get(r12.size() - 1).length();
            List<String> list = this.encodedPathSegments;
            if (length == 0) {
                list.set(list.size() - 1, canonicalize$default);
            } else {
                list.add(canonicalize$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int U = sp0.U(size, 0, -2);
            if (U > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (j42.c(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == U) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i3, i2);
                boolean z = delimiterOffset < i2;
                Builder builder = this;
                String str2 = str;
                builder.push(str2, i3, delimiterOffset, z, true);
                if (z) {
                    i3 = delimiterOffset + 1;
                    this = builder;
                    str = str2;
                } else {
                    this = builder;
                    str = str2;
                    i3 = delimiterOffset;
                }
            }
        }

        private final int schemeDelimiterOffset(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((j42.m(charAt, 97) >= 0 && j42.m(charAt, 122) <= 0) || (j42.m(charAt, 65) >= 0 && j42.m(charAt, 90) <= 0)) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '/' && charAt != '\\') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private final void toPathString(List<String> list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int I = jx4.I(str, '&', i, 4);
                if (I == -1) {
                    I = str.length();
                }
                int I2 = jx4.I(str, '=', i, 4);
                if (I2 == -1 || I2 > I) {
                    arrayList.add(str.substring(i, I));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, I2));
                    arrayList.add(str.substring(I2 + 1, I));
                }
                i = I + 1;
            }
            return arrayList;
        }

        public final Builder addEncodedPathSegment(String str) {
            str.getClass();
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            str.getClass();
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            str.getClass();
            List list = this.encodedQueryNamesAndValues;
            if (list == null) {
                list = new ArrayList();
                this.encodedQueryNamesAndValues = list;
            }
            list.getClass();
            list.add(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            str.getClass();
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addQueryParameter(String str, String str2) {
            str.getClass();
            List list = this.encodedQueryNamesAndValues;
            if (list == null) {
                list = new ArrayList();
                this.encodedQueryNamesAndValues = list;
            }
            list.getClass();
            list.add(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                zy.i("scheme == null");
                return null;
            }
            String percentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
            String percentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                zy.i("host == null");
                return null;
            }
            int effectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(p70.J(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(p70.J(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? _UrlKt.percentDecode$default(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, percentDecode$default, percentDecode$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? _UrlKt.percentDecode$default(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? _UrlKt.canonicalize$default(str, 0, 0, "", true, false, false, true, 51, null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            str.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            str.getClass();
            if (qx4.y(str, "/", false)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            s83.h("unexpected encodedPath: ".concat(str));
            return null;
        }

        public final Builder encodedQuery(String str) {
            String canonicalize$default;
            this.encodedQueryNamesAndValues = (str == null || (canonicalize$default = _UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) == null) ? null : toQueryNamesAndValues(canonicalize$default);
            return this;
        }

        public final Builder encodedUsername(String str) {
            str.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? _UrlKt.canonicalize$default(str, 0, 0, "", false, false, false, true, 59, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            str.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            s83.t("unexpected host: ".concat(str));
            return null;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            boolean z;
            int i;
            int i2;
            String str2 = str;
            str2.getClass();
            int indexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int schemeDelimiterOffset = schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z2 = true;
            if (schemeDelimiterOffset != -1) {
                if (qx4.z(true, str2, indexOfFirstNonAsciiWhitespace$default, "https:")) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!qx4.z(true, str2, indexOfFirstNonAsciiWhitespace$default, "http:")) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, schemeDelimiterOffset) + '\'');
                    }
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    s83.t("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? jx4.f0(6, str2).concat("...") : str2));
                    return null;
                }
                this.scheme = httpUrl.scheme();
            }
            int slashCount = slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c = '#';
            if (slashCount >= 2 || httpUrl == null || !j42.c(httpUrl.scheme(), this.scheme)) {
                boolean z3 = false;
                boolean z4 = false;
                int i3 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = _UtilCommonKt.delimiterOffset(str2, "@/\\?#", i3, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str2.charAt(delimiterOffset) : (char) 65535;
                    if (charAt == 65535 || charAt == c || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z3) {
                            z = z2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str2 = str;
                            i = delimiterOffset;
                            sb.append(_UrlKt.canonicalize$default(str2, i3, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb.toString();
                        } else {
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str2, ':', i3, delimiterOffset);
                            z = z2;
                            String canonicalize$default = _UrlKt.canonicalize$default(str2, i3, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z4) {
                                canonicalize$default = this.encodedUsername + "%40" + canonicalize$default;
                            }
                            this.encodedUsername = canonicalize$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(str, delimiterOffset2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z3 = z;
                            } else {
                                i2 = delimiterOffset;
                            }
                            str2 = str;
                            i = i2;
                            z4 = z;
                        }
                        i3 = i + 1;
                        z2 = z;
                        c = '#';
                    }
                }
                int portColonOffset = portColonOffset(str2, i3, delimiterOffset);
                int i4 = portColonOffset + 1;
                if (i4 < delimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    int parsePort = parsePort(str2, i4, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + str2.substring(i4, delimiterOffset) + '\"').toString());
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    Companion companion = HttpUrl.Companion;
                    String str3 = this.scheme;
                    str3.getClass();
                    this.port = companion.defaultPort(str3);
                }
                if (this.host == null) {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + str2.substring(i3, portColonOffset) + '\"').toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int delimiterOffset3 = _UtilCommonKt.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = _UtilCommonKt.delimiterOffset(str2, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, delimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = _UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final Builder password(String str) {
            str.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder port(int i) {
            if (1 > i || i >= 65536) {
                s83.h(hf1.u(i, "unexpected port: "));
                return null;
            }
            this.port = i;
            return this;
        }

        public final Builder query(String str) {
            String canonicalize$default;
            this.encodedQueryNamesAndValues = (str == null || (canonicalize$default = _UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) == null) ? null : toQueryNamesAndValues(canonicalize$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2 = this.host;
            if (str2 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                compile.getClass();
                str = compile.matcher(str2).replaceAll("");
                str.getClass();
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, _UrlKt.canonicalize$default(list.get(i), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? _UrlKt.canonicalize$default(str3, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null) : null);
                }
            }
            String str4 = this.encodedFragment;
            this.encodedFragment = str4 != null ? _UrlKt.canonicalize$default(str4, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            str.getClass();
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
                return this;
            }
            s83.t("unexpected scheme: ".concat(str));
            return null;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            str.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(str, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.encodedPathSegments.set(i, canonicalize$default);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                return this;
            }
            s83.h("unexpected path segment: ".concat(str));
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            str.getClass();
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            str.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(str, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, 123, null);
            if (isDot(canonicalize$default) || isDotDot(canonicalize$default)) {
                s83.h("unexpected path segment: ".concat(str));
                return null;
            }
            this.encodedPathSegments.set(i, canonicalize$default);
            return this;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            str.getClass();
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (jx4.E(str2, ':')) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            toPathString(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion = HttpUrl.Companion;
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                companion.toQueryString(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder username(String str) {
            str.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder addPathSegments(String str) {
            str.getClass();
            return addPathSegments(str, false);
        }
    }

    public final Builder newBuilder(String str) {
        str.getClass();
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

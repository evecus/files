package coil3;

import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Uri {
    private final String authority;
    private final String data;
    private final String fragment;
    private final String path;
    private final String query;
    private final String scheme;
    private final String separator;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String authority;
        private String fragment;
        private String path;
        private String query;
        private String scheme;
        private String separator;

        public Builder(String str, String str2, String str3, String str4, String str5, String str6) {
            this.scheme = str;
            this.authority = str2;
            this.path = str3;
            this.query = str4;
            this.fragment = str5;
            this.separator = str6;
        }

        public final Builder authority(String str) {
            this.authority = str;
            return this;
        }

        public final Uri build() {
            return UriKt.Uri(this.scheme, this.authority, this.path, this.query, this.fragment, this.separator);
        }

        public final Builder fragment(String str) {
            this.fragment = str;
            return this;
        }

        public final Builder path(String str) {
            this.path = str;
            return this;
        }

        public final Builder query(String str) {
            this.query = str;
            return this;
        }

        public final Builder scheme(String str) {
            this.scheme = str;
            return this;
        }

        public final Builder separator(String str) {
            this.separator = str;
            return this;
        }
    }

    public Uri(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.data = str;
        this.separator = str2;
        this.scheme = str3;
        this.authority = str4;
        this.path = str5;
        this.query = str6;
        this.fragment = str7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Uri) && j42.c(((Uri) obj).data, this.data);
    }

    public final String getAuthority() {
        return this.authority;
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSeparator() {
        return this.separator;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public final Builder newBuilder() {
        return new Builder(this.scheme, this.authority, this.path, this.query, this.fragment, this.separator);
    }

    public String toString() {
        return this.data;
    }
}

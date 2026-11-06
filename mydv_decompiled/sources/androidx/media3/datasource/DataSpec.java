package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import coil3.network.internal.UtilsKt;
import defpackage.nt3;
import defpackage.s83;
import defpackage.sp0;
import j$.util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface HttpMethod {
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    private DataSpec(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        sp0.o(j4 >= 0);
        sp0.o(j2 >= 0);
        sp0.o(j3 > 0 || j3 == -1);
        uri.getClass();
        this.uri = uri;
        this.uriPositionOffset = j;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.position = j2;
        this.absoluteStreamPosition = j4;
        this.length = j3;
        this.key = str;
        this.flags = i2;
        this.customData = obj;
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return UtilsKt.HTTP_METHOD_GET;
        }
        if (i == 2) {
            return HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST;
        }
        if (i == 3) {
            return "HEAD";
        }
        s83.r();
        return null;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(getHttpMethodString());
        sb.append(" ");
        sb.append(this.uri);
        sb.append(", ");
        sb.append(this.position);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", ");
        sb.append(this.key);
        sb.append(", ");
        return nt3.n(sb, this.flags, "]");
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        public DataSpec build() {
            sp0.w(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setCustomData(Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        public Builder setUriPositionOffset(long j) {
            this.uriPositionOffset = j;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.EMPTY_MAP;
            this.length = -1L;
        }
    }

    public DataSpec subrange(long j) {
        long j2 = this.length;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(Uri uri, long j, long j2) {
        this(uri, j, j2, null);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, str, 0, null);
    }
}

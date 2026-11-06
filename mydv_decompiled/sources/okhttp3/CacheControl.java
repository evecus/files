package okhttp3;

import defpackage.er0;
import defpackage.hf1;
import defpackage.jp;
import defpackage.r7;
import defpackage.s83;
import defpackage.su0;
import defpackage.t41;
import defpackage.x41;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._CacheControlCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CacheControl {
    public static final Companion Companion;
    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK;
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public final CacheControl build() {
            return _CacheControlCommonKt.commonBuild(this);
        }

        public final boolean getImmutable$okhttp() {
            return this.immutable;
        }

        public final int getMaxAgeSeconds$okhttp() {
            return this.maxAgeSeconds;
        }

        public final int getMaxStaleSeconds$okhttp() {
            return this.maxStaleSeconds;
        }

        public final int getMinFreshSeconds$okhttp() {
            return this.minFreshSeconds;
        }

        public final boolean getNoCache$okhttp() {
            return this.noCache;
        }

        public final boolean getNoStore$okhttp() {
            return this.noStore;
        }

        public final boolean getNoTransform$okhttp() {
            return this.noTransform;
        }

        public final boolean getOnlyIfCached$okhttp() {
            return this.onlyIfCached;
        }

        public final Builder immutable() {
            return _CacheControlCommonKt.commonImmutable(this);
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i >= 0) {
                this.maxAgeSeconds = _CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(i));
                return this;
            }
            s83.h(hf1.u(i, "maxAge < 0: "));
            return null;
        }

        /* renamed from: maxAge-LRDsOJo, reason: not valid java name */
        public final Builder m229maxAgeLRDsOJo(long j) {
            jp jpVar = t41.J;
            long h = t41.h(j, x41.SECONDS);
            if (h >= 0) {
                this.maxAgeSeconds = _CacheControlCommonKt.commonClampToInt(h);
                return this;
            }
            s83.h(r7.A("maxAge < 0: ", h));
            return null;
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i >= 0) {
                this.maxStaleSeconds = _CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(i));
                return this;
            }
            s83.h(hf1.u(i, "maxStale < 0: "));
            return null;
        }

        /* renamed from: maxStale-LRDsOJo, reason: not valid java name */
        public final Builder m230maxStaleLRDsOJo(long j) {
            jp jpVar = t41.J;
            long h = t41.h(j, x41.SECONDS);
            if (h >= 0) {
                this.maxStaleSeconds = _CacheControlCommonKt.commonClampToInt(h);
                return this;
            }
            s83.h(r7.A("maxStale < 0: ", h));
            return null;
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i >= 0) {
                this.minFreshSeconds = _CacheControlCommonKt.commonClampToInt(timeUnit.toSeconds(i));
                return this;
            }
            s83.h(hf1.u(i, "minFresh < 0: "));
            return null;
        }

        /* renamed from: minFresh-LRDsOJo, reason: not valid java name */
        public final Builder m231minFreshLRDsOJo(long j) {
            jp jpVar = t41.J;
            long h = t41.h(j, x41.SECONDS);
            if (h >= 0) {
                this.minFreshSeconds = _CacheControlCommonKt.commonClampToInt(h);
                return this;
            }
            s83.h(r7.A("minFresh < 0: ", h));
            return null;
        }

        public final Builder noCache() {
            return _CacheControlCommonKt.commonNoCache(this);
        }

        public final Builder noStore() {
            return _CacheControlCommonKt.commonNoStore(this);
        }

        public final Builder noTransform() {
            return _CacheControlCommonKt.commonNoTransform(this);
        }

        public final Builder onlyIfCached() {
            return _CacheControlCommonKt.commonOnlyIfCached(this);
        }

        public final void setImmutable$okhttp(boolean z) {
            this.immutable = z;
        }

        public final void setMaxAgeSeconds$okhttp(int i) {
            this.maxAgeSeconds = i;
        }

        public final void setMaxStaleSeconds$okhttp(int i) {
            this.maxStaleSeconds = i;
        }

        public final void setMinFreshSeconds$okhttp(int i) {
            this.minFreshSeconds = i;
        }

        public final void setNoCache$okhttp(boolean z) {
            this.noCache = z;
        }

        public final void setNoStore$okhttp(boolean z) {
            this.noStore = z;
        }

        public final void setNoTransform$okhttp(boolean z) {
            this.noTransform = z;
        }

        public final void setOnlyIfCached$okhttp(boolean z) {
            this.onlyIfCached = z;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        FORCE_NETWORK = _CacheControlCommonKt.commonForceNetwork(companion);
        FORCE_CACHE = _CacheControlCommonKt.commonForceCache(companion);
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    @su0
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m219deprecated_immutable() {
        return this.immutable;
    }

    @su0
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m220deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @su0
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m221deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @su0
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m222deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @su0
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m223deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @su0
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m224deprecated_noCache() {
        return this.noCache;
    }

    @su0
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m225deprecated_noStore() {
        return this.noStore;
    }

    @su0
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m226deprecated_noTransform() {
        return this.noTransform;
    }

    @su0
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m227deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @su0
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m228deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final String getHeaderValue$okhttp() {
        return this.headerValue;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final void setHeaderValue$okhttp(String str) {
        this.headerValue = str;
    }

    public String toString() {
        return _CacheControlCommonKt.commonToString(this);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final CacheControl parse(Headers headers) {
            headers.getClass();
            return _CacheControlCommonKt.commonParse(this, headers);
        }

        private Companion() {
        }
    }
}

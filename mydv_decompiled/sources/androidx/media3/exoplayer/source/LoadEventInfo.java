package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import defpackage.c34;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;
    public final String steeredPathwayId;
    public final Uri uri;

    private LoadEventInfo(Builder builder) {
        this.loadTaskId = builder.loadTaskId;
        this.dataSpec = builder.dataSpec;
        this.uri = builder.uri;
        this.steeredPathwayId = builder.steeredPathwayId;
        this.responseHeaders = builder.responseHeaders;
        this.elapsedRealtimeMs = builder.elapsedRealtimeMs;
        this.loadDurationMs = builder.loadDurationMs;
        this.bytesLoaded = builder.bytesLoaded;
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public LoadEventInfo copyWithTaskIdAndDurationMs(long j, long j2) {
        return buildUpon().setLoadTaskId(j).setLoadDurationMs(j2).build();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private long bytesLoaded;
        private DataSpec dataSpec;
        private long elapsedRealtimeMs;
        private long loadDurationMs;
        private long loadTaskId;
        private Map<String, List<String>> responseHeaders;
        private String steeredPathwayId;
        private Uri uri;

        private Builder(LoadEventInfo loadEventInfo) {
            this.loadTaskId = loadEventInfo.loadTaskId;
            this.dataSpec = loadEventInfo.dataSpec;
            this.uri = loadEventInfo.uri;
            this.responseHeaders = loadEventInfo.responseHeaders;
            this.elapsedRealtimeMs = loadEventInfo.elapsedRealtimeMs;
            this.loadDurationMs = loadEventInfo.loadDurationMs;
            this.bytesLoaded = loadEventInfo.bytesLoaded;
        }

        public LoadEventInfo build() {
            return new LoadEventInfo(this);
        }

        public Builder setBytesLoaded(long j) {
            this.bytesLoaded = j;
            return this;
        }

        public Builder setDataSpec(DataSpec dataSpec) {
            this.dataSpec = dataSpec;
            this.uri = dataSpec.uri;
            return this;
        }

        public Builder setElapsedRealtimeMs(long j) {
            this.elapsedRealtimeMs = j;
            return this;
        }

        public Builder setLoadDurationMs(long j) {
            this.loadDurationMs = j;
            return this;
        }

        public Builder setLoadTaskId(long j) {
            this.loadTaskId = j;
            return this;
        }

        public Builder setResponseHeaders(Map<String, List<String>> map) {
            this.responseHeaders = map;
            return this;
        }

        public Builder setSteeredPathwayId(String str) {
            this.steeredPathwayId = str;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder(long j, DataSpec dataSpec, long j2) {
            this.loadTaskId = j;
            this.dataSpec = dataSpec;
            this.uri = dataSpec.uri;
            this.elapsedRealtimeMs = j2;
            this.responseHeaders = c34.O;
        }
    }

    @Deprecated
    public LoadEventInfo(long j, DataSpec dataSpec, long j2) {
        this(j, dataSpec, dataSpec.uri, c34.O, j2, 0L, 0L);
    }

    @Deprecated
    public LoadEventInfo(long j, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.loadTaskId = j;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.steeredPathwayId = null;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j2;
        this.loadDurationMs = j3;
        this.bytesLoaded = j4;
    }
}

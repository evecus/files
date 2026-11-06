package androidx.media3.exoplayer;

import androidx.media3.common.C;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j) {
        long j2 = this.lastRebufferRealtimeMs;
        return (j2 == C.TIME_UNSET || j == C.TIME_UNSET || j2 < j) ? false : true;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public Builder() {
            this.playbackPositionUs = C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C.TIME_UNSET;
        }

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        public Builder setLastRebufferRealtimeMs(long j) {
            sp0.o(j >= 0 || j == C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j;
            return this;
        }

        public Builder setPlaybackPositionUs(long j) {
            this.playbackPositionUs = j;
            return this;
        }

        public Builder setPlaybackSpeed(float f) {
            sp0.o(f > 0.0f || f == -3.4028235E38f);
            this.playbackSpeed = f;
            return this;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }
}

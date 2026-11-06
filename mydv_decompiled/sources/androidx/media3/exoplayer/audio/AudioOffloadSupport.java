package androidx.media3.exoplayer.audio;

import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport DEFAULT_UNSUPPORTED = new Builder().build();
    public final boolean isFormatSupported;
    public final boolean isGaplessSupported;
    public final boolean isSpeedChangeSupported;

    private AudioOffloadSupport(Builder builder) {
        this.isFormatSupported = builder.isFormatSupported;
        this.isGaplessSupported = builder.isGaplessSupported;
        this.isSpeedChangeSupported = builder.isSpeedChangeSupported;
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioOffloadSupport.class == obj.getClass()) {
            AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
            if (this.isFormatSupported == audioOffloadSupport.isFormatSupported && this.isGaplessSupported == audioOffloadSupport.isGaplessSupported && this.isSpeedChangeSupported == audioOffloadSupport.isSpeedChangeSupported) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.isFormatSupported ? 1 : 0) << 2) + ((this.isGaplessSupported ? 1 : 0) << 1) + (this.isSpeedChangeSupported ? 1 : 0);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean isFormatSupported;
        private boolean isGaplessSupported;
        private boolean isSpeedChangeSupported;

        public Builder(AudioOffloadSupport audioOffloadSupport) {
            this.isFormatSupported = audioOffloadSupport.isFormatSupported;
            this.isGaplessSupported = audioOffloadSupport.isGaplessSupported;
            this.isSpeedChangeSupported = audioOffloadSupport.isSpeedChangeSupported;
        }

        public AudioOffloadSupport build() {
            if (this.isFormatSupported || !(this.isGaplessSupported || this.isSpeedChangeSupported)) {
                return new AudioOffloadSupport(this);
            }
            zy.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }

        public Builder setIsFormatSupported(boolean z) {
            this.isFormatSupported = z;
            return this;
        }

        public Builder setIsGaplessSupported(boolean z) {
            this.isGaplessSupported = z;
            return this;
        }

        public Builder setIsSpeedChangeSupported(boolean z) {
            this.isSpeedChangeSupported = z;
            return this;
        }

        public Builder() {
        }
    }
}

package androidx.media3.exoplayer;

import defpackage.sp0;
import defpackage.sy1;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ScrubbingModeParameters {
    public static final ScrubbingModeParameters DEFAULT = new Builder().build();
    public final boolean allowSkippingKeyFrameReset;
    public final boolean allowSkippingMediaCodecFlush;
    public final sy1 disabledTrackTypes;
    public final Double fractionalSeekToleranceAfter;
    public final Double fractionalSeekToleranceBefore;

    @Deprecated
    public final boolean isMediaCodecFlushEnabled;
    public final boolean shouldEnableDynamicScheduling;
    public final boolean shouldIncreaseCodecOperatingRate;
    public final boolean useDecodeOnlyFlag;

    private ScrubbingModeParameters(Builder builder) {
        this.disabledTrackTypes = builder.disabledTrackTypes;
        this.fractionalSeekToleranceBefore = builder.fractionalSeekToleranceBefore;
        this.fractionalSeekToleranceAfter = builder.fractionalSeekToleranceAfter;
        this.shouldIncreaseCodecOperatingRate = builder.shouldIncreaseCodecOperatingRate;
        this.isMediaCodecFlushEnabled = !builder.allowSkippingMediaCodecFlush;
        this.allowSkippingMediaCodecFlush = builder.allowSkippingMediaCodecFlush;
        this.allowSkippingKeyFrameReset = builder.allowSkippingKeyFrameReset;
        this.shouldEnableDynamicScheduling = builder.shouldEnableDynamicScheduling;
        this.useDecodeOnlyFlag = builder.useDecodeOnlyFlag;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrubbingModeParameters)) {
            return false;
        }
        ScrubbingModeParameters scrubbingModeParameters = (ScrubbingModeParameters) obj;
        return this.disabledTrackTypes.equals(scrubbingModeParameters.disabledTrackTypes) && this.allowSkippingMediaCodecFlush == scrubbingModeParameters.allowSkippingMediaCodecFlush && this.allowSkippingKeyFrameReset == scrubbingModeParameters.allowSkippingKeyFrameReset && Objects.equals(this.fractionalSeekToleranceBefore, scrubbingModeParameters.fractionalSeekToleranceBefore) && Objects.equals(this.fractionalSeekToleranceAfter, scrubbingModeParameters.fractionalSeekToleranceAfter) && this.shouldIncreaseCodecOperatingRate == scrubbingModeParameters.shouldIncreaseCodecOperatingRate && this.shouldEnableDynamicScheduling == scrubbingModeParameters.shouldEnableDynamicScheduling && this.useDecodeOnlyFlag == scrubbingModeParameters.useDecodeOnlyFlag;
    }

    public int hashCode() {
        return Objects.hash(this.disabledTrackTypes, this.fractionalSeekToleranceBefore, this.fractionalSeekToleranceAfter, Boolean.valueOf(this.shouldIncreaseCodecOperatingRate), Boolean.valueOf(this.allowSkippingMediaCodecFlush), Boolean.valueOf(this.allowSkippingKeyFrameReset), Boolean.valueOf(this.shouldEnableDynamicScheduling), Boolean.valueOf(this.useDecodeOnlyFlag));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean allowSkippingKeyFrameReset;
        private boolean allowSkippingMediaCodecFlush;
        private sy1 disabledTrackTypes;
        private Double fractionalSeekToleranceAfter;
        private Double fractionalSeekToleranceBefore;
        private boolean shouldEnableDynamicScheduling;
        private boolean shouldIncreaseCodecOperatingRate;
        private boolean useDecodeOnlyFlag;

        public Builder() {
            this.disabledTrackTypes = sy1.n(2, 1, 5);
            this.shouldIncreaseCodecOperatingRate = true;
            this.allowSkippingMediaCodecFlush = true;
            this.allowSkippingKeyFrameReset = true;
            this.shouldEnableDynamicScheduling = true;
            this.useDecodeOnlyFlag = true;
        }

        public ScrubbingModeParameters build() {
            return new ScrubbingModeParameters(this);
        }

        public Builder setAllowSkippingKeyFrameReset(boolean z) {
            this.allowSkippingKeyFrameReset = z;
            return this;
        }

        public Builder setAllowSkippingMediaCodecFlush(boolean z) {
            this.allowSkippingMediaCodecFlush = z;
            return this;
        }

        public Builder setDisabledTrackTypes(Set<Integer> set) {
            this.disabledTrackTypes = sy1.o(set);
            return this;
        }

        public Builder setFractionalSeekTolerance(Double d, Double d2) {
            boolean z = false;
            sp0.o((d == null) == (d2 == null));
            sp0.o(d == null || (d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d));
            if (d2 == null || (d2.doubleValue() >= 0.0d && d2.doubleValue() <= 1.0d)) {
                z = true;
            }
            sp0.o(z);
            this.fractionalSeekToleranceBefore = d;
            this.fractionalSeekToleranceAfter = d2;
            return this;
        }

        @Deprecated
        public Builder setIsMediaCodecFlushEnabled(boolean z) {
            this.allowSkippingMediaCodecFlush = !z;
            return this;
        }

        public Builder setShouldEnableDynamicScheduling(boolean z) {
            this.shouldEnableDynamicScheduling = z;
            return this;
        }

        public Builder setShouldIncreaseCodecOperatingRate(boolean z) {
            this.shouldIncreaseCodecOperatingRate = z;
            return this;
        }

        public Builder setUseDecodeOnlyFlag(boolean z) {
            this.useDecodeOnlyFlag = z;
            return this;
        }

        private Builder(ScrubbingModeParameters scrubbingModeParameters) {
            this.disabledTrackTypes = scrubbingModeParameters.disabledTrackTypes;
            this.fractionalSeekToleranceBefore = scrubbingModeParameters.fractionalSeekToleranceBefore;
            this.fractionalSeekToleranceAfter = scrubbingModeParameters.fractionalSeekToleranceAfter;
            this.shouldIncreaseCodecOperatingRate = scrubbingModeParameters.shouldIncreaseCodecOperatingRate;
            this.allowSkippingMediaCodecFlush = scrubbingModeParameters.allowSkippingMediaCodecFlush;
            this.allowSkippingKeyFrameReset = scrubbingModeParameters.allowSkippingKeyFrameReset;
            this.shouldEnableDynamicScheduling = scrubbingModeParameters.shouldEnableDynamicScheduling;
            this.useDecodeOnlyFlag = scrubbingModeParameters.useDecodeOnlyFlag;
        }
    }
}

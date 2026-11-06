package androidx.media3.common.audio;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import defpackage.hf1;
import defpackage.sp0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    AudioFormat configure(AudioFormat audioFormat);

    @Deprecated
    void flush();

    void flush(StreamMetadata streamMetadata);

    long getDurationAfterProcessorApplied(long j);

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class StreamMetadata {
        public static final StreamMetadata DEFAULT = new Builder().build();
        public final Object periodUid;
        public final long positionOffsetUs;
        public final Timeline timeline;

        private StreamMetadata(Builder builder) {
            this.positionOffsetUs = builder.positionOffsetUs;
            this.timeline = builder.timeline;
            this.periodUid = builder.periodUid;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private Object periodUid;
            private long positionOffsetUs;
            private Timeline timeline;

            private Builder(StreamMetadata streamMetadata) {
                this.positionOffsetUs = streamMetadata.positionOffsetUs;
                this.timeline = streamMetadata.timeline;
                this.periodUid = streamMetadata.periodUid;
            }

            public StreamMetadata build() {
                Object obj;
                if (!this.timeline.isEmpty() && (obj = this.periodUid) != null) {
                    sp0.o(this.timeline.getIndexOfPeriod(obj) != -1);
                }
                return new StreamMetadata(this);
            }

            public Builder setPeriodUid(Object obj) {
                this.periodUid = obj;
                return this;
            }

            public Builder setPositionOffsetUs(long j) {
                this.positionOffsetUs = j;
                return this;
            }

            public Builder setTimeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public Builder() {
                this.positionOffsetUs = 0L;
                this.timeline = Timeline.EMPTY;
                this.periodUid = null;
            }
        }

        @Deprecated
        public StreamMetadata(long j) {
            this(new Builder().setPositionOffsetUs(j));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.encoding = i3;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i3) ? Util.getPcmFrameSize(i3, i2) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.encoding));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            return hf1.y(sb, this.encoding, ']');
        }

        public AudioFormat(Format format) {
            this(format.sampleRate, format.channelCount, format.pcmEncoding);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class UnhandledAudioFormatException extends Exception {
        public final AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + audioFormat);
            this.inputAudioFormat = audioFormat;
        }

        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }
    }
}

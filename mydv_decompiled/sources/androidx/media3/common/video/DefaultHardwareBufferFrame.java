package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.video.HardwareBufferFrame;
import defpackage.c34;
import defpackage.iy1;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultHardwareBufferFrame implements HardwareBufferFrame {
    private final long contentTimeUs;
    private final Format format;
    private final HardwareBuffer hardwareBuffer;
    private final Object internalImage;
    private final iy1 metadata;

    private DefaultHardwareBufferFrame(Builder builder) {
        this.hardwareBuffer = builder.hardwareBuffer;
        this.format = builder.format;
        this.metadata = builder.metadata;
        this.contentTimeUs = builder.contentTimeUs;
        this.internalImage = builder.internalImage;
    }

    @Override // androidx.media3.common.video.HardwareBufferFrame
    public HardwareBufferFrame.Builder buildUpon() {
        return new Builder();
    }

    @Override // androidx.media3.common.video.Frame
    public long getContentTimeUs() {
        return this.contentTimeUs;
    }

    @Override // androidx.media3.common.video.Frame
    public Format getFormat() {
        return this.format;
    }

    @Override // androidx.media3.common.video.HardwareBufferFrame
    public HardwareBuffer getHardwareBuffer() {
        return this.hardwareBuffer;
    }

    public Object getInternalImage() {
        return this.internalImage;
    }

    @Override // androidx.media3.common.video.Frame
    public iy1 getMetadata() {
        return this.metadata;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder implements HardwareBufferFrame.Builder {
        private long contentTimeUs;
        private Format format;
        private final HardwareBuffer hardwareBuffer;
        private Object internalImage;
        private iy1 metadata;

        private Builder(DefaultHardwareBufferFrame defaultHardwareBufferFrame) {
            this.hardwareBuffer = defaultHardwareBufferFrame.hardwareBuffer;
            this.format = defaultHardwareBufferFrame.format;
            this.metadata = defaultHardwareBufferFrame.metadata;
            this.contentTimeUs = defaultHardwareBufferFrame.contentTimeUs;
            this.internalImage = defaultHardwareBufferFrame.internalImage;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public DefaultHardwareBufferFrame build() {
            return new DefaultHardwareBufferFrame(this);
        }

        public Builder setFormat(Format format) {
            this.format = format;
            return this;
        }

        public Builder setInternalImage(Object obj) {
            this.internalImage = obj;
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public Builder setMetadata(Map<String, Object> map) {
            this.metadata = iy1.a(map);
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public Builder setContentTimeUs(long j) {
            this.contentTimeUs = j;
            return this;
        }

        @Override // androidx.media3.common.video.HardwareBufferFrame.Builder
        public /* bridge */ /* synthetic */ HardwareBufferFrame.Builder setMetadata(Map map) {
            return setMetadata((Map<String, Object>) map);
        }

        public Builder(HardwareBuffer hardwareBuffer) {
            this.hardwareBuffer = hardwareBuffer;
            this.format = new Format.Builder().build();
            this.metadata = c34.O;
            this.contentTimeUs = C.TIME_UNSET;
        }
    }
}

package androidx.media3.exoplayer.image;

import androidx.media3.common.Format;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public interface Factory {

        @Deprecated
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(Format format);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    ImageOutputBuffer dequeueOutputBuffer();

    @Override // androidx.media3.decoder.Decoder
    /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer();

    /* JADX WARN: Can't rename method to resolve collision */
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    /* bridge */ /* synthetic */ void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);
}

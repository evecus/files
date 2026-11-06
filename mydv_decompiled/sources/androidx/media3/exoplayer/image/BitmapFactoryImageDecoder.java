package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.image.ImageDecoder;
import defpackage.hf1;
import defpackage.sp0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final Context context;
    private final int maxOutputSize;

    private BitmapFactoryImageDecoder(Context context, int i) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.context = context;
        this.maxOutputSize = i;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z) {
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        byteBuffer.getClass();
        sp0.z(byteBuffer.hasArray());
        sp0.o(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.maxOutputSize;
            if (i == -1) {
                Context context = this.context;
                if (context != null) {
                    Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
                    int i2 = currentDisplayModeSize.x;
                    int i3 = currentDisplayModeSize.y;
                    Format format = decoderInputBuffer.format;
                    if (format != null) {
                        int i4 = format.tileCountHorizontal;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = format.tileCountVertical;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            imageOutputBuffer.bitmap = BitmapUtil.decode(byteBuffer.array(), byteBuffer.remaining(), null, i);
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements ImageDecoder.Factory {
        private final Context context;
        private int maxOutputSize;

        public Factory(Context context) {
            context.getClass();
            this.context = context;
            this.maxOutputSize = -1;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.context, this.maxOutputSize);
        }

        public Factory setMaxOutputSize(int i) {
            sp0.o(i == -1 || i > 0);
            this.maxOutputSize = i;
            return this;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return (str == null || !MimeTypes.isImage(str)) ? hf1.k(0, 0, 0, 0) : Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? hf1.k(4, 0, 0, 0) : hf1.k(1, 0, 0, 0);
        }

        @Deprecated
        public Factory() {
            this.context = null;
            this.maxOutputSize = -1;
        }
    }
}

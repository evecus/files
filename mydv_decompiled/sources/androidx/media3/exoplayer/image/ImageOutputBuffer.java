package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderOutputBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {
    public Bitmap bitmap;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}

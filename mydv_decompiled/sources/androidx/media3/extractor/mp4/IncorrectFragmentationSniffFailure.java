package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public static final IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new IncorrectFragmentationSniffFailure(true);
    public static final IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z) {
        this.fileIsFragmented = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
        sb.append(!this.fileIsFragmented);
        sb.append("}");
        return sb.toString();
    }
}

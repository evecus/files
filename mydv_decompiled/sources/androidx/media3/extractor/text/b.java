package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.dy1;
import defpackage.w7;
import defpackage.zx1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static void a(SubtitleParser subtitleParser, byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        subtitleParser.parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    public static Subtitle b(SubtitleParser subtitleParser, byte[] bArr, int i, int i2) {
        SubtitleParser.OutputOptions outputOptions;
        zx1 n = dy1.n();
        outputOptions = SubtitleParser.OutputOptions.ALL;
        subtitleParser.parse(bArr, i, i2, outputOptions, new w7(n, (byte) 19));
        return new CuesWithTimingSubtitle(n.f());
    }
}

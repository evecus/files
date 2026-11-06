package defpackage;

import android.graphics.ColorSpace;
import android.net.Uri;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl1 implements ExtractorsFactory, wn4, Consumer, MediaCodecSelector, Id3Decoder.FramePredicate {
    public final /* synthetic */ byte I;

    public /* synthetic */ zl1(byte b) {
        this.I = b;
    }

    public static /* bridge */ /* synthetic */ ColorSpace b(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new IOException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void i(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void k(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // defpackage.wn4
    public boolean a() {
        return false;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] lambda$static$1;
        Extractor[] lambda$static$12;
        Extractor[] lambda$static$0;
        Extractor[] lambda$static$13;
        switch (this.I) {
            case 0:
                lambda$static$1 = FragmentedMp4Extractor.lambda$static$1();
                return lambda$static$1;
            case 17:
                lambda$static$12 = MatroskaExtractor.lambda$static$1();
                return lambda$static$12;
            case 24:
                lambda$static$0 = Mp3Extractor.lambda$static$0();
                return lambda$static$0;
            default:
                lambda$static$13 = Mp4Extractor.lambda$static$1();
                return lambda$static$13;
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$1;
        lambda$static$1 = Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        return lambda$static$1;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public /* synthetic */ ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public List getDecoderInfos(String str, boolean z, boolean z2) {
        switch (this.I) {
            case 19:
                return MediaCodecUtil.getDecoderInfos(str, z, z2);
            default:
                return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(MediaCodecSelector.DEFAULT.getDecoderInfos(str, z, z2));
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory setParseHagcMetadata(boolean z) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        byte b = this.I;
        return jp0.a(this);
    }
}

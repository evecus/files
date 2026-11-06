package defpackage;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class am1 implements ExtractorsFactory {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SubtitleParser.Factory J;

    public /* synthetic */ am1(SubtitleParser.Factory factory, byte b) {
        this.I = b;
        this.J = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors(Uri uri, Map map) {
        Extractor[] lambda$newFactory$0;
        Extractor[] lambda$newFactory$02;
        Extractor[] lambda$newFactory$03;
        Extractor[] lambda$newFactory$04;
        switch (this.I) {
            case 0:
                lambda$newFactory$0 = FragmentedMp4Extractor.lambda$newFactory$0(this.J);
                return lambda$newFactory$0;
            case 1:
                lambda$newFactory$02 = MatroskaExtractor.lambda$newFactory$0(this.J);
                return lambda$newFactory$02;
            case 2:
                lambda$newFactory$03 = Mp4Extractor.lambda$newFactory$0(this.J);
                return lambda$newFactory$03;
            default:
                lambda$newFactory$04 = TsExtractor.lambda$newFactory$0(this.J);
                return lambda$newFactory$04;
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public final ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final ExtractorsFactory setParseHagcMetadata(boolean z) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: setSubtitleParserFactory */
    public final ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory) {
        byte b = this.I;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$newFactory$0;
        Extractor[] lambda$newFactory$02;
        Extractor[] lambda$newFactory$03;
        Extractor[] lambda$newFactory$04;
        byte b = this.I;
        SubtitleParser.Factory factory = this.J;
        switch (b) {
            case 0:
                lambda$newFactory$0 = FragmentedMp4Extractor.lambda$newFactory$0(factory);
                return lambda$newFactory$0;
            case 1:
                lambda$newFactory$02 = MatroskaExtractor.lambda$newFactory$0(factory);
                return lambda$newFactory$02;
            case 2:
                lambda$newFactory$03 = Mp4Extractor.lambda$newFactory$0(factory);
                return lambda$newFactory$03;
            default:
                lambda$newFactory$04 = TsExtractor.lambda$newFactory$0(factory);
                return lambda$newFactory$04;
        }
    }
}

package defpackage;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements ExtractorsFactory {
    public final /* synthetic */ byte I;

    public /* synthetic */ e1(byte b) {
        this.I = b;
    }

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        Extractor[] lambda$static$02;
        Extractor[] lambda$static$03;
        Extractor[] lambda$static$04;
        switch (this.I) {
            case 1:
                lambda$static$0 = Ac3Extractor.lambda$static$0();
                return lambda$static$0;
            case 2:
                lambda$static$02 = Ac4Extractor.lambda$static$0();
                return lambda$static$02;
            case 17:
                lambda$static$03 = AdtsExtractor.lambda$static$0();
                return lambda$static$03;
            default:
                lambda$static$04 = AmrExtractor.lambda$static$0();
                return lambda$static$04;
        }
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

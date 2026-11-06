package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import coil3.EventListener;
import coil3.request.ImageRequest;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class zy implements CacheKeyFactory, ty0, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, TrackSelector.Factory, DrmSessionManager.DrmSessionReference, l61, EventListener.Factory, ExtractorsFactory {
    public final /* synthetic */ byte I;

    public /* synthetic */ zy(byte b) {
        this.I = b;
    }

    public static /* synthetic */ void c() {
        throw new EOFException();
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void n() {
        throw new d92();
    }

    public static /* synthetic */ void o(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void p(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // defpackage.ty0
    public double b(double d) {
        switch (this.I) {
            case 6:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 7:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 8:
                float[] fArr = z80.a;
                return z80.b(z80.c, d);
            case 9:
                float[] fArr2 = z80.a;
                return z80.a(z80.c, d);
            case 10:
                float[] fArr3 = z80.a;
                return z80.d(z80.d, d);
            default:
                float[] fArr4 = z80.a;
                return z80.c(z80.d, d);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    @Override // coil3.EventListener.Factory
    public EventListener create(ImageRequest imageRequest) {
        int i = db1.a;
        return EventListener.NONE;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        Extractor[] lambda$static$02;
        switch (this.I) {
            case 28:
                lambda$static$0 = FlacExtractor.lambda$static$0();
                return lambda$static$0;
            default:
                lambda$static$02 = FlvExtractor.lambda$static$0();
                return lambda$static$02;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public TrackSelector createTrackSelector(Context context) {
        return new DefaultTrackSelector(context);
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

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        Constructor flacExtractorConstructor;
        Constructor midiExtractorConstructor;
        switch (this.I) {
            case 15:
                flacExtractorConstructor = DefaultExtractorsFactory.getFlacExtractorConstructor();
                return flacExtractorConstructor;
            default:
                midiExtractorConstructor = DefaultExtractorsFactory.getMidiExtractorConstructor();
                return midiExtractorConstructor;
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

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
    }

    @Override // defpackage.l61
    public float a(float f) {
        return f;
    }
}

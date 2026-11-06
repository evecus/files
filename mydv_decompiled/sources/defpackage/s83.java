package defpackage;

import android.database.SQLException;
import android.net.Uri;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s83 implements ExtractorsFactory, ty0, ListenerSet.Event {
    public final /* synthetic */ byte I;

    public /* synthetic */ s83(byte b) {
        this.I = b;
    }

    public static /* synthetic */ void d() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void g(SQLException sQLException) {
        throw new DatabaseIOException(sQLException);
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void m(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void r() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void v() {
        throw new d92();
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        Extractor[] lambda$static$02;
        Extractor[] lambda$static$1;
        Extractor[] lambda$static$03;
        switch (this.I) {
            case 3:
                lambda$static$0 = OggExtractor.lambda$static$0();
                return lambda$static$0;
            case 8:
                lambda$static$02 = PsExtractor.lambda$static$0();
                return lambda$static$02;
            case 22:
                lambda$static$1 = TsExtractor.lambda$static$1();
                return lambda$static$1;
            default:
                lambda$static$03 = WavExtractor.lambda$static$0();
                return lambda$static$03;
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

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
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

    @Override // defpackage.ty0
    public double b(double d) {
        return d;
    }
}

package defpackage;

import android.media.MediaParser;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.hls.HlsExtractorFactory;
import androidx.media3.exoplayer.hls.HlsMediaChunkExtractor;
import androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor;
import androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MediaParserExtractorAdapter;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class or0 implements DefaultGainProvider.FadeProvider, HlsPlaylistTracker.Factory, TextOutput, MetadataOutput, ExtractorsFactory, ExoMediaDrm.Provider, Id3Decoder.FramePredicate, LoudnessCodecController.LoudnessParameterUpdateListener, ProgressiveMediaExtractor.Factory, HlsExtractorFactory {
    public final /* synthetic */ byte I;

    public /* synthetic */ or0(byte b) {
        this.I = b;
    }

    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint c(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void e(long j, long j2) {
        throw new EOFException("DEF length " + j + ((Object) " object truncated by ") + j2);
    }

    public static /* synthetic */ void f(String str, int i, int i2, Object obj) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
    public ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        ExoMediaDrm lambda$static$0;
        lambda$static$0 = FrameworkMediaDrm.lambda$static$0(uuid);
        return lambda$static$0;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        HlsMediaChunkExtractor lambda$static$0;
        lambda$static$0 = MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
        return lambda$static$0;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return new Extractor[0];
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$static$0;
        lambda$static$0 = MediaParserExtractorAdapter.lambda$static$0(playerId);
        return lambda$static$0;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
    public HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, gz4 gz4Var) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration, gz4Var);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$0;
        boolean lambda$static$1;
        switch (this.I) {
            case 21:
                lambda$static$0 = Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
                return lambda$static$0;
            default:
                lambda$static$1 = Id3Decoder.lambda$static$1(i, i2, i3, i4, i5);
                return lambda$static$1;
        }
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        float lambda$static$0;
        float lambda$static$1;
        float lambda$static$2;
        float lambda$static$3;
        switch (this.I) {
            case 0:
                lambda$static$0 = DefaultGainProvider.lambda$static$0(j, j2);
                return lambda$static$0;
            case 1:
                lambda$static$1 = DefaultGainProvider.lambda$static$1(j, j2);
                return lambda$static$1;
            case 2:
                lambda$static$2 = DefaultGainProvider.lambda$static$2(j, j2);
                return lambda$static$2;
            default:
                lambda$static$3 = DefaultGainProvider.lambda$static$3(j, j2);
                return lambda$static$3;
        }
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public void onCues(CueGroup cueGroup) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
    }

    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public void onMetadata(Metadata metadata) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies, reason: collision with other method in class */
    public ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: setSubtitleParserFactory, reason: collision with other method in class */
    public ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        return new Extractor[0];
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public void onCues(List list) {
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public Format getOutputTextFormat(Format format) {
        return format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return bundle;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory setParseHagcMetadata(boolean z) {
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }
}

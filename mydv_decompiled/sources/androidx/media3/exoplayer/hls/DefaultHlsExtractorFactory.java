package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.TsExtractor;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private int codecsToParseWithinGopSampleDependencies;
    private final boolean exposeCea608WhenMissingDeclarations;
    private boolean parseSubtitlesDuringExtraction;
    private final int payloadReaderFactoryFlags;
    private SubtitleParser.Factory subtitleParserFactory;

    public DefaultHlsExtractorFactory(int i, boolean z) {
        this.payloadReaderFactoryFlags = i;
        this.exposeCea608WhenMissingDeclarations = z;
        this.subtitleParserFactory = new DefaultSubtitleParserFactory();
    }

    private static void addFileTypeIfValidAndNotPresent(int i, List<Integer> list) {
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    private Extractor createExtractorByFileType(int i, Format format, List<Format> list, TimestampAdjuster timestampAdjuster) {
        if (i == 0) {
            return new Ac3Extractor();
        }
        if (i == 1) {
            return new Ac4Extractor();
        }
        if (i == 2) {
            return new AdtsExtractor();
        }
        if (i == 7) {
            return new Mp3Extractor(0, 0L);
        }
        if (i == 8) {
            return createFragmentedMp4Extractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction, timestampAdjuster, list, this.codecsToParseWithinGopSampleDependencies);
        }
        if (i == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }
        if (i != 13) {
            return null;
        }
        return new WebvttExtractor(format.language, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    private static FragmentedMp4Extractor createFragmentedMp4Extractor(SubtitleParser.Factory factory, boolean z, TimestampAdjuster timestampAdjuster, List<Format> list, int i) {
        int i2;
        if (z) {
            i2 = 4;
        } else {
            factory = SubtitleParser.Factory.UNSUPPORTED;
            i2 = 36;
        }
        SubtitleParser.Factory factory2 = factory;
        int codecsToParseWithinGopSampleDependenciesAsFlags = i2 | FragmentedMp4Extractor.codecsToParseWithinGopSampleDependenciesAsFlags(i);
        if (list == null) {
            ay1 ay1Var = dy1.J;
            list = x24.M;
        }
        return new FragmentedMp4Extractor(factory2, codecsToParseWithinGopSampleDependenciesAsFlags, timestampAdjuster, null, list, null);
    }

    private static TsExtractor createTsExtractor(int i, boolean z, Format format, List<Format> list, TimestampAdjuster timestampAdjuster, SubtitleParser.Factory factory, boolean z2) {
        int i2;
        int i3 = i | 16;
        if (list != null) {
            i3 = i | 48;
        } else {
            list = z ? Collections.singletonList(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()) : Collections.EMPTY_LIST;
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.AUDIO_AAC)) {
                i3 |= 2;
            }
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.VIDEO_H264)) {
                i3 |= 4;
            }
        }
        if (z2) {
            i2 = 0;
        } else {
            factory = SubtitleParser.Factory.UNSUPPORTED;
            i2 = 1;
        }
        return new TsExtractor(2, i2, factory, timestampAdjuster, new DefaultTsPayloadReaderFactory(i3, list), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    private static boolean sniffQuietly(Extractor extractor, ExtractorInput extractorInput) {
        try {
            boolean sniff = extractor.sniff(extractorInput);
            extractorInput.resetPeekPosition();
            return sniff;
        } catch (EOFException unused) {
            extractorInput.resetPeekPosition();
            return false;
        } catch (Throwable th) {
            extractorInput.resetPeekPosition();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public BundledHlsMediaChunkExtractor createExtractor(Uri uri, Format format, List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput, PlayerId playerId) {
        int inferFileTypeFromMimeType = FileTypes.inferFileTypeFromMimeType(format.sampleMimeType);
        int inferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
        int inferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(inferFileTypeFromMimeType, arrayList);
        addFileTypeIfValidAndNotPresent(inferFileTypeFromResponseHeaders, arrayList);
        addFileTypeIfValidAndNotPresent(inferFileTypeFromUri, arrayList);
        int i = 0;
        for (int i2 : iArr) {
            addFileTypeIfValidAndNotPresent(i2, arrayList);
        }
        extractorInput.resetPeekPosition();
        Extractor extractor = null;
        while (i < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            int i3 = inferFileTypeFromResponseHeaders;
            ArrayList arrayList2 = arrayList;
            Extractor createExtractorByFileType = createExtractorByFileType(intValue, format, list, timestampAdjuster);
            createExtractorByFileType.getClass();
            if (sniffQuietly(createExtractorByFileType, extractorInput)) {
                return new BundledHlsMediaChunkExtractor(createExtractorByFileType, format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
            }
            if (extractor == null && (intValue == inferFileTypeFromMimeType || intValue == i3 || intValue == inferFileTypeFromUri || intValue == 11)) {
                extractor = createExtractorByFileType;
            }
            i++;
            arrayList = arrayList2;
            inferFileTypeFromResponseHeaders = i3;
        }
        extractor.getClass();
        return new BundledHlsMediaChunkExtractor(extractor, format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public Format getOutputTextFormat(Format format) {
        String str;
        if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
            return format;
        }
        Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
        StringBuilder sb = new StringBuilder();
        sb.append(format.sampleMimeType);
        if (format.codecs != null) {
            str = " " + format.codecs;
        } else {
            str = "";
        }
        sb.append(str);
        return cueReplacementBehavior.setCodecs(sb.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public DefaultHlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.parseSubtitlesDuringExtraction = z;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public DefaultHlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        this.codecsToParseWithinGopSampleDependencies = i;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public DefaultHlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        return this;
    }

    public DefaultHlsExtractorFactory() {
        this(0, true);
        this.codecsToParseWithinGopSampleDependencies = 3;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        return createExtractor(uri, format, (List<Format>) list, timestampAdjuster, (Map<String, List<String>>) map, extractorInput, playerId);
    }
}

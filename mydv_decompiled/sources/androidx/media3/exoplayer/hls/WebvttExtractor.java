package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.text.webvtt.WebvttParserUtil;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebvttExtractor implements Extractor {
    private static final int HEADER_MAX_LENGTH = 9;
    private static final int HEADER_MIN_LENGTH = 6;
    private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String language;
    private ExtractorOutput output;
    private final boolean parseSubtitlesDuringExtraction;
    private byte[] sampleData;
    private final ParsableByteArray sampleDataWrapper;
    private int sampleSize;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final TimestampAdjuster timestampAdjuster;

    public WebvttExtractor(String str, TimestampAdjuster timestampAdjuster, SubtitleParser.Factory factory, boolean z) {
        this.language = str;
        this.timestampAdjuster = timestampAdjuster;
        this.sampleDataWrapper = new ParsableByteArray();
        this.sampleData = new byte[1024];
        this.subtitleParserFactory = factory;
        this.parseSubtitlesDuringExtraction = z;
    }

    @RequiresNonNull({"output"})
    private TrackOutput buildTrackOutput(long j) {
        TrackOutput track = this.output.track(0, 3);
        track.format(new Format.Builder().setSampleMimeType(MimeTypes.TEXT_VTT).setLanguage(this.language).setSubsampleOffsetUs(j).build());
        this.output.endTracks();
        return track;
    }

    @RequiresNonNull({"output"})
    private void processSample() {
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.sampleData);
        WebvttParserUtil.validateWebvttHeaderLine(parsableByteArray);
        long j = 0;
        long j2 = 0;
        for (String readLine = parsableByteArray.readLine(); !TextUtils.isEmpty(readLine); readLine = parsableByteArray.readLine()) {
            if (readLine.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = LOCAL_TIMESTAMP.matcher(readLine);
                if (!matcher.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(readLine), null);
                }
                Matcher matcher2 = MEDIA_TIMESTAMP.matcher(readLine);
                if (!matcher2.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(readLine), null);
                }
                String group = matcher.group(1);
                group.getClass();
                j2 = WebvttParserUtil.parseTimestampUs(group);
                String group2 = matcher2.group(1);
                group2.getClass();
                j = TimestampAdjuster.ptsToUs(Long.parseLong(group2));
            }
        }
        Matcher findNextCueHeader = WebvttParserUtil.findNextCueHeader(parsableByteArray);
        if (findNextCueHeader == null) {
            buildTrackOutput(0L);
            return;
        }
        String group3 = findNextCueHeader.group(1);
        group3.getClass();
        long parseTimestampUs = WebvttParserUtil.parseTimestampUs(group3);
        long adjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(TimestampAdjuster.usToWrappedPts((j + parseTimestampUs) - j2));
        TrackOutput buildTrackOutput = buildTrackOutput(adjustTsTimestamp - parseTimestampUs);
        this.sampleDataWrapper.reset(this.sampleData, this.sampleSize);
        buildTrackOutput.sampleData(this.sampleDataWrapper, this.sampleSize);
        buildTrackOutput.sampleMetadata(adjustTsTimestamp, 1, this.sampleSize, 0, null);
    }

    @Override // androidx.media3.extractor.Extractor
    public final List getSniffFailureDetails() {
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.output.getClass();
        int length = (int) extractorInput.getLength();
        int i = this.sampleSize;
        byte[] bArr = this.sampleData;
        if (i == bArr.length) {
            bArr = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
            this.sampleData = bArr;
        }
        int i2 = this.sampleSize;
        int read = extractorInput.read(bArr, i2, bArr.length - i2);
        if (read != -1) {
            int i3 = this.sampleSize + read;
            this.sampleSize = i3;
            if (length == -1 || i3 != length) {
                return 0;
            }
        }
        processSample();
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.sampleData, 0, 6, false);
        this.sampleDataWrapper.reset(this.sampleData, 6);
        if (WebvttParserUtil.isWebvttHeaderLine(this.sampleDataWrapper)) {
            return true;
        }
        extractorInput.peekFully(this.sampleData, 6, 3, false);
        this.sampleDataWrapper.reset(this.sampleData, 9);
        return WebvttParserUtil.isWebvttHeaderLine(this.sampleDataWrapper);
    }

    @Deprecated
    public WebvttExtractor(String str, TimestampAdjuster timestampAdjuster) {
        this(str, timestampAdjuster, SubtitleParser.Factory.UNSUPPORTED, false);
    }

    @Override // androidx.media3.extractor.Extractor
    public final Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}

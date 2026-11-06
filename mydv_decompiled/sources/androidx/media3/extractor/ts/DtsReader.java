package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import defpackage.s83;
import defpackage.sp0;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int CORE_HEADER_SIZE = 18;
    static final int EXTSS_HEADER_SIZE_MAX = 4096;
    static final int FTOC_MAX_HEADER_SIZE = 5408;
    private static final int STATE_CHECKING_FOR_EXTSS_AFTER_CORE = 7;
    private static final int STATE_FINDING_EXTSS_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_FINDING_UHD_HEADER_SIZE = 4;
    private static final int STATE_READING_CORE_HEADER = 1;
    private static final int STATE_READING_EXTSS_HEADER = 3;
    private static final int STATE_READING_SAMPLE = 6;
    private static final int STATE_READING_UHD_HEADER = 5;
    private int bytesRead;
    private final String containerMimeType;
    private boolean coreFormatPendingEmit;
    private int coreSampleSize;
    private int extSyncBytes;
    private Format format;
    private String formatId;
    private int frameType;
    private boolean hasCore;
    private final ParsableByteArray headerScratchBytes;
    private final String language;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private boolean skipExtssUntilCore;
    private int syncBytes;
    private int state = 0;
    private long timeUs = C.TIME_UNSET;
    private long pendingTimeUs = C.TIME_UNSET;
    private final AtomicInteger uhdAudioChunkId = new AtomicInteger();
    private int extensionSubstreamHeaderSize = -1;
    private int uhdHeaderSize = -1;

    public DtsReader(String str, int i, int i2, String str2) {
        this.headerScratchBytes = new ParsableByteArray(new byte[i2]);
        this.language = str;
        this.roleFlags = i;
        this.containerMimeType = str2;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, min);
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private void parseCoreHeader() {
        this.hasCore = true;
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            this.format = DtsUtil.parseDtsFormat(data, this.formatId, this.language, this.roleFlags, this.containerMimeType, null);
            this.coreFormatPendingEmit = true;
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = sp0.B(Util.sampleCountToDurationUs(DtsUtil.parseDtsAudioSampleCount(data), this.format.sampleRate));
    }

    @RequiresNonNull({"output"})
    private void parseExtensionSubstreamHeader() {
        DtsUtil.DtsHeader parseDtsHdHeader = DtsUtil.parseDtsHdHeader(this.headerScratchBytes.getData());
        updateFormatWithDtsHeaderInfo(parseDtsHdHeader);
        this.sampleSize = parseDtsHdHeader.frameSize;
        long j = parseDtsHdHeader.frameDurationUs;
        if (j != C.TIME_UNSET) {
            this.sampleDurationUs = j;
        }
    }

    @RequiresNonNull({"output"})
    private void parseUhdHeader() {
        DtsUtil.DtsHeader parseDtsUhdHeader = DtsUtil.parseDtsUhdHeader(this.headerScratchBytes.getData(), this.uhdAudioChunkId);
        if (this.frameType == 3) {
            updateFormatWithDtsHeaderInfo(parseDtsUhdHeader);
        }
        this.sampleSize = parseDtsUhdHeader.frameSize;
        long j = parseDtsUhdHeader.frameDurationUs;
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        this.sampleDurationUs = j;
    }

    private void setHeaderScratchBytesFromSyncWord(int i) {
        byte[] data = this.headerScratchBytes.getData();
        data[0] = (byte) ((i >> 24) & 255);
        data[1] = (byte) ((i >> 16) & 255);
        data[2] = (byte) ((i >> 8) & 255);
        data[3] = (byte) (i & 255);
        this.bytesRead = 4;
    }

    private boolean skipToNextSyncWord(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.syncBytes << 8;
            this.syncBytes = i;
            int readUnsignedByte = i | parsableByteArray.readUnsignedByte();
            this.syncBytes = readUnsignedByte;
            int frameType = DtsUtil.getFrameType(readUnsignedByte);
            this.frameType = frameType;
            if (frameType != 0) {
                setHeaderScratchBytesFromSyncWord(this.syncBytes);
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull({"output"})
    private void updateFormatWithDtsHeaderInfo(DtsUtil.DtsHeader dtsHeader) {
        int i;
        int i2 = dtsHeader.sampleRate;
        if (i2 == -2147483647 || (i = dtsHeader.channelCount) == -1) {
            return;
        }
        String str = dtsHeader.mimeType;
        if (str == null) {
            Format format = this.format;
            str = format != null ? format.sampleMimeType : null;
        }
        Format format2 = this.format;
        if (format2 != null && !this.coreFormatPendingEmit && i == format2.channelCount && i2 == format2.sampleRate && Objects.equals(str, format2.sampleMimeType)) {
            return;
        }
        Format format3 = this.format;
        Format build = (format3 == null ? new Format.Builder() : format3.buildUpon()).setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(str).setChannelCount(dtsHeader.channelCount).setSampleRate(dtsHeader.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
        this.format = build;
        this.output.format(build);
        this.coreFormatPendingEmit = false;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            switch (this.state) {
                case 0:
                    if (!skipToNextSyncWord(parsableByteArray)) {
                        break;
                    } else if (!this.skipExtssUntilCore || this.frameType != 2) {
                        int i = this.frameType;
                        if (i == 1) {
                            this.skipExtssUntilCore = false;
                        }
                        if (i != 3 && i != 4) {
                            if (i != 1) {
                                this.state = 2;
                                break;
                            } else {
                                this.state = 1;
                                break;
                            }
                        } else {
                            this.state = 4;
                            break;
                        }
                    } else {
                        this.bytesRead = 0;
                        break;
                    }
                case 1:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                        break;
                    } else {
                        parseCoreHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, 18);
                        this.state = 6;
                        break;
                    }
                case 2:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 7)) {
                        break;
                    } else {
                        this.extensionSubstreamHeaderSize = DtsUtil.parseDtsHdHeaderSize(this.headerScratchBytes.getData());
                        this.state = 3;
                        break;
                    }
                case 3:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.extensionSubstreamHeaderSize)) {
                        break;
                    } else {
                        parseExtensionSubstreamHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.extensionSubstreamHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 4:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 6)) {
                        break;
                    } else {
                        int parseDtsUhdHeaderSize = DtsUtil.parseDtsUhdHeaderSize(this.headerScratchBytes.getData());
                        this.uhdHeaderSize = parseDtsUhdHeaderSize;
                        int i2 = this.bytesRead;
                        if (i2 > parseDtsUhdHeaderSize) {
                            int i3 = i2 - parseDtsUhdHeaderSize;
                            this.bytesRead = i2 - i3;
                            parsableByteArray.setPosition(parsableByteArray.getPosition() - i3);
                        }
                        this.state = 5;
                        break;
                    }
                case 5:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.uhdHeaderSize)) {
                        break;
                    } else {
                        parseUhdHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.uhdHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, min);
                    int i4 = this.bytesRead + min;
                    this.bytesRead = i4;
                    int i5 = this.sampleSize;
                    if (i4 == i5) {
                        if (this.frameType != 1) {
                            sp0.z(this.timeUs != C.TIME_UNSET);
                            int i6 = this.sampleSize;
                            int i7 = this.frameType;
                            int i8 = i6 + (i7 == 2 ? this.coreSampleSize : 0);
                            long j = this.timeUs;
                            this.output.sampleMetadata(j, i7 == 4 ? 0 : 1, i8, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            long j2 = this.pendingTimeUs;
                            if (j2 != C.TIME_UNSET) {
                                if (j2 != j) {
                                    this.timeUs = j2;
                                }
                                this.pendingTimeUs = C.TIME_UNSET;
                            }
                            this.coreSampleSize = 0;
                            this.state = 0;
                            break;
                        } else {
                            this.coreSampleSize = i5;
                            this.bytesRead = 0;
                            this.extSyncBytes = 0;
                            this.state = 7;
                            break;
                        }
                    } else {
                        break;
                    }
                case 7:
                    while (parsableByteArray.bytesLeft() > 0 && this.bytesRead < 4) {
                        int i9 = this.extSyncBytes << 8;
                        this.extSyncBytes = i9;
                        this.extSyncBytes = i9 | parsableByteArray.readUnsignedByte();
                        this.bytesRead++;
                    }
                    if (this.bytesRead == 4) {
                        if (DtsUtil.getFrameType(this.extSyncBytes) != 2) {
                            if (this.coreFormatPendingEmit) {
                                TrackOutput trackOutput = this.output;
                                Format format = this.format;
                                format.getClass();
                                trackOutput.format(format);
                                this.coreFormatPendingEmit = false;
                            }
                            sp0.z(this.timeUs != C.TIME_UNSET);
                            long j3 = this.timeUs;
                            this.output.sampleMetadata(j3, 1, this.coreSampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            long j4 = this.pendingTimeUs;
                            if (j4 != C.TIME_UNSET) {
                                if (j4 != j3) {
                                    this.timeUs = j4;
                                }
                                this.pendingTimeUs = C.TIME_UNSET;
                            }
                            this.coreSampleSize = 0;
                            int i10 = this.extSyncBytes;
                            this.syncBytes = i10;
                            this.extSyncBytes = 0;
                            int frameType = DtsUtil.getFrameType(i10);
                            this.frameType = frameType;
                            if (frameType != 3 && frameType != 4) {
                                if (frameType != 1) {
                                    this.bytesRead = 0;
                                    this.state = 0;
                                    break;
                                } else {
                                    setHeaderScratchBytesFromSyncWord(this.syncBytes);
                                    this.syncBytes = 0;
                                    this.state = 1;
                                    break;
                                }
                            } else {
                                setHeaderScratchBytesFromSyncWord(this.syncBytes);
                                this.syncBytes = 0;
                                this.state = 4;
                                break;
                            }
                        } else {
                            setHeaderScratchBytesFromSyncWord(this.extSyncBytes);
                            this.frameType = 2;
                            this.extSyncBytes = 0;
                            this.state = 2;
                            break;
                        }
                    } else {
                        break;
                    }
                default:
                    s83.r();
                    return;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        if (this.state == 7) {
            this.output.getClass();
            if (this.coreFormatPendingEmit) {
                TrackOutput trackOutput = this.output;
                Format format = this.format;
                format.getClass();
                trackOutput.format(format);
                this.coreFormatPendingEmit = false;
            }
            long j = this.timeUs;
            if (j != C.TIME_UNSET) {
                this.output.sampleMetadata(j, 1, this.coreSampleSize, 0, null);
                this.timeUs += this.sampleDurationUs;
            }
            this.coreSampleSize = 0;
            this.bytesRead = 0;
            this.syncBytes = 0;
            this.extSyncBytes = 0;
            this.state = 0;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != C.TIME_UNSET) {
            if (this.state != 0) {
                this.pendingTimeUs = j;
            } else {
                this.timeUs = j;
                this.pendingTimeUs = C.TIME_UNSET;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.extSyncBytes = 0;
        this.coreSampleSize = 0;
        this.timeUs = C.TIME_UNSET;
        this.pendingTimeUs = C.TIME_UNSET;
        this.uhdAudioChunkId.set(0);
        this.coreFormatPendingEmit = false;
        this.skipExtssUntilCore = this.hasCore;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }
}

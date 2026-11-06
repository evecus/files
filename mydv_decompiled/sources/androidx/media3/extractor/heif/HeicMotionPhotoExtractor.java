package androidx.media3.extractor.heif;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.StartOffsetExtractorInput;
import androidx.media3.extractor.StartOffsetExtractorOutput;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.jp0;
import defpackage.s83;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class HeicMotionPhotoExtractor implements Extractor {
    private static final int STATE_ENDED = 4;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_MOTION_PHOTO_VIDEO = 3;
    private static final int STATE_SNIFFING_MOTION_PHOTO_VIDEO = 2;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private ExtractorOutput extractorOutput;
    private ExtractorInput lastExtractorInput;
    private MotionPhotoMetadata motionPhotoMetadata;
    private Mp4Extractor mp4Extractor;
    private StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private final ParsableByteArray scratch = new ParsableByteArray(16);
    private long mp4StartPosition = -1;
    private int state = 0;

    private void endReading() {
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.state = 4;
    }

    private void outputImageTrack(MotionPhotoMetadata motionPhotoMetadata) {
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.track(1024, 4).format(new Format.Builder().setContainerMimeType("image/heic").setMetadata(new Metadata(motionPhotoMetadata)).build());
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.scratch.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.scratch.setPosition(0);
            this.atomSize = this.scratch.readUnsignedInt();
            this.atomType = this.scratch.readInt();
        }
        if (this.atomSize == 1) {
            extractorInput.readFully(this.scratch.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.scratch.readUnsignedLongToLong();
        }
        if (this.atomType == 1836086884) {
            long position = extractorInput.getPosition();
            this.mp4StartPosition = position;
            int i = this.atomHeaderBytesRead;
            MotionPhotoMetadata motionPhotoMetadata = new MotionPhotoMetadata(0L, position - i, C.TIME_UNSET, position, this.atomSize - i);
            this.motionPhotoMetadata = motionPhotoMetadata;
            outputImageTrack(motionPhotoMetadata);
            this.state = 2;
        } else {
            this.state = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) {
        extractorInput.skipFully((int) (this.atomSize - this.atomHeaderBytesRead));
        this.atomHeaderBytesRead = 0;
        this.state = 0;
    }

    private int readMotionPhotoVideo(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
            this.lastExtractorInput = extractorInput;
            this.mp4ExtractorStartOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        }
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        mp4Extractor.getClass();
        int read = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, positionHolder);
        if (read == 1) {
            positionHolder.position += this.mp4StartPosition;
        }
        return read;
    }

    private void sniffMotionPhotoVideo(ExtractorInput extractorInput) {
        if (this.mp4Extractor == null) {
            this.mp4Extractor = new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 8);
        }
        StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        this.mp4ExtractorStartOffsetExtractorInput = startOffsetExtractorInput;
        if (!this.mp4Extractor.sniff(startOffsetExtractorInput)) {
            endReading();
            return;
        }
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        long j = this.mp4StartPosition;
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        mp4Extractor.init(new StartOffsetExtractorOutput(j, extractorOutput));
        this.state = 3;
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            int i = this.state;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(extractorInput);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            return readMotionPhotoVideo(extractorInput, positionHolder);
                        }
                        if (i == 4) {
                            return -1;
                        }
                        s83.r();
                        return 0;
                    }
                    sniffMotionPhotoVideo(extractorInput);
                }
            } else if (!readAtomHeader(extractorInput)) {
                endReading();
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.release();
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j != 0) {
            if (this.state == 3) {
                Mp4Extractor mp4Extractor = this.mp4Extractor;
                mp4Extractor.getClass();
                mp4Extractor.seek(j, j2);
                return;
            }
            return;
        }
        this.state = 0;
        this.atomHeaderBytesRead = 0;
        this.mp4StartPosition = -1L;
        Mp4Extractor mp4Extractor2 = this.mp4Extractor;
        if (mp4Extractor2 != null) {
            mp4Extractor2.release();
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return HeifSniffer.sniff(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }
}

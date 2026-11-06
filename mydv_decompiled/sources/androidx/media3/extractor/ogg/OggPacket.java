package androidx.media3.extractor.ogg;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import defpackage.sp0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private final ParsableByteArray packetArray = new ParsableByteArray(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int currentSegmentIndex = -1;

    private int calculatePacketSize(int i) {
        int i2;
        int i3 = 0;
        this.segmentCount = 0;
        do {
            int i4 = this.segmentCount;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i5 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.segmentCount = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public boolean populate(ExtractorInput extractorInput) {
        sp0.z(extractorInput != null);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset(0);
        }
        while (!this.populated) {
            int i = this.currentSegmentIndex;
            if (i < 0) {
                if (!this.pageHeader.skipToNextPage(extractorInput) || !this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.pageHeader;
                int i2 = oggPageHeader.headerSize;
                if ((oggPageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    i2 += calculatePacketSize(0);
                    i = this.segmentCount;
                } else {
                    i = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(extractorInput, i2)) {
                    return false;
                }
                this.currentSegmentIndex = i;
            }
            int calculatePacketSize = calculatePacketSize(i);
            int i3 = this.currentSegmentIndex + this.segmentCount;
            if (calculatePacketSize > 0) {
                ParsableByteArray parsableByteArray = this.packetArray;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + calculatePacketSize);
                if (!ExtractorUtil.readFullyQuietly(extractorInput, this.packetArray.getData(), this.packetArray.limit(), calculatePacketSize)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.packetArray;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + calculatePacketSize);
                this.populated = this.pageHeader.laces[i3 + (-1)] != 255;
            }
            if (i3 == this.pageHeader.pageSegmentCount) {
                i3 = -1;
            }
            this.currentSegmentIndex = i3;
        }
        return true;
    }

    public void reset() {
        this.pageHeader.reset();
        this.packetArray.reset(0);
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public void trimPayload() {
        if (this.packetArray.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.packetArray;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.packetArray.limit())), this.packetArray.limit());
    }
}

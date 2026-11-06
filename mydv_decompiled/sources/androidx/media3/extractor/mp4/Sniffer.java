package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Sniffer {
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z) {
        SniffFailure sniffFailure;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        long j2;
        int i5;
        boolean z2;
        int[] iArr;
        long length = extractorInput.getLength();
        long j3 = -1;
        long j4 = 4096;
        if (length != -1 && length <= 4096) {
            j4 = length;
        }
        int i6 = (int) j4;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        while (i8 < i6) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), i7, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i3 = 16;
                parsableByteArray.setLimit(16);
                i2 = i8;
                j = parsableByteArray.readLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j3) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                i2 = i8;
                j = readUnsignedInt;
                i3 = 8;
            }
            long j5 = i3;
            if (j < j5) {
                sniffFailure = null;
                if (readInt != 1718773093 || i3 != 8) {
                    return new AtomSizeTooSmallSniffFailure(readInt, j, i3);
                }
                j = j5;
            } else {
                sniffFailure = null;
            }
            int i9 = i2 + i3;
            if (readInt == 1836019574 || readInt == 1970628964) {
                i6 += (int) j;
                i4 = readInt;
                if (length != -1 && i6 > length) {
                    i6 = (int) length;
                }
                if (i4 == 1836019574) {
                    i8 = i9;
                    j3 = -1;
                    i7 = 0;
                }
            } else {
                i4 = readInt;
            }
            if (i4 != 1953653099 && i4 != 1835297121 && i4 != 1835626086) {
                if (i4 != 1836019558 && i4 != 1836475768) {
                    if (i4 == 1835295092) {
                        z3 = true;
                    }
                    if (i4 != 1937007212 || j <= 1000000) {
                        j2 = length;
                        if ((i9 + j) - j5 < i6) {
                            int i10 = (int) (j - j5);
                            i8 = i9 + i10;
                            if (i4 != 1718909296) {
                                i5 = 0;
                                if (i10 != 0) {
                                    extractorInput.advancePeekPosition(i10);
                                }
                            } else {
                                if (i10 < 8) {
                                    return new AtomSizeTooSmallSniffFailure(i4, i10, 8);
                                }
                                parsableByteArray.reset(i10);
                                i5 = 0;
                                extractorInput.peekFully(parsableByteArray.getData(), 0, i10);
                                int readInt2 = parsableByteArray.readInt();
                                if (isCompatibleBrand(readInt2)) {
                                    z3 = true;
                                }
                                parsableByteArray.skipBytes(4);
                                int bytesLeft = parsableByteArray.bytesLeft() / 4;
                                if (!z3 && bytesLeft > 0) {
                                    int[] iArr2 = new int[bytesLeft];
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= bytesLeft) {
                                            z2 = z3;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int readInt3 = parsableByteArray.readInt();
                                        iArr2[i11] = readInt3;
                                        if (isCompatibleBrand(readInt3)) {
                                            z2 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i11++;
                                    }
                                } else {
                                    z2 = z3;
                                    iArr = sniffFailure;
                                }
                                if (!z2) {
                                    return new UnsupportedBrandsSniffFailure(readInt2, iArr);
                                }
                                z3 = z2;
                            }
                            i7 = i5;
                        }
                    }
                    i = 0;
                    break;
                }
                i = 1;
                break;
            }
            j2 = length;
            i7 = 0;
            i8 = i9;
            length = j2;
            j3 = -1;
        }
        sniffFailure = null;
        i = i7;
        return !z3 ? NoDeclaredBrandSniffFailure.INSTANCE : z != i ? i != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED : sniffFailure;
    }

    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, false);
    }
}

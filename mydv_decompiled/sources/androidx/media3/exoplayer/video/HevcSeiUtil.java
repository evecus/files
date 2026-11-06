package androidx.media3.exoplayer.video;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HevcSeiUtil {
    private static final int SEI_PAYLOAD_TYPE_ITU_T_T35 = 4;
    static final int SEI_PAYLOAD_TYPE_UNSPECIFIED = 254;

    private HevcSeiUtil() {
    }

    private static int findNalUnit(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    public static void stripAllT35Metadata(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        if (limit - position < 4) {
            return;
        }
        while (position < limit) {
            int findNalUnit = findNalUnit(byteBuffer, position, limit);
            if (findNalUnit == limit || (i = findNalUnit + 3) >= limit) {
                return;
            }
            int i2 = (byteBuffer.get(i) & 126) >> 1;
            if (i2 >= 0 && i2 <= 31) {
                return;
            }
            if (i2 == 39) {
                int i3 = findNalUnit + 5;
                i = findNalUnit(byteBuffer, i3, limit);
                int i4 = 0;
                while (i3 < i) {
                    int i5 = 0;
                    while (true) {
                        if (i3 >= i) {
                            break;
                        }
                        int i6 = byteBuffer.get(i3) & 255;
                        if (i6 != 3 || i4 < 2) {
                            i4 = i6 == 0 ? i4 + 1 : 0;
                            int i7 = i3 + 1;
                            i5 += i6;
                            if (i6 != 255) {
                                if (i5 == 4) {
                                    byteBuffer.put(i3, (byte) -2);
                                }
                                i3 = i7;
                            } else {
                                i3 = i7;
                            }
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                    if (i3 >= i) {
                        break;
                    }
                    int i8 = 0;
                    while (i3 < i) {
                        int i9 = byteBuffer.get(i3) & 255;
                        if (i9 != 3 || i4 < 2) {
                            i4 = i9 == 0 ? i4 + 1 : 0;
                            i3++;
                            i8 += i9;
                            if (i9 != 255) {
                                break;
                            }
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                    int i10 = 0;
                    while (i10 < i8 && i3 < i) {
                        int i11 = i3 + 1;
                        int i12 = byteBuffer.get(i3) & 255;
                        if (i12 == 3 && i4 >= 2) {
                            i10--;
                        } else if (i12 == 0) {
                            i4++;
                            i10++;
                            i3 = i11;
                        }
                        i4 = 0;
                        i10++;
                        i3 = i11;
                    }
                }
            }
            position = i;
        }
    }
}

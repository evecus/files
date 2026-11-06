package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.j42;
import defpackage.ux1;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ListChunk implements AviChunk {
    public final dy1 children;
    private final int type;

    private ListChunk(int i, dy1 dy1Var) {
        this.type = i;
        this.children = dy1Var;
    }

    private static AviChunk createBox(int i, int i2, ParsableByteArray parsableByteArray) {
        switch (i) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i2, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        j42.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int limit = parsableByteArray.limit();
        int i2 = 0;
        int i3 = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk parseFrom = readLittleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(readLittleEndianInt, i3, parsableByteArray);
            if (parseFrom != null) {
                if (parseFrom.getType() == 1752331379) {
                    i3 = ((AviStreamHeaderChunk) parseFrom).getTrackType();
                }
                int i4 = i2 + 1;
                int b = ux1.b(objArr.length, i4);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i2] = parseFrom;
                i2 = i4;
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(limit);
        }
        return new ListChunk(i, dy1.m(i2, objArr));
    }

    public <T extends AviChunk> T getChild(Class<T> cls) {
        ay1 listIterator = this.children.listIterator(0);
        while (listIterator.hasNext()) {
            T t = (T) listIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}

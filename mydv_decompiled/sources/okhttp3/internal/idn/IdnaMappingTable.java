package okhttp3.internal.idn;

import defpackage.j42;
import defpackage.lz;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class IdnaMappingTable {
    private final String mappings;
    private final String ranges;
    private final String sections;

    public IdnaMappingTable(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    private final int findRangesOffset(int i, int i2, int i3) {
        int i4;
        int i5 = i & 127;
        int i6 = i3 - 1;
        while (true) {
            if (i2 > i6) {
                i4 = (-i2) - 1;
                break;
            }
            i4 = (i2 + i6) / 2;
            int m = j42.m(i5, this.ranges.charAt(i4 * 4));
            if (m >= 0) {
                if (m <= 0) {
                    break;
                }
                i2 = i4 + 1;
            } else {
                i6 = i4 - 1;
            }
        }
        return i4 >= 0 ? i4 * 4 : ((-i4) - 2) * 4;
    }

    private final int findSectionsIndex(int i) {
        int i2;
        int i3 = (i & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i4 = 0;
        while (true) {
            if (i4 > length) {
                i2 = (-i4) - 1;
                break;
            }
            i2 = (i4 + length) / 2;
            int m = j42.m(i3, IdnaMappingTableKt.read14BitInt(this.sections, i2 * 4));
            if (m >= 0) {
                if (m <= 0) {
                    break;
                }
                i4 = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i2 >= 0 ? i2 * 4 : ((-i2) - 2) * 4;
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int i, lz lzVar) {
        lzVar.getClass();
        int findSectionsIndex = findSectionsIndex(i);
        int findRangesOffset = findRangesOffset(i, IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 2), findSectionsIndex + 4 < this.sections.length() ? IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 6) : this.ranges.length() / 4);
        char charAt = this.ranges.charAt(findRangesOffset + 1);
        if (charAt >= 0 && charAt < '@') {
            int read14BitInt = IdnaMappingTableKt.read14BitInt(this.ranges, findRangesOffset + 2);
            lzVar.J(read14BitInt, charAt + read14BitInt, this.mappings);
            return true;
        }
        if ('@' <= charAt && charAt < 'P') {
            lzVar.k(i - (this.ranges.charAt(findRangesOffset + 3) | (((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= charAt && charAt < '`') {
            lzVar.k(i + (this.ranges.charAt(findRangesOffset + 3) | ((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7)));
            return true;
        }
        if (charAt == 'w') {
            return true;
        }
        if (charAt == 'x') {
            lzVar.k(i);
            return true;
        }
        if (charAt == 'y') {
            lzVar.k(i);
            return false;
        }
        if (charAt == 'z') {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2));
            return true;
        }
        if (charAt == '{') {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            return true;
        }
        if (charAt == '|') {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2));
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 3));
            return true;
        }
        if (charAt == '}') {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 3));
            return true;
        }
        if (charAt == '~') {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2));
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 3) | 128);
            return true;
        }
        if (charAt == 127) {
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            lzVar.writeByte(this.ranges.charAt(findRangesOffset + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i).toString());
    }
}

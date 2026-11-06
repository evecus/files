package okhttp3.internal.http2;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import coil3.network.internal.UtilsKt;
import defpackage.cz;
import defpackage.dq;
import defpackage.er0;
import defpackage.h00;
import defpackage.j42;
import defpackage.mz;
import defpackage.o70;
import defpackage.or0;
import defpackage.s04;
import defpackage.ut4;
import defpackage.zl1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<h00, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        h00 h00Var = Header.TARGET_METHOD;
        Header header2 = new Header(h00Var, UtilsKt.HTTP_METHOD_GET);
        Header header3 = new Header(h00Var, HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
        h00 h00Var2 = Header.TARGET_PATH;
        Header header4 = new Header(h00Var2, "/");
        Header header5 = new Header(h00Var2, "/index.html");
        h00 h00Var3 = Header.TARGET_SCHEME;
        Header header6 = new Header(h00Var3, "http");
        Header header7 = new Header(h00Var3, "https");
        h00 h00Var4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(h00Var4, "200"), new Header(h00Var4, "204"), new Header(h00Var4, "206"), new Header(h00Var4, "304"), new Header(h00Var4, "400"), new Header(h00Var4, "404"), new Header(h00Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<h00, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<h00, Integer> unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final h00 checkLowercase(h00 h00Var) {
        h00Var.getClass();
        int d = h00Var.d();
        for (int i = 0; i < d; i++) {
            byte i2 = h00Var.i(i);
            if (65 <= i2 && i2 < 91) {
                zl1.g("PROTOCOL_ERROR response malformed: mixed case name: ".concat(h00Var.s()));
                return null;
            }
        }
        return h00Var;
    }

    public final Map<h00, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final cz out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, boolean z, cz czVar) {
            czVar.getClass();
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = czVar;
            this.smallestHeaderTableSizeSetting = Log.LOG_LEVEL_OFF;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            dq.X0(0, r0.length, null, this.dynamicTable);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    i -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
                headerArr = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            headerArr[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(h00 h00Var) {
            h00Var.getClass();
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(h00Var) < h00Var.d()) {
                    cz czVar = new cz();
                    huffman.encode(h00Var, czVar);
                    h00 i = czVar.i(czVar.J);
                    writeInt(i.d(), 127, 128);
                    this.out.c0(i);
                    return;
                }
            }
            writeInt(h00Var.d(), 127, 0);
            this.out.c0(h00Var);
        }

        public final void writeHeaders(List<Header> list) {
            int i;
            int i2;
            list.getClass();
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Log.LOG_LEVEL_OFF;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = list.get(i4);
                h00 q = header.name.q();
                h00 h00Var = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(q);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (j42.c(hpack.getSTATIC_HEADER_TABLE()[intValue].value, h00Var)) {
                            i = i2;
                        } else if (j42.c(hpack.getSTATIC_HEADER_TABLE()[i2].value, h00Var)) {
                            i = i2;
                            i2 = intValue + 2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i5];
                        header2.getClass();
                        if (j42.c(header2.name, q)) {
                            Header header3 = this.dynamicTable[i5];
                            header3.getClass();
                            if (j42.c(header3.value, h00Var)) {
                                i2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    writeInt(i2, 127, 128);
                } else if (i == -1) {
                    this.out.d0(64);
                    writeByteString(q);
                    writeByteString(h00Var);
                    insertIntoDynamicTable(header);
                } else {
                    h00 h00Var2 = Header.PSEUDO_PREFIX;
                    q.getClass();
                    h00Var2.getClass();
                    if (!q.m(0, h00Var2, h00Var2.d()) || j42.c(Header.TARGET_AUTHORITY, q)) {
                        writeInt(i, Hpack.PREFIX_6_BITS, 64);
                        writeByteString(h00Var);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(i, 15, 0);
                        writeByteString(h00Var);
                    }
                }
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            cz czVar = this.out;
            if (i < i2) {
                czVar.d0(i3 | i);
                return;
            }
            czVar.d0(i3 | i2);
            int i4 = i - i2;
            while (true) {
                cz czVar2 = this.out;
                if (i4 < 128) {
                    czVar2.d0(i4);
                    return;
                } else {
                    czVar2.d0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(cz czVar) {
            this(0, false, czVar, 3, null);
            czVar.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, cz czVar) {
            this(i, false, czVar, 2, null);
            czVar.getClass();
        }

        public /* synthetic */ Writer(int i, boolean z, cz czVar, int i2, er0 er0Var) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, czVar);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private long headerListByteCount;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final mz source;

        public Reader(ut4 ut4Var, int i, int i2) {
            ut4Var.getClass();
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = new s04(ut4Var);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        private final void addHeader(Header header) {
            this.headerList.add(header);
            long d = this.headerListByteCount + header.value.d() + header.name.d();
            this.headerListByteCount = d;
            if (d <= _HeadersCommonKt.HEADER_LIMIT) {
                return;
            }
            zl1.g("header byte count limit of 262144 exceeded");
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            dq.X0(0, r0.length, null, this.dynamicTable);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i4 = header.hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final h00 getName(int i) {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    header.getClass();
                    return header.name;
                }
            }
            or0.d(i + 1, "Header index too large ");
            return null;
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            addHeader(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                header2.getClass();
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                    headerArr = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                headerArr[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i) + evictToRecoverBytes + i] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return _UtilCommonKt.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) {
            if (isStaticHeader(i)) {
                addHeader(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    header.getClass();
                    addHeader(header);
                    return;
                }
            }
            or0.d(i + 1, "Header index too large ");
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) {
            addHeader(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            addHeader(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> r1 = o70.r1(this.headerList);
            this.headerList.clear();
            this.headerListByteCount = 0L;
            return r1;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final h00 readByteString() {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            long readInt = readInt(readByte, 127);
            if (this.headerListByteCount + readInt > _HeadersCommonKt.HEADER_LIMIT) {
                zl1.g("header byte count limit of 262144 exceeded");
                return null;
            }
            if (!z) {
                return this.source.i(readInt);
            }
            cz czVar = new cz();
            Huffman.INSTANCE.decode(this.source, readInt, czVar);
            return czVar.i(czVar.J);
        }

        public final void readHeaders() {
            while (!this.source.p()) {
                int and = _UtilCommonKt.and(this.source.readByte(), 255);
                if (and == 128) {
                    zl1.g("index == 0");
                    return;
                }
                if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, Hpack.PREFIX_6_BITS) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        or0.d(this.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                        return;
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            long j = i2;
            int i4 = 0;
            int i5 = 0;
            while (i4 != 5) {
                int readByte = readByte();
                i4++;
                long j2 = (readByte & 127) << i5;
                if (j2 > 2147483647L - j) {
                    zl1.g("HPACK integer overflow");
                    return 0;
                }
                j += j2;
                if ((readByte & 128) == 0) {
                    return (int) j;
                }
                i5 += 7;
            }
            zl1.g("HPACK integer overflow");
            return 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(ut4 ut4Var, int i) {
            this(ut4Var, i, 0, 4, null);
            ut4Var.getClass();
        }

        public /* synthetic */ Reader(ut4 ut4Var, int i, int i2, int i3, er0 er0Var) {
            this(ut4Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}

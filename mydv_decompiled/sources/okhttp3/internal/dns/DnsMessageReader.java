package okhttp3.internal.dns;

import androidx.media3.common.util.Log;
import defpackage.cz;
import defpackage.gj2;
import defpackage.h00;
import defpackage.hf1;
import defpackage.mz;
import defpackage.o91;
import defpackage.s04;
import defpackage.ut0;
import defpackage.wr2;
import defpackage.zl1;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.dns.ResourceRecord;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DnsMessageReader {
    private final mz source;
    private final mz sourceOffsetZero;

    public DnsMessageReader(mz mzVar) {
        mzVar.getClass();
        this.sourceOffsetZero = mzVar;
        this.source = mzVar.peek();
    }

    private final ResourceRecord.Https readHttpsResourceRecord(mz mzVar, String str, int i) {
        short s;
        boolean z;
        int readShort;
        short readShort2 = mzVar.readShort();
        String readName = readName(mzVar);
        char c = 65535;
        boolean z2 = false;
        int i2 = 443;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        h00 h00Var = null;
        while (!mzVar.p()) {
            int readShort3 = mzVar.readShort() & 65535;
            if (readShort3 <= c) {
                zl1.m("malformed HTTPS resource record");
                return null;
            }
            long readShort4 = mzVar.readShort() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            boolean z3 = z2;
            long j = 0;
            switch (readShort3 == true ? 1 : 0) {
                case false:
                    s = readShort2;
                    z = z3;
                    if (readShort4 % 2 != 0) {
                        zl1.m("malformed HTTPS / mandatory");
                        return null;
                    }
                    wr2 a0 = ut0.a0(2L, ut0.d0(readShort4));
                    long j2 = a0.I;
                    long j3 = a0.J;
                    long j4 = a0.K;
                    if ((j4 > 0 && j2 <= j3) || (j4 < 0 && j3 <= j2)) {
                        while (true) {
                            readShort = mzVar.readShort() & 65535;
                            if (readShort >= 0 && readShort < 7) {
                                if (j2 != j3) {
                                    j2 += j4;
                                }
                            }
                        }
                        throw new ProtocolException(hf1.u(readShort, "unsupported HTTPS mandatory parameter "));
                    }
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                case true:
                    s = readShort2;
                    z = z3;
                    arrayList2 = new ArrayList();
                    while (j < readShort4) {
                        long readByte = mzVar.readByte() & 255;
                        j = j + 1 + readByte;
                        if (j > readShort4) {
                            zl1.m("malformed HTTPS / alpn");
                            return null;
                        }
                        arrayList2.add(mzVar.f(readByte));
                    }
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
                case true:
                    short s2 = readShort2;
                    if (readShort4 != 0) {
                        zl1.m("malformed HTTPS / no-default-alpn");
                        return null;
                    }
                    z2 = true;
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s2;
                case true:
                    s = readShort2;
                    z = z3;
                    if (readShort4 != 2) {
                        zl1.m("malformed HTTPS / port");
                        return null;
                    }
                    i2 = mzVar.readShort() & 65535;
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
                case true:
                    s = readShort2;
                    z = z3;
                    arrayList = new ArrayList();
                    if (readShort4 % 4 != 0) {
                        zl1.m("malformed HTTPS / ipv4hint");
                        return null;
                    }
                    wr2 a02 = ut0.a0(4L, ut0.d0(readShort4));
                    long j5 = a02.I;
                    long j6 = a02.J;
                    long j7 = a02.K;
                    if ((j7 > 0 && j5 <= j6) || (j7 < 0 && j6 <= j5)) {
                        while (true) {
                            arrayList.add(InetAddress.getByAddress(mzVar.N(4L)));
                            if (j5 != j6) {
                                j5 += j7;
                            }
                        }
                    }
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                case true:
                    z = z3;
                    h00Var = mzVar.i(readShort4);
                    c = readShort3 == true ? 1 : 0;
                    arrayList = arrayList;
                    z2 = z;
                case true:
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (readShort4 % 16 != 0) {
                        zl1.m("malformed HTTPS / ipv6hint");
                        return null;
                    }
                    wr2 a03 = ut0.a0(16L, ut0.d0(readShort4));
                    long j8 = a03.I;
                    long j9 = a03.J;
                    s = readShort2;
                    z = z3;
                    long j10 = a03.K;
                    if ((j10 > 0 && j8 <= j9) || (j10 < 0 && j9 <= j8)) {
                        while (true) {
                            arrayList.add(InetAddress.getByAddress(mzVar.N(16L)));
                            if (j8 != j9) {
                                j8 += j10;
                            }
                        }
                    }
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                default:
                    mzVar.skip(readShort4);
                    s = readShort2;
                    z = z3;
                    c = readShort3 == true ? 1 : 0;
                    readShort2 = s;
                    arrayList = arrayList;
                    z2 = z;
            }
        }
        short s3 = readShort2;
        if (z2) {
            if (arrayList2 == null) {
                zl1.m("malformed HTTPS / no-default-alpn");
                return null;
            }
        } else if (arrayList2 != null) {
            Protocol protocol = Protocol.HTTP_1_1;
            if (!arrayList2.contains(protocol.toString())) {
                arrayList2.add(protocol.toString());
            }
        }
        int i3 = s3 & 65535;
        List list = arrayList;
        if (arrayList == null) {
            list = o91.I;
        }
        return new ResourceRecord.Https(str, i, i3, readName, arrayList2, i2, list, h00Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        defpackage.zl1.m("unsupported label type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readName(defpackage.mz r7, defpackage.cz r8, int r9) {
        /*
            r6 = this;
        L0:
            byte r0 = r7.readByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            r0 = r0 & 63
            if (r1 == 0) goto L3c
            r2 = 64
            if (r1 == r2) goto L36
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L36
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 == r2) goto L17
            goto L0
        L17:
            int r0 = r0 << 8
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r0
            if (r7 >= r9) goto L30
            mz r9 = r6.sourceOffsetZero
            s04 r9 = r9.peek()
            long r0 = (long) r7
            r9.skip(r0)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L0
        L30:
            java.lang.String r6 = "malformed DNS message"
            defpackage.zl1.m(r6)
            return
        L36:
            java.lang.String r6 = "unsupported label type"
            defpackage.zl1.m(r6)
            return
        L3c:
            if (r0 != 0) goto L3f
            return
        L3f:
            long r1 = r8.J
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4c
            r1 = 46
            r8.d0(r1)
        L4c:
            long r0 = (long) r0
            r8.b0(r7, r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.DnsMessageReader.readName(mz, cz, int):void");
    }

    public static /* synthetic */ void readName$default(DnsMessageReader dnsMessageReader, mz mzVar, cz czVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Log.LOG_LEVEL_OFF;
        }
        dnsMessageReader.readName(mzVar, czVar, i);
    }

    private final Question readQuestion(mz mzVar) {
        return new Question(readName(mzVar), mzVar.readShort(), mzVar.readShort());
    }

    public final DnsMessage read() {
        mz mzVar;
        short readShort = this.source.readShort();
        short readShort2 = this.source.readShort();
        int readShort3 = this.source.readShort() & 65535;
        int readShort4 = this.source.readShort() & 65535;
        int readShort5 = this.source.readShort() & 65535;
        int readShort6 = 65535 & this.source.readShort();
        ArrayList arrayList = new ArrayList(readShort3);
        int i = 0;
        for (int i2 = 0; i2 < readShort3; i2++) {
            arrayList.add(readQuestion(this.source));
        }
        ArrayList arrayList2 = new ArrayList(readShort4);
        for (int i3 = 0; i3 < readShort4; i3++) {
            ResourceRecord readResourceRecord = readResourceRecord(this.source);
            if (readResourceRecord != null) {
                arrayList2.add(readResourceRecord);
            }
        }
        ArrayList arrayList3 = new ArrayList(readShort5);
        for (int i4 = 0; i4 < readShort5; i4++) {
            ResourceRecord readResourceRecord2 = readResourceRecord(this.source);
            if (readResourceRecord2 != null) {
                arrayList3.add(readResourceRecord2);
            }
        }
        ArrayList arrayList4 = new ArrayList(readShort6);
        while (true) {
            mzVar = this.source;
            if (i >= readShort6) {
                break;
            }
            ResourceRecord readResourceRecord3 = readResourceRecord(mzVar);
            if (readResourceRecord3 != null) {
                arrayList4.add(readResourceRecord3);
            }
            i++;
        }
        if (mzVar.p()) {
            _UtilJvmKt.skipAll(this.sourceOffsetZero);
            return new DnsMessage(readShort, readShort2, arrayList, arrayList2, arrayList3, arrayList4);
        }
        zl1.m("unexpected trailing data in message");
        return null;
    }

    public final ResourceRecord readResourceRecord(mz mzVar) {
        mzVar.getClass();
        String readName = readName(mzVar);
        short readShort = mzVar.readShort();
        short readShort2 = mzVar.readShort();
        int readInt = mzVar.readInt();
        long readShort3 = mzVar.readShort() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        if (readShort2 == 1 && readShort == 1) {
            if (readShort3 != 4) {
                zl1.m("unexpected record length");
                return null;
            }
            InetAddress byAddress = InetAddress.getByAddress(mzVar.N(4L));
            byAddress.getClass();
            return new ResourceRecord.IpAddress(readName, readInt, byAddress);
        }
        if (readShort2 != 1 || readShort != 28) {
            if (readShort2 == 1 && readShort == 65) {
                return readHttpsResourceRecord(new s04(new gj2(mzVar, readShort3, false)), readName, readInt);
            }
            mzVar.skip(readShort3);
            return null;
        }
        if (readShort3 != 16) {
            zl1.m("unexpected record length");
            return null;
        }
        InetAddress byAddress2 = InetAddress.getByAddress(mzVar.N(16L));
        byAddress2.getClass();
        return new ResourceRecord.IpAddress(readName, readInt, byAddress2);
    }

    private final String readName(mz mzVar) {
        cz czVar = new cz();
        readName$default(this, mzVar, czVar, 0, 2, null);
        return czVar.Q();
    }
}

package okhttp3.internal.dns;

import defpackage.cz;
import defpackage.h00;
import defpackage.j42;
import defpackage.jp;
import defpackage.kb4;
import defpackage.s83;
import defpackage.zy;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Protocol;
import okhttp3.internal.dns.ResourceRecord;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DnsMessageWriter {
    private final Map<h00, Long> labelToOffset;
    private final long messageStart;
    private final cz sink;

    public DnsMessageWriter(cz czVar) {
        czVar.getClass();
        this.sink = czVar;
        this.labelToOffset = new LinkedHashMap();
        this.messageStart = czVar.J;
    }

    private final void writeHttps(ResourceRecord.Https https) {
        cz czVar = this.sink;
        h00 h00Var = h00.L;
        writeName$default(this, czVar, jp.h(https.getName()), 0L, 2, null);
        this.sink.h0(65);
        this.sink.h0(1);
        this.sink.g0(https.getTimeToLive());
        cz czVar2 = new cz();
        czVar2.h0(https.getPriority());
        writeName(czVar2, jp.h(https.getTargetName()), this.sink.J + 2);
        if (https.getAlpnIds() != null) {
            czVar2.h0(1);
            List<String> alpnIds = https.getAlpnIds();
            ArrayList arrayList = new ArrayList();
            for (Object obj : alpnIds) {
                if (!j42.c((String) obj, Protocol.HTTP_1_1.toString())) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j += kb4.g0((String) obj2) + 1;
            }
            czVar2.h0((int) j);
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList.get(i2);
                i2++;
                String str = (String) obj3;
                czVar2.d0((int) kb4.g0(str));
                czVar2.k0(str);
            }
            if (!https.getAlpnIds().contains(Protocol.HTTP_1_1.toString())) {
                czVar2.h0(2);
                czVar2.h0(0);
            }
        }
        if (https.getPort() != 443) {
            czVar2.h0(3);
            czVar2.h0(2);
            czVar2.h0(https.getPort());
        }
        List<InetAddress> ipAddressHints = https.getIpAddressHints();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : ipAddressHints) {
            if (obj4 instanceof Inet4Address) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            czVar2.h0(4);
            czVar2.h0(arrayList2.size() * 4);
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj5 = arrayList2.get(i3);
                i3++;
                byte[] address = ((Inet4Address) obj5).getAddress();
                address.getClass();
                czVar2.m196write(address, 0, address.length);
            }
        }
        if (https.getEchConfigList() != null) {
            czVar2.h0(5);
            czVar2.h0(https.getEchConfigList().d());
            czVar2.c0(https.getEchConfigList());
        }
        List<InetAddress> ipAddressHints2 = https.getIpAddressHints();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : ipAddressHints2) {
            if (obj6 instanceof Inet6Address) {
                arrayList3.add(obj6);
            }
        }
        if (!arrayList3.isEmpty()) {
            czVar2.h0(6);
            czVar2.h0(arrayList3.size() * 16);
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj7 = arrayList3.get(i4);
                i4++;
                byte[] address2 = ((Inet6Address) obj7).getAddress();
                address2.getClass();
                czVar2.m196write(address2, 0, address2.length);
            }
        }
        long j2 = czVar2.J;
        if (j2 >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            zy.i("record too long");
        } else {
            this.sink.h0((int) j2);
            this.sink.q(czVar2);
        }
    }

    private final void writeIpAddress(ResourceRecord.IpAddress ipAddress) {
        int i;
        byte[] address = ipAddress.getAddress().getAddress();
        cz czVar = this.sink;
        h00 h00Var = h00.L;
        writeName$default(this, czVar, jp.h(ipAddress.getName()), 0L, 2, null);
        cz czVar2 = this.sink;
        int length = address.length;
        if (length == 4) {
            i = 1;
        } else {
            if (length != 16) {
                zy.i("unexpected address");
                return;
            }
            i = 28;
        }
        czVar2.h0(i);
        this.sink.h0(1);
        this.sink.g0(ipAddress.getTimeToLive());
        this.sink.h0(address.length);
        cz czVar3 = this.sink;
        czVar3.getClass();
        czVar3.m196write(address, 0, address.length);
    }

    private final void writeName(cz czVar, h00 h00Var, long j) {
        h00 h00Var2;
        while (h00Var.d() != 0) {
            Long l = this.labelToOffset.get(h00Var);
            if (l != null) {
                czVar.h0(((int) l.longValue()) | 49152);
                return;
            }
            this.labelToOffset.put(h00Var, Long.valueOf((czVar.J + j) - this.messageStart));
            h00Var2 = _DnsMessageWriterKt.LABEL_SEPARATOR;
            int g = h00.g(h00Var, h00Var2);
            if (g == -1) {
                if (h00Var.d() >= 64) {
                    zy.i("label too long");
                    return;
                }
                czVar.d0(h00Var.d());
                czVar.c0(h00Var);
                czVar.d0(0);
                return;
            }
            if (g >= 64) {
                zy.i("label too long");
                return;
            } else {
                czVar.d0(g);
                h00Var.t(g, czVar);
                h00Var = h00.p(h00Var, g + 1, 0, 2);
            }
        }
        czVar.d0(0);
    }

    public static /* synthetic */ void writeName$default(DnsMessageWriter dnsMessageWriter, cz czVar, h00 h00Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dnsMessageWriter.writeName(czVar, h00Var, j);
    }

    private final void writeQuestion(Question question) {
        cz czVar = this.sink;
        h00 h00Var = h00.L;
        writeName$default(this, czVar, jp.h(question.getName()), 0L, 2, null);
        this.sink.h0(question.getType());
        this.sink.h0(question.getClass());
    }

    private final void writeResourceRecord(ResourceRecord resourceRecord) {
        if (resourceRecord instanceof ResourceRecord.Https) {
            writeHttps((ResourceRecord.Https) resourceRecord);
        } else if (resourceRecord instanceof ResourceRecord.IpAddress) {
            writeIpAddress((ResourceRecord.IpAddress) resourceRecord);
        } else {
            s83.v();
        }
    }

    public final void write(DnsMessage dnsMessage) {
        dnsMessage.getClass();
        this.sink.h0(dnsMessage.getId());
        this.sink.h0(dnsMessage.getFlags());
        this.sink.h0(dnsMessage.getQuestions().size());
        this.sink.h0(dnsMessage.getAnswers().size());
        this.sink.h0(dnsMessage.getAuthorityRecords().size());
        this.sink.h0(dnsMessage.getAdditionalRecords().size());
        Iterator<Question> it = dnsMessage.getQuestions().iterator();
        while (it.hasNext()) {
            writeQuestion(it.next());
        }
        Iterator<ResourceRecord> it2 = dnsMessage.getAnswers().iterator();
        while (it2.hasNext()) {
            writeResourceRecord(it2.next());
        }
        Iterator<ResourceRecord> it3 = dnsMessage.getAuthorityRecords().iterator();
        while (it3.hasNext()) {
            writeResourceRecord(it3.next());
        }
        Iterator<ResourceRecord> it4 = dnsMessage.getAdditionalRecords().iterator();
        while (it4.hasNext()) {
            writeResourceRecord(it4.next());
        }
    }
}

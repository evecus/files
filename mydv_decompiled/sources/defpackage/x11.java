package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import coil3.network.internal.UtilsKt;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x11 {
    public final ArrayList e;
    public kr0 f;
    public wx3 g;
    public final ArrayList h;
    public nj0 i;
    public final ArrayList j;
    public ByteBuffer k;
    public final int m;
    public int a = 0;
    public final gr2 b = ir2.b(x11.class);
    public kr0 c = new kr0();
    public final kr0 d = new kr0();
    public final SecureRandom l = new SecureRandom();

    public x11(List list, int i, List list2) {
        boolean z = false;
        if (list == null || list2 == null || i < 1) {
            s83.d();
            throw null;
        }
        this.e = new ArrayList(list.size());
        this.h = new ArrayList(list2.size());
        this.j = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((kr0) it.next()).getClass().equals(kr0.class)) {
                z = true;
            }
        }
        this.e.addAll(list);
        if (!z) {
            ArrayList arrayList = this.e;
            arrayList.add(arrayList.size(), this.c);
        }
        this.h.addAll(list2);
        this.m = i;
        this.f = null;
    }

    public static List h(qs1 qs1Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("HTTP/1.1 101 ");
        sb.append(qs1Var.c);
        sb.append("\r\n");
        for (String str : DesugarCollections.unmodifiableSet(((TreeMap) qs1Var.b).keySet())) {
            String k = qs1Var.k(str);
            sb.append(str);
            sb.append(": ");
            sb.append(k);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        String sb2 = sb.toString();
        CodingErrorAction codingErrorAction = y50.a;
        byte[] bytes = sb2.getBytes(StandardCharsets.US_ASCII);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
        allocate.put(bytes);
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public static String m(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b = b2;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = y50.a;
        return new String(array, 0, limit, StandardCharsets.US_ASCII);
    }

    public final int a(qs1 qs1Var) {
        qs1 qs1Var2 = qs1Var;
        if (qs1Var2.k("Upgrade").equalsIgnoreCase("websocket") && qs1Var2.k("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            throw null;
        }
        this.b.j("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
        return 2;
    }

    public final int b(ps1 ps1Var) {
        boolean z;
        boolean z2;
        ps1 ps1Var2 = ps1Var;
        String k = ps1Var2.k("Sec-WebSocket-Version");
        int i = -1;
        if (k.length() > 0) {
            try {
                i = Integer.parseInt(k.trim());
            } catch (NumberFormatException unused) {
            }
        }
        gr2 gr2Var = this.b;
        if (i != 13) {
            gr2Var.j("acceptHandshakeAsServer - Wrong websocket version.");
            return 2;
        }
        ps1Var2.k("Sec-WebSocket-Extensions");
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            kr0 kr0Var = (kr0) it.next();
            kr0Var.getClass();
            this.c = kr0Var;
            gr2Var.e(kr0Var, "acceptHandshakeAsServer - Matching extension found: {}");
            z = true;
        } else {
            z = 2;
        }
        ps1Var2.k("Sec-WebSocket-Protocol");
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            wx3 wx3Var = (wx3) arrayList.get(0);
            wx3Var.getClass();
            this.g = wx3Var;
            gr2Var.e(wx3Var, "acceptHandshake - Matching protocol found: {}");
            z2 = true;
        } else {
            z2 = 2;
        }
        if (z2 && z) {
            return 1;
        }
        gr2Var.j("acceptHandshakeAsServer - No matching extension or protocol found.");
        return 2;
    }

    public final void c(ByteBuffer byteBuffer) {
        synchronized (this.j) {
            this.j.add(byteBuffer);
        }
    }

    public final void d() {
        long j;
        synchronized (this.j) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                j = 0;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    j += ((ByteBuffer) obj).limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j <= this.m) {
            return;
        }
        e();
        this.b.i("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.m), Long.valueOf(j));
        throw new ej2(this.m);
    }

    public final void e() {
        synchronized (this.j) {
            this.j.clear();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x11.class != obj.getClass()) {
            return false;
        }
        x11 x11Var = (x11) obj;
        if (this.m != x11Var.m) {
            return false;
        }
        kr0 kr0Var = this.c;
        kr0 kr0Var2 = x11Var.c;
        if (kr0Var != null) {
            if (!kr0Var.equals(kr0Var2)) {
                return false;
            }
        } else if (kr0Var2 != null) {
            return false;
        }
        wx3 wx3Var = this.g;
        wx3 wx3Var2 = x11Var.g;
        return wx3Var != null ? wx3Var.equals(wx3Var2) : wx3Var2 == null;
    }

    public final x11 f() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((kr0) obj).getClass();
            arrayList.add(new kr0());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.h;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            ((wx3) obj2).getClass();
            arrayList3.add(new wx3());
        }
        return new x11(arrayList, this.m, arrayList3);
    }

    public final List g(String str, boolean z) {
        aw awVar = new aw((byte) 2, 2);
        CodingErrorAction codingErrorAction = y50.a;
        awVar.c = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        awVar.d = z;
        try {
            awVar.b();
            return Collections.singletonList(awVar);
        } catch (r42 e) {
            throw new vb0(e);
        }
    }

    public final int hashCode() {
        int hashCode = this.c != null ? kr0.class.hashCode() : 0;
        int i = this.m;
        return (hashCode * 961) + (i ^ (i >>> 32));
    }

    public final ByteBuffer i() {
        ByteBuffer allocate;
        synchronized (this.j) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                int i = 0;
                long j = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    j += ((ByteBuffer) obj).limit();
                }
                d();
                allocate = ByteBuffer.allocate((int) j);
                ArrayList arrayList2 = this.j;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    allocate.put((ByteBuffer) obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        allocate.flip();
        return allocate;
    }

    public final void j(dt5 dt5Var, RuntimeException runtimeException) {
        this.b.d("Runtime exception during onWebsocketMessage", runtimeException);
        dt5Var.d.n(dt5Var, runtimeException);
    }

    public final qs1 k(ps1 ps1Var, qs1 qs1Var) {
        String str;
        qs1Var.n("Upgrade", "websocket");
        ps1 ps1Var2 = ps1Var;
        qs1Var.n("Connection", ps1Var2.k("Connection"));
        String k = ps1Var2.k("Sec-WebSocket-Key");
        if ("".equals(k)) {
            throw new t42("missing Sec-WebSocket-Key");
        }
        String B = r7.B(k.trim(), WebSocketProtocol.ACCEPT_MAGIC);
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(B.getBytes());
            try {
                str = eu5.A(digest.length, digest);
            } catch (IOException unused) {
                str = null;
            }
            qs1Var.n("Sec-WebSocket-Accept", str);
            this.c.getClass();
            qs1Var.c = "Web Socket Protocol Handshake";
            qs1Var.n("Server", "TooTallNate Java-WebSocket");
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            qs1Var.n("Date", simpleDateFormat.format(calendar.getTime()));
            return qs1Var;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void l(dt5 dt5Var, nj0 nj0Var) {
        int i;
        String str;
        int i2 = nj0Var.b;
        if (i2 == 6) {
            if (nj0Var instanceof x60) {
                x60 x60Var = (x60) nj0Var;
                i = x60Var.i;
                str = x60Var.j;
            } else {
                i = 1005;
                str = "";
            }
            if (dt5Var.i == 3) {
                dt5Var.b(i, str, true);
                return;
            } else {
                dt5Var.a(i, str, true);
                return;
            }
        }
        if (i2 == 4) {
            gq3 gq3Var = new gq3((byte) 0, 5);
            gq3Var.c = ((xm3) nj0Var).c;
            dt5Var.j(Collections.singletonList(gq3Var));
            return;
        }
        if (i2 == 5) {
            dt5Var.q = System.nanoTime();
            return;
        }
        boolean z = nj0Var.a;
        if (z && i2 != 1) {
            if (this.i != null) {
                this.b.error("Protocol error: Continuous frame sequence not completed.");
                throw new r42(1002, "Continuous frame sequence not completed.");
            }
            if (i2 == 2) {
                try {
                    dt5Var.d.o(dt5Var, y50.b(nj0Var.a()));
                    return;
                } catch (RuntimeException e) {
                    j(dt5Var, e);
                    return;
                }
            }
            if (i2 != 3) {
                this.b.error("non control or continious frame expected");
                throw new r42(1002, "non control or continious frame expected");
            }
            try {
                nj0Var.a();
                return;
            } catch (RuntimeException e2) {
                j(dt5Var, e2);
                return;
            }
        }
        gr2 gr2Var = this.b;
        nj0 nj0Var2 = this.i;
        if (i2 != 1) {
            if (nj0Var2 != null) {
                gr2Var.j("Protocol error: Previous continuous frame sequence not completed.");
                throw new r42(1002, "Previous continuous frame sequence not completed.");
            }
            this.i = nj0Var;
            c(nj0Var.a());
            d();
        } else if (z) {
            if (nj0Var2 == null) {
                gr2Var.j("Protocol error: Previous continuous frame sequence not completed.");
                throw new r42(1002, "Continuous frame sequence was not started.");
            }
            c(nj0Var.a());
            d();
            nj0 nj0Var3 = this.i;
            int i3 = nj0Var3.b;
            if (i3 == 2) {
                nj0Var3.d(i());
                this.i.b();
                try {
                    dt5Var.d.o(dt5Var, y50.b(this.i.a()));
                } catch (RuntimeException e3) {
                    j(dt5Var, e3);
                }
            } else if (i3 == 3) {
                nj0Var3.d(i());
                this.i.b();
                try {
                    this.i.a();
                } catch (RuntimeException e4) {
                    j(dt5Var, e4);
                }
            }
            this.i = null;
            e();
        } else if (nj0Var2 == null) {
            gr2Var.error("Protocol error: Continuous frame sequence was not started.");
            throw new r42(1002, "Continuous frame sequence was not started.");
        }
        if (i2 == 2 && !y50.a(nj0Var.a())) {
            gr2Var.error("Protocol error: Payload is not UTF8");
            throw new r42(AnalyticsListener.EVENT_AUDIO_ENABLED);
        }
        if (i2 != 1 || this.i == null) {
            return;
        }
        c(nj0Var.a());
    }

    public final String n() {
        return getClass().getSimpleName();
    }

    public final List o(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.k == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.k.remaining();
                ByteBuffer byteBuffer2 = this.k;
                if (remaining2 > remaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.EMPTY_LIST;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(q((ByteBuffer) this.k.duplicate().position(0)));
                this.k = null;
            } catch (xy1 e) {
                int i = e.I;
                if (i < 0) {
                    throw new r42(1002, "Negative count");
                }
                ByteBuffer allocate = ByteBuffer.allocate(i);
                this.k.rewind();
                allocate.put(this.k);
                this.k = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(q(byteBuffer));
            } catch (xy1 e2) {
                byteBuffer.reset();
                int i2 = e2.I;
                if (i2 < 0) {
                    throw new r42(1002, "Negative count");
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                this.k = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d1 p(ByteBuffer byteBuffer) {
        ps1 ps1Var;
        int i = this.a;
        String m = m(byteBuffer);
        if (m == null) {
            throw new yy1(byteBuffer.capacity() + 128);
        }
        String[] split = m.split(" ", 3);
        if (split.length != 3) {
            throw new t42(1002);
        }
        if (i == 1) {
            if (!"101".equals(split[1])) {
                throw new t42("Invalid status code received: " + split[1] + " Status line: " + m);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[0])) {
                throw new t42("Invalid status line received: " + split[0] + " Status line: " + m);
            }
            qs1 qs1Var = new qs1((byte) 2);
            Short.parseShort(split[1]);
            qs1Var.c = split[2];
            ps1Var = qs1Var;
        } else {
            if (!UtilsKt.HTTP_METHOD_GET.equalsIgnoreCase(split[0])) {
                throw new t42("Invalid request method received: " + split[0] + " Status line: " + m);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[2])) {
                throw new t42("Invalid status line received: " + split[2] + " Status line: " + m);
            }
            ps1 ps1Var2 = new ps1((byte) 2);
            ps1Var2.c = "*";
            String str = split[1];
            if (str == null) {
                s83.t("http resource descriptor must not be null");
                return null;
            }
            ps1Var2.c = str;
            ps1Var = ps1Var2;
        }
        String m2 = m(byteBuffer);
        while (m2 != null && m2.length() > 0) {
            String[] split2 = m2.split(":", 2);
            if (split2.length != 2) {
                throw new t42("not an http header");
            }
            if (((TreeMap) ps1Var.b).containsKey(split2[0])) {
                String str2 = split2[0];
                ps1Var.n(str2, ps1Var.k(str2) + "; " + split2[1].replaceFirst("^ +", ""));
            } else {
                ps1Var.n(split2[0], split2[1].replaceFirst("^ +", ""));
            }
            m2 = m(byteBuffer);
        }
        if (m2 != null) {
            return ps1Var;
        }
        throw new yy1();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nj0 q(java.nio.ByteBuffer r22) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x11.q(java.nio.ByteBuffer):nj0");
    }

    public final void r(long j) {
        gr2 gr2Var = this.b;
        if (j > 2147483647L) {
            gr2Var.j("Limit exedeed: Payloadsize is to big...");
            throw new ej2("Payloadsize is to big...");
        }
        int i = this.m;
        if (j > i) {
            gr2Var.i("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new ej2("Payload limit reached.", i);
        }
        if (j >= 0) {
            return;
        }
        gr2Var.j("Limit underflow: Payloadsize is to little...");
        throw new ej2("Payloadsize is to little...");
    }

    public final void s(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.b.j("Incomplete frame: maxpacketsize < realpacketsize");
        throw new xy1(i2);
    }

    public final String toString() {
        String n = n();
        if (this.c != null) {
            StringBuilder sb = new StringBuilder(n);
            sb.append(" extension: ");
            this.c.getClass();
            sb.append(kr0.class.getSimpleName());
            n = sb.toString();
        }
        if (this.g != null) {
            this.g.getClass();
            n = n.concat(" protocol: ");
        }
        return n + " max frame size: " + this.m;
    }
}

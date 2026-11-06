package defpackage;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dt5 {
    public final LinkedBlockingQueue b;
    public final LinkedBlockingQueue c;
    public final wc4 d;
    public SelectionKey e;
    public SocketChannel f;
    public ft5 g;
    public final List j;
    public final int l;
    public final gr2 a = ir2.b(dt5.class);
    public boolean h = false;
    public volatile int i = 1;
    public x11 k = null;
    public ByteBuffer m = ByteBuffer.allocate(0);
    public String n = null;
    public Integer o = null;
    public Boolean p = null;
    public long q = System.nanoTime();
    public final Object r = new Object();

    public dt5(wc4 wc4Var, List list) {
        if (this.l == 2) {
            s83.t("parameters must not be null");
            throw null;
        }
        this.b = new LinkedBlockingQueue();
        this.c = new LinkedBlockingQueue();
        this.d = wc4Var;
        this.l = 2;
        if (list != null && !list.isEmpty()) {
            this.j = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        arrayList.add(new x11(Collections.EMPTY_LIST, Log.LOG_LEVEL_OFF, Collections.singletonList(new wx3())));
    }

    public static ByteBuffer h(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        StringBuilder E = r7.E("HTTP/1.1 ", str, "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: ");
        E.append(str.length() + 48);
        E.append("\r\n\r\n<html><head></head><body><h1>");
        E.append(str);
        E.append("</h1></body></html>");
        String sb = E.toString();
        CodingErrorAction codingErrorAction = y50.a;
        return ByteBuffer.wrap(sb.getBytes(StandardCharsets.US_ASCII));
    }

    public final synchronized void a(int i, String str, boolean z) {
        if (this.i == 3 || this.i == 4) {
            return;
        }
        boolean z2 = true;
        if (this.i == 2) {
            if (i == 1006) {
                this.i = 3;
                g(i, str, false);
                return;
            }
            this.k.getClass();
            try {
                if (this.i != 2) {
                    z2 = false;
                }
                if (z2) {
                    x60 x60Var = new x60();
                    x60Var.j = str == null ? "" : str;
                    x60Var.e();
                    x60Var.i = i;
                    if (i == 1015) {
                        x60Var.i = 1005;
                        x60Var.j = "";
                    }
                    x60Var.e();
                    x60Var.b();
                    j(Collections.singletonList(x60Var));
                }
            } catch (r42 e) {
                this.a.d("generated frame is invalid", e);
                this.d.n(this, e);
                g(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "generated frame is invalid", false);
            }
            g(i, str, z);
        } else if (i == -3) {
            g(-3, str, true);
        } else if (i == 1002) {
            g(i, str, z);
        } else {
            g(-1, str, false);
        }
        this.i = 3;
        this.m = null;
    }

    public final synchronized void b(int i, String str, boolean z) {
        try {
            if (this.i == 4) {
                return;
            }
            if (this.i == 2 && i == 1006) {
                this.i = 3;
            }
            SelectionKey selectionKey = this.e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            SocketChannel socketChannel = this.f;
            if (socketChannel != null) {
                try {
                    socketChannel.close();
                } catch (IOException e) {
                    if (e.getMessage() == null || !e.getMessage().equals("Broken pipe")) {
                        this.a.d("Exception during channel.close()", e);
                        this.d.n(this, e);
                    } else {
                        this.a.m("Caught IOException: Broken pipe during closeConnection()", e);
                    }
                }
            }
            try {
                wc4 wc4Var = this.d;
                wc4Var.T.wakeup();
                if (wc4Var.r(this)) {
                    wc4Var.m(this, str);
                }
            } catch (RuntimeException e2) {
                this.d.n(this, e2);
            }
            x11 x11Var = this.k;
            if (x11Var != null) {
                x11Var.k = null;
                x11Var.c = new kr0();
                x11Var.g = null;
            }
            this.i = 4;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(r42 r42Var) {
        k(h(404));
        g(r42Var.I, r42Var.getMessage(), false);
    }

    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        d1 p;
        if (this.a.h()) {
            this.a.i("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        }
        if (this.i != 1) {
            if (this.i == 2) {
                e(byteBuffer);
                return;
            }
            return;
        }
        int i = this.l;
        wc4 wc4Var = this.d;
        gr2 gr2Var = this.a;
        if (this.m.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.m.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.m.capacity());
                this.m.flip();
                allocate.put(this.m);
                this.m = allocate;
            }
            this.m.put(byteBuffer);
            this.m.flip();
            byteBuffer2 = this.m;
        }
        byteBuffer2.mark();
        try {
            try {
                if (i != 2) {
                    if (i == 1) {
                        x11 x11Var = this.k;
                        x11Var.a = i;
                        d1 p2 = x11Var.p(byteBuffer2);
                        if (!(p2 instanceof qs1)) {
                            gr2Var.j("Closing due to protocol error: wrong http function");
                            g(1002, "wrong http function", false);
                            return;
                        }
                        this.k.a((qs1) p2);
                        gr2Var.e(this.k, "Closing due to protocol error: draft {} refuses handshake");
                        a(1002, "draft " + this.k + " refuses handshake", false);
                        return;
                    }
                    return;
                }
                x11 x11Var2 = this.k;
                if (x11Var2 == null) {
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        x11 f = ((x11) it.next()).f();
                        try {
                            f.a = i;
                            byteBuffer2.reset();
                            p = f.p(byteBuffer2);
                        } catch (t42 unused) {
                        }
                        if (!(p instanceof ps1)) {
                            gr2Var.j("Closing due to wrong handshake");
                            c(new r42(1002, "wrong http function"));
                            return;
                        }
                        ps1 ps1Var = (ps1) p;
                        if (f.b(ps1Var) == 1) {
                            try {
                                qs1 qs1Var = new qs1((byte) 2);
                                f.k(ps1Var, qs1Var);
                                l(x11.h(qs1Var));
                                this.k = f;
                                i(ps1Var);
                            } catch (RuntimeException e) {
                                gr2Var.d("Closing due to internal server error", e);
                                wc4Var.n(this, e);
                                k(h(500));
                                g(-1, e.getMessage(), false);
                                return;
                            } catch (r42 e2) {
                                gr2Var.m("Closing due to wrong handshake. Possible handshake rejection", e2);
                                c(e2);
                                return;
                            }
                        }
                    }
                    if (this.k == null) {
                        gr2Var.j("Closing due to protocol error: no draft matches");
                        c(new r42(1002, "no draft matches"));
                        return;
                    }
                    return;
                }
                d1 p3 = x11Var2.p(byteBuffer2);
                if (!(p3 instanceof ps1)) {
                    gr2Var.j("Closing due to protocol error: wrong http function");
                    g(1002, "wrong http function", false);
                    return;
                }
                ps1 ps1Var2 = (ps1) p3;
                if (this.k.b(ps1Var2) != 1) {
                    gr2Var.j("Closing due to protocol error: the handshake did finally not match");
                    a(1002, "the handshake did finally not match", false);
                    return;
                }
                i(ps1Var2);
                if (this.i == 3 || this.i == 4) {
                    return;
                }
                if (byteBuffer.hasRemaining()) {
                    e(byteBuffer);
                } else if (this.m.hasRemaining()) {
                    e(this.m);
                }
            } catch (t42 e3) {
                gr2Var.m("Closing due to invalid handshake", e3);
                a(e3.I, e3.getMessage(), false);
            }
        } catch (yy1 e4) {
            if (this.m.capacity() != 0) {
                ByteBuffer byteBuffer3 = this.m;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.m;
                byteBuffer4.limit(byteBuffer4.capacity());
                return;
            }
            byteBuffer2.reset();
            int i2 = e4.I;
            if (i2 == 0) {
                i2 = byteBuffer2.capacity() + 16;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
            this.m = allocate2;
            allocate2.put(byteBuffer);
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        wc4 wc4Var = this.d;
        gr2 gr2Var = this.a;
        try {
            for (nj0 nj0Var : this.k.o(byteBuffer)) {
                gr2Var.e(nj0Var, "matched frame: {}");
                this.k.l(this, nj0Var);
            }
        } catch (ej2 e) {
            if (e.J == Integer.MAX_VALUE) {
                gr2Var.d("Closing due to invalid size of frame", e);
                wc4Var.n(this, e);
            }
            a(e.I, e.getMessage(), false);
        } catch (LinkageError e2) {
            e = e2;
            gr2Var.error("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e3) {
            e = e3;
            gr2Var.error("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e4) {
            e = e4;
            gr2Var.error("Got fatal error during frame processing");
            throw e;
        } catch (Error e5) {
            gr2Var.error("Closing web socket due to an error during frame processing");
            wc4Var.n(this, new Exception(e5));
            a(AnalyticsListener.EVENT_AUDIO_UNDERRUN, "Got error ".concat(e5.getClass().getName()), false);
        } catch (r42 e6) {
            gr2Var.d("Closing due to invalid data in frame", e6);
            wc4Var.n(this, e6);
            a(e6.I, e6.getMessage(), false);
        }
    }

    public final void f() {
        if (this.i == 1) {
            b(-1, "", true);
        } else {
            if (this.h) {
                b(this.o.intValue(), this.n, this.p.booleanValue());
                return;
            }
            this.k.getClass();
            this.k.getClass();
            b(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "", true);
        }
    }

    public final synchronized void g(int i, String str, boolean z) {
        if (this.h) {
            return;
        }
        this.o = Integer.valueOf(i);
        this.n = str;
        this.p = Boolean.valueOf(z);
        this.h = true;
        wc4 wc4Var = this.d;
        try {
            this.e.interestOps(5);
        } catch (CancelledKeyException unused) {
            this.b.clear();
        }
        wc4Var.T.wakeup();
        x11 x11Var = this.k;
        if (x11Var != null) {
            x11Var.k = null;
            x11Var.c = new kr0();
            x11Var.g = null;
        }
    }

    public final void i(rs1 rs1Var) {
        this.a.e(this.k, "open using draft: {}");
        this.i = 2;
        this.q = System.nanoTime();
        try {
            this.d.p(this, rs1Var);
        } catch (RuntimeException e) {
            this.d.n(this, e);
        }
    }

    public final void j(Collection collection) {
        String str;
        byte b;
        if (this.i != 2) {
            throw new gt5();
        }
        if (collection == null) {
            s83.d();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nj0 nj0Var = (nj0) it.next();
            this.a.e(nj0Var, "send frame: {}");
            x11 x11Var = this.k;
            x11Var.c.getClass();
            gr2 gr2Var = x11Var.b;
            if (gr2Var.h()) {
                gr2Var.i("afterEnconding({}): {}", Integer.valueOf(nj0Var.a().remaining()), nj0Var.a().remaining() > 1000 ? "too big to display" : new String(nj0Var.a().array()));
            }
            ByteBuffer a = nj0Var.a();
            boolean z = x11Var.a == 1;
            int i = a.remaining() <= 125 ? 1 : a.remaining() <= 65535 ? 2 : 8;
            int i2 = 4;
            ByteBuffer allocate = ByteBuffer.allocate(a.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
            int i3 = nj0Var.b;
            if (i3 == 1) {
                b = 0;
            } else if (i3 == 2) {
                b = 1;
            } else if (i3 == 3) {
                b = 2;
            } else if (i3 == 6) {
                b = 8;
            } else if (i3 == 4) {
                b = 9;
            } else {
                if (i3 != 5) {
                    switch (i3) {
                        case 1:
                            str = "CONTINUOUS";
                            break;
                        case 2:
                            str = "TEXT";
                            break;
                        case 3:
                            str = "BINARY";
                            break;
                        case 4:
                            str = "PING";
                            break;
                        case 5:
                            str = "PONG";
                            break;
                        case 6:
                            str = "CLOSING";
                            break;
                        default:
                            throw null;
                    }
                    s83.t("Don't know how to handle ".concat(str));
                    return;
                }
                b = 10;
            }
            byte b2 = (byte) (b | ((byte) (nj0Var.a ? -128 : 0)));
            if (nj0Var.e) {
                b2 = (byte) (b2 | 64);
            }
            if (nj0Var.f) {
                b2 = (byte) (b2 | 32);
            }
            if (nj0Var.g) {
                b2 = (byte) (b2 | 16);
            }
            allocate.put(b2);
            long remaining = a.remaining();
            byte[] bArr = new byte[i];
            int i4 = (i * 8) - 8;
            int i5 = 0;
            while (i5 < i) {
                bArr[i5] = (byte) (r20 >>> (i4 - (i5 * 8)));
                i5++;
                i2 = i2;
                remaining = remaining;
            }
            int i6 = i2;
            if (i == 1) {
                allocate.put((byte) (bArr[0] | (z ? Byte.MIN_VALUE : (byte) 0)));
            } else if (i == 2) {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | 126));
                allocate.put(bArr);
            } else if (i != 8) {
                zy.i("Size representation not supported/specified");
                return;
            } else {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | Byte.MAX_VALUE));
                allocate.put(bArr);
            }
            if (z) {
                ByteBuffer allocate2 = ByteBuffer.allocate(i6);
                allocate2.putInt(x11Var.l.nextInt());
                allocate.put(allocate2.array());
                int i7 = 0;
                while (a.hasRemaining()) {
                    allocate.put((byte) (a.get() ^ allocate2.get(i7 % 4)));
                    i7++;
                }
            } else {
                allocate.put(a);
                a.flip();
            }
            allocate.flip();
            arrayList.add(allocate);
        }
        l(arrayList);
    }

    public final void k(ByteBuffer byteBuffer) {
        this.a.i("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        LinkedBlockingQueue linkedBlockingQueue = this.b;
        linkedBlockingQueue.add(byteBuffer);
        try {
            this.e.interestOps(5);
        } catch (CancelledKeyException unused) {
            linkedBlockingQueue.clear();
        }
        this.d.T.wakeup();
    }

    public final void l(List list) {
        synchronized (this.r) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    k((ByteBuffer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

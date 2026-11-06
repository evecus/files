package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wc4 extends u4 implements Runnable {
    public static final int f0 = Runtime.getRuntime().availableProcessors();
    public final gr2 P;
    public final HashSet Q;
    public final InetSocketAddress R;
    public ServerSocketChannel S;
    public Selector T;
    public final List U;
    public Thread V;
    public final AtomicBoolean W;
    public final ArrayList X;
    public final LinkedList Y;
    public final LinkedBlockingQueue Z;
    public int a0;
    public final AtomicInteger b0;
    public final n84 c0;
    public final int d0;
    public final zc4 e0;

    public wc4(zc4 zc4Var) {
        zc4Var.getClass();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(9980);
        HashSet hashSet = new HashSet();
        this.P = ir2.b(wc4.class);
        this.W = new AtomicBoolean(false);
        this.a0 = 0;
        this.b0 = new AtomicInteger(0);
        this.c0 = new n84((byte) 29);
        this.d0 = -1;
        int i = f0;
        if (i < 1) {
            s83.t("address and connectionscontainer must not be null and you need at least 1 decoder");
            throw null;
        }
        this.U = Collections.EMPTY_LIST;
        this.R = inetSocketAddress;
        this.Q = hashSet;
        this.K = false;
        this.Y = new LinkedList();
        this.X = new ArrayList(i);
        this.Z = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            this.X.add(new ft5(this));
        }
        this.e0 = zc4Var;
    }

    public static void i(SelectionKey selectionKey) {
        dt5 dt5Var = (dt5) selectionKey.attachment();
        try {
            if (fb4.g(dt5Var, dt5Var.f) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            throw new kz5(dt5Var, e);
        }
    }

    public final void d(String str) {
        ArrayList arrayList;
        List g;
        HashSet hashSet = this.Q;
        if (hashSet == null) {
            s83.d();
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (hashSet) {
            arrayList = new ArrayList(hashSet);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dt5 dt5Var = (dt5) obj;
            if (dt5Var != null) {
                x11 x11Var = dt5Var.k;
                if (!hashMap.containsKey(x11Var) && (g = x11Var.g(str, false)) != null) {
                    hashMap.put(x11Var, g);
                }
                try {
                    dt5Var.j((Collection) hashMap.get(x11Var));
                } catch (gt5 unused) {
                }
            }
        }
    }

    public final void e(Iterator it) {
        SocketChannel accept = this.S.accept();
        if (accept == null) {
            return;
        }
        accept.configureBlocking(false);
        Socket socket = accept.socket();
        socket.setTcpNoDelay(false);
        socket.setKeepAlive(true);
        this.c0.getClass();
        dt5 dt5Var = new dt5(this, this.U);
        dt5Var.e = accept.register(this.T, 1, dt5Var);
        try {
            dt5Var.f = accept;
            it.remove();
            AtomicInteger atomicInteger = this.b0;
            if (atomicInteger.get() >= (this.X.size() * 2) + 1) {
                return;
            }
            atomicInteger.incrementAndGet();
            this.Z.put(ByteBuffer.allocate(65536));
        } catch (IOException e) {
            SelectionKey selectionKey = dt5Var.e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            l(dt5Var.e, null, e);
        }
    }

    public final void f() {
        LinkedList linkedList = this.Y;
        if (linkedList.isEmpty()) {
            return;
        }
        if (((dt5) linkedList.remove(0)).f != null) {
            zl1.c();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.Z.take();
        try {
            byteBuffer.clear();
            throw null;
        } catch (IOException e) {
            q(byteBuffer);
            throw e;
        }
    }

    public final boolean g(SelectionKey selectionKey, Iterator it) {
        dt5 dt5Var = (dt5) selectionKey.attachment();
        ByteBuffer byteBuffer = (ByteBuffer) this.Z.take();
        SocketChannel socketChannel = dt5Var.f;
        if (socketChannel == null) {
            selectionKey.cancel();
            l(selectionKey, dt5Var, new IOException());
            return false;
        }
        try {
            byteBuffer.clear();
            int read = socketChannel.read(byteBuffer);
            byteBuffer.flip();
            if (read == -1) {
                dt5Var.f();
            } else if (read != 0) {
                if (!byteBuffer.hasRemaining()) {
                    q(byteBuffer);
                    return true;
                }
                dt5Var.c.put(byteBuffer);
                ft5 ft5Var = dt5Var.g;
                if (ft5Var == null) {
                    ArrayList arrayList = this.X;
                    ft5Var = (ft5) arrayList.get(this.a0 % arrayList.size());
                    dt5Var.g = ft5Var;
                    this.a0++;
                }
                ft5Var.I.put(dt5Var);
                it.remove();
                return true;
            }
            q(byteBuffer);
            return true;
        } catch (IOException e) {
            q(byteBuffer);
            throw new kz5(dt5Var, e);
        }
    }

    public final void h() {
        int i;
        synchronized (this.O) {
            try {
                i = 0;
                if (this.L == null) {
                    if (this.M != null) {
                    }
                }
                this.J.j("Connection lost timer stopped");
                ScheduledExecutorService scheduledExecutorService = this.L;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    this.L = null;
                }
                ScheduledFuture scheduledFuture = this.M;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.M = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ft5) obj).interrupt();
            }
        }
        Selector selector = this.T;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                this.P.d("IOException during selector.close", e);
                n(null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.S;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                this.P.d("IOException during server.close", e2);
                n(null, e2);
            }
        }
    }

    public final Collection j() {
        Collection unmodifiableCollection;
        synchronized (this.Q) {
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(new ArrayList(this.Q));
        }
        return unmodifiableCollection;
    }

    public final void k(dt5 dt5Var, Exception exc) {
        gr2 gr2Var = this.P;
        gr2Var.d("Shutdown due to fatal error", exc);
        n(dt5Var, exc);
        try {
            t("Got error on server side: " + exc.getClass().getName() + (exc.getCause() != null ? " caused by ".concat(exc.getCause().getClass().getName()) : ""));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            gr2Var.d("Interrupt during stop", exc);
            n(null, e);
        }
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ft5) obj).interrupt();
            }
        }
        Thread thread = this.V;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void l(SelectionKey selectionKey, dt5 dt5Var, IOException iOException) {
        SelectableChannel channel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (dt5Var != null) {
            dt5Var.b(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, iOException.getMessage(), false);
        } else {
            if (selectionKey == null || (channel = selectionKey.channel()) == null || !channel.isOpen()) {
                return;
            }
            try {
                channel.close();
            } catch (IOException unused) {
            }
            this.P.m("Connection closed because of exception", iOException);
        }
    }

    public final void m(dt5 dt5Var, String str) {
        str.getClass();
        zc4 zc4Var = this.e0;
        zc4Var.getClass();
        if (this != zc4Var.j) {
            return;
        }
        zc4Var.k.remove(dt5Var);
        if (zc4Var.k.isEmpty()) {
            fw4 fw4Var = zc4Var.c;
            dg0 dg0Var = dg0.J;
            fw4Var.getClass();
            fw4Var.i(null, dg0Var);
        }
    }

    public final void n(dt5 dt5Var, Exception exc) {
        zc4 zc4Var = this.e0;
        zc4Var.getClass();
        Log.e("SearchInputServer", "WebSocket 错误", exc);
        if (dt5Var == null && this == zc4Var.j) {
            fw4 fw4Var = zc4Var.c;
            dg0 dg0Var = dg0.L;
            fw4Var.getClass();
            fw4Var.i(null, dg0Var);
        }
    }

    public final void o(dt5 dt5Var, String str) {
        str.getClass();
        zc4 zc4Var = this.e0;
        zc4Var.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type", "");
            if (j42.c(optString, "input")) {
                mn4 mn4Var = zc4Var.e;
                String optString2 = jSONObject.optString("text", "");
                optString2.getClass();
                mn4Var.b(optString2);
                return;
            }
            if (j42.c(optString, "search")) {
                mn4 mn4Var2 = zc4Var.g;
                String optString3 = jSONObject.optString("text", "");
                optString3.getClass();
                mn4Var2.b(optString3);
            }
        } catch (Exception e) {
            Log.e("SearchInputServer", "消息解析失败: ".concat(str), e);
        }
    }

    public final void p(dt5 dt5Var, rs1 rs1Var) {
        boolean z;
        boolean z2 = true;
        if (this.W.get()) {
            dt5Var.a(1001, "", false);
            z = true;
        } else {
            synchronized (this.Q) {
                z = this.Q.add(dt5Var);
            }
        }
        if (z) {
            zc4 zc4Var = this.e0;
            zc4Var.getClass();
            if (this != zc4Var.j) {
                return;
            }
            zc4Var.k.add(dt5Var);
            fw4 fw4Var = zc4Var.c;
            dg0 dg0Var = dg0.K;
            fw4Var.getClass();
            fw4Var.i(null, dg0Var);
            try {
                String jSONObject = new JSONObject().put("type", "tv_text").put("text", zc4Var.l).toString();
                jSONObject.getClass();
                x11 x11Var = dt5Var.k;
                if (dt5Var.l != 1) {
                    z2 = false;
                }
                dt5Var.j(x11Var.g(jSONObject, z2));
            } catch (Exception e) {
                Log.w("SearchInputServer", "回传电视文字失败", e);
            }
        }
    }

    public final void q(ByteBuffer byteBuffer) {
        LinkedBlockingQueue linkedBlockingQueue = this.Z;
        if (linkedBlockingQueue.size() > this.b0.intValue()) {
            return;
        }
        linkedBlockingQueue.put(byteBuffer);
    }

    public final boolean r(dt5 dt5Var) {
        boolean z;
        synchronized (this.Q) {
            try {
                if (this.Q.contains(dt5Var)) {
                    z = this.Q.remove(dt5Var);
                } else {
                    this.P.e(dt5Var, "Removing connection which is not in the connections collection! Possible no handshake received! {}");
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.W.get() && this.Q.isEmpty()) {
            this.V.interrupt();
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SelectionKey selectionKey;
        ServerSocketChannel serverSocketChannel;
        synchronized (this) {
            try {
                if (this.V != null) {
                    throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
                }
                this.V = Thread.currentThread();
                if (this.W.get()) {
                    return;
                }
                this.V.setName("WebSocketSelector-" + this.V.getId());
                try {
                    ServerSocketChannel serverSocketChannel2 = this.S;
                    if (serverSocketChannel2 == null) {
                        serverSocketChannel2 = ServerSocketChannel.open();
                        this.S = serverSocketChannel2;
                    }
                    int i = 0;
                    serverSocketChannel2.configureBlocking(false);
                    ServerSocket socket = this.S.socket();
                    socket.setReuseAddress(this.K);
                    if (!socket.isBound()) {
                        socket.bind(this.R, this.d0);
                    }
                    Selector open = Selector.open();
                    this.T = open;
                    ServerSocketChannel serverSocketChannel3 = this.S;
                    serverSocketChannel3.register(open, serverSocketChannel3.validOps());
                    c();
                    ArrayList arrayList = this.X;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((ft5) obj).start();
                    }
                    int port = this.R.getPort();
                    if (port == 0 && (serverSocketChannel = this.S) != null) {
                        port = serverSocketChannel.socket().getLocalPort();
                    }
                    Log.i("SearchInputServer", "WsServer started on port " + port);
                    int i3 = 5;
                    while (!this.V.isInterrupted() && i3 != 0) {
                        try {
                            try {
                                try {
                                    try {
                                        if (this.W.get()) {
                                            i = 5;
                                        }
                                        if (this.T.select(i) == 0 && this.W.get()) {
                                            i3--;
                                        }
                                        Iterator<SelectionKey> it = this.T.selectedKeys().iterator();
                                        selectionKey = null;
                                        while (it.hasNext()) {
                                            try {
                                                SelectionKey next = it.next();
                                                try {
                                                    if (next.isValid()) {
                                                        if (next.isAcceptable()) {
                                                            e(it);
                                                        } else if ((!next.isReadable() || g(next, it)) && next.isWritable()) {
                                                            i(next);
                                                        }
                                                    }
                                                    selectionKey = next;
                                                } catch (IOException e) {
                                                    e = e;
                                                    selectionKey = next;
                                                    l(selectionKey, null, e);
                                                } catch (kz5 e2) {
                                                    e = e2;
                                                    selectionKey = next;
                                                    l(selectionKey, e.I, e.J);
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                            } catch (kz5 e4) {
                                                e = e4;
                                            }
                                        }
                                        f();
                                    } catch (IOException e5) {
                                        e = e5;
                                        selectionKey = null;
                                    } catch (kz5 e6) {
                                        e = e6;
                                        selectionKey = null;
                                    }
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                } catch (CancelledKeyException unused2) {
                                } catch (ClosedByInterruptException unused3) {
                                    h();
                                    return;
                                }
                            } finally {
                                h();
                            }
                        } catch (RuntimeException e7) {
                            k(null, e7);
                        }
                    }
                    h();
                } catch (IOException e8) {
                    k(null, e8);
                }
            } finally {
            }
        }
    }

    public final void s() {
        if (this.V != null) {
            zy.i(getClass().getName().concat(" can only be started once."));
            return;
        }
        Thread thread = new Thread(this);
        thread.setDaemon(false);
        thread.start();
    }

    public final void t(String str) {
        ArrayList arrayList;
        Selector selector;
        if (this.W.compareAndSet(false, true)) {
            synchronized (this.Q) {
                arrayList = new ArrayList(this.Q);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((dt5) obj).a(1001, str, false);
            }
            this.c0.getClass();
            synchronized (this) {
                try {
                    if (this.V != null && (selector = this.T) != null) {
                        selector.wakeup();
                        this.V.join(0L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void u() {
        t("");
    }
}

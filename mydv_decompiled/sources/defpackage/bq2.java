package defpackage;

import android.util.Log;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bq2 extends WebSocketListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ cq2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xp2 e;

    public bq2(long j, cq2 cq2Var, String str, boolean z, xp2 xp2Var) {
        this.a = j;
        this.b = cq2Var;
        this.c = str;
        this.d = z;
        this.e = xp2Var;
    }

    public final boolean a(WebSocket webSocket) {
        cq2 cq2Var = this.b;
        return this.a == cq2Var.n && webSocket == cq2Var.h && j42.c(cq2Var.i, this.c);
    }

    public final void b(String str) {
        String str2 = this.d ? "backup" : "primary";
        String str3 = this.b.i;
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder F = r7.F("ignoring stale websocket callback: event=", str, ", using=", str2, ", source=");
        F.append(this.c);
        F.append(", activeSource=");
        F.append(str3);
        Log.d("LiveWebSocket", F.toString());
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i, String str) {
        webSocket.getClass();
        str.getClass();
        if (!a(webSocket)) {
            b("onClosed");
            return;
        }
        if (jx4.L(str)) {
            str = "<empty>";
        }
        Log.w("LiveWebSocket", "websocket closed: code=" + i + ", reason=" + ((Object) str));
        qp2 qp2Var = qp2.L;
        cq2 cq2Var = this.b;
        cq2Var.b(qp2Var);
        cq2Var.g(this.c, this.e);
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(WebSocket webSocket, int i, String str) {
        webSocket.getClass();
        str.getClass();
        if (!a(webSocket)) {
            b("onClosing");
            return;
        }
        if (jx4.L(str)) {
            str = "<empty>";
        }
        Log.w("LiveWebSocket", "websocket closing: code=" + i + ", reason=" + ((Object) str));
        webSocket.close(1000, null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
        String str;
        Object g54Var;
        webSocket.getClass();
        th.getClass();
        if (response != null) {
            try {
                g54Var = jx4.f0(200, response.peekBody(512L).string());
            } catch (Throwable th2) {
                g54Var = new g54(th2);
            }
            if (g54Var instanceof g54) {
                g54Var = "";
            }
            str = (String) g54Var;
        } else {
            str = null;
        }
        String str2 = str != null ? str : "";
        boolean z = this.d;
        String str3 = z ? "backup" : "primary";
        String message = th.getMessage();
        int code = response != null ? response.code() : -1;
        StringBuilder F = r7.F("WebSocket failure: using=", str3, ", message=", message, ", http=");
        F.append(code);
        F.append(", body=");
        F.append(str2);
        Log.e("LiveWebSocket", F.toString(), th);
        if (!a(webSocket)) {
            b("onFailure");
            return;
        }
        cq2 cq2Var = this.b;
        boolean z2 = cq2Var.k;
        xp2 xp2Var = this.e;
        if (z2 || z) {
            cq2Var.b(qp2.L);
            cq2Var.g(this.c, xp2Var);
        } else {
            Log.w("LiveWebSocket", "primary websocket failed before open, retrying backup");
            cq2Var.e(xp2Var, true);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, h00 h00Var) {
        webSocket.getClass();
        h00Var.getClass();
        if (!a(webSocket)) {
            b("onMessage:binary");
            return;
        }
        cq2 cq2Var = this.b;
        cq2Var.l = 0;
        Log.d("LiveWebSocket", "received binary ws frame: size=" + h00Var.d());
        y60 y60Var = cq2Var.a;
        os0 os0Var = sx0.a;
        p70.g0(y60Var, ur0.I, null, new q30(cq2Var, h00Var, null, (byte) 5), 2);
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        byte[] n;
        cq2 cq2Var = this.b;
        y60 y60Var = cq2Var.a;
        webSocket.getClass();
        response.getClass();
        fj0 fj0Var = null;
        if (!a(webSocket)) {
            b("onOpen");
            try {
                webSocket.close(1000, null);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        cq2Var.k = true;
        int code = response.code();
        String str = this.d ? "backup" : "primary";
        Log.i("LiveWebSocket", "websocket opened: code=" + code + ", using=" + str + ", responseHeaders=" + response.headers().size());
        p70.g0(y60Var, null, null, new aq2(cq2Var, fj0Var, (byte) 0), 3);
        Log.d("LiveWebSocket", "sending join frame: payloadType=hb");
        n = k04.n("hb", 0L, new byte[0]);
        cq2Var.h(n);
        rv4 rv4Var = cq2Var.g;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        Log.d("LiveWebSocket", "heartbeat loop started: intervalMs=10000");
        cq2Var.g = p70.g0(y60Var, null, null, new r(cq2Var, fj0Var, (byte) 27), 3);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        webSocket.getClass();
        str.getClass();
        if (!a(webSocket)) {
            b("onMessage:text");
        } else {
            this.b.l = 0;
            Log.d("LiveWebSocket", "received text ws message: ".concat(jx4.f0(200, str)));
        }
    }
}

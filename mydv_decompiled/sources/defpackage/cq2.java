package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cq2 {
    public static final pp2 Companion = new pp2();
    public final y60 a;
    public final no4 b;
    public final n11 c;
    public final OkHttpClient d;
    public rv4 e;
    public rv4 f;
    public rv4 g;
    public WebSocket h;
    public String i;
    public xp2 j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public final AtomicLong o;
    public volatile boolean p;
    public final mn4 q;
    public final mn4 r;
    public final mn4 s;
    public final mn4 t;

    public cq2(y60 y60Var, no4 no4Var, n11 n11Var) {
        this.a = y60Var;
        this.b = no4Var;
        this.c = n11Var;
        ne5 ne5Var = oe5.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        oe5.a(builder);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = builder.connectTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).writeTimeout(10L, timeUnit).pingInterval(0L, timeUnit).build();
        this.o = new AtomicLong(1L);
        this.p = true;
        mn4 b = o7.b(256, 5, null);
        this.q = b;
        this.r = b;
        mn4 b2 = o7.b(1, 5, null);
        this.s = b2;
        this.t = b2;
    }

    public static String f(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("signature");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return jx4.L(queryParameter) ? str : qx4.x(str, queryParameter, r7.z("<signature:", queryParameter.length(), ">"), false);
    }

    public static String i(String str) {
        if (jx4.L(str)) {
            return "<empty>";
        }
        int i = 0;
        List Y = jx4.Y(str, new char[]{';'});
        ArrayList arrayList = new ArrayList(p70.J(Y, 10));
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            arrayList.add(jx4.g0(jx4.c0((String) it.next(), '=')).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!jx4.L((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return o70.Z0(o70.j1(arrayList2), null, "[", "]", 0, null, 57);
    }

    public static String j(cq2 cq2Var, String str) {
        cq2Var.getClass();
        if (jx4.L(str)) {
            return "<empty>";
        }
        return "len=" + str.length() + ", value=" + jx4.f0(96, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.az0 r11, defpackage.gj0 r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq2.a(az0, gj0):java.lang.Object");
    }

    public final void b(qp2 qp2Var) {
        rv4 rv4Var = this.g;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.g = null;
        WebSocket webSocket = this.h;
        this.h = null;
        this.n = 0L;
        boolean z = this.k;
        this.k = false;
        if (webSocket != null) {
            try {
                webSocket.close(1000, null);
            } catch (Throwable unused) {
            }
        }
        String str = this.i;
        if (str == null) {
            str = "";
        }
        Log.d("LiveWebSocket", "closeWebSocket: state=" + qp2Var + ", wasConnected=" + z + ", source=" + str);
        if (qp2Var != null) {
            if (z || qp2Var != qp2.K) {
                p70.g0(this.a, null, null, new r((Object) this, (Object) qp2Var, fj0Var, (byte) 26), 3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (r13 == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r13 != r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r11.s.emit(defpackage.qp2.I, r0) == r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.zp2
            if (r0 == 0) goto L13
            r0 = r13
            zp2 r0 = (defpackage.zp2) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            zp2 r0 = new zp2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.J
            int r1 = r0.L
            java.lang.String r2 = "LiveWebSocket"
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            el0 r7 = defpackage.el0.I
            if (r1 == 0) goto L41
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.mu0.V(r13)
            goto Lbe
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r6
        L37:
            defpackage.mu0.V(r13)
            goto L81
        L3b:
            java.lang.String r12 = r0.I
            defpackage.mu0.V(r13)
            goto L5a
        L41:
            defpackage.mu0.V(r13)
            r11.b(r6)
            r11.i = r12
            r11.j = r6
            r0.I = r12
            r0.L = r5
            mn4 r13 = r11.s
            qp2 r1 = defpackage.qp2.I
            java.lang.Object r13 = r13.emit(r1, r0)
            if (r13 != r7) goto L5a
            goto Lbd
        L5a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "connectInternal: preparing danmaku args for source="
            r13.<init>(r1)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r2, r13)
            r0.I = r6
            r0.L = r4
            os0 r13 = defpackage.sx0.a
            ur0 r13 = defpackage.ur0.I
            b11 r1 = new b11
            n11 r4 = r11.c
            r1.<init>(r6, r4, r12)
            java.lang.Object r13 = defpackage.p70.D0(r13, r1, r0)
            if (r13 != r7) goto L81
            goto Lbd
        L81:
            az0 r13 = (defpackage.az0) r13
            java.lang.String r12 = r13.d()
            java.lang.String r1 = r13.b()
            java.lang.String r4 = r13.c()
            java.lang.String r5 = r13.a()
            java.lang.String r5 = i(r5)
            java.lang.String r8 = ", roomId="
            java.lang.String r9 = ", userId="
            java.lang.String r10 = "danmaku args ready: webRid="
            java.lang.StringBuilder r12 = defpackage.r7.F(r10, r12, r8, r1, r9)
            r12.append(r4)
            java.lang.String r1 = ", cookies="
            r12.append(r1)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r2, r12)
            r0.I = r6
            r0.L = r3
            java.lang.Object r13 = r11.a(r13, r0)
            if (r13 != r7) goto Lbe
        Lbd:
            return r7
        Lbe:
            xp2 r13 = (defpackage.xp2) r13
            r11.j = r13
            r12 = 0
            r11.e(r13, r12)
            wd5 r11 = defpackage.wd5.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq2.c(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(byte[] r29) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq2.d(byte[]):void");
    }

    public final void e(xp2 xp2Var, boolean z) {
        String str = this.i;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j = 1 + this.m;
        this.m = j;
        this.n = j;
        String a = z ? xp2Var.a() : xp2Var.c();
        String str3 = z ? "backup" : "primary";
        String f = f(a);
        String i = i(xp2Var.b());
        StringBuilder F = r7.F("opening ", str3, " websocket: url=", f, ", cookies=");
        F.append(i);
        Log.i("LiveWebSocket", F.toString());
        Request.Builder header = new Request.Builder().url(a).header("User-Agent", xp2Var.d()).header("Origin", "https://live.douyin.com");
        if (!jx4.L(xp2Var.b())) {
            header.header("Cookie", xp2Var.b());
        }
        this.h = this.d.newWebSocket(header.build(), new bq2(j, this, str2, z, xp2Var));
    }

    public final void g(String str, xp2 xp2Var) {
        if (jx4.L(str) || !j42.c(this.i, str)) {
            return;
        }
        int i = this.l;
        y60 y60Var = this.a;
        byte b = 1;
        fj0 fj0Var = null;
        if (i >= 5) {
            Log.w("LiveWebSocket", "reconnect skipped: attempts exhausted for source=".concat(str));
            p70.g0(y60Var, null, null, new aq2(this, fj0Var, b), 3);
            return;
        }
        rv4 rv4Var = this.f;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        int i2 = this.l + 1;
        this.l = i2;
        Log.w("LiveWebSocket", "scheduling websocket reconnect: source=" + str + ", attempt=" + i2 + "/5, delayMs=5000");
        this.f = p70.g0(y60Var, null, null, new eg1(this, str, xp2Var, fj0Var, (byte) 2), 3);
    }

    public final void h(byte[] bArr) {
        WebSocket webSocket = this.h;
        if (webSocket != null) {
            h00 h00Var = h00.L;
            webSocket.send(jp.w(bArr));
        }
    }
}

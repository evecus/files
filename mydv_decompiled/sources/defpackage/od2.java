package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class od2 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public boolean d;
    public Object e;
    public final Object f;

    public od2(byte b, int i, int i2) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new gk3(i);
                this.c = new gk3(i2);
                this.f = new re2(i, 30, 100);
                break;
            default:
                this.b = new gk3(i);
                this.c = new gk3(i2);
                this.f = new re2(i, 90, 200);
                break;
        }
    }

    public static MotionEvent f(long j, long j2, int i, float f, float f2) {
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = 0;
        pointerProperties.toolType = 1;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = f;
        pointerCoords.y = f2;
        pointerCoords.pressure = 1.0f;
        pointerCoords.size = 1.0f;
        MotionEvent obtain = MotionEvent.obtain(j, j2, i, 1, new MotionEvent.PointerProperties[]{pointerProperties}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0, 1.0f, 1.0f, 0, 0, 4098, 0);
        obtain.getClass();
        return obtain;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (defpackage.rt0.n(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, r0) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r10 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r9, defpackage.gj0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ky3
            if (r0 == 0) goto L13
            r0 = r10
            ky3 r0 = (defpackage.ky3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ky3 r0 = new ky3
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.I
            int r1 = r0.K
            r2 = 2
            r3 = 1
            r4 = 0
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.mu0.V(r10)
            goto L67
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r4
        L31:
            defpackage.mu0.V(r10)
            goto L58
        L35:
            defpackage.mu0.V(r10)
            qb0 r10 = defpackage.g4.c()
            r8.e = r10
            java.lang.Object r10 = r8.c
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            r10.loadUrl(r9)
            h40 r9 = new h40
            r10 = 17
            r9.<init>(r8, r4, r10)
            r0.K = r3
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r10 = defpackage.qi4.n(r6, r9, r0)
            if (r10 != r5) goto L58
            goto L66
        L58:
            wd5 r10 = (defpackage.wd5) r10
            if (r10 == 0) goto L6a
            r0.K = r2
            r8 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = defpackage.rt0.n(r8, r0)
            if (r8 != r5) goto L67
        L66:
            return r5
        L67:
            wd5 r8 = defpackage.wd5.a
            return r8
        L6a:
            java.lang.String r8 = "抖音登录页加载超时，请重试"
            defpackage.zy.i(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.a(java.lang.String, gj0):java.lang.Object");
    }

    public void b() {
        WebView webView = (WebView) this.c;
        if (this.d) {
            return;
        }
        this.d = true;
        if (((qb0) this.e).isActive()) {
            ((qb0) this.e).e(null);
        }
        try {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
        } catch (Throwable unused) {
        }
        try {
            webView.destroy();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(15:5|6|(1:(1:9)(2:36|37))(2:38|(2:40|(1:42))(2:43|44))|10|11|12|(1:14)(1:33)|15|(1:17)|18|(1:20)|21|22|23|(1:25)(2:27|28)))|45|6|(0)(0)|10|11|12|(0)(0)|15|(0)|18|(0)|21|22|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r4 = new defpackage.g54(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        r4 = new defpackage.g54(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:12:0x004b, B:14:0x0058), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ny3
            if (r0 == 0) goto L13
            r0 = r6
            ny3 r0 = (defpackage.ny3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ny3 r0 = new ny3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.mu0.V(r6)
            goto L49
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r3
        L2c:
            defpackage.mu0.V(r6)
            boolean r6 = r4.d
            if (r6 != 0) goto L8b
            r0.K = r2
            os0 r6 = defpackage.sx0.a
            ns1 r6 = defpackage.ju2.a
            gu2 r1 = new gu2
            r2 = 8
            r1.<init>(r4, r5, r3, r2)
            java.lang.Object r6 = defpackage.p70.D0(r6, r1, r0)
            el0 r4 = defpackage.el0.I
            if (r6 != r4) goto L49
            return r4
        L49:
            java.lang.String r6 = (java.lang.String) r6
            org.json.JSONTokener r4 = new org.json.JSONTokener     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r4.nextValue()     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5b
            goto L65
        L5b:
            r4 = move-exception
            goto L5f
        L5d:
            r4 = r3
            goto L65
        L5f:
            g54 r5 = new g54
            r5.<init>(r4)
            r4 = r5
        L65:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 == 0) goto L6b
            r4 = r3
        L6b:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L70
            goto L71
        L70:
            r6 = r4
        L71:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77
            goto L7e
        L77:
            r4 = move-exception
            g54 r5 = new g54
            r5.<init>(r4)
            r4 = r5
        L7e:
            java.lang.Throwable r5 = defpackage.h54.a(r4)
            if (r5 != 0) goto L85
            return r4
        L85:
            java.lang.String r4 = "抖音登录页返回异常数据"
            defpackage.zy.i(r4)
            return r3
        L8b:
            java.lang.String r4 = "抖音登录会话已关闭"
            defpackage.zy.i(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.c(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:28|29))(2:30|(2:32|(1:34))(2:35|36))|10|11|12|(1:14)(1:25)|15|(1:17)|18|(1:23)(2:20|21)))|37|6|(0)(0)|10|11|12|(0)(0)|15|(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r4 = new defpackage.g54(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x004b, B:14:0x0058), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v1, types: [g54] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.oy3
            if (r0 == 0) goto L13
            r0 = r6
            oy3 r0 = (defpackage.oy3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            oy3 r0 = new oy3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.mu0.V(r6)
            goto L49
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r3
        L2c:
            defpackage.mu0.V(r6)
            boolean r6 = r4.d
            if (r6 != 0) goto L73
            r0.K = r2
            os0 r6 = defpackage.sx0.a
            ns1 r6 = defpackage.ju2.a
            gu2 r1 = new gu2
            r2 = 8
            r1.<init>(r4, r5, r3, r2)
            java.lang.Object r6 = defpackage.p70.D0(r6, r1, r0)
            el0 r4 = defpackage.el0.I
            if (r6 != r4) goto L49
            return r4
        L49:
            java.lang.String r6 = (java.lang.String) r6
            org.json.JSONTokener r4 = new org.json.JSONTokener     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r4.nextValue()     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5b
            goto L65
        L5b:
            r4 = move-exception
            goto L5f
        L5d:
            r4 = r3
            goto L65
        L5f:
            g54 r5 = new g54
            r5.<init>(r4)
            r4 = r5
        L65:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 == 0) goto L6b
            goto L6c
        L6b:
            r3 = r4
        L6c:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L71
            goto L72
        L71:
            r6 = r3
        L72:
            return r6
        L73:
            java.lang.String r4 = "抖音登录会话已关闭"
            defpackage.zy.i(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.d(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e0, code lost:
    
        if (a("https://creator.douyin.com/", r0) == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        if (defpackage.p70.D0(r12, r1, r0) != r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r12.k(r0) == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.qy3
            if (r0 == 0) goto L13
            r0 = r12
            qy3 r0 = (defpackage.qy3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            qy3 r0 = new qy3
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            el0 r7 = defpackage.el0.I
            if (r1 == 0) goto L40
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.mu0.V(r12)
            goto Le3
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r3
        L36:
            defpackage.mu0.V(r12)
            goto Ld8
        L3b:
            defpackage.mu0.V(r12)
            goto Lc6
        L40:
            defpackage.mu0.V(r12)
            java.lang.Object r12 = r11.c
            android.webkit.WebView r12 = (android.webkit.WebView) r12
            android.webkit.WebSettings r1 = r12.getSettings()
            r1.setJavaScriptEnabled(r6)
            r1.setDomStorageEnabled(r6)
            android.content.Context r8 = r12.getContext()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = android.webkit.WebSettings.getDefaultUserAgent(r8)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r8 = move-exception
            g54 r9 = new g54
            r9.<init>(r8)
            r8 = r9
        L61:
            boolean r9 = r8 instanceof defpackage.g54
            if (r9 == 0) goto L68
            java.lang.String r8 = ""
        L68:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Chrome/(\\d+)"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            r9.getClass()
            r8.getClass()
            java.util.regex.Matcher r9 = r9.matcher(r8)
            r9.getClass()
            zv2 r8 = defpackage.rt0.r(r9, r2, r8)
            if (r8 == 0) goto L8f
            java.util.List r8 = r8.a()
            java.lang.Object r8 = defpackage.o70.V0(r6, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L91
        L8f:
            java.lang.String r8 = "113"
        L91:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = ".0.0.0 Safari/537.36"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r1.setUserAgentString(r8)
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()
            r1.setAcceptCookie(r6)
            r1.setAcceptThirdPartyCookies(r12, r6)
            sy3 r1 = new sy3
            r1.<init>(r11)
            r12.setWebViewClient(r1)
            java.lang.Object r12 = r11.f
            ez3 r12 = (defpackage.ez3) r12
            r0.K = r6
            java.lang.Object r12 = r12.k(r0)
            if (r12 != r7) goto Lc6
            goto Le2
        Lc6:
            os0 r12 = defpackage.sx0.a
            ns1 r12 = defpackage.ju2.a
            ry3 r1 = new ry3
            r1.<init>(r5, r3, r2)
            r0.K = r5
            java.lang.Object r12 = defpackage.p70.D0(r12, r1, r0)
            if (r12 != r7) goto Ld8
            goto Le2
        Ld8:
            r0.K = r4
            java.lang.String r12 = "https://creator.douyin.com/"
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r7) goto Le3
        Le2:
            return r7
        Le3:
            wd5 r11 = defpackage.wd5.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.e(gj0):java.lang.Object");
    }

    public void g(int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.f;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                if (i < 0.0f) {
                    t02.a("Index should be non-negative");
                }
                ((gk3) obj3).i(i);
                ((re2) obj2).c(i);
                ((gk3) obj).i(i2);
                break;
            default:
                if (i < 0.0f) {
                    t02.a("Index should be non-negative (" + i + ")");
                }
                ((gk3) obj3).i(i);
                ((re2) obj2).c(i);
                ((gk3) obj).i(i2);
                break;
        }
    }

    public od2(ez3 ez3Var, Activity activity) {
        this.a = (byte) 2;
        this.f = ez3Var;
        this.b = new WeakReference(activity);
        WebView webView = new WebView(activity);
        this.c = webView;
        this.e = g4.c();
        try {
            webView.setFocusable(false);
            webView.setClickable(true);
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.addView(webView, 0, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Throwable unused) {
        }
    }
}

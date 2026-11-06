package defpackage;

import android.content.Context;
import android.util.Log;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s {
    public static final i Companion = new i();
    public final Context a;
    public final qb1 b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile QuickJSContext e;

    public s(Context context) {
        this.a = context.getApplicationContext();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new g((byte) 0));
        newSingleThreadExecutor.getClass();
        this.b = new qb1(newSingleThreadExecutor);
    }

    public static String b(String str) {
        return qx4.x(qx4.x(qx4.x(qx4.x(str, "\\", "\\\\", false), "'", "\\'", false), "\n", "\\n", false), "\r", "\\r", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [g54] */
    public static String e(String str) {
        String g54Var;
        String x = qx4.x(qx4.x(qx4.x(qx4.x(qx4.x(jx4.U(jx4.g0(str).toString()), "\\u003d", "=", false), "\\u002b", "+", false), "\\u002f", "/", false), "\\/", "/", false), "\\\"", "\"", false);
        if (jx4.L(x) || x.equals("null") || x.equals("undefined")) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(x);
            if (jSONObject.optBoolean("ok")) {
                g54Var = jSONObject.optString("value", "");
                g54Var.getClass();
                if (!jx4.L(g54Var)) {
                    Log.d("ABogusSigner", "Generated a_bogus: length=" + g54Var.length());
                }
            } else {
                Log.e("ABogusSigner", "a_bogus generation failed: " + jSONObject.optString("error"));
                g54Var = "";
            }
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (h54.a(g54Var) != null) {
            if (x.length() > 20) {
                Log.d("ABogusSigner", "Generated a_bogus (raw): length=" + x.length());
            } else {
                Log.e("ABogusSigner", "Unexpected a_bogus result: ".concat(x));
                x = "";
            }
            g54Var = x;
        }
        return g54Var;
    }

    public final void a() {
        byte b = 0;
        if (j42.c(Thread.currentThread().getName(), "quickjs-abogus")) {
            try {
                QuickJSContext quickJSContext = this.e;
                if (quickJSContext != null) {
                    quickJSContext.destroy();
                }
            } catch (Exception e) {
                Log.e("ABogusSigner", "Failed to destroy QuickJSContext", e);
            }
            this.e = null;
            this.c = false;
            this.d = false;
        } else {
            try {
                Executor executor = this.b.I;
                executor.getClass();
                ((ExecutorService) executor).submit(new h(this, b)).get(5L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                Log.e("ABogusSigner", "Failed to dispatch destroy", e2);
                try {
                    QuickJSContext quickJSContext2 = this.e;
                    if (quickJSContext2 != null) {
                        quickJSContext2.destroy();
                    }
                } catch (Exception unused) {
                }
                this.e = null;
                this.c = false;
            }
        }
        this.b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r0 != r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.gj0 r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r2 = r0 instanceof defpackage.l
            if (r2 == 0) goto L16
            r2 = r0
            l r2 = (defpackage.l) r2
            int r3 = r2.O
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.O = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            l r2 = new l
            r2.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.M
            el0 r8 = defpackage.el0.I
            int r2 = r7.O
            java.lang.String r9 = ""
            java.lang.String r10 = "ABogusSigner"
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L3a
            if (r2 != r11) goto L34
            defpackage.mu0.V(r0)
            goto La1
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r12
        L3a:
            java.lang.String r2 = r7.L
            java.lang.String r3 = r7.K
            java.lang.String r4 = r7.J
            java.lang.String r5 = r7.I
            defpackage.mu0.V(r0)
            r13 = r4
            r4 = r0
            r0 = r5
            r5 = r2
            r2 = r13
            goto L6d
        L4b:
            defpackage.mu0.V(r0)
            boolean r0 = r14.c
            if (r0 != 0) goto L7f
            r7.I = r15
            r2 = r16
            r7.J = r2
            r4 = r17
            r7.K = r4
            r5 = r18
            r7.L = r5
            r7.O = r3
            java.lang.Object r3 = r14.d(r7)
            if (r3 != r8) goto L69
            goto La0
        L69:
            r0 = r4
            r4 = r3
            r3 = r0
            r0 = r15
        L6d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L7b
            java.lang.String r0 = "a_bogus runtime is not ready"
            android.util.Log.e(r10, r0)
            return r9
        L7b:
            r4 = r3
            r3 = r2
            r2 = r0
            goto L87
        L7f:
            r2 = r16
            r4 = r17
            r5 = r18
            r3 = r2
            r2 = r15
        L87:
            m r0 = new m
            r6 = 0
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.I = r12
            r7.J = r12
            r7.K = r12
            r7.L = r12
            r7.O = r11
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = defpackage.qi4.n(r1, r0, r7)
            if (r0 != r8) goto La1
        La0:
            return r8
        La1:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lab
            java.lang.String r0 = "getABogus timed out"
            android.util.Log.e(r10, r0)
            return r9
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.gj0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.o
            if (r0 == 0) goto L13
            r0 = r7
            o r0 = (defpackage.o) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            o r0 = new o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.I
            el0 r1 = defpackage.el0.I
            int r2 = r0.K
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L29
            defpackage.mu0.V(r7)
            goto L49
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r4
        L2f:
            defpackage.mu0.V(r7)
            boolean r7 = r6.c
            if (r7 == 0) goto L39
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L39:
            p r7 = new p
            r7.<init>(r6, r4, r3)
            r0.K = r5
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r7 = defpackage.qi4.n(r4, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L51
            boolean r3 = r7.booleanValue()
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.d(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r9, defpackage.gj0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.q
            if (r0 == 0) goto L13
            r0 = r10
            q r0 = (defpackage.q) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            q r0 = new q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.J
            el0 r1 = defpackage.el0.I
            int r2 = r0.L
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            java.lang.String r7 = "ABogusSigner"
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.mu0.V(r10)
            goto L78
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r3
        L35:
            java.lang.String r9 = r0.I
            defpackage.mu0.V(r10)
            goto L4d
        L3b:
            defpackage.mu0.V(r10)
            boolean r10 = r8.d
            if (r10 != 0) goto L5b
            r0.I = r9
            r0.L = r5
            java.lang.Object r10 = r8.d(r0)
            if (r10 != r1) goto L4d
            goto L77
        L4d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L5b
            java.lang.String r8 = "byted_acrawler is not ready for __ac_signature"
            android.util.Log.e(r7, r8)
            return r6
        L5b:
            boolean r10 = r8.d
            if (r10 != 0) goto L65
            java.lang.String r8 = "byted_acrawler init failed, cannot generate __ac_signature"
            android.util.Log.e(r7, r8)
            return r6
        L65:
            r r10 = new r
            r2 = 0
            r10.<init>(r8, r9, r3, r2)
            r0.I = r3
            r0.L = r4
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r10 = defpackage.qi4.n(r8, r10, r0)
            if (r10 != r1) goto L78
        L77:
            return r1
        L78:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L82
            java.lang.String r8 = "signAcSignature timed out"
            android.util.Log.e(r7, r8)
            return r6
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.f(java.lang.String, gj0):java.lang.Object");
    }
}

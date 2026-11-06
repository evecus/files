package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class gq1 extends AppWidgetProvider {
    public static final int $stable = 8;
    public static final String ACTION_DEBUG_UPDATE = "androidx.glance.appwidget.action.DEBUG_UPDATE";
    public static final bq1 Companion = new bq1();
    private static final String TAG = "GlanceAppWidgetReceiver";
    private final tk0 coroutineContext = sx0.a;

    public final void a(dl0 dl0Var, Context context) {
        p70.g0(dl0Var, null, null, new r((Object) context, (Object) this, (fj0) null, (byte) 19), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doDelete$glance_appwidget(defpackage.dl0 r6, android.content.Context r7, int[] r8, defpackage.fj0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cq1
            if (r0 == 0) goto L13
            r0 = r9
            cq1 r0 = (defpackage.cq1) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            cq1 r0 = new cq1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.M
            int r1 = r0.O
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            int r6 = r0.L
            int r7 = r0.K
            int[] r8 = r0.J
            android.content.Context r1 = r0.I
            defpackage.mu0.V(r9)
            r9 = r8
            r8 = r1
            goto L5d
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L36:
            defpackage.mu0.V(r9)
            r5.a(r6, r7)
            int r6 = r8.length
            r9 = 0
            r4 = r8
            r8 = r7
            r7 = r9
            r9 = r4
        L42:
            if (r7 >= r6) goto L5f
            r1 = r9[r7]
            rp1 r3 = r5.getGlanceAppWidget()
            r0.I = r8
            r0.J = r9
            r0.K = r7
            r0.L = r6
            r0.O = r2
            java.lang.Object r1 = r3.deleted$glance_appwidget(r8, r1, r0)
            el0 r3 = defpackage.el0.I
            if (r1 != r3) goto L5d
            return r3
        L5d:
            int r7 = r7 + r2
            goto L42
        L5f:
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq1.doDelete$glance_appwidget(dl0, android.content.Context, int[], fj0):java.lang.Object");
    }

    public final Object doLambda$glance_appwidget(dl0 dl0Var, Context context, int i, String str, fj0 fj0Var) {
        a(dl0Var, context);
        Object triggerAction$glance_appwidget$default = rp1.triggerAction$glance_appwidget$default(getGlanceAppWidget(), context, i, str, null, fj0Var, 8, null);
        return triggerAction$glance_appwidget$default == el0.I ? triggerAction$glance_appwidget$default : wd5.a;
    }

    public final Object doOptionsChanged$glance_appwidget(dl0 dl0Var, Context context, int i, Bundle bundle, fj0 fj0Var) {
        a(dl0Var, context);
        Object resize$glance_appwidget = getGlanceAppWidget().resize$glance_appwidget(context, i, bundle, fj0Var);
        return resize$glance_appwidget == el0.I ? resize$glance_appwidget : wd5.a;
    }

    public final Object doUpdate$glance_appwidget(dl0 dl0Var, Context context, int[] iArr, fj0 fj0Var) {
        a(dl0Var, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            gq1 gq1Var = this;
            arrayList.add(p70.y(dl0Var, null, new dq1(gq1Var, context, iArr[i], null, (byte) 0), 3));
            i++;
            this = gq1Var;
        }
        Object z = p70.z(arrayList, fj0Var);
        return z == el0.I ? z : wd5.a;
    }

    public tk0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public abstract rp1 getGlanceAppWidget();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (e41.V(context, new aq1((byte) 1, i, this, bundle))) {
            return;
        }
        d4.B(this, getCoroutineContext(), new eq1((Object) this, (Object) context, i, (Object) bundle, (fj0) null, (byte) 0));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        if (e41.V(context, new zp1(this, iArr, (byte) 0))) {
            return;
        }
        d4.B(this, getCoroutineContext(), new fq1(this, context, iArr, null, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: all -> 0x00b5, CancellationException -> 0x00be, TryCatch #2 {CancellationException -> 0x00be, all -> 0x00b5, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:20:0x0045, B:24:0x0056, B:25:0x005d, B:26:0x005e, B:27:0x0065, B:28:0x0066, B:31:0x00b1, B:33:0x007c, B:35:0x008e, B:37:0x0099, B:38:0x00a5, B:40:0x00a1, B:41:0x00a9, B:42:0x00b0, B:43:0x0071), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[Catch: all -> 0x00b5, CancellationException -> 0x00be, TryCatch #2 {CancellationException -> 0x00be, all -> 0x00b5, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:20:0x0045, B:24:0x0056, B:25:0x005d, B:26:0x005e, B:27:0x0065, B:28:0x0066, B:31:0x00b1, B:33:0x007c, B:35:0x008e, B:37:0x0099, B:38:0x00a5, B:40:0x00a1, B:41:0x00a9, B:42:0x00b0, B:43:0x0071), top: B:2:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r10.getAction()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L71
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L66
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r8
            r3 = r9
            goto Lb1
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r10.getStringExtra(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r5 == 0) goto L5e
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r10.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r4 == r1) goto L56
            aq1 r10 = new aq1     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r0 = 0
            r10.<init>(r0, r4, r8, r5)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            boolean r10 = defpackage.e41.V(r9, r10)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r10 != 0) goto Lbe
            tk0 r10 = r8.getCoroutineContext()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            eq1 r1 = new eq1     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r6 = 0
            r7 = 1
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            defpackage.d4.B(r2, r10, r1)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            return
        L56:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            java.lang.String r9 = "Intent is missing AppWidgetId extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            throw r8     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
        L5e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            java.lang.String r9 = "Intent is missing ActionKey extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            throw r8     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
        L66:
            r2 = r8
            r3 = r9
            java.lang.String r8 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r8 != 0) goto L7c
            goto Lb1
        L71:
            r2 = r8
            r3 = r9
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r8 != 0) goto L7c
            goto Lb1
        L7c:
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            java.lang.String r9 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r1 == 0) goto La9
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r4.<init>(r9, r1)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            boolean r9 = r10.hasExtra(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            if (r9 == 0) goto La1
            int[] r9 = r10.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r9.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            goto La5
        La1:
            int[] r9 = r8.getAppWidgetIds(r4)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
        La5:
            r2.onUpdate(r3, r8, r9)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            return
        La9:
            java.lang.String r8 = "no canonical name"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            throw r9     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
        Lb1:
            super.onReceive(r3, r10)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lbe
            return
        Lb5:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "GlanceAppWidget"
            java.lang.String r10 = "Error in Glance App Widget"
            android.util.Log.e(r9, r10, r8)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq1.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (e41.V(context, new zp1(this, iArr, (byte) 1))) {
            return;
        }
        d4.B(this, getCoroutineContext(), new fq1(this, context, iArr, null, (byte) 1));
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}

package defpackage;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oq1 implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public oq1(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final o34 a() {
        o34 o34Var;
        cp0 cp0Var = GlanceRemoteViewsService.I;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        cp0 cp0Var2 = GlanceRemoteViewsService.I;
        synchronized (cp0Var2) {
            o34Var = (o34) cp0Var2.a.get(cp0.e(i, i2, str));
            if (o34Var == null) {
                o34Var = o34.d;
            }
        }
        return o34Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if (r14 == r11) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.lo r13, defpackage.gj0 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.nq1
            if (r0 == 0) goto L14
            r0 = r14
            nq1 r0 = (defpackage.nq1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            nq1 r0 = new nq1
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.I
            int r0 = r6.K
            wd5 r7 = defpackage.wd5.a
            int r8 = r12.b
            r9 = 3
            r1 = 1
            r10 = 0
            el0 r11 = defpackage.el0.I
            if (r0 == 0) goto L45
            if (r0 == r1) goto L41
            r12 = 2
            if (r0 == r12) goto L3a
            if (r0 != r9) goto L34
            defpackage.mu0.V(r14)
            return r7
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r10
        L3a:
            defpackage.mu0.V(r14)
            r10 = r14
            v52 r10 = (defpackage.v52) r10
            goto L95
        L41:
            defpackage.mu0.V(r14)
            goto L89
        L45:
            defpackage.mu0.V(r14)
            androidx.glance.appwidget.GlanceRemoteViewsService r2 = r12.a
            android.appwidget.AppWidgetManager r12 = android.appwidget.AppWidgetManager.getInstance(r2)
            android.appwidget.AppWidgetProviderInfo r12 = r12.getAppWidgetInfo(r8)
            if (r12 == 0) goto L74
            android.content.ComponentName r12 = r12.provider
            if (r12 == 0) goto L74
            java.lang.String r12 = r12.getClassName()
            if (r12 == 0) goto L74
            java.lang.Class r12 = java.lang.Class.forName(r12)
            java.lang.reflect.Constructor r12 = r12.getDeclaredConstructor(r10)
            java.lang.Object r12 = r12.newInstance(r10)
            r12.getClass()
            gq1 r12 = (defpackage.gq1) r12
            rp1 r12 = r12.getGlanceAppWidget()
            goto L75
        L74:
            r12 = r10
        L75:
            if (r12 == 0) goto L90
            qp1 r5 = new qp1
            r14 = 4
            r5.<init>(r14, r10, r1)
            r6.K = r1
            r4 = 0
            r1 = r12
            r3 = r13
            java.lang.Object r14 = r1.getOrCreateAppWidgetSession$glance_appwidget(r2, r3, r4, r5, r6)
            if (r14 != r11) goto L89
            goto L9f
        L89:
            v52 r14 = (defpackage.v52) r14
            if (r14 != 0) goto L8e
            goto L90
        L8e:
            r10 = r14
            goto L95
        L90:
            l95 r12 = androidx.glance.appwidget.UnmanagedSessionReceiver.a
            defpackage.l95.c(r8)
        L95:
            if (r10 == 0) goto La0
            r6.K = r9
            java.lang.Object r12 = r10.W(r6)
            if (r12 != r11) goto La0
        L9f:
            return r11
        La0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq1.b(lo, gj0):java.lang.Object");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return a().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return a().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return a().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return a().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        a().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        g4.b0(l91.I, new h40((Object) this, (fj0) null, (byte) 8));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        cp0 cp0Var = GlanceRemoteViewsService.I;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        cp0 cp0Var2 = GlanceRemoteViewsService.I;
        synchronized (cp0Var2) {
            cp0Var2.a.remove(cp0.e(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}

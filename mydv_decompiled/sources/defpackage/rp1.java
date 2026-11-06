package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.github.mytv.dv.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class rp1 {
    public static final int $stable = 8;
    private final int errorUiLayout = R.layout.glance_error_layout;
    private final bt3 previewSizeMode;
    private final rq4 sizeMode;
    private final uq1 stateDefinition;

    public rp1() {
        qq4 qq4Var = qq4.a;
        this.sizeMode = qq4Var;
        this.previewSizeMode = qq4Var;
        this.stateDefinition = qc2.c;
    }

    public static /* synthetic */ vo createAppWidgetSession$default(rp1 rp1Var, Context context, lo loVar, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: createAppWidgetSession");
            return null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return rp1Var.createAppWidgetSession(context, loVar, bundle);
    }

    public static /* synthetic */ Object getOrCreateAppWidgetSession$glance_appwidget$default(rp1 rp1Var, Context context, lo loVar, Bundle bundle, jn1 jn1Var, fj0 fj0Var, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: getOrCreateAppWidgetSession");
            return null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return rp1Var.getOrCreateAppWidgetSession$glance_appwidget(context, loVar, bundle, jn1Var, fj0Var);
    }

    public static /* synthetic */ Object onDelete$suspendImpl(rp1 rp1Var, Context context, iq1 iq1Var, fj0 fj0Var) {
        return wd5.a;
    }

    public static /* synthetic */ Object providePreview$suspendImpl(rp1 rp1Var, Context context, int i, fj0 fj0Var) {
        return wd5.a;
    }

    public static /* synthetic */ Object triggerAction$glance_appwidget$default(rp1 rp1Var, Context context, int i, String str, Bundle bundle, fj0 fj0Var, int i2, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: triggerAction");
            return null;
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return rp1Var.triggerAction$glance_appwidget(context, i, str, bundle, fj0Var);
    }

    public static /* synthetic */ Object update$glance_appwidget$default(rp1 rp1Var, Context context, int i, Bundle bundle, fj0 fj0Var, int i2, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: update");
            return null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        return rp1Var.update$glance_appwidget(context, i, bundle, fj0Var);
    }

    public vo createAppWidgetSession(Context context, lo loVar, Bundle bundle) {
        return new vo(this, loVar, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x009b, code lost:
    
        if (defpackage.ik4.a(r1, r6, r0) == r5) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleted$glance_appwidget(android.content.Context r10, int r11, defpackage.fj0 r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp1.deleted$glance_appwidget(android.content.Context, int, fj0):java.lang.Object");
    }

    public hq1 getComponents(Context context) {
        return null;
    }

    public int getErrorUiLayout$glance_appwidget() {
        return this.errorUiLayout;
    }

    public final <T> Object getOrCreateAppWidgetSession$glance_appwidget(Context context, lo loVar, Bundle bundle, jn1 jn1Var, fj0 fj0Var) {
        ck4 sessionManager = getSessionManager(context);
        op1 op1Var = new op1(context, loVar, this, bundle, jn1Var, null);
        ik4 ik4Var = (ik4) sessionManager;
        ik4Var.getClass();
        return ik4.a(ik4Var, op1Var, fj0Var);
    }

    public bt3 getPreviewSizeMode() {
        return this.previewSizeMode;
    }

    public ck4 getSessionManager(Context context) {
        return jk4.a;
    }

    public abstract rq4 getSizeMode();

    public uq1 getStateDefinition() {
        return this.stateDefinition;
    }

    public void onCompositionError(Context context, iq1 iq1Var, int i, Throwable th) {
        if (getErrorUiLayout$glance_appwidget() == 0) {
            throw th;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), getErrorUiLayout$glance_appwidget()));
    }

    public Object onDelete(Context context, iq1 iq1Var, fj0 fj0Var) {
        return onDelete$suspendImpl(this, context, iq1Var, fj0Var);
    }

    public abstract Object provideGlance(Context context, iq1 iq1Var, fj0 fj0Var);

    public Object providePreview(Context context, int i, fj0 fj0Var) {
        return providePreview$suspendImpl(this, context, i, fj0Var);
    }

    public final Object resize$glance_appwidget(Context context, int i, Bundle bundle, fj0 fj0Var) {
        Object orCreateAppWidgetSession$glance_appwidget;
        return ((getSizeMode() instanceof qq4) || (Build.VERSION.SDK_INT > 31 && (getSizeMode() instanceof pq4)) || (orCreateAppWidgetSession$glance_appwidget = getOrCreateAppWidgetSession$glance_appwidget(context, new lo(i), bundle, new pp1(bundle, null, (byte) 0), fj0Var)) != el0.I) ? wd5.a : orCreateAppWidgetSession$glance_appwidget;
    }

    public final Object triggerAction$glance_appwidget(Context context, int i, String str, Bundle bundle, fj0 fj0Var) {
        Object orCreateAppWidgetSession$glance_appwidget = getOrCreateAppWidgetSession$glance_appwidget(context, new lo(i), bundle, new pp1(str, null, (byte) 1), fj0Var);
        return orCreateAppWidgetSession$glance_appwidget == el0.I ? orCreateAppWidgetSession$glance_appwidget : wd5.a;
    }

    public final Object update(Context context, iq1 iq1Var, fj0 fj0Var) {
        if (!(iq1Var instanceof lo) || d4.D((lo) iq1Var)) {
            s83.t("Invalid Glance ID");
            return null;
        }
        Object update$glance_appwidget$default = update$glance_appwidget$default(this, context, ((lo) iq1Var).a, null, fj0Var, 4, null);
        return update$glance_appwidget$default == el0.I ? update$glance_appwidget$default : wd5.a;
    }

    public final Object update$glance_appwidget(Context context, int i, Bundle bundle, fj0 fj0Var) {
        AtomicBoolean atomicBoolean = g95.a;
        if (Build.VERSION.SDK_INT >= 29 && g95.a.get()) {
            io.a();
        }
        Object orCreateAppWidgetSession$glance_appwidget = getOrCreateAppWidgetSession$glance_appwidget(context, new lo(i), bundle, new qp1(4, null, (byte) 0), fj0Var);
        return orCreateAppWidgetSession$glance_appwidget == el0.I ? orCreateAppWidgetSession$glance_appwidget : wd5.a;
    }
}

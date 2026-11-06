package com.github.mytv.dv.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import defpackage.gq1;
import defpackage.ux5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class BaseWidgetReceiver extends gq1 {
    public static final int $stable = gq1.$stable;

    public abstract WidgetKind getKind$app();

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        boolean isDeviceProtected;
        context.getClass();
        isDeviceProtected = WidgetActionsKt.isDeviceProtected(context);
        if (!isDeviceProtected) {
            ux5 e = ux5.e(context);
            e.getClass();
            e.a("widgets_periodic_" + getKind$app().name());
        }
        super.onDisabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        WidgetRefreshScheduler widgetRefreshScheduler = WidgetRefreshScheduler.INSTANCE;
        widgetRefreshScheduler.schedule(context, getKind$app());
        widgetRefreshScheduler.refreshNow(context, getKind$app());
    }

    @Override // defpackage.gq1, android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        WidgetRefreshScheduler.INSTANCE.schedule(context, getKind$app());
        super.onUpdate(context, appWidgetManager, iArr);
    }
}

package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.d4;
import defpackage.e41;
import defpackage.fj0;
import defpackage.k33;
import defpackage.lo;
import defpackage.m6;
import defpackage.n6;
import defpackage.sx0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            k33 A = d4.A(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            lo loVar = new lo(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (e41.V(context, new m6((Object) string, (Object) loVar, (Object) A, (byte) 0))) {
                return;
            }
            d4.B(this, sx0.a, new n6((Object) context, (Object) string, (Object) loVar, (Object) A, (fj0) null, (byte) 0));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }
}

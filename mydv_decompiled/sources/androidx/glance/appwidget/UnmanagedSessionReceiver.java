package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.j42;
import defpackage.l95;
import defpackage.zy;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final l95 a = new l95();
    public static final LinkedHashMap b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !j42.c(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            zy.i("Intent is missing ActionKey extra");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            zy.i("Intent is missing AppWidgetId extra");
        } else {
            l95.c(intExtra);
            Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
        }
    }
}

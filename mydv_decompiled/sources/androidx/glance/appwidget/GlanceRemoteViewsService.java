package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.cp0;
import defpackage.oq1;
import defpackage.s83;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {
    public static final cp0 I = new cp0((byte) 2);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            s83.t("Intent is null");
            return null;
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            zy.i("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            zy.i("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new oq1(this, intExtra, intExtra2, stringExtra);
        }
        zy.i("No size info was present in the intent");
        return null;
    }
}

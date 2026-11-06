package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.d4;
import defpackage.do2;
import defpackage.e41;
import defpackage.sx0;
import defpackage.t53;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            zy.i("onReceive context is null");
            return;
        }
        if (intent == null) {
            zy.i("onReceive intent is null");
        } else {
            if (e41.V(context, new do2((byte) 10))) {
                return;
            }
            d4.B(this, sx0.a, new t53(context, null, (byte) 0));
        }
    }
}

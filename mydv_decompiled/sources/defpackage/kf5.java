package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kf5 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String concat;
        context.getClass();
        intent.getClass();
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
        if (intExtra == -1) {
            Intent c = lf5.c(intent);
            if (c != null) {
                c.addFlags(268435456);
                try {
                    context.startActivity(c);
                    return;
                } catch (Exception e) {
                    Log.w("UpdateManager", "拉起安装确认界面失败", e);
                    return;
                }
            }
            return;
        }
        kf5 kf5Var = lf5.b;
        if (kf5Var != null) {
            lf5.b = null;
            try {
                context.getApplicationContext().unregisterReceiver(kf5Var);
            } catch (Exception e2) {
                Log.w("UpdateManager", "注销安装结果监听失败", e2);
            }
        }
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        if (intExtra == 0) {
            concat = "更新包已安装";
        } else {
            concat = "安装失败".concat((stringExtra == null || jx4.L(stringExtra)) ? "" : ": ".concat(stringExtra));
        }
        Toast.makeText(context, concat, 1).show();
    }
}

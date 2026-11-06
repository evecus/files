package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pt2 extends BroadcastReceiver {
    public final /* synthetic */ MainActivity a;

    public pt2(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        MainActivity mainActivity = this.a;
        hu2 hu2Var = mainActivity.j0;
        if (hu2Var == null || ((Boolean) ((fw4) hu2Var.I.I).getValue()).booleanValue()) {
            return;
        }
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    hu2 hu2Var2 = mainActivity.j0;
                    if (hu2Var2 != null) {
                        hu2Var2.z();
                        return;
                    } else {
                        j42.g0("coordinator");
                        throw null;
                    }
                }
                return;
            }
            if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                hu2 hu2Var3 = mainActivity.j0;
                if (hu2Var3 == null) {
                    j42.g0("coordinator");
                    throw null;
                }
                jk3 jk3Var = hu2Var3.K;
                Boolean bool = Boolean.FALSE;
                jk3Var.setValue(bool);
                fw4 fw4Var = hu2Var3.N;
                fw4Var.getClass();
                fw4Var.i(null, bool);
            }
        }
    }
}

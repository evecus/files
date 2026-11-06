package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hl extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((b5) obj).k();
                break;
            default:
                context.getClass();
                intent.getClass();
                ((uy) obj).f(intent);
                break;
        }
    }
}

package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    public /* synthetic */ fc0(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.I = (byte) 2;
        this.J = eventDispatcher;
        this.L = drmSessionEventListener;
        this.K = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        int i = this.K;
        Object obj = this.L;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                gc0 gc0Var = (gc0) obj2;
                Object obj3 = ((o5) obj).a;
                String str = (String) gc0Var.a.get(Integer.valueOf(i));
                if (str != null) {
                    s7 s7Var = (s7) gc0Var.e.get(str);
                    if ((s7Var != null ? s7Var.a : null) != null) {
                        n7 n7Var = s7Var.a;
                        if (gc0Var.d.remove(str)) {
                            n7Var.a(obj3);
                            break;
                        }
                    } else {
                        gc0Var.g.remove(str);
                        gc0Var.f.put(str, obj3);
                        break;
                    }
                }
                break;
            case 1:
                ((gc0) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj, i);
                break;
        }
    }

    public /* synthetic */ fc0(gc0 gc0Var, int i, Object obj, byte b) {
        this.I = b;
        this.J = gc0Var;
        this.K = i;
        this.L = obj;
    }
}

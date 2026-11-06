package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.StuckPlayerDetector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pl2 implements Handler.Callback {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ pl2(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMessage;
        boolean handleMessage2;
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                handleMessage = ((ListenerSet) obj).handleMessage(message);
                return handleMessage;
            default:
                handleMessage2 = ((StuckPlayerDetector) obj).handleMessage(message);
                return handleMessage2;
        }
    }
}

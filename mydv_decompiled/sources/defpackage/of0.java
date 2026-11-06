package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource2;
import androidx.media3.ui.PlayerNotificationManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class of0 implements Handler.Callback {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ of0(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMessage;
        boolean handleMessage2;
        boolean handleMainMessage;
        boolean handleMessage3;
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                handleMessage = ((ConcatenatingMediaSource) obj).handleMessage(message);
                return handleMessage;
            case 1:
                handleMessage2 = ((ConcatenatingMediaSource2) obj).handleMessage(message);
                return handleMessage2;
            case 2:
                handleMainMessage = ((DownloadManager) obj).handleMainMessage(message);
                return handleMainMessage;
            default:
                handleMessage3 = ((PlayerNotificationManager) obj).handleMessage(message);
                return handleMessage3;
        }
    }
}

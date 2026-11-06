package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Icon;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class kr {
    public static /* synthetic */ Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ PictureInPictureParams.Builder b() {
        return new PictureInPictureParams.Builder();
    }

    public static /* synthetic */ RemoteAction c(Icon icon, PendingIntent pendingIntent) {
        return new RemoteAction(icon, "暂停", "暂停播放", pendingIntent);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ RemoteAction e(Icon icon, PendingIntent pendingIntent) {
        return new RemoteAction(icon, "播放", "继续播放", pendingIntent);
    }

    public static /* synthetic */ RemoteAction f(Icon icon, PendingIntent pendingIntent) {
        return new RemoteAction(icon, "下一个", "播放下一个", pendingIntent);
    }
}

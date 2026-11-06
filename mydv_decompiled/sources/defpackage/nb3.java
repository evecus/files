package defpackage;

import android.os.Build;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nb3 extends lc3 {
    @Override // defpackage.lc3
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // defpackage.lc3
    public final RemoteViews makeBigContentView(db3 db3Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        this.mBuilder.getClass();
        this.mBuilder.getClass();
        return null;
    }

    @Override // defpackage.lc3
    public final RemoteViews makeContentView(db3 db3Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        this.mBuilder.getClass();
        return null;
    }

    @Override // defpackage.lc3
    public final RemoteViews makeHeadsUpContentView(db3 db3Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        this.mBuilder.getClass();
        this.mBuilder.getClass();
        return null;
    }
}

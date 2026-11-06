package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hb3 extends lc3 {
    public final /* synthetic */ byte a;
    public Object b;

    public hb3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // defpackage.lc3
    public final void apply(db3 db3Var) {
        switch (this.a) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) ((mc3) db3Var).b).setBigContentTitle(this.mBigContentTitle).bigText((CharSequence) this.b);
                if (this.mSummaryTextSet) {
                    bigText.setSummaryText(this.mSummaryText);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) ((mc3) db3Var).b).setBigContentTitle(this.mBigContentTitle);
                if (this.mSummaryTextSet) {
                    bigContentTitle.setSummaryText(this.mSummaryText);
                }
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // defpackage.lc3
    public final void clearCompatExtraKeys(Bundle bundle) {
        switch (this.a) {
            case 0:
                super.clearCompatExtraKeys(bundle);
                bundle.remove("android.bigText");
                break;
            default:
                super.clearCompatExtraKeys(bundle);
                bundle.remove("android.textLines");
                break;
        }
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        switch (this.a) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        switch (this.a) {
            case 0:
                super.restoreFromCompatExtras(bundle);
                this.b = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.restoreFromCompatExtras(bundle);
                ArrayList arrayList = (ArrayList) this.b;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                    break;
                }
                break;
        }
    }
}

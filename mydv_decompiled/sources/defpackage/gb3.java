package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gb3 extends lc3 {
    public IconCompat a;
    public IconCompat b;
    public boolean c;
    public boolean d;

    public static IconCompat c(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.k;
            return k21.r((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // defpackage.lc3
    public final void apply(db3 db3Var) {
        Bitmap b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) ((mc3) db3Var).b).setBigContentTitle(this.mBigContentTitle);
        IconCompat iconCompat = this.a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                fb3.a(bigContentTitle, k21.t0(iconCompat, (Context) ((mc3) db3Var).a));
            } else {
                int i = iconCompat.a;
                if (i == -1) {
                    i = k21.T(iconCompat.b);
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.a;
                    int i2 = iconCompat2.a;
                    if (i2 == -1) {
                        Object obj = iconCompat2.b;
                        b = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        b = (Bitmap) iconCompat2.b;
                    } else {
                        if (i2 != 5) {
                            zl1.l(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        b = IconCompat.b((Bitmap) iconCompat2.b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(b);
                }
            }
        }
        if (this.c) {
            IconCompat iconCompat3 = this.b;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(k21.t0(iconCompat3, (Context) ((mc3) db3Var).a));
            }
        }
        if (this.mSummaryTextSet) {
            bigContentTitle.setSummaryText(this.mSummaryText);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            fb3.c(bigContentTitle, this.d);
            fb3.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.lc3
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = c(bundle.getParcelable("android.largeIcon.big"));
            this.c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.a = parcelable != null ? c(parcelable) : c(bundle.getParcelable("android.pictureIcon"));
        this.d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}

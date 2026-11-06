package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class lc3 {
    CharSequence mBigContentTitle;
    protected ib3 mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public static lc3 constructCompatStyleByName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$ProgressStyle":
                return new kc3();
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new nb3();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new gb3();
            case "androidx.core.app.NotificationCompat$MetricStyle":
                return new ec3();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new lb3();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new hb3((byte) 1);
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new hb3((byte) 0);
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new ub3();
            default:
                return null;
        }
    }

    public static lc3 constructCompatStyleForBundle(Bundle bundle) {
        lc3 constructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (constructCompatStyleByName != null) {
            return constructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new ub3();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new gb3();
        }
        if (bundle.containsKey("android.bigText")) {
            return new hb3((byte) 0);
        }
        if (bundle.containsKey("android.textLines")) {
            return new hb3((byte) 1);
        }
        if (bundle.containsKey("android.callType")) {
            return new lb3();
        }
        if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
            return new kc3();
        }
        if (bundle.containsKey("android.metrics")) {
            return new ec3();
        }
        String string = bundle.getString("android.template");
        if (string == null) {
            return null;
        }
        if (string.equals(Notification.BigPictureStyle.class.getName())) {
            return new gb3();
        }
        if (string.equals(Notification.BigTextStyle.class.getName())) {
            return new hb3((byte) 0);
        }
        if (string.equals(Notification.InboxStyle.class.getName())) {
            return new hb3((byte) 1);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 36 && string.equals(Notification.ProgressStyle.class.getName())) {
            return new kc3();
        }
        if (i >= 24) {
            if (string.equals(Notification.MessagingStyle.class.getName())) {
                return new ub3();
            }
            if (string.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new nb3();
            }
        }
        if (i < 37 || !string.equals(Notification.MetricStyle.class.getName())) {
            return null;
        }
        return new ec3();
    }

    public static lc3 constructStyleForExtras(Bundle bundle) {
        lc3 constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (constructCompatStyleForBundle == null) {
            return null;
        }
        try {
            constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return constructCompatStyleForBundle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static lc3 extractStyleFromNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    public final Bitmap a(IconCompat iconCompat, int i, int i2) {
        Object obj;
        Resources resources;
        Context context = this.mBuilder.a;
        if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String e = iconCompat.e();
                    if ("android".equals(e)) {
                        resources = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(e, 8192);
                            if (applicationInfo != null) {
                                resources = packageManager.getResourcesForApplication(applicationInfo);
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.e("IconCompat", "Unable to find pkg=" + e + " for icon", e2);
                        }
                        resources = null;
                    }
                    int identifier = resources.getIdentifier(str4, str3, str5);
                    if (iconCompat.e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + e + " " + str);
                        iconCompat.e = identifier;
                    }
                }
            }
        }
        Drawable loadDrawable = k21.t0(iconCompat, context).loadDrawable(context);
        int intrinsicWidth = i2 == 0 ? loadDrawable.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = loadDrawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        loadDrawable.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        loadDrawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public void apply(db3 db3Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((Notification.Builder) ((mc3) db3Var).b).setStyle(mb3.a());
        }
    }

    public RemoteViews applyStandardTemplate(boolean z, int i, boolean z2) {
        boolean z3;
        Resources resources = this.mBuilder.a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.mBuilder.a.getPackageName(), i);
        ib3 ib3Var = this.mBuilder;
        if (ib3Var.h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.h, 0));
            if (z && this.mBuilder.w.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                ib3 ib3Var2 = this.mBuilder;
                remoteViews.setImageViewBitmap(R.id.right_icon, b(ib3Var2.w.icon, dimensionPixelSize, dimensionPixelSize2, ib3Var2.r));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z && ib3Var.w.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            ib3 ib3Var3 = this.mBuilder;
            remoteViews.setImageViewBitmap(R.id.icon, b(ib3Var3.w.icon, dimensionPixelSize3, dimensionPixelSize4, ib3Var3.r));
        }
        CharSequence charSequence = this.mBuilder.e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.mBuilder.f;
        boolean z4 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z3 = true;
        } else {
            z3 = false;
        }
        this.mBuilder.getClass();
        this.mBuilder.getClass();
        remoteViews.setViewVisibility(R.id.info, 8);
        CharSequence charSequence3 = this.mBuilder.m;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.mBuilder.f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence4);
                remoteViews.setViewVisibility(R.id.text2, 0);
                if (z2) {
                    remoteViews.setTextViewTextSize(R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(R.id.text2, 8);
            }
        }
        ib3 ib3Var4 = this.mBuilder;
        if ((ib3Var4.j ? ib3Var4.w.when : 0L) == 0) {
            z4 = false;
        } else if (ib3Var4.k) {
            remoteViews.setViewVisibility(R.id.chronometer, 0);
            ib3 ib3Var5 = this.mBuilder;
            remoteViews.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + (ib3Var5.j ? ib3Var5.w.when : 0L));
            remoteViews.setBoolean(R.id.chronometer, "setStarted", true);
            this.mBuilder.getClass();
        } else {
            remoteViews.setViewVisibility(R.id.time, 0);
            ib3 ib3Var6 = this.mBuilder;
            remoteViews.setLong(R.id.time, "setTime", ib3Var6.j ? ib3Var6.w.when : 0L);
        }
        remoteViews.setViewVisibility(R.id.right_side, z4 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.line3, z3 ? 0 : 8);
        return remoteViews;
    }

    public final Bitmap b(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = this.mBuilder.a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        Bitmap a = a(IconCompat.c(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(a);
        Drawable mutate = this.mBuilder.a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return a;
    }

    public Notification build() {
        ib3 ib3Var = this.mBuilder;
        if (ib3Var != null) {
            return ib3Var.a();
        }
        return null;
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.mBuilder.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f = resources.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f2 * dimensionPixelSize2) + ((1.0f - f2) * dimensionPixelSize)), 0, 0);
    }

    public void clearCompatExtraKeys(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public Bitmap createColoredBitmap(int i, int i2) {
        Context context = this.mBuilder.a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        return a(IconCompat.c(context.getResources(), context.getPackageName(), i), i2, 0);
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(db3 db3Var) {
        return null;
    }

    public RemoteViews makeContentView(db3 db3Var) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(db3 db3Var) {
        return null;
    }

    public void restoreFromCompatExtras(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.mSummaryText = bundle.getCharSequence("android.summaryText");
            this.mSummaryTextSet = true;
        }
        this.mBigContentTitle = bundle.getCharSequence("android.title.big");
    }

    public void setBuilder(ib3 ib3Var) {
        if (this.mBuilder != ib3Var) {
            this.mBuilder = ib3Var;
            if (ib3Var == null || ib3Var.l == this) {
                return;
            }
            ib3Var.l = this;
            setBuilder(ib3Var);
        }
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
        return a(iconCompat, i, 0);
    }
}

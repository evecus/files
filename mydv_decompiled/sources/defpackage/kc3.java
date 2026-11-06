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
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kc3 extends lc3 {
    public boolean d;
    public IconCompat f;
    public IconCompat g;
    public IconCompat h;
    public ArrayList a = new ArrayList();
    public ArrayList b = new ArrayList();
    public int c = 0;
    public boolean e = true;

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
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        if (Build.VERSION.SDK_INT <= 36) {
            ArrayList arrayList = this.a;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    jc3 jc3Var = (jc3) arrayList.get(i);
                    if (jc3Var.a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", jc3Var.a);
                        bundle2.putInt(TtmlNode.ATTR_ID, jc3Var.b);
                        bundle2.putInt("colorInt", jc3Var.c);
                        bundle2.putInt("semanticStyle", jc3Var.d);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.b;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    ic3 ic3Var = (ic3) arrayList3.get(i2);
                    if (ic3Var.a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", ic3Var.a);
                        bundle3.putInt(TtmlNode.ATTR_ID, ic3Var.b);
                        bundle3.putInt("colorInt", ic3Var.c);
                        bundle3.putInt("semanticStyle", ic3Var.d);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
        }
        if (Build.VERSION.SDK_INT < 36) {
            bundle.putInt("android.progress", this.c);
            bundle.putBoolean("android.progressIndeterminate", this.d);
            bundle.putInt("android.progressMax", d());
            bundle.putBoolean("android.styledByProgress", this.e);
            ib3 ib3Var = this.mBuilder;
            Context context = ib3Var != null ? ib3Var.a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.f;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", k21.t0(iconCompat, context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.g;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", k21.t0(iconCompat2, context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.h;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", k21.t0(iconCompat3, context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // defpackage.lc3
    public final void apply(db3 db3Var) {
        Notification.Builder builder = (Notification.Builder) ((mc3) db3Var).b;
        int i = Build.VERSION.SDK_INT;
        if (i < 36) {
            int d = d();
            builder.setProgress(d, Math.min(this.c, d), this.d);
            return;
        }
        Context context = (Context) ((mc3) db3Var).a;
        Notification.ProgressStyle a = fc3.a();
        gc3.h(a, this.e);
        gc3.a(a, this.c);
        gc3.c(a, this.d);
        IconCompat iconCompat = this.g;
        gc3.f(a, iconCompat != null ? k21.t0(iconCompat, context) : null);
        IconCompat iconCompat2 = this.h;
        gc3.b(a, iconCompat2 != null ? k21.t0(iconCompat2, context) : null);
        IconCompat iconCompat3 = this.f;
        gc3.g(a, iconCompat3 != null ? k21.t0(iconCompat3, context) : null);
        ArrayList arrayList = this.b;
        if (i >= 37) {
            hc3.a(a, arrayList);
            hc3.b(a, this.a);
        } else {
            gc3.d(a, arrayList);
            gc3.e(a, this.a);
        }
        builder.setStyle(a);
    }

    @Override // defpackage.lc3
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    public final int d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return 100;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int i4 = ((jc3) arrayList.get(i3)).a;
            if (i4 > 0) {
                long j = i2 + i4;
                i2 = (int) j;
                if (j != i2) {
                    try {
                        throw new ArithmeticException();
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
                i++;
            }
        }
        if (i == 0) {
            return 100;
        }
        return i2;
    }

    @Override // defpackage.lc3
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList A = o7.A(bundle, "android.progressSegments", Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (A != null && !A.isEmpty()) {
            for (int i = 0; i < A.size(); i++) {
                Bundle bundle2 = (Bundle) A.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt(TtmlNode.ATTR_ID);
                    int i4 = bundle2.getInt("colorInt", 0);
                    int i5 = bundle2.getInt("semanticStyle", 0);
                    jc3 jc3Var = new jc3();
                    jc3Var.a = i2;
                    jc3Var.b = i3;
                    jc3Var.c = i4;
                    jc3Var.d = i5;
                    arrayList.add(jc3Var);
                }
            }
        }
        this.a = arrayList;
        this.c = bundle.getInt("android.progress", 0);
        this.d = bundle.getBoolean("android.progressIndeterminate", false);
        this.e = bundle.getBoolean("android.styledByProgress", true);
        ArrayList A2 = o7.A(bundle, "android.progressPoints", Bundle.class);
        ArrayList arrayList2 = new ArrayList();
        if (A2 != null && !A2.isEmpty()) {
            for (int i6 = 0; i6 < A2.size(); i6++) {
                Bundle bundle3 = (Bundle) A2.get(i6);
                int i7 = bundle3.getInt("position");
                if (i7 >= 0) {
                    int i8 = bundle3.getInt(TtmlNode.ATTR_ID);
                    int i9 = bundle3.getInt("colorInt", 0);
                    int i10 = bundle3.getInt("semanticStyle", 0);
                    ic3 ic3Var = new ic3();
                    ic3Var.a = i7;
                    ic3Var.b = i8;
                    ic3Var.c = i9;
                    ic3Var.d = i10;
                    arrayList2.add(ic3Var);
                }
            }
        }
        this.b = arrayList2;
        this.f = c((Parcelable) o7.z(bundle, "android.progressTrackerIcon", Icon.class));
        this.g = c((Parcelable) o7.z(bundle, "android.progressStartIcon", Icon.class));
        this.h = c((Parcelable) o7.z(bundle, "android.progressEndIcon", Icon.class));
    }
}

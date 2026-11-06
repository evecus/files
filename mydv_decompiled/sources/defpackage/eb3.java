package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eb3 {
    public final Bundle a;
    public IconCompat b;
    public final u34[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public eb3(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u34[] u34VarArr) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if ((i == -1 ? k21.T(iconCompat.b) : i) == 2) {
                this.f = iconCompat.d();
            }
        }
        this.g = ib3.b(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = u34VarArr;
        this.d = true;
        this.e = true;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.b;
        if (iconCompat != null || (i = this.f) == 0) {
            return iconCompat;
        }
        IconCompat c = IconCompat.c(null, "", i);
        this.b = c;
        return c;
    }

    public eb3(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.c(null, "", i) : null, str, pendingIntent, new Bundle(), null);
    }
}

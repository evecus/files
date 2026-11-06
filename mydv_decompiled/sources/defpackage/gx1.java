package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gx1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final fx1 j;
    public boolean k;

    public gx1(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? x70.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        fx1 fx1Var = new fx1(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
        this.j = fx1Var;
        arrayList.add(fx1Var);
    }

    public static void a(gx1 gx1Var, ArrayList arrayList, rt4 rt4Var) {
        if (gx1Var.k) {
            q02.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((fx1) r7.w(gx1Var.i, 1)).j.add(new wh5("", arrayList, 0, rt4Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final hx1 b() {
        if (this.k) {
            q02.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                fx1 fx1Var = this.j;
                hx1 hx1Var = new hx1(this.a, this.b, this.c, this.d, this.e, new sh5(fx1Var.a, fx1Var.b, fx1Var.c, fx1Var.d, fx1Var.e, fx1Var.f, fx1Var.g, fx1Var.h, fx1Var.i, fx1Var.j), this.f, this.g, this.h);
                this.k = true;
                return hx1Var;
            }
            if (this.k) {
                q02.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            fx1 fx1Var2 = (fx1) arrayList.remove(arrayList.size() - 1);
            ((fx1) r7.w(arrayList, 1)).j.add(new sh5(fx1Var2.a, fx1Var2.b, fx1Var2.c, fx1Var2.d, fx1Var2.e, fx1Var2.f, fx1Var2.g, fx1Var2.h, fx1Var2.i, fx1Var2.j));
        }
    }
}

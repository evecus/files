package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xk1 {
    public final int a;
    public final int b;
    public final Notification c;

    public xk1(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xk1.class != obj.getClass()) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        if (this.a == xk1Var.a && this.b == xk1Var.b) {
            return this.c.equals(xk1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

package defpackage;

import android.widget.RemoteViews;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x34 {
    public final RemoteViews a;
    public final n12 b;

    public x34(RemoteViews remoteViews, n12 n12Var) {
        this.a = remoteViews;
        this.b = n12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x34)) {
            return false;
        }
        x34 x34Var = (x34) obj;
        return this.a.equals(x34Var.a) && this.b.equals(x34Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}

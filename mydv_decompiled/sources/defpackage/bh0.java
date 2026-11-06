package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bh0 {
    public final Uri a;
    public final boolean b;

    public bh0(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bh0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bh0 bh0Var = (bh0) obj;
        return this.a.equals(bh0Var.a) && this.b == bh0Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }
}

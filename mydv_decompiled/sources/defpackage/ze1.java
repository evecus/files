package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ze1 implements i80 {
    public final long a;

    public ze1(long j) {
        this.a = j;
    }

    @Override // defpackage.i80
    public final long a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze1)) {
            return false;
        }
        long j = ((ze1) obj).a;
        int i = x70.h;
        return zc5.a(this.a, j);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) x70.i(this.a)) + ')';
    }
}

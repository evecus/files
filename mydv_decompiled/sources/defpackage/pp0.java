package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pp0 implements i80 {
    public final long a;
    public final long b;

    public pp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.i80
    public final long a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.b : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        long j = pp0Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, pp0Var.b);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.b) + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return "DayNightColorProvider(day=" + ((Object) x70.i(this.a)) + ", night=" + ((Object) x70.i(this.b)) + ')';
    }
}

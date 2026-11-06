package defpackage;

import android.graphics.LightingColorFilter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dj2 extends c80 {
    public final long b;
    public final long c;

    public dj2(long j, long j2) {
        super(new LightingColorFilter(qb.i0(j), qb.i0(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        long j = dj2Var.b;
        int i = x70.h;
        return zc5.a(this.b, j) && zc5.a(this.c, dj2Var.c);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.c) + (i82.Q(this.b) * 31);
    }

    public final String toString() {
        return hf1.x("LightingColorFilter(multiply=", x70.i(this.b), ", add=", x70.i(this.c), ")");
    }
}

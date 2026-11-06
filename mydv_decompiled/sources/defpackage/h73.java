package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h73 implements Comparable {
    public final i73 I;
    public final Bundle J;
    public final boolean K;
    public final int L;
    public final boolean M;

    public h73(i73 i73Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.I = i73Var;
        this.J = bundle;
        this.K = z;
        this.L = i;
        this.M = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h73 h73Var) {
        h73Var.getClass();
        boolean z = h73Var.M;
        boolean z2 = h73Var.K;
        Bundle bundle = h73Var.J;
        boolean z3 = this.K;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.L - h73Var.L;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.J;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.M;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}

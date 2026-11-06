package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d34 extends qy1 {
    public static final d34 P;
    public final transient ad3 M;
    public final transient int N;
    public transient py1 O;

    static {
        ad3 ad3Var = new ad3();
        ad3Var.d(3);
        P = new d34(ad3Var);
    }

    public d34(ad3 ad3Var) {
        this.M = ad3Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = ad3Var.c;
            if (i >= i2) {
                this.N = sp0.d0(j);
                return;
            } else {
                sp0.u(i, i2);
                j += ad3Var.b[i];
                i++;
            }
        }
    }

    @Override // defpackage.vx1
    public final boolean j() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.N;
    }
}

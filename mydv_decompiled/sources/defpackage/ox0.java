package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ox0 extends ya4 {
    public static final /* synthetic */ long N = gq.a.objectFieldOffset(ox0.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.ya4, defpackage.e62
    public final void m(Object obj) {
        o(obj);
    }

    @Override // defpackage.ya4, defpackage.e62
    public final void o(Object obj) {
        while (true) {
            Unsafe unsafe = gq.a;
            long j = N;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    qb.c0(mu0.G(this.M), mw2.M(obj));
                    return;
                } else {
                    zy.i("Already resumed");
                    return;
                }
            }
            ox0 ox0Var = this;
            if (unsafe.compareAndSwapInt(ox0Var, j, 0, 2)) {
                return;
            } else {
                this = ox0Var;
            }
        }
    }
}

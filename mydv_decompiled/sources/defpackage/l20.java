package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l20 extends p40 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater N = AtomicIntegerFieldUpdater.newUpdater(l20.class, "consumed$volatile");
    public final k20 L;
    public final boolean M;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ l20(k20 k20Var, boolean z) {
        this(k20Var, z, l91.I, -3, ez.I);
    }

    @Override // defpackage.p40
    public final String c() {
        return "channel=" + this.L;
    }

    @Override // defpackage.p40, defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        int i = this.J;
        el0 el0Var = el0.I;
        if (i == -3) {
            boolean z = this.M;
            if (z && N.getAndSet(this, 1) == 1) {
                zy.i("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object o = rt0.o(ag1Var, this.L, z, fj0Var);
            if (o == el0Var) {
                return o;
            }
        } else {
            Object collect = super.collect(ag1Var, fj0Var);
            if (collect == el0Var) {
                return collect;
            }
        }
        return wd5.a;
    }

    @Override // defpackage.p40
    public final Object d(bu3 bu3Var, fj0 fj0Var) {
        Object o = rt0.o(new nj4(bu3Var), this.L, this.M, fj0Var);
        return o == el0.I ? o : wd5.a;
    }

    @Override // defpackage.p40
    public final p40 e(tk0 tk0Var, int i, ez ezVar) {
        return new l20(this.L, this.M, tk0Var, i, ezVar);
    }

    @Override // defpackage.p40
    public final zf1 f() {
        return new l20(this.L, this.M);
    }

    @Override // defpackage.p40
    public final k20 g(dl0 dl0Var) {
        if (!this.M || N.getAndSet(this, 1) != 1) {
            return this.J == -3 ? this.L : super.g(dl0Var);
        }
        zy.i("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public l20(k20 k20Var, boolean z, tk0 tk0Var, int i, ez ezVar) {
        super(tk0Var, i, ezVar);
        this.L = k20Var;
        this.M = z;
    }
}

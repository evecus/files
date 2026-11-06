package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class vk0 extends d2 implements rk0 {
    public static final uk0 Key = new uk0(q8.i0, new o90(25));

    public vk0() {
        super(q8.i0);
    }

    public static /* synthetic */ vk0 limitedParallelism$default(vk0 vk0Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return vk0Var.limitedParallelism(i, str);
    }

    public void dispatch(tk0 tk0Var, Runnable runnable) {
        tk0Var.getClass();
        runnable.getClass();
        hl0.J.dispatch(tk0Var, runnable);
    }

    public void dispatchYield(tk0 tk0Var, Runnable runnable) {
        qb.d0(this, tk0Var, runnable);
    }

    @Override // defpackage.d2, defpackage.tk0
    public <E extends rk0> E get(sk0 sk0Var) {
        E e;
        sk0Var.getClass();
        if (!(sk0Var instanceof uk0)) {
            if (q8.i0 == sk0Var) {
                return this;
            }
            return null;
        }
        uk0 uk0Var = (uk0) sk0Var;
        sk0 key = getKey();
        key.getClass();
        if ((key == uk0Var || uk0Var.J == key) && (e = (E) uk0Var.I.invoke(this)) != null) {
            return e;
        }
        return null;
    }

    public final <T> fj0 interceptContinuation(fj0 fj0Var) {
        return new nx0(this, fj0Var);
    }

    public boolean isDispatchNeeded(tk0 tk0Var) {
        return !(this instanceof pd5);
    }

    public vk0 limitedParallelism(int i, String str) {
        ut0.l(i);
        return new ij2(this, i, str);
    }

    @Override // defpackage.d2, defpackage.tk0
    public tk0 minusKey(sk0 sk0Var) {
        sk0Var.getClass();
        if (sk0Var instanceof uk0) {
            uk0 uk0Var = (uk0) sk0Var;
            sk0 key = getKey();
            key.getClass();
            if (key != uk0Var && uk0Var.J != key) {
                return this;
            }
            if (((rk0) uk0Var.I.invoke(this)) == null) {
                return this;
            }
        } else if (q8.i0 != sk0Var) {
            return this;
        }
        return l91.I;
    }

    public final void releaseInterceptedContinuation(fj0 fj0Var) {
        Unsafe unsafe;
        long j;
        fj0Var.getClass();
        nx0 nx0Var = (nx0) fj0Var;
        do {
            unsafe = gq.a;
            j = nx0.P;
        } while (unsafe.getObjectVolatile(nx0Var, j) == qb.f);
        Object objectVolatile = unsafe.getObjectVolatile(nx0Var, j);
        k10 k10Var = objectVolatile instanceof k10 ? (k10) objectVolatile : null;
        if (k10Var != null) {
            k10Var.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + o7.y(this);
    }

    @su0
    public /* synthetic */ vk0 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    @su0
    public final vk0 plus(vk0 vk0Var) {
        return vk0Var;
    }
}

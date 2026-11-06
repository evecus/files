package coil3.network.internal;

import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SingleParameterLazy<P, T> {
    private Object _value = UNINITIALIZED.INSTANCE;
    private tm1 initializer;

    public SingleParameterLazy(tm1 tm1Var) {
        this.initializer = tm1Var;
    }

    public final T get(P p) {
        T t;
        T t2 = (T) this._value;
        UNINITIALIZED uninitialized = UNINITIALIZED.INSTANCE;
        if (t2 != uninitialized) {
            return t2;
        }
        synchronized (this) {
            t = (T) this._value;
            if (t == uninitialized) {
                tm1 tm1Var = this.initializer;
                tm1Var.getClass();
                t = (T) tm1Var.invoke(p);
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }
}

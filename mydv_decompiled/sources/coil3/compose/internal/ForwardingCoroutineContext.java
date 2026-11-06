package coil3.compose.internal;

import defpackage.hn1;
import defpackage.j42;
import defpackage.rk0;
import defpackage.sk0;
import defpackage.tk0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ForwardingCoroutineContext implements tk0 {
    public static final int $stable = 0;
    private final tk0 delegate;

    public ForwardingCoroutineContext(tk0 tk0Var) {
        this.delegate = tk0Var;
    }

    public boolean equals(Object obj) {
        return j42.c(this.delegate, obj);
    }

    @Override // defpackage.tk0
    public <R> R fold(R r, hn1 hn1Var) {
        return (R) this.delegate.fold(r, hn1Var);
    }

    @Override // defpackage.tk0
    public <E extends rk0> E get(sk0 sk0Var) {
        return (E) this.delegate.get(sk0Var);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // defpackage.tk0
    public tk0 minusKey(sk0 sk0Var) {
        return newContext(this, this.delegate.minusKey(sk0Var));
    }

    public abstract ForwardingCoroutineContext newContext(tk0 tk0Var, tk0 tk0Var2);

    @Override // defpackage.tk0
    public tk0 plus(tk0 tk0Var) {
        return newContext(this, this.delegate.plus(tk0Var));
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.delegate + ")";
    }
}

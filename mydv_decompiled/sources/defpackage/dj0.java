package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dj0 implements dl0 {
    public final tk0 I;

    public dj0(tk0 tk0Var) {
        this.I = tk0Var;
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.I;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.I + ')';
    }
}

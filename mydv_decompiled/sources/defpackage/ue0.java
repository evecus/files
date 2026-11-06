package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ue0 implements kg3, rk0 {
    public static final jp J = new jp((byte) 11);
    public final go1 I;

    public ue0(go1 go1Var) {
        this.I = go1Var;
    }

    @Override // defpackage.kg3
    public final List d(Integer num) {
        return this.I.J();
    }

    @Override // defpackage.kg3
    public final boolean f() {
        return this.I.C;
    }

    @Override // defpackage.tk0
    public final /* bridge */ Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final /* bridge */ rk0 get(sk0 sk0Var) {
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return J;
    }

    @Override // defpackage.tk0
    public final /* bridge */ tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public final /* bridge */ tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}

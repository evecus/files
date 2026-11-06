package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nl3 implements k34 {
    public final Set I;
    public final b53 J = new b53(new lo1[16]);

    public nl3(Set set) {
        this.I = set;
    }

    public final b53 a() {
        return this.J;
    }

    @Override // defpackage.k34
    public final void onRemembered() {
        b53 b53Var = this.J;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            k34 k34Var = ((lo1) objArr[i2]).a;
            this.I.remove(k34Var);
            k34Var.onRemembered();
        }
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
    }

    @Override // defpackage.k34
    public final void onForgotten() {
    }
}

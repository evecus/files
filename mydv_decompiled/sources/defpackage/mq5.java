package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mq5 implements PointerInputEventHandler, qn1 {
    public final /* synthetic */ gu2 I;

    public mq5(gu2 gu2Var) {
        this.I = gu2Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof qn1)) {
            return this.I == ((qn1) obj).getFunctionDelegate();
        }
        return false;
    }

    @Override // defpackage.qn1
    public final dn1 getFunctionDelegate() {
        return this.I;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(xp3 xp3Var, fj0 fj0Var) {
        return this.I.invoke(xp3Var, fj0Var);
    }
}

package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u82 extends k13 implements t82 {
    public tm1 I;
    public tm1 J;

    @Override // defpackage.t82
    public final boolean b(KeyEvent keyEvent) {
        tm1 tm1Var = this.J;
        if (tm1Var != null) {
            return ((Boolean) tm1Var.invoke(l82.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.t82
    public final boolean t(KeyEvent keyEvent) {
        tm1 tm1Var = this.I;
        if (tm1Var != null) {
            return ((Boolean) tm1Var.invoke(l82.a(keyEvent))).booleanValue();
        }
        return false;
    }
}

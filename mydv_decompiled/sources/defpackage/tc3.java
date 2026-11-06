package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class tc3 extends sc3 {
    @Override // defpackage.sc3
    public final void a(j14 j14Var) {
        j14Var.closeConnection();
    }

    @Override // defpackage.sc3, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        j14 j14Var = this.b;
        if (j14Var != null) {
            return j14Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.sc3, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}

package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class uc3 extends tc3 {
    @Override // defpackage.sc3, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        j14 j14Var = this.b;
        if (j14Var != null) {
            return j14Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}

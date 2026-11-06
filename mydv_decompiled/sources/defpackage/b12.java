package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b12 extends InputConnectionWrapper {
    public final /* synthetic */ w7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b12(InputConnection inputConnection, w7 w7Var) {
        super(inputConnection, false);
        this.a = w7Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        uu2 uu2Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            uu2Var = new uu2(new d12(inputContentInfo));
        }
        if (this.a.f(uu2Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

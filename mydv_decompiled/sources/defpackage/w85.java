package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w85 implements View.OnClickListener {
    public final o6 I;
    public final /* synthetic */ y85 J;

    public w85(y85 y85Var) {
        this.J = y85Var;
        Context context = y85Var.a.getContext();
        CharSequence charSequence = y85Var.h;
        o6 o6Var = new o6();
        o6Var.e = 4096;
        o6Var.g = 4096;
        o6Var.l = null;
        o6Var.m = null;
        o6Var.n = false;
        o6Var.o = false;
        o6Var.p = 16;
        o6Var.i = context;
        o6Var.a = charSequence;
        this.I = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y85 y85Var = this.J;
        Window.Callback callback = y85Var.k;
        if (callback == null || !y85Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.I);
    }
}

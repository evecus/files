package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ m8 I;
    public final /* synthetic */ j8 J;

    public i8(j8 j8Var, m8 m8Var) {
        this.J = j8Var;
        this.I = m8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        j8 j8Var = this.J;
        DialogInterface.OnClickListener onClickListener = j8Var.l;
        m8 m8Var = this.I;
        onClickListener.onClick(m8Var.b, i);
        if (j8Var.n) {
            return;
        }
        m8Var.b.dismiss();
    }
}

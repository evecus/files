package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xk2 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ cl2 I;

    public xk2(cl2 cl2Var) {
        this.I = cl2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        m41 m41Var;
        if (i == -1 || (m41Var = this.I.K) == null) {
            return;
        }
        m41Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

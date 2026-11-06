package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ hm I;

    public fm(hm hmVar) {
        this.I = hmVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        hm hmVar = this.I;
        km kmVar = hmVar.o0;
        kmVar.setSelection(i);
        if (kmVar.getOnItemClickListener() != null) {
            kmVar.performItemClick(view, i, hmVar.l0.getItemId(i));
        }
        hmVar.dismiss();
    }
}

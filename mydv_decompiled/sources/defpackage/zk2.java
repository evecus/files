package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zk2 extends DataSetObserver {
    public final /* synthetic */ cl2 a;

    public zk2(cl2 cl2Var) {
        this.a = cl2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        cl2 cl2Var = this.a;
        if (cl2Var.g0.isShowing()) {
            cl2Var.g();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}

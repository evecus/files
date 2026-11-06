package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qf implements f35 {
    public final View a;
    public final tm1 b;
    public final rm1 c;
    public final k53 d = new k53();
    public final kt4 e = new kt4(new hf(this, 0));
    public final hf f = new hf(this, 1);
    public final hf g = new hf(this, 2);
    public ActionMode h;
    public of i;
    public Runnable j;

    public qf(View view, tm1 tm1Var, rm1 rm1Var) {
        this.a = view;
        this.b = tm1Var;
        this.c = rm1Var;
    }

    @Override // defpackage.f35
    public final Object a(w25 w25Var, k05 k05Var) {
        pf pfVar = new pf(this, w25Var, null, (byte) 0);
        k53 k53Var = this.d;
        k53Var.getClass();
        Object o0 = i42.o0(new nu1(k53Var, pfVar, null), k05Var);
        return o0 == el0.I ? o0 : wd5.a;
    }
}

package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oc implements View.OnDragListener, y11 {
    public final b21 a;
    public final bq b;
    public final nc c;

    public oc() {
        b21 b21Var = new b21();
        b21Var.K = 0L;
        this.a = b21Var;
        this.b = new bq(0);
        this.c = new nc(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        uu2 uu2Var = new uu2(dragEvent);
        int action = dragEvent.getAction();
        bq bqVar = this.b;
        b21 b21Var = this.a;
        switch (action) {
            case 1:
                n24 n24Var = new n24();
                c21.h(b21Var, new z11(uu2Var, b21Var, n24Var));
                boolean z = n24Var.I;
                aq aqVar = new aq(bqVar);
                while (aqVar.hasNext()) {
                    ((b21) aqVar.next()).n0();
                }
                break;
            case 2:
                b21Var.m0(uu2Var);
                break;
            case 4:
                c21.h(b21Var, new v1((Object) uu2Var, (byte) 16));
                bqVar.clear();
                break;
            case 5:
                b21Var.k0();
                break;
            case 6:
                b21Var.l0();
                break;
        }
        return false;
    }
}

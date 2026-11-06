package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ aq3 J;

    public /* synthetic */ zp3(aq3 aq3Var, byte b) {
        this.I = b;
        this.J = aq3Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        aq3 aq3Var = this.J;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (b) {
            case 0:
                kg kgVar = aq3Var.a;
                if (kgVar != null) {
                    kgVar.invoke(motionEvent);
                    return wd5Var;
                }
                j42.g0("onTouchEvent");
                throw null;
            default:
                kg kgVar2 = aq3Var.a;
                if (kgVar2 != null) {
                    kgVar2.invoke(motionEvent);
                    return wd5Var;
                }
                j42.g0("onTouchEvent");
                throw null;
        }
    }
}

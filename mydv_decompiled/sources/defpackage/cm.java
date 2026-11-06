package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ cm(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                km kmVar = (km) obj;
                if (!kmVar.getInternalPopup().b()) {
                    kmVar.N.o(kmVar.getTextDirection(), kmVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = kmVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                hm hmVar = (hm) obj;
                km kmVar2 = hmVar.o0;
                if (!kmVar2.isAttachedToWindow() || !kmVar2.getGlobalVisibleRect(hmVar.m0)) {
                    hmVar.dismiss();
                    break;
                } else {
                    hmVar.s();
                    hmVar.g();
                    break;
                }
                break;
            case 2:
                b20 b20Var = (b20) obj;
                ArrayList arrayList = b20Var.P;
                if (b20Var.b() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((a20) arrayList.get(0)).a.f0) {
                        View view = b20Var.W;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                ((a20) obj2).a.g();
                            }
                            break;
                        } else {
                            b20Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                sv4 sv4Var = (sv4) obj;
                ty2 ty2Var = sv4Var.P;
                if (sv4Var.b() && !ty2Var.f0) {
                    View view2 = sv4Var.U;
                    if (view2 != null && view2.isShown()) {
                        ty2Var.g();
                        break;
                    } else {
                        sv4Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}

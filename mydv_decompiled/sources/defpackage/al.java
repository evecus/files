package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class al extends fb4 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    public /* synthetic */ al(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override // defpackage.fb4, defpackage.cs5
    public void b() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((kl) ((bl) obj).J).c0.setVisibility(0);
                break;
            case 1:
                kl klVar = (kl) obj;
                klVar.c0.setVisibility(0);
                if (klVar.c0.getParent() instanceof View) {
                    View view = (View) klVar.c0.getParent();
                    WeakHashMap weakHashMap = dr5.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cs5
    public final void c() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                kl klVar = (kl) ((bl) obj).J;
                klVar.c0.setAlpha(1.0f);
                klVar.f0.d(null);
                klVar.f0 = null;
                break;
            case 1:
                kl klVar2 = (kl) obj;
                klVar2.c0.setAlpha(1.0f);
                klVar2.f0.d(null);
                klVar2.f0 = null;
                break;
            default:
                kl klVar3 = (kl) ((g12) obj).K;
                klVar3.c0.setVisibility(8);
                PopupWindow popupWindow = klVar3.d0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (klVar3.c0.getParent() instanceof View) {
                    View view = (View) klVar3.c0.getParent();
                    WeakHashMap weakHashMap = dr5.a;
                    view.requestApplyInsets();
                }
                klVar3.c0.e();
                klVar3.f0.d(null);
                klVar3.f0 = null;
                ViewGroup viewGroup = klVar3.h0;
                WeakHashMap weakHashMap2 = dr5.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}

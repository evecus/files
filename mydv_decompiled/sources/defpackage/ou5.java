package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ou5 extends fb4 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ qu5 f;

    public /* synthetic */ ou5(qu5 qu5Var, byte b) {
        this.e = b;
        this.f = qu5Var;
    }

    @Override // defpackage.cs5
    public final void c() {
        View view;
        byte b = this.e;
        qu5 qu5Var = this.f;
        switch (b) {
            case 0:
                if (qu5Var.o && (view = qu5Var.g) != null) {
                    view.setTranslationY(0.0f);
                    qu5Var.d.setTranslationY(0.0f);
                }
                qu5Var.d.setVisibility(8);
                qu5Var.d.setTransitioning(false);
                qu5Var.s = null;
                g12 g12Var = qu5Var.k;
                if (g12Var != null) {
                    g12Var.O(qu5Var.j);
                    qu5Var.j = null;
                    qu5Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = qu5Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = dr5.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                qu5Var.s = null;
                qu5Var.d.requestLayout();
                break;
        }
    }
}

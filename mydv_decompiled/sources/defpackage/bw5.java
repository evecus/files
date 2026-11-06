package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class bw5 extends ui4 {
    public final WindowInsetsController h;
    public final ep i;
    public final Window j;

    public bw5(Window window, ep epVar) {
        this.h = window.getInsetsController();
        this.i = epVar;
        this.j = window;
    }

    @Override // defpackage.ui4
    public final void k(int i) {
        if ((i & 8) != 0) {
            ((ep) this.i.J).t();
        }
        this.h.hide(i & (-9));
    }

    @Override // defpackage.ui4
    public void o(boolean z) {
        Window window = this.j;
        if (window != null) {
            if (!z) {
                t(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.h;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.ui4
    public void p(boolean z) {
        Window window = this.j;
        if (window != null) {
            if (!z) {
                t(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.h;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.ui4
    public void q() {
        Window window = this.j;
        if (window == null) {
            this.h.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        t(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    @Override // defpackage.ui4
    public final void r() {
        this.h.show(1);
    }

    public final void t(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}

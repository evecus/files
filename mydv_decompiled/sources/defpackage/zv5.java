package defpackage;

import android.view.View;
import android.view.Window;
import androidx.media3.common.C;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class zv5 extends ui4 {
    public final Window h;
    public final ep i;

    public zv5(Window window, ep epVar, int i) {
        this.h = window;
        this.i = epVar;
    }

    @Override // defpackage.ui4
    public final void k(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    t(4);
                } else if (i2 == 2) {
                    t(2);
                } else if (i2 == 8) {
                    ((ep) this.i.J).t();
                }
            }
        }
    }

    @Override // defpackage.ui4
    public final void p(boolean z) {
        if (!z) {
            u(8192);
            return;
        }
        Window window = this.h;
        window.clearFlags(C.BUFFER_FLAG_NOT_DEPENDED_ON);
        window.addFlags(Integer.MIN_VALUE);
        t(8192);
    }

    @Override // defpackage.ui4
    public final void q() {
        this.h.getDecorView().setTag(356039078, 2);
        u(2048);
        t(4096);
    }

    @Override // defpackage.ui4
    public final void r() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((1 & i) != 0) {
                if (i == 1) {
                    u(4);
                    this.h.clearFlags(1024);
                } else if (i == 2) {
                    u(2);
                } else if (i == 8) {
                    ((ep) this.i.J).J();
                }
            }
        }
    }

    public final void t(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void u(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public zv5(Window window, ep epVar) {
        this(window, epVar, 0);
    }
}

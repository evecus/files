package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class be3 implements OnBackAnimationCallback {
    public final /* synthetic */ ce3 a;

    public be3(ce3 ce3Var) {
        this.a = ce3Var;
    }

    public final void onBackCancelled() {
        ce3 ce3Var = this.a;
        ts0 ts0Var = ce3Var.a;
        if (ts0Var == null) {
            zy.i("This input is not added to any dispatcher.");
            return;
        }
        if (!ce3Var.b) {
            ts0Var.g(ce3Var, null);
        }
        o83 o83Var = (o83) ts0Var.K;
        if (ce3Var.equals(o83Var.h) && -1 == o83Var.g) {
            l83 l83Var = o83Var.f;
            if (l83Var == null) {
                l83Var = o83Var.c(-1);
            }
            o83Var.f = null;
            o83Var.g = 0;
            o83Var.h = null;
            if (l83Var != null) {
                l83Var.a();
            }
            o83Var.a.i(null, p83.g);
        }
        ce3Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        j83 b = m5.b(backEvent);
        ce3 ce3Var = this.a;
        ts0 ts0Var = ce3Var.a;
        if (ts0Var == null) {
            zy.i("This input is not added to any dispatcher.");
            return;
        }
        if (ce3Var.b) {
            o83 o83Var = (o83) ts0Var.K;
            if (ce3Var.equals(o83Var.h) && -1 == o83Var.g) {
                l83 l83Var = o83Var.f;
                if (l83Var == null) {
                    l83Var = o83Var.c(-1);
                }
                if (l83Var != null) {
                    l83Var.c(b);
                }
                o83Var.a.i(null, new q83(b));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        j83 b = m5.b(backEvent);
        ce3 ce3Var = this.a;
        ts0 ts0Var = ce3Var.a;
        if (ts0Var == null) {
            zy.i("This input is not added to any dispatcher.");
        } else {
            if (ce3Var.b) {
                return;
            }
            ts0Var.g(ce3Var, b);
            ce3Var.b = true;
        }
    }
}

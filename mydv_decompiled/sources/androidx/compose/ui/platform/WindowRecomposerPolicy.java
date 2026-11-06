package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.github.mytv.dv.R;
import defpackage.a23;
import defpackage.bd;
import defpackage.bg;
import defpackage.dj0;
import defpackage.eg;
import defpackage.fj0;
import defpackage.i42;
import defpackage.ky;
import defpackage.l91;
import defpackage.li2;
import defpackage.n43;
import defpackage.ns1;
import defpackage.nt3;
import defpackage.os1;
import defpackage.ow5;
import defpackage.p70;
import defpackage.pw5;
import defpackage.q02;
import defpackage.q8;
import defpackage.qw5;
import defpackage.r24;
import defpackage.rm1;
import defpackage.s13;
import defpackage.sv2;
import defpackage.sw5;
import defpackage.tk0;
import defpackage.u05;
import defpackage.u92;
import defpackage.uw5;
import defpackage.vi2;
import defpackage.xq1;
import defpackage.z13;
import defpackage.zy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<pw5> factory = new AtomicReference<>(q8.E0);
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(pw5 pw5Var, pw5 pw5Var2) {
        return nt3.s(factory, pw5Var, pw5Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Recomposer createAndInstallWindowRecomposer$ui(View view) {
        tk0 tk0Var;
        eg egVar;
        ((ow5) factory.get()).getClass();
        n43 n43Var = uw5.a;
        l91 l91Var = l91.I;
        u05 u05Var = bg.S;
        fj0 fj0Var = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            tk0Var = (tk0) bg.S.getValue();
        } else {
            tk0Var = (tk0) bg.T.get();
            if (tk0Var == null) {
                zy.i("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        tk0 plus = tk0Var.plus(l91Var);
        s13 s13Var = (s13) plus.get(q8.s0);
        if (s13Var != null) {
            eg egVar2 = new eg(s13Var);
            u92 u92Var = (u92) egVar2.K;
            synchronized (u92Var.b) {
                u92Var.a = false;
                egVar = egVar2;
            }
        } else {
            egVar = 0;
        }
        r24 r24Var = new r24();
        tk0 tk0Var2 = (z13) plus.get(q8.t0);
        if (tk0Var2 == null) {
            tk0Var2 = new a23(view.getContext().getApplicationContext());
            r24Var.I = tk0Var2;
        }
        if (egVar != 0) {
            l91Var = egVar;
        }
        tk0 plus2 = plus.plus(l91Var).plus(tk0Var2);
        Recomposer recomposer = new Recomposer(plus2);
        recomposer.pauseCompositionFrameClock();
        dj0 H = i42.H(plus2);
        vi2 vi2Var = ViewTreeLifecycleOwner.get(view);
        li2 k = vi2Var != null ? vi2Var.k() : null;
        if (k == null) {
            q02.c("ViewTreeLifecycleOwner not found from " + view);
            zy.n();
            return null;
        }
        view.addOnAttachStateChangeListener(new qw5(view, recomposer));
        k.a(new sw5(H, egVar, recomposer, r24Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposer);
        xq1 xq1Var = xq1.I;
        Handler handler = view.getHandler();
        int i = os1.a;
        view.addOnAttachStateChangeListener(new bd(p70.g0(xq1Var, new ns1(handler, "windowRecomposer cleanup", false).L, null, new ky(recomposer, view, fj0Var, (byte) 9), 2), (byte) 2));
        return recomposer;
    }

    public final pw5 getAndSetFactory(pw5 pw5Var) {
        return factory.getAndSet(pw5Var);
    }

    public final void setFactory(pw5 pw5Var) {
        factory.set(pw5Var);
    }

    public final <R> R withFactory(pw5 pw5Var, rm1 rm1Var) {
        pw5 andSetFactory = getAndSetFactory(pw5Var);
        try {
            R r = (R) rm1Var.invoke();
            if (compareAndSetFactory(pw5Var, andSetFactory)) {
                return r;
            }
            zy.i("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(pw5Var, andSetFactory)) {
                    throw th2;
                }
                sv2.i(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}

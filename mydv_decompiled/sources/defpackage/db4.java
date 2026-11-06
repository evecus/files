package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class db4 {
    public final jk3 a = ad4.w(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, xi4 xi4Var, tk0 tk0Var, Consumer consumer) {
        b53 b53Var = new b53(new eb4[16]);
        fb4.d0(xi4Var.a(), 0, new cb4(b53Var));
        Arrays.sort(b53Var.I, 0, b53Var.K, j42.o(new yv3((byte) 11), new yv3((byte) 12)));
        int i = b53Var.K;
        eb4 eb4Var = (eb4) (i == 0 ? null : b53Var.I[i - 1]);
        if (eb4Var == null) {
            return;
        }
        td0 td0Var = new td0(eb4Var.b(), eb4Var.c(), i42.H(tk0Var), this, androidComposeView);
        ca2 a = eb4Var.a();
        m14 J = mu0.q(a).J(a, true);
        long b = eb4Var.c().b();
        ScrollCaptureTarget c = tb.c(androidComposeView, sp0.g0(rt0.F(J)), new Point((int) (b >> 32), (int) (b & 4294967295L)), td0Var);
        c.setScrollBounds(sp0.g0(eb4Var.c()));
        consumer.n(c);
    }
}

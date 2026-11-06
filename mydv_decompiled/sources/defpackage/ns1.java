package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ns1 extends iu2 implements pt0 {
    public final Handler I;
    public final String J;
    public final boolean K;
    public final ns1 L;

    public ns1(Handler handler, String str, boolean z) {
        this.I = handler;
        this.J = str;
        this.K = z;
        this.L = z ? this : new ns1(handler, str, true);
    }

    @Override // defpackage.pt0
    public final void K(long j, k10 k10Var) {
        byte b = 14;
        h8 h8Var = new h8(k10Var, this, b);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.I.postDelayed(h8Var, j)) {
            k10Var.v(new be(this, h8Var, b));
        } else {
            a0(k10Var.M, h8Var);
        }
    }

    public final void a0(tk0 tk0Var, Runnable runnable) {
        vt0.j(tk0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        os0 os0Var = sx0.a;
        ur0.I.dispatch(tk0Var, runnable);
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        if (this.I.post(runnable)) {
            return;
        }
        a0(tk0Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ns1)) {
            return false;
        }
        ns1 ns1Var = (ns1) obj;
        return ns1Var.I == this.I && ns1Var.K == this.K;
    }

    public final int hashCode() {
        return (this.K ? 1231 : 1237) ^ System.identityHashCode(this.I);
    }

    @Override // defpackage.vk0
    public final boolean isDispatchNeeded(tk0 tk0Var) {
        return (this.K && j42.c(Looper.myLooper(), this.I.getLooper())) ? false : true;
    }

    @Override // defpackage.vk0
    public final String toString() {
        ns1 ns1Var;
        String str;
        os0 os0Var = sx0.a;
        ns1 ns1Var2 = ju2.a;
        if (this == ns1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ns1Var = ns1Var2.L;
            } catch (UnsupportedOperationException unused) {
                ns1Var = null;
            }
            str = this == ns1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.J;
        if (str2 == null) {
            str2 = this.I.toString();
        }
        return this.K ? r7.B(str2, ".immediate") : str2;
    }

    @Override // defpackage.pt0
    public final cy0 y(long j, final Runnable runnable, tk0 tk0Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.I.postDelayed(runnable, j)) {
            return new cy0() { // from class: ms1
                @Override // defpackage.cy0
                public final void dispose() {
                    ns1.this.I.removeCallbacks(runnable);
                }
            };
        }
        a0(tk0Var, runnable);
        return ua3.I;
    }

    public ns1(Handler handler) {
        this(handler, null, false);
    }
}

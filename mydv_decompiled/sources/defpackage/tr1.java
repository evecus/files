package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tr1 implements na4, ne3, nb1 {
    public static final String W = fr2.h("GreedyScheduler");
    public final Context I;
    public final st0 K;
    public boolean L;
    public final v05 N;
    public final yt3 O;
    public final v05 P;
    public final uf0 Q;
    public final HashMap R;
    public Boolean S;
    public final d63 T;
    public final c25 U;
    public final mc3 V;
    public final HashMap J = new HashMap();
    public final Object M = new Object();

    public tr1(Context context, uf0 uf0Var, zw zwVar, yt3 yt3Var, v05 v05Var, c25 c25Var) {
        cp0 cp0Var = new cp0((byte) 4);
        v05 v05Var2 = new v05();
        v05Var2.a = cp0Var;
        v05Var2.b = new Object();
        this.N = v05Var2;
        this.R = new HashMap();
        this.I = context;
        uu2 uu2Var = uf0Var.e;
        this.K = new st0(this, uu2Var, uf0Var.d);
        this.V = new mc3(uu2Var, v05Var);
        this.U = c25Var;
        this.T = new d63(zwVar);
        this.Q = uf0Var;
        this.O = yt3Var;
        this.P = v05Var;
    }

    @Override // defpackage.ne3
    public final void a(ky5 ky5Var, hh0 hh0Var) {
        nx5 B = hc4.B(ky5Var);
        boolean z = hh0Var instanceof fh0;
        v05 v05Var = this.P;
        mc3 mc3Var = this.V;
        String str = W;
        v05 v05Var2 = this.N;
        if (z) {
            if (v05Var2.e(B)) {
                return;
            }
            fr2.e().a(str, "Constraints met: Scheduling work ID " + B);
            wv4 i = v05Var2.i(B);
            mc3Var.m(i);
            v05Var.getClass();
            v05Var.g(i, null);
            return;
        }
        fr2.e().a(str, "Constraints not met: Cancelling work ID " + B);
        wv4 f = v05Var2.f(B);
        if (f != null) {
            mc3Var.b(f);
            int i2 = ((gh0) hh0Var).a;
            v05Var.getClass();
            v05Var.h(f, i2);
        }
    }

    @Override // defpackage.nb1
    public final void b(nx5 nx5Var, boolean z) {
        wv4 f = this.N.f(nx5Var);
        if (f != null) {
            this.V.b(f);
        }
        f(nx5Var);
        if (z) {
            return;
        }
        synchronized (this.M) {
            this.R.remove(nx5Var);
        }
    }

    @Override // defpackage.na4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.na4
    public final void d(String str) {
        List<wv4> k;
        Runnable runnable;
        String str2 = W;
        Boolean bool = this.S;
        if (bool == null) {
            bool = Boolean.valueOf(wt3.a(this.I, this.Q));
            this.S = bool;
        }
        if (!bool.booleanValue()) {
            fr2.e().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.L) {
            this.O.a(this);
            this.L = true;
        }
        fr2.e().a(str2, "Cancelling work ID " + str);
        st0 st0Var = this.K;
        if (st0Var != null && (runnable = (Runnable) st0Var.c.remove(str)) != null) {
            ((Handler) st0Var.b.I).removeCallbacks(runnable);
        }
        v05 v05Var = this.N;
        v05Var.getClass();
        str.getClass();
        synchronized (v05Var.b) {
            k = ((cp0) v05Var.a).k(str);
        }
        for (wv4 wv4Var : k) {
            this.V.b(wv4Var);
            v05 v05Var2 = this.P;
            v05Var2.getClass();
            v05Var2.h(wv4Var, -512);
        }
    }

    @Override // defpackage.na4
    public final void e(ky5... ky5VarArr) {
        Boolean bool = this.S;
        if (bool == null) {
            bool = Boolean.valueOf(wt3.a(this.I, this.Q));
            this.S = bool;
        }
        if (!bool.booleanValue()) {
            fr2.e().g(W, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.L) {
            this.O.a(this);
            this.L = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ky5 ky5Var : ky5VarArr) {
            if (!this.N.e(hc4.B(ky5Var))) {
                long max = Math.max(ky5Var.a(), g(ky5Var));
                j81 j81Var = this.Q.d;
                long currentTimeMillis = System.currentTimeMillis();
                if (ky5Var.b == sx5.I) {
                    if (currentTimeMillis < max) {
                        st0 st0Var = this.K;
                        if (st0Var != null) {
                            uu2 uu2Var = st0Var.b;
                            HashMap hashMap = st0Var.c;
                            Runnable runnable = (Runnable) hashMap.remove(ky5Var.a);
                            if (runnable != null) {
                                ((Handler) uu2Var.I).removeCallbacks(runnable);
                            }
                            wn1 wn1Var = new wn1((byte) 7, st0Var, ky5Var, false);
                            hashMap.put(ky5Var.a, wn1Var);
                            ((Handler) uu2Var.I).postDelayed(wn1Var, max - System.currentTimeMillis());
                        }
                    } else if (!j42.c(ch0.j, ky5Var.j)) {
                        ch0 ch0Var = ky5Var.j;
                        if (ch0Var.d) {
                            fr2.e().a(W, "Ignoring " + ky5Var + ". Requires device idle.");
                        } else if (Build.VERSION.SDK_INT < 24 || !ch0Var.b()) {
                            hashSet.add(ky5Var);
                            hashSet2.add(ky5Var.a);
                        } else {
                            fr2.e().a(W, "Ignoring " + ky5Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.N.e(hc4.B(ky5Var))) {
                        fr2.e().a(W, "Starting work for " + ky5Var.a);
                        v05 v05Var = this.N;
                        v05Var.getClass();
                        wv4 i = v05Var.i(hc4.B(ky5Var));
                        this.V.m(i);
                        v05 v05Var2 = this.P;
                        v05Var2.getClass();
                        v05Var2.g(i, null);
                    }
                }
            }
        }
        synchronized (this.M) {
            try {
                if (!hashSet.isEmpty()) {
                    fr2.e().a(W, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ky5 ky5Var2 = (ky5) it.next();
                        nx5 B = hc4.B(ky5Var2);
                        if (!this.J.containsKey(B)) {
                            this.J.put(B, fx5.a(this.T, ky5Var2, (vk0) ((mc3) this.U).b, this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(nx5 nx5Var) {
        v52 v52Var;
        synchronized (this.M) {
            v52Var = (v52) this.J.remove(nx5Var);
        }
        if (v52Var != null) {
            fr2.e().a(W, "Stopping tracking for " + nx5Var);
            v52Var.e(null);
        }
    }

    public final long g(ky5 ky5Var) {
        long max;
        synchronized (this.M) {
            try {
                nx5 B = hc4.B(ky5Var);
                sr1 sr1Var = (sr1) this.R.get(B);
                if (sr1Var == null) {
                    int i = ky5Var.k;
                    j81 j81Var = this.Q.d;
                    sr1Var = new sr1(i, System.currentTimeMillis());
                    this.R.put(B, sr1Var);
                }
                max = (Math.max((ky5Var.k - sr1Var.a) - 5, 0) * 30000) + sr1Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }
}

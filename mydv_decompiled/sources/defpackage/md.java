package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class md implements jo3 {
    public hh2 a;
    public rv4 b;
    public ph2 c;
    public mn4 d;

    @Override // defpackage.jo3
    public final void a() {
        j(null);
    }

    @Override // defpackage.jo3
    public final void b() {
        ot4 ot4Var;
        hh2 hh2Var = this.a;
        if (hh2Var == null || (ot4Var = (ot4) j42.r(hh2Var, hf0.q)) == null) {
            return;
        }
        ((yt0) ot4Var).b();
    }

    @Override // defpackage.jo3
    public final void c(d55 d55Var, td3 td3Var, u55 u55Var, oe oeVar, m14 m14Var, m14 m14Var2) {
        ph2 ph2Var = this.c;
        if (ph2Var != null) {
            ih2 ih2Var = ph2Var.m;
            synchronized (ih2Var.c) {
                try {
                    ih2Var.j = d55Var;
                    ih2Var.l = td3Var;
                    ih2Var.k = u55Var;
                    ih2Var.m = m14Var;
                    ih2Var.n = m14Var2;
                    if (!ih2Var.e) {
                        if (ih2Var.d) {
                        }
                    }
                    ih2Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.jo3
    public final void d() {
        rv4 rv4Var = this.b;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.b = null;
        r43 i = i();
        if (i != null) {
            mn4 mn4Var = (mn4) i;
            synchronized (mn4Var) {
                mn4Var.s(mn4Var.n() + mn4Var.S, mn4Var.R, mn4Var.n() + mn4Var.S, mn4Var.n() + mn4Var.S + mn4Var.T);
            }
        }
    }

    @Override // defpackage.jo3
    public final void e(d55 d55Var, mx1 mx1Var, m6 m6Var, xj0 xj0Var) {
        j(new v7(d55Var, this, mx1Var, m6Var, xj0Var, (byte) 1));
    }

    @Override // defpackage.jo3
    public final void f(d55 d55Var, d55 d55Var2) {
        ph2 ph2Var = this.c;
        if (ph2Var != null) {
            boolean z = (d65.b(ph2Var.h.b, d55Var2.b) && j42.c(ph2Var.h.c, d55Var2.c)) ? false : true;
            ph2Var.h = d55Var2;
            int size = ph2Var.j.size();
            for (int i = 0; i < size; i++) {
                j14 j14Var = (j14) ((WeakReference) ph2Var.j.get(i)).get();
                if (j14Var != null) {
                    j14Var.g = d55Var2;
                }
            }
            ih2 ih2Var = ph2Var.m;
            synchronized (ih2Var.c) {
                ih2Var.j = null;
                ih2Var.l = null;
                ih2Var.k = null;
                ih2Var.m = null;
                ih2Var.n = null;
            }
            if (j42.c(d55Var, d55Var2)) {
                if (z) {
                    g12 g12Var = ph2Var.b;
                    int f = d65.f(d55Var2.b);
                    int e = d65.e(d55Var2.b);
                    d65 d65Var = ph2Var.h.c;
                    int f2 = d65Var != null ? d65.f(d65Var.a) : -1;
                    d65 d65Var2 = ph2Var.h.c;
                    g12Var.q().updateSelection((View) g12Var.J, f, e, f2, d65Var2 != null ? d65.e(d65Var2.a) : -1);
                    return;
                }
                return;
            }
            if (d55Var != null && (!j42.c(d55Var.a.J, d55Var2.a.J) || (d65.b(d55Var.b, d55Var2.b) && !j42.c(d55Var.c, d55Var2.c)))) {
                g12 g12Var2 = ph2Var.b;
                g12Var2.q().restartInput((View) g12Var2.J);
                return;
            }
            int size2 = ph2Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                j14 j14Var2 = (j14) ((WeakReference) ph2Var.j.get(i2)).get();
                if (j14Var2 != null) {
                    d55 d55Var3 = ph2Var.h;
                    g12 g12Var3 = ph2Var.b;
                    if (j14Var2.k) {
                        j14Var2.g = d55Var3;
                        if (j14Var2.i) {
                            g12Var3.q().updateExtractedText((View) g12Var3.J, j14Var2.h, jl2.q0(d55Var3));
                        }
                        d65 d65Var3 = d55Var3.c;
                        long j = d55Var3.b;
                        int f3 = d65Var3 != null ? d65.f(d65Var3.a) : -1;
                        d65 d65Var4 = d55Var3.c;
                        g12Var3.q().updateSelection((View) g12Var3.J, d65.f(j), d65.e(j), f3, d65Var4 != null ? d65.e(d65Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.jo3
    public final void g() {
        ot4 ot4Var;
        hh2 hh2Var = this.a;
        if (hh2Var == null || (ot4Var = (ot4) j42.r(hh2Var, hf0.q)) == null) {
            return;
        }
        ((yt0) ot4Var).a();
    }

    @Override // defpackage.jo3
    public final void h(m14 m14Var) {
        Rect rect;
        ph2 ph2Var = this.c;
        if (ph2Var != null) {
            ph2Var.l = new Rect(mw2.P(m14Var.a), mw2.P(m14Var.b), mw2.P(m14Var.c), mw2.P(m14Var.d));
            if (!ph2Var.j.isEmpty() || (rect = ph2Var.l) == null) {
                return;
            }
            ph2Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final r43 i() {
        mn4 mn4Var = this.d;
        if (mn4Var != null) {
            return mn4Var;
        }
        if (!jy4.a) {
            return null;
        }
        mn4 b = o7.b(0, 2, ez.K);
        this.d = b;
        return b;
    }

    public final void j(v7 v7Var) {
        hh2 hh2Var = this.a;
        if (hh2Var == null) {
            return;
        }
        rv4 rv4Var = null;
        n6 n6Var = new n6((Object) v7Var, (Object) this, (Object) hh2Var, (fj0) rv4Var, (byte) 1);
        if (hh2Var.isAttached()) {
            rv4Var = p70.g0(hh2Var.getCoroutineScope(), null, gl0.L, new r((Object) hh2Var, (Object) n6Var, (fj0) rv4Var, (byte) 24), 1);
        }
        this.b = rv4Var;
    }

    public final void k(hh2 hh2Var) {
        hh2 hh2Var2 = this.a;
        if (hh2Var2 != hh2Var) {
            t02.c("Expected textInputModifierNode to be " + hh2Var + " but was " + hh2Var2);
        }
        this.a = null;
    }
}

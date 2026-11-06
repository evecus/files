package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l55 implements jo3 {
    public final View a;
    public final pn b;
    public final ja c;
    public boolean d;
    public tm1 e;
    public tm1 f;
    public d55 g;
    public mx1 h;
    public final ArrayList i;
    public final uc2 j;
    public Rect k;
    public final om0 l;
    public final b53 m;
    public h n;

    public l55(View view, AndroidComposeView androidComposeView, ja jaVar) {
        pn pnVar = new pn(view);
        this.a = view;
        this.b = pnVar;
        this.c = jaVar;
        this.e = new ba4((byte) 26);
        this.f = new ba4((byte) 27);
        this.g = new d55(4, "", d65.b);
        this.h = mx1.g;
        this.i = new ArrayList();
        this.j = ut0.K(dh2.J, new q94(this, (byte) 8));
        this.l = new om0(androidComposeView, pnVar);
        this.m = new b53(new k55[16]);
    }

    @Override // defpackage.jo3
    public final void a() {
        i(k55.I);
    }

    @Override // defpackage.jo3
    public final void b() {
        i(k55.K);
    }

    @Override // defpackage.jo3
    public final void c(d55 d55Var, td3 td3Var, u55 u55Var, oe oeVar, m14 m14Var, m14 m14Var2) {
        om0 om0Var = this.l;
        synchronized (om0Var.c) {
            try {
                om0Var.j = d55Var;
                om0Var.l = td3Var;
                om0Var.k = u55Var;
                om0Var.m = oeVar;
                om0Var.n = m14Var;
                om0Var.o = m14Var2;
                if (!om0Var.e) {
                    if (om0Var.d) {
                    }
                }
                om0Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jo3
    public final void d() {
        this.d = false;
        this.e = new m45((byte) 1);
        this.f = new m45((byte) 2);
        this.k = null;
        i(k55.J);
    }

    @Override // defpackage.jo3
    public final void e(d55 d55Var, mx1 mx1Var, m6 m6Var, xj0 xj0Var) {
        this.d = true;
        this.g = d55Var;
        this.h = mx1Var;
        this.e = m6Var;
        this.f = xj0Var;
        i(k55.I);
    }

    @Override // defpackage.jo3
    public final void f(d55 d55Var, d55 d55Var2) {
        boolean z = (d65.b(this.g.b, d55Var2.b) && j42.c(this.g.c, d55Var2.c)) ? false : true;
        this.g = d55Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            i14 i14Var = (i14) ((WeakReference) this.i.get(i)).get();
            if (i14Var != null) {
                i14Var.d(d55Var2);
            }
        }
        om0 om0Var = this.l;
        synchronized (om0Var.c) {
            om0Var.j = null;
            om0Var.l = null;
            om0Var.k = null;
            om0Var.m = ne.K;
            om0Var.n = null;
            om0Var.o = null;
        }
        if (j42.c(d55Var, d55Var2)) {
            if (z) {
                pn pnVar = this.b;
                int f = d65.f(d55Var2.b);
                int e = d65.e(d55Var2.b);
                d65 d65Var = this.g.c;
                int f2 = d65Var != null ? d65.f(d65Var.a) : -1;
                d65 d65Var2 = this.g.c;
                ((InputMethodManager) ((uc2) pnVar.c).getValue()).updateSelection((View) pnVar.b, f, e, f2, d65Var2 != null ? d65.e(d65Var2.a) : -1);
                return;
            }
            return;
        }
        if (d55Var != null && (!j42.c(d55Var.a.J, d55Var2.a.J) || (d65.b(d55Var.b, d55Var2.b) && !j42.c(d55Var.c, d55Var2.c)))) {
            pn pnVar2 = this.b;
            ((InputMethodManager) ((uc2) pnVar2.c).getValue()).restartInput((View) pnVar2.b);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            i14 i14Var2 = (i14) ((WeakReference) this.i.get(i2)).get();
            if (i14Var2 != null) {
                i14Var2.e(this.g, this.b);
            }
        }
    }

    @Override // defpackage.jo3
    public final void g() {
        i(k55.L);
    }

    @Override // defpackage.jo3
    public final void h(m14 m14Var) {
        Rect rect;
        this.k = new Rect(mw2.P(m14Var.a), mw2.P(m14Var.b), mw2.P(m14Var.c), mw2.P(m14Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(k55 k55Var) {
        this.m.c(k55Var);
        if (this.n == null) {
            h hVar = new h(this, (byte) 25);
            this.c.execute(hVar);
            this.n = hVar;
        }
    }
}

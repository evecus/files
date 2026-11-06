package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class be0 {
    public final View a;
    public boolean b;
    public re0 c;
    public vi2 d;
    public w94 e;
    public wr5 f;
    public final kx1 g;
    public final w44 h;
    public final Configuration i;
    public final t43 j;
    public final q8 k;
    public final fg l;
    public final da m;
    public final v60 n;
    public final jj1 o;
    public final t43 p;
    public final ts1 q;
    public final hg r;
    public final ya2 s;
    public final fh2 t;
    public final s10 u;
    public int v;
    public final eq w;
    public gf x;
    public final ae0 y;

    public be0(be0 be0Var, View view, re0 re0Var, vi2 vi2Var, w94 w94Var, wr5 wr5Var) {
        kx1 kx1Var;
        Configuration configuration;
        t43 w;
        q8 q8Var;
        fg fgVar;
        da daVar;
        v60 caVar;
        jj1 q8Var2;
        t43 jk3Var;
        hg hgVar;
        boolean c = j42.c(be0Var != null ? be0Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = re0Var;
        this.d = vi2Var;
        this.e = w94Var;
        this.f = wr5Var;
        if (c) {
            be0Var.getClass();
            kx1Var = be0Var.g;
        } else {
            kx1Var = new kx1();
        }
        this.g = kx1Var;
        this.h = be0Var != null ? be0Var.h : new w44();
        if (c) {
            be0Var.getClass();
            configuration = be0Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (c) {
            be0Var.getClass();
            w = be0Var.j;
        } else {
            w = ad4.w(new Configuration(configuration));
        }
        this.j = w;
        if (c) {
            be0Var.getClass();
            q8Var = be0Var.k;
        } else {
            Context context = view.getContext();
            q8Var = new q8((byte) 24);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = q8Var;
        if (c) {
            be0Var.getClass();
            fgVar = be0Var.l;
        } else {
            fgVar = new fg(view.getContext());
        }
        this.l = fgVar;
        if (c) {
            be0Var.getClass();
            daVar = be0Var.m;
        } else {
            daVar = new da(view.getContext(), (byte) 0);
        }
        this.m = daVar;
        if (c) {
            be0Var.getClass();
            caVar = be0Var.n;
        } else {
            caVar = new ca(daVar);
        }
        this.n = caVar;
        if (c) {
            be0Var.getClass();
            q8Var2 = be0Var.o;
        } else {
            view.getContext();
            q8Var2 = new q8((byte) 25);
        }
        this.o = q8Var2;
        if (c) {
            be0Var.getClass();
            jk3Var = be0Var.p;
        } else {
            jk3Var = new jk3(sp0.C(view.getContext()), q8.y0);
        }
        this.p = jk3Var;
        this.q = view == (be0Var != null ? be0Var.a : null) ? be0Var.q : new kn3(view);
        if (c) {
            be0Var.getClass();
            hgVar = be0Var.r;
        } else {
            hgVar = new hg(ViewConfiguration.get(view.getContext()));
        }
        this.r = hgVar;
        this.s = be0Var != null ? be0Var.s : new ya2();
        this.t = new fh2();
        this.u = be0Var != null ? be0Var.u : new s10();
        this.w = new eq(this, (byte) 4);
        this.y = new ae0(this);
    }

    public final void a(AndroidComposeView androidComposeView, tc0 tc0Var, fe0 fe0Var, int i) {
        ay3 ay3Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(123858079);
        int i2 = (go1Var.i(androidComposeView) ? 4 : 2) | i | (go1Var.i(tc0Var) ? 32 : 16) | (go1Var.i(this) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof w72) && !(tag instanceof b82))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof w72) || (tag2 instanceof b82))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(go1Var.z());
                go1Var.q = true;
                go1Var.C = true;
                go1Var.c.d();
                go1Var.H.d();
                wr4 wr4Var = go1Var.I;
                tr4 tr4Var = wr4Var.a;
                wr4Var.e = tr4Var.R;
                wr4Var.f = tr4Var.S;
            }
            boolean g = go1Var.g(androidComposeView.getView());
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = new es5(androidComposeView.getView());
                go1Var.o0(Q);
            }
            es5 es5Var = (es5) Q;
            ay3 a = mq2.a.a(d());
            xx3 xx3Var = qq2.a;
            g();
            w94 w94Var = this.e;
            w94Var.getClass();
            ay3 a2 = xx3Var.a(w94Var);
            ay3 a3 = rb.d.a(this.g);
            ay3 a4 = rb.e.a(this.h);
            i51 i51Var = hf0.v;
            boolean i3 = go1Var.i(this);
            Object Q2 = go1Var.Q();
            byte b = 5;
            if (i3 || Q2 == jpVar) {
                Q2 = new i9(this, b);
                go1Var.o0(Q2);
            }
            ay3 c = i51Var.c((tm1) Q2);
            ay3 a5 = rb.b.a(androidComposeView.getContext());
            ay3 a6 = y12.a.a(set);
            ay3 a7 = rb.a.a(androidComposeView.getConfiguration());
            i51 i51Var2 = l94.a;
            boolean i4 = go1Var.i(androidComposeView);
            Object Q3 = go1Var.Q();
            if (i4 || Q3 == jpVar) {
                ay3Var = a4;
                Q3 = new na(androidComposeView, (byte) 2);
                go1Var.o0(Q3);
            } else {
                ay3Var = a4;
            }
            ay3 c2 = i51Var2.c((tm1) Q3);
            ay3 a8 = rb.f.a(androidComposeView.getView());
            i51 i51Var3 = hf0.x;
            boolean i5 = go1Var.i(androidComposeView);
            Object Q4 = go1Var.Q();
            if (i5 || Q4 == jpVar) {
                Q4 = new na(androidComposeView, (byte) 3);
                go1Var.o0(Q4);
            }
            mw2.c(new ay3[]{a, a2, a3, ay3Var, c, a5, a6, a7, c2, a8, i51Var3.c((tm1) Q4), hf0.t.a(androidComposeView.getViewConfiguration()), kv1.a.a(es5Var)}, p70.u0(1317454175, new zd0(androidComposeView, this, tc0Var), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zd0(this, androidComposeView, tc0Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            ae0 ae0Var = this.y;
            context.unregisterComponentCallbacks(ae0Var);
            fh2 fh2Var = this.t;
            if (fh2Var.b == null) {
                fh2Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(ae0Var);
        }
    }

    public final re0 c() {
        g();
        re0 re0Var = this.c;
        re0Var.getClass();
        return re0Var;
    }

    public final vi2 d() {
        g();
        vi2 vi2Var = this.d;
        vi2Var.getClass();
        return vi2Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            ae0 ae0Var = this.y;
            context.registerComponentCallbacks(ae0Var);
            f(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            fh2 fh2Var = this.t;
            fh2Var.c.setValue(Boolean.valueOf(hasWindowFocus));
            jk3 jk3Var = fh2Var.b;
            eq eqVar = this.w;
            if (jk3Var == null) {
                fh2Var.a = eqVar;
            }
            if (jk3Var != null) {
                jk3Var.setValue(eqVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(ae0Var);
        }
    }

    public final void f(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                ix1 ix1Var = (ix1) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (ix1Var == null || Configuration.needNewResources(updateFrom, ix1Var.a())) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            w44 w44Var = this.h;
            synchronized (w44Var) {
                w44Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(sp0.C(this.a.getContext()));
            }
            if ((805248384 & updateFrom) != 0) {
                fh2 fh2Var = this.t;
                eq eqVar = this.w;
                jk3 jk3Var = fh2Var.b;
                if (jk3Var != null) {
                    jk3Var.setValue(eqVar.invoke());
                }
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        re0 re0Var = this.c;
        View view = this.a;
        if (re0Var == null) {
            re0 a = uw5.a(view);
            if (a == null) {
                Object parent = view.getParent();
                while (a == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    a = uw5.a(view2);
                    parent = oh4.f(view2);
                }
            }
            if (a == null) {
                a = uw5.b(view);
            }
            this.c = a;
        }
        if (this.d == null) {
            vi2 vi2Var = ViewTreeLifecycleOwner.get(view);
            if (vi2Var == null) {
                zy.i("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = vi2Var;
        }
        if (this.e == null) {
            w94 w94Var = ViewTreeSavedStateRegistryOwner.get(view);
            if (w94Var == null) {
                zy.i("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = w94Var;
        }
        if (this.f == null) {
            this.f = ViewTreeViewModelStoreOwner.get(view);
        }
    }
}

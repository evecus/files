package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.github.mytv.dv.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dw5 {
    public static final WeakHashMap w = new WeakHashMap();
    public final wg a;
    public final wg b;
    public final wg c;
    public final wg d;
    public final wg e;
    public final wg f;
    public final wg g;
    public final wg h;
    public final wg i;
    public final eh5 j;
    public final jk3 k;
    public final vd5 l;
    public final eh5 m;
    public final eh5 n;
    public final eh5 o;
    public final eh5 p;
    public final eh5 q;
    public final eh5 r;
    public final eh5 s;
    public final boolean t;
    public int u;
    public final r12 v;

    public dw5(View view) {
        wg wgVar = new wg(4, "captionBar");
        this.a = wgVar;
        wg wgVar2 = new wg(128, "displayCutout");
        this.b = wgVar2;
        wg wgVar3 = new wg(8, "ime");
        this.c = wgVar3;
        wg wgVar4 = new wg(32, "mandatorySystemGestures");
        this.d = wgVar4;
        wg wgVar5 = new wg(2, "navigationBars");
        this.e = wgVar5;
        wg wgVar6 = new wg(1, "statusBars");
        this.f = wgVar6;
        wg wgVar7 = new wg(519, "systemBars");
        this.g = wgVar7;
        wg wgVar8 = new wg(16, "systemGestures");
        this.h = wgVar8;
        wg wgVar9 = new wg(64, "tappableElement");
        this.i = wgVar9;
        eh5 eh5Var = new eh5(new w12(0, 0, 0, 0), "waterfall");
        this.j = eh5Var;
        this.k = ad4.w(null);
        vd5 vd5Var = new vd5(new vd5(wgVar7, wgVar3), wgVar2);
        this.l = vd5Var;
        new vd5(vd5Var, new vd5(new vd5(new vd5(wgVar9, wgVar4), wgVar8), eh5Var));
        this.m = wi4.y(4, "captionBarIgnoringVisibility");
        this.n = wi4.y(2, "navigationBarsIgnoringVisibility");
        this.o = wi4.y(1, "statusBarsIgnoringVisibility");
        this.p = wi4.y(519, "systemBarsIgnoringVisibility");
        this.q = wi4.y(64, "tappableElementIgnoringVisibility");
        this.r = new eh5(new w12(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new eh5(new w12(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new r12(this);
        WeakHashMap weakHashMap = dr5.a;
        yv5 a = wq5.a(view);
        if (a != null) {
            vv5 vv5Var = a.a;
            wgVar.f(vv5Var.u(4));
            wgVar2.f(vv5Var.u(128));
            wgVar3.f(vv5Var.u(8));
            wgVar4.f(vv5Var.u(32));
            wgVar5.f(vv5Var.u(2));
            wgVar6.f(vv5Var.u(1));
            wgVar7.f(vv5Var.u(519));
            wgVar8.f(vv5Var.u(16));
            wgVar9.f(vv5Var.u(64));
        }
    }

    public static void b(dw5 dw5Var, yv5 yv5Var) {
        boolean z = false;
        dw5Var.a.g(yv5Var, 0);
        dw5Var.c.g(yv5Var, 0);
        dw5Var.b.g(yv5Var, 0);
        dw5Var.e.g(yv5Var, 0);
        dw5Var.f.g(yv5Var, 0);
        dw5Var.g.g(yv5Var, 0);
        dw5Var.h.g(yv5Var, 0);
        dw5Var.i.g(yv5Var, 0);
        dw5Var.d.g(yv5Var, 0);
        dw5Var.m.f(oh4.v(yv5Var.a.j(4)));
        dw5Var.n.f(oh4.v(yv5Var.a.j(2)));
        dw5Var.o.f(oh4.v(yv5Var.a.j(1)));
        dw5Var.p.f(oh4.v(yv5Var.a.j(519)));
        dw5Var.q.f(oh4.v(yv5Var.a.j(64)));
        tx0 h = yv5Var.a.h();
        dw5Var.j.f(oh4.v(h != null ? h.a() : o12.e));
        yd ydVar = null;
        if (h != null) {
            Path j = Build.VERSION.SDK_INT >= 31 ? ub.j(h.a) : null;
            if (j != null) {
                ydVar = new yd(j);
            }
        }
        dw5Var.k.setValue(ydVar);
        synchronized (ws4.c) {
            o43 o43Var = ws4.j.h;
            if (o43Var != null) {
                if (o43Var.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            ws4.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            r12 r12Var = this.v;
            r12Var.L = false;
            r12Var.M = false;
            r12Var.N = null;
            WeakHashMap weakHashMap = dr5.a;
            vq5.c(view, r12Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(r12Var);
            ev5.a(view, r12Var);
        }
        this.u++;
    }
}

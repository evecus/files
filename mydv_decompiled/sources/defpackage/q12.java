package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q12 extends wu5 implements Runnable, yd3, View.OnAttachStateChangeListener {
    public boolean K;
    public int L;
    public yv5 M;
    public final n43 N;
    public final gk3 O;
    public final e43 P;
    public final gt4 Q;

    public q12() {
        super(1);
        n43 n43Var = new n43(9);
        fw5.a.getClass();
        n43Var.m(ew5.b, new xw5("caption bar"));
        n43Var.m(ew5.c, new xw5("display cutout"));
        n43Var.m(ew5.d, new xw5("ime"));
        n43Var.m(ew5.e, new xw5("mandatory system gestures"));
        n43Var.m(ew5.f, new xw5("navigation bars"));
        n43Var.m(ew5.g, new xw5("status bars"));
        n43Var.m(ew5.h, new xw5("system gestures"));
        n43Var.m(ew5.i, new xw5("tappable element"));
        n43Var.m(ew5.j, new xw5("waterfall"));
        this.N = n43Var;
        this.O = new gk3(0);
        this.P = new e43(4);
        this.Q = new gt4();
    }

    @Override // defpackage.wu5
    public final void a(ev5 ev5Var) {
        boolean z = false;
        this.K = false;
        int d = ev5Var.a.d();
        this.L &= ~d;
        this.M = null;
        fw5 fw5Var = (fw5) hw5.a.b(d);
        if (fw5Var != null) {
            Object g = this.N.g(fw5Var);
            g.getClass();
            xw5 xw5Var = (xw5) g;
            xw5Var.c.i(0.0f);
            xw5Var.e.i(1.0f);
            xw5Var.d.i(0L);
            xw5Var.c.i(0.0f);
            xw5Var.b.setValue(Boolean.FALSE);
            xw5Var.j = -1L;
            xw5Var.k = -1L;
            gk3 gk3Var = this.O;
            gk3Var.i(gk3Var.h() + 1);
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
    }

    @Override // defpackage.wu5
    public final void b(ev5 ev5Var) {
        this.K = true;
    }

    @Override // defpackage.wu5
    public final yv5 c(yv5 yv5Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ev5 ev5Var = (ev5) list.get(i);
            fw5 fw5Var = (fw5) hw5.a.b(ev5Var.a.d());
            if (fw5Var != null) {
                Object g = this.N.g(fw5Var);
                g.getClass();
                xw5 xw5Var = (xw5) g;
                if (((Boolean) xw5Var.b.getValue()).booleanValue()) {
                    dv5 dv5Var = ev5Var.a;
                    xw5Var.c.i(dv5Var.c());
                    xw5Var.e.i(dv5Var.a());
                    xw5Var.d.i(dv5Var.b());
                }
            }
        }
        e(yv5Var);
        return yv5Var;
    }

    @Override // defpackage.wu5
    public final da d(ev5 ev5Var, da daVar) {
        yv5 yv5Var = this.M;
        boolean z = false;
        this.K = false;
        this.M = null;
        if (ev5Var.a.b() > 0 && yv5Var != null) {
            int d = ev5Var.a.d();
            this.L |= d;
            fw5 fw5Var = (fw5) hw5.a.b(d);
            if (fw5Var != null) {
                Object g = this.N.g(fw5Var);
                g.getClass();
                xw5 xw5Var = (xw5) g;
                o12 i = yv5Var.a.i(d);
                long j = (i.a << 48) | (i.b << 32) | (i.c << 16) | i.d;
                long j2 = xw5Var.h;
                if (!wi4.i(j, j2)) {
                    xw5Var.j = j2;
                    xw5Var.k = j;
                    xw5Var.b.setValue(Boolean.TRUE);
                    dv5 dv5Var = ev5Var.a;
                    xw5Var.c.i(dv5Var.c());
                    xw5Var.e.i(dv5Var.a());
                    xw5Var.d.i(dv5Var.b());
                    gk3 gk3Var = this.O;
                    gk3Var.i(gk3Var.h() + 1);
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
                        return daVar;
                    }
                }
            }
        }
        return daVar;
    }

    public final void e(yv5 yv5Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        q33 q33Var = hw5.a;
        int[] iArr3 = q33Var.b;
        Object[] objArr3 = q33Var.c;
        long[] jArr3 = q33Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            fw5 fw5Var = (fw5) objArr3[i6];
                            o12 i8 = yv5Var.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (i8.a << 48) | (i8.b << 32) | (i8.c << 16) | i8.d;
                            Object g = this.N.g(fw5Var);
                            g.getClass();
                            xw5 xw5Var = (xw5) g;
                            j2 = j3;
                            if (!wi4.i(j4, xw5Var.h)) {
                                xw5Var.h = j4;
                                z2 = true;
                                if (!wi4.i(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                o12 j5 = yv5Var.a.j(i7);
                                objArr2 = objArr3;
                                long j6 = (j5.b << 32) | (j5.a << 48) | (j5.c << 16) | j5.d;
                                if (!wi4.i(xw5Var.i, j6)) {
                                    xw5Var.i = j6;
                                    z2 = true;
                                    if (!wi4.i(j6, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            xw5Var.a.setValue(Boolean.valueOf(yv5Var.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        tx0 h = yv5Var.a.h();
        if (h == null) {
            j = 0;
        } else {
            o12 a = h.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        n43 n43Var = this.N;
        fw5.a.getClass();
        Object g2 = n43Var.g(ew5.j);
        g2.getClass();
        xw5 xw5Var2 = (xw5) g2;
        xw5Var2.a.setValue(Boolean.valueOf(!wi4.i(j, 0L)));
        if (!wi4.i(xw5Var2.h, j)) {
            xw5Var2.h = j;
            xw5Var2.i = j;
            z2 = z;
            if (!wi4.i(j, 0L)) {
                z3 = z2;
            }
        }
        if (h == null) {
            e43 e43Var = this.P;
            if (e43Var.b > 0) {
                e43Var.d();
                this.Q.clear();
                z2 = z;
            }
        } else {
            List k = Build.VERSION.SDK_INT >= 28 ? ck.k(h.a) : Collections.EMPTY_LIST;
            int size = k.size();
            e43 e43Var2 = this.P;
            if (size < e43Var2.b) {
                e43Var2.m(k.size(), this.P.b);
                this.Q.f(k.size(), this.Q.size());
                z2 = z;
            } else {
                int size2 = k.size() - this.P.b;
                int i9 = 0;
                while (i9 < size2) {
                    e43 e43Var3 = this.P;
                    e43Var3.a(ad4.w(k.get(e43Var3.b)));
                    this.Q.add(new y02(hf1.u(this.P.b, "display cutout rect ")));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = k.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) k.get(i10);
                t43 t43Var = (t43) this.P.g(i10);
                if (!j42.c(t43Var.getValue(), rect)) {
                    t43Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!k.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.O.h() != 0) && z2) {
            gk3 gk3Var = this.O;
            gk3Var.i(gk3Var.h() + 1);
            synchronized (ws4.c) {
                o43 o43Var = ws4.j.h;
                if (o43Var != null) {
                    boolean z5 = z;
                    z4 = o43Var.c() == z5 ? z5 : false;
                }
            }
            if (z4) {
                ws4.c();
            }
        }
    }

    @Override // defpackage.yd3
    public final yv5 j(View view, yv5 yv5Var) {
        if (this.K) {
            this.M = yv5Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return yv5Var;
            }
        } else if (this.L == 0) {
            e(yv5Var);
        }
        return yv5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = dr5.a;
        vq5.c(view, this);
        ev5.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = dr5.a;
        vq5.c(view, null);
        ev5.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.K) {
            this.L = 0;
            this.K = false;
            yv5 yv5Var = this.M;
            if (yv5Var != null) {
                e(yv5Var);
                this.M = null;
            }
        }
    }
}

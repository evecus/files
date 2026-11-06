package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.recyclerview.widget.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class da implements w60, ty4, yy4, l10, z94 {
    public final /* synthetic */ byte I;
    public Object J;
    public Object K;

    public da(byte b) {
        this.I = b;
        switch (b) {
            case 5:
                this.J = new b53(new wa2[16]);
                break;
            case 12:
                this.J = new o63((byte) 20);
                this.K = new ss2(16);
                break;
            case 14:
                this.J = new oo4(0);
                this.K = new bs2((Object) null);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void j(wa2 wa2Var) {
        if (wa2Var.x0 > 0) {
            if (wa2Var.o0.d == sa2.M && !wa2Var.q() && !wa2Var.r() && !wa2Var.y0 && wa2Var.L()) {
                ja3 ja3Var = wa2Var.n0;
                if ((ja3Var.f.getAggregateChildKindSet$ui() & 256) != 0) {
                    for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                        if ((k13Var.getKindSet$ui() & 256) != 0) {
                            wt0 wt0Var = k13Var;
                            ?? r5 = 0;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof vq1) {
                                    vq1 vq1Var = (vq1) wt0Var;
                                    vq1Var.O(ut0.S(vq1Var, 256));
                                } else if ((wt0Var.getKindSet$ui() & 256) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var2 = wt0Var.J;
                                    int i = 0;
                                    wt0Var = wt0Var;
                                    r5 = r5;
                                    while (k13Var2 != null) {
                                        if ((k13Var2.getKindSet$ui() & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                wt0Var = k13Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r5.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r5.c(k13Var2);
                                            }
                                        }
                                        k13Var2 = k13Var2.getChild$ui();
                                        wt0Var = wt0Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r5);
                            }
                        }
                        if ((k13Var.getAggregateChildKindSet$ui() & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            wa2Var.w0 = false;
            b53 A = wa2Var.A();
            Object[] objArr = A.I;
            int i2 = A.K;
            for (int i3 = 0; i3 < i2; i3++) {
                j((wa2) objArr[i3]);
            }
        }
    }

    @Override // defpackage.z94
    public Object a(Object obj) {
        return ((tm1) this.K).invoke(obj);
    }

    @Override // defpackage.ty4
    public uy4 apply() {
        kb2 kb2Var = (kb2) this.J;
        cb2 m = m();
        if (m != null) {
            kb2Var.a(m, false);
        }
        return kb2Var.e(this.K);
    }

    @Override // defpackage.z94
    public Object b(f94 f94Var, Object obj) {
        return ((hn1) this.J).invoke(f94Var, obj);
    }

    @Override // defpackage.yy4
    public void c(xy4 xy4Var) {
        a43 a43Var = (a43) this.K;
        a43Var.a();
        f43 f43Var = (f43) xy4Var.J;
        Object[] objArr = f43Var.b;
        long[] jArr = f43Var.c;
        int i = f43Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object b = ((le2) this.J).b(obj);
            int d = a43Var.d(b);
            int i3 = d >= 0 ? a43Var.c[d] : 0;
            if (i3 == 7) {
                xy4Var.remove(obj);
            } else {
                a43Var.g(b, i3 + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.ty4, defpackage.l10
    public void cancel() {
        switch (this.I) {
            case 2:
                cb2 m = m();
                if ((m != null ? m.f : null) != null) {
                    ((kb2) this.J).g(this.K);
                    break;
                }
                break;
            default:
                if (!((xq) this.K).compareAndSet(1, 1)) {
                    ((ls) this.J).invoke();
                    break;
                }
                break;
        }
    }

    public void d(g gVar, rs rsVar) {
        oo4 oo4Var = (oo4) this.J;
        kr5 kr5Var = (kr5) oo4Var.get(gVar);
        if (kr5Var == null) {
            kr5Var = kr5.b();
            oo4Var.put(gVar, kr5Var);
        }
        kr5Var.c = rsVar;
        kr5Var.a |= 8;
    }

    @Override // defpackage.ty4
    public boolean e(eq0 eq0Var) {
        cb2 m = m();
        ml3 ml3Var = m != null ? m.f : null;
        if (ml3Var == null || ml3Var.c()) {
            return true;
        }
        ns4 i = o63.i();
        tm1 e = i != null ? i.e() : null;
        ns4 j = o63.j(i);
        try {
            return ml3Var.e(eq0Var);
        } catch (Throwable th) {
            try {
                m.getClass();
                throw th;
            } finally {
                o63.o(i, j, e);
            }
        }
    }

    public Bundle f(String str) {
        Bundle bundle;
        v94 v94Var = (v94) this.J;
        if (!v94Var.g) {
            zy.i("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = v94Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                jl2.W(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            v94Var.f = null;
        }
        return bundle;
    }

    @Override // defpackage.yy4
    public boolean g(Object obj, Object obj2) {
        le2 le2Var = (le2) this.J;
        return j42.c(le2Var.b(obj), le2Var.b(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.J
            b53 r0 = (defpackage.b53) r0
            java.lang.Object[] r1 = r0.I
            int r2 = r0.K
            r3 = 0
            se3 r4 = defpackage.se3.J
            java.util.Arrays.sort(r1, r3, r2, r4)
            int r1 = r0.K
            java.lang.Object r2 = r6.K
            wa2[] r2 = (defpackage.wa2[]) r2
            if (r2 == 0) goto L19
            int r4 = r2.length
            if (r4 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            wa2[] r2 = new defpackage.wa2[r2]
        L21:
            r4 = 0
            r6.K = r4
        L24:
            if (r3 >= r1) goto L2f
            java.lang.Object[] r5 = r0.I
            r5 = r5[r3]
            r2[r3] = r5
            int r3 = r3 + 1
            goto L24
        L2f:
            r0.h()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r3 = r0.w0
            if (r3 == 0) goto L43
            j(r0)
        L43:
            r2[r1] = r4
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.K = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.h():void");
    }

    @Override // defpackage.ty4
    public boolean i() {
        ml3 ml3Var;
        cb2 m = m();
        if (m == null || (ml3Var = m.f) == null) {
            return true;
        }
        return ml3Var.c();
    }

    public View k(int i, int i2, int i3, int i4) {
        View t;
        qq5 qq5Var = (qq5) this.K;
        x14 x14Var = (x14) this.J;
        int d = x14Var.d();
        int c = x14Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (x14Var.a) {
                case 0:
                    t = x14Var.b.t(i);
                    break;
                default:
                    t = x14Var.b.t(i);
                    break;
            }
            int b = x14Var.b(t);
            int a = x14Var.a(t);
            qq5Var.b = d;
            qq5Var.c = c;
            qq5Var.d = b;
            qq5Var.e = a;
            if (i3 != 0) {
                qq5Var.a = i3;
                if (qq5Var.a()) {
                    return t;
                }
            }
            if (i4 != 0) {
                qq5Var.a = i4;
                if (qq5Var.a()) {
                    view = t;
                }
            }
            i += i5;
        }
        return view;
    }

    public ClipboardManager l() {
        ClipboardManager clipboardManager = (ClipboardManager) this.K;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.J).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.K = clipboardManager2;
        return clipboardManager2;
    }

    public cb2 m() {
        kb2 kb2Var = (kb2) this.J;
        wa2 wa2Var = (wa2) kb2Var.R.g(this.K);
        if (wa2Var != null) {
            return (cb2) kb2Var.N.g(wa2Var);
        }
        return null;
    }

    public u94 n(String str) {
        u94 u94Var;
        v94 v94Var = (v94) this.J;
        synchronized (v94Var.c) {
            Iterator it = v94Var.d.entrySet().iterator();
            do {
                u94Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                u94 u94Var2 = (u94) entry.getValue();
                if (j42.c(str2, str)) {
                    u94Var = u94Var2;
                }
            } while (u94Var == null);
        }
        return u94Var;
    }

    public boolean o(View view) {
        qq5 qq5Var = (qq5) this.K;
        x14 x14Var = (x14) this.J;
        int d = x14Var.d();
        int c = x14Var.c();
        int b = x14Var.b(view);
        int a = x14Var.a(view);
        qq5Var.b = d;
        qq5Var.c = c;
        qq5Var.d = b;
        qq5Var.e = a;
        qq5Var.a = 24579;
        return qq5Var.a();
    }

    public void p(Bundle bundle) {
        v94 v94Var = (v94) this.J;
        w94 w94Var = v94Var.a;
        if (!v94Var.e) {
            v94Var.a();
        }
        if (((xi2) w94Var.k()).i.compareTo(ki2.L) >= 0) {
            s83.k(((xi2) w94Var.k()).i, "performRestore cannot be called when owner is ");
            return;
        }
        if (v94Var.g) {
            zy.i("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                jl2.W("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        v94Var.f = bundle2;
        v94Var.g = true;
    }

    public void q(Bundle bundle) {
        v94 v94Var = (v94) this.J;
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        Bundle bundle2 = v94Var.f;
        if (bundle2 != null) {
            b0.putAll(bundle2);
        }
        synchronized (v94Var.c) {
            for (Map.Entry entry : v94Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((u94) entry.getValue()).a();
                str.getClass();
                b0.putBundle(str, a);
            }
        }
        if (b0.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", b0);
    }

    public rs r(g gVar, int i) {
        kr5 kr5Var;
        rs rsVar;
        oo4 oo4Var = (oo4) this.J;
        int c = oo4Var.c(gVar);
        if (c >= 0 && (kr5Var = (kr5) oo4Var.h(c)) != null) {
            int i2 = kr5Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                kr5Var.a = i3;
                if (i == 4) {
                    rsVar = kr5Var.b;
                } else if (i == 8) {
                    rsVar = kr5Var.c;
                } else {
                    s83.t("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    oo4Var.f(c);
                    kr5.c(kr5Var);
                }
                return rsVar;
            }
        }
        return null;
    }

    public void s(String str, u94 u94Var) {
        v94 v94Var = (v94) this.J;
        synchronized (v94Var.c) {
            if (v94Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            v94Var.d.put(str, u94Var);
        }
    }

    public void t(g gVar) {
        kr5 kr5Var = (kr5) ((oo4) this.J).get(gVar);
        if (kr5Var == null) {
            return;
        }
        kr5Var.a &= -2;
    }

    public String toString() {
        switch (this.I) {
            case 15:
                return "Bounds{lower=" + ((o12) this.J) + " upper=" + ((o12) this.K) + "}";
            default:
                return super.toString();
        }
    }

    public void u(g gVar) {
        bs2 bs2Var = (bs2) this.K;
        int i = bs2Var.i() - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (gVar == bs2Var.j(i)) {
                Object[] objArr = bs2Var.K;
                Object obj = objArr[i];
                Object obj2 = eu5.o;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    bs2Var.I = true;
                }
            } else {
                i--;
            }
        }
        kr5 kr5Var = (kr5) ((oo4) this.J).remove(gVar);
        if (kr5Var != null) {
            kr5.c(kr5Var);
        }
    }

    public void v() {
        if (!((v94) this.J).h) {
            zy.i("Can not perform this action after onSaveInstanceState");
            return;
        }
        k14 k14Var = (k14) this.K;
        if (k14Var == null) {
            k14Var = new k14(this);
        }
        this.K = k14Var;
        try {
            mh2.class.getDeclaredConstructor(null);
            k14 k14Var2 = (k14) this.K;
            if (k14Var2 != null) {
                k14Var2.b(mh2.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + mh2.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public /* synthetic */ da(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    public da(v94 v94Var) {
        this.I = (byte) 9;
        this.J = v94Var;
        this.K = new da(v94Var, (byte) 8);
    }

    public /* synthetic */ da(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    public da(is0 is0Var, qi3 qi3Var, cj3 cj3Var) {
        this.I = (byte) 7;
        this.J = is0Var;
        this.K = qi3Var;
    }

    public da(ls lsVar) {
        this.I = (byte) 6;
        this.J = lsVar;
        this.K = new xq(0);
    }

    public da(x14 x14Var) {
        this.I = (byte) 13;
        this.J = x14Var;
        qq5 qq5Var = new qq5();
        qq5Var.a = 0;
        this.K = qq5Var;
    }

    public da(le2 le2Var) {
        this.I = (byte) 3;
        this.J = le2Var;
        a43 a43Var = dd3.a;
        this.K = new a43();
    }

    public da(WindowInsetsAnimation.Bounds bounds) {
        this.I = (byte) 15;
        this.J = cv5.g(bounds);
        this.K = cv5.f(bounds);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class si4 {
    public final k13 a;
    public final boolean b;
    public final wa2 c;
    public final ki4 d;
    public si4 e;
    public final int f;

    public si4(k13 k13Var, boolean z, wa2 wa2Var, ki4 ki4Var) {
        this.a = k13Var;
        this.b = z;
        this.c = wa2Var;
        this.d = ki4Var;
        this.f = wa2Var.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
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
    public final m14 a(na3 na3Var) {
        wt0 wt0Var;
        si4 l = l();
        if (l == null) {
            return m14.e;
        }
        ja3 ja3Var = l.c.n0;
        if ((ja3Var.f.getAggregateChildKindSet$ui() & 8) != 0) {
            loop0: for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                if ((k13Var.getKindSet$ui() & 8) != 0) {
                    wt0Var = k13Var;
                    ?? r5 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof pi4) {
                            if (wt0Var.isImportantForBounds()) {
                                break loop0;
                            }
                        } else if ((wt0Var.getKindSet$ui() & 8) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var2 = wt0Var.J;
                            int i = 0;
                            wt0Var = wt0Var;
                            r5 = r5;
                            while (k13Var2 != null) {
                                if ((k13Var2.getKindSet$ui() & 8) != 0) {
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
                if ((k13Var.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
        }
        wt0Var = 0;
        pi4 pi4Var = (pi4) wt0Var;
        na3 S = pi4Var != null ? ut0.S(pi4Var, 8) : null;
        return S == null ? l.a(na3Var) : S.J(na3Var, true);
    }

    public final si4 b(t64 t64Var, tm1 tm1Var) {
        ki4 ki4Var = new ki4();
        ki4Var.K = false;
        ki4Var.L = false;
        tm1Var.invoke(ki4Var);
        si4 si4Var = new si4(new ri4(tm1Var), false, new wa2(true, this.f + (t64Var != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000)), ki4Var);
        si4Var.e = this;
        return si4Var;
    }

    public final void c(wa2 wa2Var, ArrayList arrayList) {
        b53 z = wa2Var.z();
        Object[] objArr = z.I;
        int i = z.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (wa2Var2.K() && !wa2Var2.y0) {
                if (wa2Var2.n0.c(8)) {
                    arrayList.add(ui4.a(wa2Var2, this.b));
                } else {
                    c(wa2Var2, arrayList);
                }
            }
        }
    }

    public final na3 d() {
        if (!n()) {
            pi4 f = f();
            return f != null ? ut0.S(f, 8) : this.c.n0.c;
        }
        si4 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            si4 si4Var = (si4) arrayList.get(size2);
            if (si4Var.o()) {
                arrayList2.add(si4Var);
            } else if (!si4Var.d.L) {
                si4Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pi4 f() {
        k13 k13Var;
        boolean z;
        boolean z2 = this.d.K;
        Object obj = null;
        wa2 wa2Var = this.c;
        if (!z2) {
            ja3 ja3Var = wa2Var.n0;
            if ((ja3Var.f.getAggregateChildKindSet$ui() & 8) != 0) {
                loop3: for (k13 k13Var2 = ja3Var.f; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                    if ((k13Var2.getKindSet$ui() & 8) != 0) {
                        k13Var = k13Var2;
                        b53 b53Var = null;
                        while (k13Var != null) {
                            if (k13Var instanceof pi4) {
                                if (((pi4) k13Var).isImportantForBounds()) {
                                    obj = k13Var;
                                }
                            } else if ((k13Var.getKindSet$ui() & 8) != 0 && (k13Var instanceof wt0)) {
                                int i = 0;
                                for (k13 k13Var3 = ((wt0) k13Var).J; k13Var3 != null; k13Var3 = k13Var3.getChild$ui()) {
                                    if ((k13Var3.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            k13Var = k13Var3;
                                        } else {
                                            if (b53Var == null) {
                                                b53Var = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var.c(k13Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var);
                        }
                    }
                    if ((k13Var2.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                }
            }
            return (pi4) obj;
        }
        ja3 ja3Var2 = wa2Var.n0;
        if ((ja3Var2.f.getAggregateChildKindSet$ui() & 8) != 0) {
            k13Var = null;
            for (k13 k13Var4 = ja3Var2.f; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                if ((k13Var4.getKindSet$ui() & 8) != 0) {
                    k13 k13Var5 = k13Var4;
                    b53 b53Var2 = null;
                    while (k13Var5 != null) {
                        if (k13Var5 instanceof pi4) {
                            pi4 pi4Var = (pi4) k13Var5;
                            if (pi4Var.isImportantForBounds()) {
                                if (pi4Var.getShouldMergeDescendantSemantics()) {
                                    return pi4Var;
                                }
                                if (k13Var == null) {
                                    k13Var = pi4Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (k13Var5.getKindSet$ui() & 8) != 0 && (k13Var5 instanceof wt0)) {
                            int i2 = 0;
                            for (k13 k13Var6 = ((wt0) k13Var5).J; k13Var6 != null; k13Var6 = k13Var6.getChild$ui()) {
                                if ((k13Var6.getKindSet$ui() & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        k13Var5 = k13Var6;
                                    } else {
                                        if (b53Var2 == null) {
                                            b53Var2 = new b53(new k13[16]);
                                        }
                                        if (k13Var5 != null) {
                                            b53Var2.c(k13Var5);
                                            k13Var5 = null;
                                        }
                                        b53Var2.c(k13Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        k13Var5 = ut0.M(b53Var2);
                    }
                }
                if ((k13Var4.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
            obj = k13Var;
        }
        return (pi4) obj;
    }

    public final m14 g() {
        na3 d = d();
        if (d != null) {
            if (!d.h()) {
                d = null;
            }
            if (d != null) {
                return mu0.q(d).J(d, true);
            }
        }
        return m14.e;
    }

    public final m14 h() {
        na3 d = d();
        if (d != null) {
            if (!d.h()) {
                d = null;
            }
            if (d != null) {
                return mu0.i(d, true);
            }
        }
        return m14.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.L) {
            return o91.I;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final ki4 k() {
        boolean o = o();
        ki4 ki4Var = this.d;
        if (!o) {
            return ki4Var;
        }
        ki4 d = ki4Var.d();
        p(new ArrayList(), d);
        return d;
    }

    public final si4 l() {
        wa2 wa2Var;
        si4 si4Var = this.e;
        if (si4Var != null) {
            return si4Var;
        }
        wa2 wa2Var2 = this.c;
        boolean z = this.b;
        if (z) {
            wa2Var = wa2Var2.v();
            while (wa2Var != null) {
                ki4 x = wa2Var.x();
                if (x != null && x.K) {
                    break;
                }
                wa2Var = wa2Var.v();
            }
        }
        wa2Var = null;
        if (wa2Var == null) {
            wa2 v = wa2Var2.v();
            while (true) {
                if (v == null) {
                    wa2Var = null;
                    break;
                }
                if (v.n0.c(8)) {
                    wa2Var = v;
                    break;
                }
                v = v.v();
            }
        }
        if (wa2Var == null) {
            return null;
        }
        return ui4.a(wa2Var, z);
    }

    public final m14 m() {
        pi4 f = f();
        if (f == null) {
            return this.c.n0.c.h1();
        }
        k13 node = f.getNode();
        Object g = this.d.I.g(ii4.b);
        if (g == null) {
            g = null;
        }
        return qi4.e(node, g != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.K;
    }

    public final void p(ArrayList arrayList, ki4 ki4Var) {
        if (this.d.L) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            si4 si4Var = (si4) arrayList.get(size2);
            if (!si4Var.o()) {
                ki4Var.f(si4Var.d);
                si4Var.p(arrayList, ki4Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return o91.I;
        }
        c(this.c, arrayList);
        if (z) {
            ki4 ki4Var = this.d;
            n43 n43Var = ki4Var.I;
            Object g = n43Var.g(zi4.z);
            if (g == null) {
                g = null;
            }
            t64 t64Var = (t64) g;
            if (t64Var != null && ki4Var.K && !arrayList.isEmpty()) {
                arrayList.add(b(t64Var, new i9(t64Var, (byte) 22)));
            }
            bj4 bj4Var = zi4.a;
            if (n43Var.c(bj4Var) && !arrayList.isEmpty() && ki4Var.K) {
                Object g2 = n43Var.g(bj4Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) o70.U0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new nw1(str, (byte) 2)));
                }
            }
        }
        return arrayList;
    }
}

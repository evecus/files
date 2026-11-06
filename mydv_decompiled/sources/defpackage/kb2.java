package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kb2 implements ld0 {
    public final wa2 I;
    public re0 J;
    public yy4 K;
    public int L;
    public int M;
    public final n43 N;
    public final n43 O;
    public final eb2 P;
    public final bb2 Q;
    public final n43 R;
    public final xy4 S;
    public final n43 T;
    public final b53 U;
    public int V;
    public int W;
    public final String X;

    public kb2(wa2 wa2Var, yy4 yy4Var) {
        this.I = wa2Var;
        this.K = yy4Var;
        long[] jArr = ia4.a;
        this.N = new n43();
        this.O = new n43();
        this.P = new eb2(this);
        this.Q = new bb2(this);
        this.R = new n43();
        this.S = new xy4();
        this.T = new n43();
        this.U = new b53(new Object[16]);
        this.X = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void c(cb2 cb2Var) {
        o43 o43Var;
        ml3 ml3Var = cb2Var.f;
        if (ml3Var != null) {
            ml3Var.h.set(ol3.J);
            j34 j34Var = ml3Var.k;
            if (j34Var.d.c()) {
                o43Var = j34Var.d;
                o43 o43Var2 = ka4.a;
                j34Var.d = new o43();
                j34Var.c.h();
            } else {
                o43Var = null;
            }
            j34Var.b();
            we0 we0Var = ml3Var.a;
            we0Var.Y = null;
            if (o43Var != null) {
                we0Var.c0.k = o43Var;
                we0Var.e0 = (byte) 2;
            }
            cb2Var.f = null;
            we0 we0Var2 = cb2Var.c;
            if (we0Var2 != null) {
                we0Var2.dispose();
            }
            cb2Var.c = null;
        }
    }

    public final void a(cb2 cb2Var, boolean z) {
        ml3 ml3Var = cb2Var.f;
        if (ml3Var != null) {
            ns4 i = o63.i();
            tm1 e = i != null ? i.e() : null;
            ns4 j = o63.j(i);
            try {
                wa2 wa2Var = this.I;
                wa2Var.Y = true;
                if (z) {
                    while (!ml3Var.c()) {
                        try {
                            ml3Var.e(new zl1((byte) 12));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ml3Var.a();
                cb2Var.f = null;
                wa2Var.Y = false;
            } finally {
                o63.o(i, j, e);
            }
        }
    }

    @Override // defpackage.ld0
    public final void b() {
        we0 we0Var;
        wa2 wa2Var = this.I;
        wa2Var.Y = true;
        n43 n43Var = this.N;
        Object[] objArr = n43Var.c;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (we0Var = ((cb2) objArr[(i << 3) + i3]).c) != null) {
                            we0Var.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        wa2Var.S();
        wa2Var.Y = false;
        n43Var.a();
        this.O.a();
        this.W = 0;
        this.V = 0;
        this.R.a();
        h();
    }

    @Override // defpackage.ld0
    public final void d() {
        j(true);
    }

    public final uy4 e(Object obj) {
        return !this.I.K() ? new ib2() : new jb2(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.V = 0;
        List p = this.I.p();
        a53 a53Var = (a53) p;
        int i2 = (a53Var.I.K - this.W) - 1;
        if (i <= i2) {
            this.S.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.N.g((wa2) a53Var.get(i3));
                    g.getClass();
                    ((f43) this.S.J).a(((cb2) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.K.c(this.S);
            ns4 i4 = o63.i();
            tm1 e = i4 != null ? i4.e() : null;
            ns4 j = o63.j(i4);
            z = false;
            while (i2 >= i) {
                try {
                    wa2 wa2Var = (wa2) ((a53) p).get(i2);
                    Object g2 = this.N.g(wa2Var);
                    g2.getClass();
                    cb2 cb2Var = (cb2) g2;
                    Object obj = cb2Var.a;
                    if (((f43) this.S.J).c(obj)) {
                        this.V++;
                        if (((Boolean) cb2Var.g.getValue()).booleanValue()) {
                            ab2 ab2Var = wa2Var.o0;
                            ab2Var.p.T = ua2.K;
                            ns2 ns2Var = ab2Var.q;
                            if (ns2Var != null) {
                                ns2Var.F0();
                            }
                            m(cb2Var, false);
                            if (cb2Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        wa2 wa2Var2 = this.I;
                        wa2Var2.Y = true;
                        this.N.k(wa2Var);
                        we0 we0Var = cb2Var.c;
                        if (we0Var != null) {
                            we0Var.dispose();
                        }
                        this.I.T(i2, 1);
                        wa2Var2.Y = false;
                    }
                    this.O.k(obj);
                    i2--;
                } catch (Throwable th) {
                    o63.o(i4, j, e);
                    throw th;
                }
            }
            o63.o(i4, j, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ws4.c) {
                o43 o43Var = ws4.j.h;
                if (o43Var != null) {
                    if (o43Var.c()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ws4.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        wa2 wa2Var = (wa2) this.R.k(obj);
        wa2 wa2Var2 = this.I;
        if (wa2Var != null) {
            if (this.W <= 0) {
                q02.b("No pre-composed items to dispose");
            }
            int j = ((a53) wa2Var2.p()).I.j(wa2Var);
            if (j < ((a53) wa2Var2.p()).I.K - this.W) {
                q02.b("Item is not in pre-composed item range");
            }
            this.V++;
            this.W--;
            cb2 cb2Var = (cb2) this.N.g(wa2Var);
            if (cb2Var != null) {
                c(cb2Var);
            }
            int i = (((a53) wa2Var2.p()).I.K - this.W) - this.V;
            k(j, i);
            f(i);
        }
        if (this.U.i(obj)) {
            wa2.Y(wa2Var2, true, 6);
        }
    }

    public final void h() {
        int i = ((a53) this.I.p()).I.K;
        int i2 = this.N.e;
        if (i2 != i) {
            q02.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.V;
        int i4 = this.W;
        if ((i - i3) - i4 < 0) {
            StringBuilder D = hf1.D("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            D.append(i4);
            q02.a(D.toString());
        }
        int i5 = this.R.e;
        int i6 = this.W;
        if (i5 == i6) {
            return;
        }
        q02.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    @Override // defpackage.ld0
    public final void i() {
        j(false);
    }

    public final void j(boolean z) {
        this.W = 0;
        this.R.a();
        List p = this.I.p();
        int i = ((a53) p).I.K;
        if (this.V != i) {
            this.V = i;
            ns4 i2 = o63.i();
            tm1 e = i2 != null ? i2.e() : null;
            ns4 j = o63.j(i2);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    wa2 wa2Var = (wa2) ((a53) p).get(i3);
                    cb2 cb2Var = (cb2) this.N.g(wa2Var);
                    if (cb2Var != null && ((Boolean) cb2Var.g.getValue()).booleanValue()) {
                        ab2 ab2Var = wa2Var.o0;
                        ab2Var.p.T = ua2.K;
                        ns2 ns2Var = ab2Var.q;
                        if (ns2Var != null) {
                            ns2Var.F0();
                        }
                        m(cb2Var, z);
                        cb2Var.a = i42.o;
                    }
                } catch (Throwable th) {
                    o63.o(i2, j, e);
                    throw th;
                }
            }
            o63.o(i2, j, e);
            this.O.a();
        }
        h();
    }

    public final void k(int i, int i2) {
        wa2 wa2Var = this.I;
        wa2Var.Y = true;
        wa2Var.O(i, i2, 1);
        wa2Var.Y = false;
    }

    public final void l(Object obj, hn1 hn1Var, boolean z) {
        wa2 wa2Var = this.I;
        if (wa2Var.K()) {
            h();
            if (this.O.c(obj)) {
                return;
            }
            this.T.k(obj);
            n43 n43Var = this.R;
            Object g = n43Var.g(obj);
            if (g == null) {
                g = o(obj);
                if (g != null) {
                    k(((a53) wa2Var.p()).I.j(g), ((a53) wa2Var.p()).I.K);
                    this.W++;
                } else {
                    int i = ((a53) wa2Var.p()).I.K;
                    wa2 wa2Var2 = new wa2(2);
                    wa2Var.Y = true;
                    wa2Var.C(wa2Var2, i);
                    wa2Var.Y = false;
                    this.W++;
                    g = wa2Var2;
                }
                n43Var.m(obj, g);
            }
            n((wa2) g, obj, z, hn1Var);
        }
    }

    public final void m(cb2 cb2Var, boolean z) {
        we0 we0Var;
        if (z || !cb2Var.h) {
            cb2Var.g = ad4.w(Boolean.FALSE);
        } else {
            cb2Var.g.setValue(Boolean.FALSE);
        }
        if (cb2Var.f != null) {
            c(cb2Var);
            return;
        }
        if (z) {
            we0 we0Var2 = cb2Var.c;
            if (we0Var2 != null) {
                we0Var2.o();
                return;
            }
            return;
        }
        tg3 outOfFrameExecutor = za2.a(this.I).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.schedule(new eq(cb2Var, (byte) 14));
        } else {
            if (cb2Var.h || (we0Var = cb2Var.c) == null) {
                return;
            }
            we0Var.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bd, B:49:0x00d2, B:51:0x00d6, B:52:0x011c, B:55:0x00e3, B:56:0x00ee, B:58:0x00f2, B:60:0x0109, B:63:0x0113, B:64:0x010e, B:65:0x0119, B:66:0x00c0, B:69:0x0092, B:71:0x00a0, B:72:0x0126, B:73:0x0130), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bd, B:49:0x00d2, B:51:0x00d6, B:52:0x011c, B:55:0x00e3, B:56:0x00ee, B:58:0x00f2, B:60:0x0109, B:63:0x0113, B:64:0x010e, B:65:0x0119, B:66:0x00c0, B:69:0x0092, B:71:0x00a0, B:72:0x0126, B:73:0x0130), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bd, B:49:0x00d2, B:51:0x00d6, B:52:0x011c, B:55:0x00e3, B:56:0x00ee, B:58:0x00f2, B:60:0x0109, B:63:0x0113, B:64:0x010e, B:65:0x0119, B:66:0x00c0, B:69:0x0092, B:71:0x00a0, B:72:0x0126, B:73:0x0130), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bd, B:49:0x00d2, B:51:0x00d6, B:52:0x011c, B:55:0x00e3, B:56:0x00ee, B:58:0x00f2, B:60:0x0109, B:63:0x0113, B:64:0x010e, B:65:0x0119, B:66:0x00c0, B:69:0x0092, B:71:0x00a0, B:72:0x0126, B:73:0x0130), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.wa2 r10, java.lang.Object r11, boolean r12, defpackage.hn1 r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.n(wa2, java.lang.Object, boolean, hn1):void");
    }

    public final wa2 o(Object obj) {
        n43 n43Var;
        int i;
        if (this.V == 0) {
            return null;
        }
        a53 a53Var = (a53) this.I.p();
        int i2 = a53Var.I.K - this.W;
        int i3 = i2 - this.V;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            n43Var = this.N;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = n43Var.g((wa2) a53Var.get(i5));
            g.getClass();
            if (j42.c(((cb2) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = n43Var.g((wa2) a53Var.get(i4));
                g2.getClass();
                cb2 cb2Var = (cb2) g2;
                Object obj2 = cb2Var.a;
                if (obj2 == i42.o || this.K.g(obj, obj2)) {
                    cb2Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            k(i5, i3);
        }
        this.V--;
        wa2 wa2Var = (wa2) a53Var.get(i3);
        Object g3 = n43Var.g(wa2Var);
        g3.getClass();
        cb2 cb2Var2 = (cb2) g3;
        cb2Var2.g = ad4.w(Boolean.TRUE);
        cb2Var2.e = true;
        cb2Var2.d = true;
        return wa2Var;
    }
}

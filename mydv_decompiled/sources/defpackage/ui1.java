package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ui1 extends k13 implements ye0, si1, kd3, n13, tt0 {
    public final boolean I;
    public final hn1 J;
    public boolean K;
    public boolean L;
    public final int M;
    public i94 N;

    public ui1(int i, hn1 hn1Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        hn1Var = (i2 & 4) != 0 ? null : hn1Var;
        this.I = z;
        this.J = hn1Var;
        this.M = i;
    }

    @Override // defpackage.n13
    public final /* synthetic */ rt0 I() {
        return q91.c;
    }

    @Override // defpackage.kd3
    public final void U() {
        p0();
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean j0(int i) {
        int ordinal = vt0.P(i, this).ordinal();
        if (ordinal == 0) {
            return vt0.Q(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        s83.v();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [k13] */
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
    public final void k0(oi1 oi1Var, oi1 oi1Var2) {
        ja3 ja3Var;
        hn1 hn1Var;
        di1 di1Var = (di1) ut0.V(this).getFocusOwner();
        ui1 g = di1Var.g();
        if (!oi1Var.equals(oi1Var2) && (hn1Var = this.J) != null) {
            hn1Var.invoke(oi1Var, oi1Var2);
        }
        k13 node = getNode();
        if (!getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 node2 = getNode();
        wa2 U = ut0.U(this);
        while (U != null) {
            if ((U.n0.f.getAggregateChildKindSet$ui() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & 4096) != 0) {
                            wt0 wt0Var = node2;
                            ?? r5 = 0;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof ph1) {
                                    ph1 ph1Var = (ph1) wt0Var;
                                    if (g == di1Var.g()) {
                                        ph1Var.u(oi1Var2);
                                    }
                                } else if ((wt0Var.getKindSet$ui() & 4096) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var = wt0Var.J;
                                    int i = 0;
                                    wt0Var = wt0Var;
                                    r5 = r5;
                                    while (k13Var != null) {
                                        if ((k13Var.getKindSet$ui() & 4096) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                wt0Var = k13Var;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r5.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r5.c(k13Var);
                                            }
                                        }
                                        k13Var = k13Var.getChild$ui();
                                        wt0Var = wt0Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r5);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            U = U.v();
            node2 = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final gi1 l0() {
        boolean z;
        ja3 ja3Var;
        gi1 gi1Var = new gi1();
        gi1Var.a = true;
        ki1 ki1Var = ki1.b;
        gi1Var.b = ki1Var;
        gi1Var.c = ki1Var;
        gi1Var.d = ki1Var;
        gi1Var.e = ki1Var;
        gi1Var.f = ki1Var;
        gi1Var.g = ki1Var;
        gi1Var.h = ki1Var;
        gi1Var.i = ki1Var;
        gi1Var.j = new yy0((byte) 12);
        gi1Var.k = new yy0((byte) 13);
        gi1Var.l = q8.o0;
        int i = this.M;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((i12) ((k12) ((j12) j42.r(this, hf0.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                zy.i("Unknown Focusability");
                return null;
            }
            z = false;
        }
        gi1Var.a = z;
        k13 node = getNode();
        if (!getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 node2 = getNode();
        wa2 U = ut0.U(this);
        loop0: while (U != null) {
            if ((U.n0.f.getAggregateChildKindSet$ui() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 2048) != 0) {
                            ?? r7 = 0;
                            wt0 wt0Var = node2;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof ii1) {
                                    ((ii1) wt0Var).s(gi1Var);
                                } else if ((wt0Var.getKindSet$ui() & 2048) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var = wt0Var.J;
                                    int i2 = 0;
                                    wt0Var = wt0Var;
                                    r7 = r7;
                                    while (k13Var != null) {
                                        if ((k13Var.getKindSet$ui() & 2048) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                wt0Var = k13Var;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r7.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r7.c(k13Var);
                                            }
                                        }
                                        k13Var = k13Var.getChild$ui();
                                        wt0Var = wt0Var;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r7);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            U = U.v();
            node2 = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
        return gi1Var;
    }

    public final m14 m0(ca2 ca2Var) {
        m14 m14Var = l0().l;
        return m14Var != q8.o0 ? ca2Var == null ? m14Var : m14Var.i(ca2Var.I(ut0.T(this), 0L)) : ca2Var != null ? ca2Var.J(ut0.T(this), false) : sv2.g(0L, ut0.b0(ut0.T(this).K));
    }

    public final ee2 n0() {
        ja3 ja3Var;
        Object obj;
        if (!getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = getNode().getParent$ui();
        wa2 U = ut0.U(this);
        while (true) {
            if (U == null) {
                break;
            }
            if ((U.n0.f.getAggregateChildKindSet$ui() & 8388640) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 8388640) != 0) {
                        if ((8388608 & parent$ui.getKindSet$ui()) != 0) {
                            if (!(parent$ui instanceof ee2)) {
                                if (parent$ui instanceof wt0) {
                                    parent$ui = null;
                                    for (k13 k13Var = ((wt0) parent$ui).J; k13Var != null; k13Var = k13Var.getChild$ui()) {
                                        if (k13Var instanceof ee2) {
                                            parent$ui = k13Var;
                                        }
                                    }
                                } else {
                                    parent$ui = null;
                                }
                            }
                            ee2 ee2Var = (ee2) parent$ui;
                            if (ee2Var != null) {
                                return ee2Var;
                            }
                        } else if ((parent$ui.getKindSet$ui() & 32) == 0) {
                            continue;
                        } else {
                            if (parent$ui instanceof n13) {
                                obj = parent$ui;
                            } else if (parent$ui instanceof wt0) {
                                obj = null;
                                for (k13 k13Var2 = ((wt0) parent$ui).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if (k13Var2 instanceof n13) {
                                        obj = k13Var2;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            n13 n13Var = (n13) obj;
                            if (n13Var != null && n13Var.I().i(j16.n)) {
                                return (ee2) n13Var.I().v();
                            }
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            U = U.v();
            parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
        return null;
    }

    public final oi1 o0() {
        ja3 ja3Var;
        boolean isAttached = isAttached();
        oi1 oi1Var = oi1.K;
        if (!isAttached) {
            return oi1Var;
        }
        ui1 g = ((di1) ut0.V(this).getFocusOwner()).g();
        if (g == null) {
            return oi1Var;
        }
        if (this == g) {
            return oi1.I;
        }
        if (g.isAttached()) {
            if (!g.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 parent$ui = g.getNode().getParent$ui();
            wa2 U = ut0.U(g);
            while (U != null) {
                if ((U.n0.f.getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            k13 k13Var = parent$ui;
                            b53 b53Var = null;
                            while (k13Var != null) {
                                if (k13Var instanceof ui1) {
                                    if (this == ((ui1) k13Var)) {
                                        return oi1.J;
                                    }
                                } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                    int i = 0;
                                    for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                        if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                k13Var = k13Var2;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var != null) {
                                                    b53Var.c(k13Var);
                                                    k13Var = null;
                                                }
                                                b53Var.c(k13Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                k13Var = ut0.M(b53Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                U = U.v();
                parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
            }
        }
        return oi1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    @Override // defpackage.k13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetach() {
        /*
            r5 = this;
            oi1 r0 = r5.o0()
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L38
            if (r0 == r1) goto L19
            r3 = 2
            if (r0 == r3) goto L38
            r1 = 3
            if (r0 != r1) goto L15
            goto L56
        L15:
            defpackage.s83.v()
            return
        L19:
            qh3 r0 = defpackage.ut0.V(r5)
            bi1 r0 = r0.getFocusOwner()
            ui1 r3 = defpackage.mu0.p(r5)
            if (r3 == 0) goto L56
            boolean r3 = r3.I
            if (r3 != r1) goto L56
            di1 r0 = (defpackage.di1) r0
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.a
            r1.mo24requestOwnerFocus7o62pno(r2, r2)
            zh1 r0 = r0.d
            r0.a()
            goto L56
        L38:
            qh3 r0 = defpackage.ut0.V(r5)
            bi1 r0 = r0.getFocusOwner()
            di1 r0 = (defpackage.di1) r0
            r3 = 8
            r4 = 0
            r0.b(r3, r1, r4)
            boolean r1 = r5.I
            if (r1 == 0) goto L51
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.a
            r1.mo24requestOwnerFocus7o62pno(r2, r2)
        L51:
            zh1 r0 = r0.d
            r0.a()
        L56:
            i94 r0 = r5.N
            if (r0 == 0) goto L5f
            pn r0 = (defpackage.pn) r0
            r0.Z()
        L5f:
            r5.N = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui1.onDetach():void");
    }

    @Override // defpackage.k13
    public final void onReset() {
        if (o0().b()) {
            ((di1) ut0.V(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final void p0() {
        int ordinal = o0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                s83.v();
                return;
            }
        }
        r24 r24Var = new r24();
        mu0.P(this, new ka(r24Var, this, (byte) 17));
        Object obj = r24Var.I;
        if (obj == null) {
            j42.g0("focusProperties");
            throw null;
        }
        if (((ei1) obj).a()) {
            return;
        }
        ((di1) ut0.V(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean r0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return l0().a ? j0(i) : wi4.k(this, i, new ea((byte) 2, i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.k13
    public final void onAttach() {
    }

    public final void q0() {
    }
}

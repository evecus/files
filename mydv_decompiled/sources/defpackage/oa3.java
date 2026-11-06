package defpackage;

import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class oa3 {
    public static final a43 a;

    static {
        a43 a43Var = dd3.a;
        a = new a43();
    }

    public static final void a(k13 k13Var) {
        if (!k13Var.isAttached()) {
            q02.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(k13Var, -1, 1);
    }

    public static final void b(k13 k13Var, int i, int i2) {
        if (!(k13Var instanceof wt0)) {
            c(k13Var, i & k13Var.getKindSet$ui(), i2);
            return;
        }
        wt0 wt0Var = (wt0) k13Var;
        int i3 = wt0Var.I;
        c(k13Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (k13 k13Var2 = wt0Var.J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
            b(k13Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(k13 k13Var, int i, int i2) {
        if (i2 != 0 || k13Var.getShouldAutoInvalidate()) {
            if ((i & 2) != 0 && (k13Var instanceof na2)) {
                ut0.U((na2) k13Var).H();
                if (i2 == 2) {
                    ut0.S(k13Var, 2).X0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                ut0.U(k13Var).H();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                ut0.U(k13Var).X(false);
            }
            if ((i & 256) != 0 && (k13Var instanceof vq1)) {
                if (i2 == 1) {
                    wa2 U = ut0.U(k13Var);
                    U.d0(U.x0 + 1);
                } else if (i2 == 2) {
                    ut0.U(k13Var).d0(r0.x0 - 1);
                }
                if (i2 != 2) {
                    wa2 U2 = ut0.U(k13Var);
                    if (U2.x0 != 0 && !U2.q() && !U2.r() && !U2.w0) {
                        za2.a(U2).requestOnPositionedCallback(U2);
                    }
                }
            }
            if ((i & 4) != 0 && (k13Var instanceof w31)) {
                mu0.I((w31) k13Var);
            }
            if ((i & 8) != 0 && (k13Var instanceof pi4)) {
                ut0.U(k13Var).Z = true;
            }
            if ((i & 64) != 0 && (k13Var instanceof lk3)) {
                ab2 ab2Var = ut0.U((lk3) k13Var).o0;
                ab2Var.p.Y = true;
                ns2 ns2Var = ab2Var.q;
                if (ns2Var != null) {
                    ns2Var.q0();
                }
            }
            if ((i & 2048) != 0 && (k13Var instanceof ii1)) {
                ii1 ii1Var = (ii1) k13Var;
                c10.b = null;
                ii1Var.s(c10.a);
                if (c10.b != null) {
                    k13 k13Var2 = (k13) ii1Var;
                    if (!k13Var2.getNode().isAttached()) {
                        q02.b("visitChildren called on an unattached node");
                    }
                    b53 b53Var = new b53(new k13[16]);
                    k13 child$ui = k13Var2.getNode().getChild$ui();
                    if (child$ui == null) {
                        ut0.h(b53Var, k13Var2.getNode());
                    } else {
                        b53Var.c(child$ui);
                    }
                    while (true) {
                        int i3 = b53Var.K;
                        if (i3 == 0) {
                            break;
                        }
                        k13 k13Var3 = (k13) b53Var.l(i3 - 1);
                        if ((k13Var3.getAggregateChildKindSet$ui() & 1024) == 0) {
                            ut0.h(b53Var, k13Var3);
                        } else {
                            while (true) {
                                if (k13Var3 == null) {
                                    break;
                                }
                                if ((k13Var3.getKindSet$ui() & 1024) != 0) {
                                    b53 b53Var2 = null;
                                    while (k13Var3 != null) {
                                        if (k13Var3 instanceof ui1) {
                                            ui1 ui1Var = (ui1) k13Var3;
                                            zh1 zh1Var = ((di1) ut0.V(ui1Var).getFocusOwner()).d;
                                            if (zh1Var.c.d(ui1Var)) {
                                                zh1Var.a();
                                            }
                                        } else if ((k13Var3.getKindSet$ui() & 1024) != 0 && (k13Var3 instanceof wt0)) {
                                            int i4 = 0;
                                            for (k13 k13Var4 = ((wt0) k13Var3).J; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                                                if ((k13Var4.getKindSet$ui() & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        k13Var3 = k13Var4;
                                                    } else {
                                                        if (b53Var2 == null) {
                                                            b53Var2 = new b53(new k13[16]);
                                                        }
                                                        if (k13Var3 != null) {
                                                            b53Var2.c(k13Var3);
                                                            k13Var3 = null;
                                                        }
                                                        b53Var2.c(k13Var4);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        k13Var3 = ut0.M(b53Var2);
                                    }
                                } else {
                                    k13Var3 = k13Var3.getChild$ui();
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (k13Var instanceof ph1)) {
                ph1 ph1Var = (ph1) k13Var;
                zh1 zh1Var2 = ((di1) ut0.V(ph1Var).getFocusOwner()).d;
                if (zh1Var2.d.d(ph1Var)) {
                    zh1Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (k13Var instanceof zz1) && i2 == 2) {
                ((zz1) k13Var).R();
            }
        }
    }

    public static final void d(k13 k13Var) {
        if (!k13Var.isAttached()) {
            q02.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(k13Var, -1, 0);
    }

    public static final int e(j13 j13Var) {
        int i = j13Var instanceof la2 ? 3 : 1;
        if (j13Var instanceof v31) {
            i |= 4;
        }
        if (j13Var instanceof yo) {
            i |= 8;
        }
        if (j13Var instanceof aq3) {
            i |= 16;
        }
        if (j13Var instanceof o13) {
            i |= 32;
        }
        if (j13Var instanceof kk3) {
            i |= 64;
        }
        return j13Var instanceof zx ? 524288 | i : i;
    }

    public static final int f(k13 k13Var) {
        if (k13Var.getKindSet$ui() != 0) {
            return k13Var.getKindSet$ui();
        }
        Class<?> cls = k13Var.getClass();
        a43 a43Var = a;
        int d = a43Var.d(cls);
        if (d >= 0) {
            return a43Var.c[d];
        }
        int i = k13Var instanceof na2 ? 3 : 1;
        if (k13Var instanceof w31) {
            i |= 4;
        }
        if (k13Var instanceof pi4) {
            i |= 8;
        }
        if (k13Var instanceof vp3) {
            i |= 16;
        }
        if (k13Var instanceof n13) {
            i |= 32;
        }
        if (k13Var instanceof lk3) {
            i |= 64;
        }
        if (k13Var instanceof y92) {
            i |= 4194432;
        } else if (k13Var instanceof cx2) {
            i |= 128;
        }
        if (k13Var instanceof vq1) {
            i |= 256;
        }
        if (k13Var instanceof ui1) {
            i |= 1024;
        }
        if (k13Var instanceof ii1) {
            i |= 2048;
        }
        if (k13Var instanceof ph1) {
            i |= 4096;
        }
        if (k13Var instanceof t82) {
            i |= 8192;
        }
        if (k13Var instanceof ta) {
            i |= 16384;
        }
        if (k13Var instanceof ye0) {
            i |= 32768;
        }
        if (k13Var instanceof la5) {
            i |= 262144;
        }
        if (k13Var instanceof zx) {
            i |= 524288;
        }
        if (k13Var instanceof ui1) {
            i |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }
        if (k13Var instanceof zz1) {
            i |= 2097152;
        }
        if (k13Var instanceof ee2) {
            i |= 8388608;
        }
        a43Var.g(cls, i);
        return i;
    }

    public static final int g(k13 k13Var) {
        if (!(k13Var instanceof wt0)) {
            return f(k13Var);
        }
        wt0 wt0Var = (wt0) k13Var;
        int i = wt0Var.I;
        for (k13 k13Var2 = wt0Var.J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
            i |= g(k13Var2);
        }
        return i;
    }

    public static final boolean h(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}

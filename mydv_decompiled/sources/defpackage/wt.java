package defpackage;

import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wt extends k13 implements na2, w31, pi4, vp3, n13, lk3, y92, vq1, ph1, ii1, mi1, rh3, pz {
    public j13 I;
    public vt J;
    public HashSet K;

    @Override // defpackage.vp3
    public final void D() {
        j13 j13Var = this.I;
        j13Var.getClass();
        ((aq3) j13Var).d.getClass();
    }

    @Override // defpackage.n13
    public final rt0 I() {
        vt vtVar = this.J;
        return vtVar != null ? vtVar : q91.c;
    }

    @Override // defpackage.vq1
    public final void O(na3 na3Var) {
        j13 j13Var = this.I;
        j13Var.getClass();
        r7.K(j13Var);
        throw null;
    }

    @Override // defpackage.vp3
    public final boolean a0() {
        j13 j13Var = this.I;
        j13Var.getClass();
        ((aq3) j13Var).d.getClass();
        return true;
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        j13 j13Var = this.I;
        j13Var.getClass();
        yo yoVar = (yo) j13Var;
        ki4 ki4Var = new ki4();
        ki4Var.K = yoVar.a;
        yoVar.b.invoke(ki4Var);
        cj4Var.getClass();
        ki4 ki4Var2 = (ki4) cj4Var;
        n43 n43Var = ki4Var2.I;
        if (ki4Var.K) {
            ki4Var2.K = true;
        }
        if (ki4Var.L) {
            ki4Var2.L = true;
        }
        n43 n43Var2 = ki4Var.I;
        Object[] objArr = n43Var2.b;
        Object[] objArr2 = n43Var2.c;
        long[] jArr = n43Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        bj4 bj4Var = (bj4) obj;
                        if (!n43Var.b(bj4Var)) {
                            n43Var.m(bj4Var, obj2);
                        } else if (obj2 instanceof v4) {
                            Object g = n43Var.g(bj4Var);
                            g.getClass();
                            v4 v4Var = (v4) g;
                            String str = v4Var.a;
                            if (str == null) {
                                str = ((v4) obj2).a;
                            }
                            dn1 dn1Var = v4Var.b;
                            if (dn1Var == null) {
                                dn1Var = ((v4) obj2).b;
                            }
                            n43Var.m(bj4Var, new v4(str, dn1Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.pz
    public final long c() {
        return ut0.b0(ut0.S(this, 128).K);
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        j13 j13Var = this.I;
        j13Var.getClass();
        ((lz1) ((v31) j13Var)).c((ya2) zh0Var);
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void e0() {
        i82.C(this);
    }

    @Override // defpackage.pz
    public final iu0 getDensity() {
        return ut0.U(this).g0;
    }

    @Override // defpackage.pz
    public final da2 getLayoutDirection() {
        return ut0.U(this).h0;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.vp3
    public final /* synthetic */ long h() {
        return i82.c();
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    public final void j0(boolean z) {
        if (!isAttached()) {
            q02.b("initializeModifier called on unattached node");
        }
        j13 j13Var = this.I;
        if ((getKindSet$ui() & 32) != 0 && (j13Var instanceof o13)) {
            o13 o13Var = (o13) j13Var;
            yx3 yx3Var = mw2.e;
            vt vtVar = this.J;
            if (vtVar == null || !vtVar.i(yx3Var)) {
                vt vtVar2 = new vt();
                vtVar2.c = o13Var;
                this.J = vtVar2;
                p15 p15Var = ut0.U(this).n0.e;
                p15Var.getClass();
                if (p15Var.I) {
                    m13 modifierLocalManager = ut0.V(this).getModifierLocalManager();
                    e43 e43Var = modifierLocalManager.b;
                    if (e43Var == null) {
                        e43Var = new e43();
                        modifierLocalManager.b = e43Var;
                    }
                    e43Var.a(this);
                    e43 e43Var2 = modifierLocalManager.c;
                    if (e43Var2 == null) {
                        e43Var2 = new e43();
                        modifierLocalManager.c = e43Var2;
                    }
                    e43Var2.a(yx3Var);
                    modifierLocalManager.a();
                }
            } else {
                vtVar.c = o13Var;
                m13 modifierLocalManager2 = ut0.V(this).getModifierLocalManager();
                e43 e43Var3 = modifierLocalManager2.b;
                if (e43Var3 == null) {
                    e43Var3 = new e43();
                    modifierLocalManager2.b = e43Var3;
                }
                e43Var3.a(this);
                e43 e43Var4 = modifierLocalManager2.c;
                if (e43Var4 == null) {
                    e43Var4 = new e43();
                    modifierLocalManager2.c = e43Var4;
                }
                e43Var4.a(yx3Var);
                modifierLocalManager2.a();
            }
        }
        if ((getKindSet$ui() & 4) != 0 && !z) {
            ut0.S(this, 2).S0();
        }
        if ((getKindSet$ui() & 2) != 0) {
            p15 p15Var2 = ut0.U(this).n0.e;
            p15Var2.getClass();
            if (p15Var2.I) {
                na3 coordinator$ui = getCoordinator$ui();
                coordinator$ui.getClass();
                ((pa2) coordinator$ui).n1(this);
                mr1 mr1Var = coordinator$ui.B0;
                if (mr1Var != null) {
                    mr1Var.c();
                }
            }
            if (!z) {
                ut0.S(this, 2).S0();
                ut0.U(this).H();
            }
        }
        if (j13Var instanceof i34) {
            ((i34) j13Var).a(ut0.U(this));
        }
        getKindSet$ui();
        getKindSet$ui();
        getKindSet$ui();
        if ((getKindSet$ui() & 16) != 0 && (j13Var instanceof aq3)) {
            ((aq3) j13Var).d.J = getCoordinator$ui();
        }
        if ((getKindSet$ui() & 8) != 0) {
            ut0.V(this).onSemanticsChange();
        }
    }

    public final void k0() {
        if (!isAttached()) {
            q02.b("unInitializeModifier called on unattached node");
        }
        j13 j13Var = this.I;
        if ((getKindSet$ui() & 32) != 0 && (j13Var instanceof o13)) {
            m13 modifierLocalManager = ut0.V(this).getModifierLocalManager();
            yx3 yx3Var = mw2.e;
            e43 e43Var = modifierLocalManager.d;
            if (e43Var == null) {
                e43Var = new e43();
                modifierLocalManager.d = e43Var;
            }
            e43Var.a(ut0.U(this));
            e43 e43Var2 = modifierLocalManager.e;
            if (e43Var2 == null) {
                e43Var2 = new e43();
                modifierLocalManager.e = e43Var2;
            }
            e43Var2.a(yx3Var);
            modifierLocalManager.a();
        }
        if ((getKindSet$ui() & 8) != 0) {
            ut0.V(this).onSemanticsChange();
        }
    }

    public final void l0() {
        if (isAttached()) {
            this.K.clear();
            sh3 snapshotObserver = ut0.V(this).getSnapshotObserver();
            snapshotObserver.a.d(this, p70.i, new ce(this, (byte) 5));
        }
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((la2) j13Var).maxIntrinsicHeight(b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((la2) j13Var).maxIntrinsicWidth(b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((la2) j13Var).mo48measure3p2s80s(ww2Var, pw2Var, j);
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((la2) j13Var).minIntrinsicHeight(b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((la2) j13Var).minIntrinsicWidth(b42Var, a42Var, i);
    }

    @Override // defpackage.lk3
    public final Object o(iu0 iu0Var, Object obj) {
        j13 j13Var = this.I;
        j13Var.getClass();
        return ((kk3) j13Var).b();
    }

    @Override // defpackage.k13
    public final void onAttach() {
        j0(true);
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        if (this.I instanceof aq3) {
            y();
        }
    }

    @Override // defpackage.k13
    public final void onDetach() {
        k0();
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
        mu0.I(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.vp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.kp3 r9, defpackage.lp3 r10, long r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.p(kp3, lp3, long):void");
    }

    @Override // defpackage.ii1
    public final void s(ei1 ei1Var) {
        j13 j13Var = this.I;
        q02.b("applyFocusProperties called on wrong node");
        r7.K(j13Var);
        throw null;
    }

    public final String toString() {
        return this.I.toString();
    }

    @Override // defpackage.ph1
    public final void u(oi1 oi1Var) {
        j13 j13Var = this.I;
        q02.b("onFocusEvent called on wrong node");
        r7.K(j13Var);
        throw null;
    }

    @Override // defpackage.vp3
    public final void y() {
        j13 j13Var = this.I;
        j13Var.getClass();
        ts0 ts0Var = ((aq3) j13Var).d;
        yp3 yp3Var = (yp3) ts0Var.K;
        aq3 aq3Var = (aq3) ts0Var.M;
        if (yp3Var == yp3.J) {
            dq2.A(SystemClock.uptimeMillis(), new zp3(aq3Var, (byte) 0));
            ts0Var.K = yp3.I;
            aq3Var.c = false;
            ts0Var.L = null;
        }
    }

    @Override // defpackage.y92
    public final void f(ca2 ca2Var) {
    }

    @Override // defpackage.cx2
    public final void i(long j) {
    }
}

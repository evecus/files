package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fc4 extends g31 implements t82, pi4 {
    public final d93 d0;
    public y1 e0;
    public p4 f0;
    public boolean g0;
    public boolean h0;
    public p23 i0;
    public k95 j0;
    public final mr0 k0;
    public final oc4 l0;
    public final ac4 m0;
    public final si1 n0;
    public final ei0 o0;

    public fc4(sc scVar, oy oyVar, gf1 gf1Var, t33 t33Var, pg3 pg3Var, gc4 gc4Var, boolean z, boolean z2) {
        super(o7.b, z, t33Var, pg3Var);
        this.d0 = new d93();
        mr0 mr0Var = new mr0(new up0(new ep(j42.q)));
        this.k0 = mr0Var;
        oc4 oc4Var = new oc4(gc4Var, scVar, gf1Var == null ? mr0Var : gf1Var, pg3Var, z2, this.d0, this, new bc4(this, (byte) 0));
        this.l0 = oc4Var;
        ac4 ac4Var = new ac4();
        ac4Var.J = oc4Var;
        ac4Var.I = z;
        this.m0 = ac4Var;
        ui1 ui1Var = new ui1(2, null, 10);
        j0(ui1Var);
        this.n0 = ui1Var;
        ei0 ei0Var = new ei0(pg3Var, oc4Var, z2, oyVar, new bc4(this, (byte) 1));
        j0(ei0Var);
        this.o0 = ei0Var;
        j0(new h93(ac4Var, this.d0));
        j0(new ly(ei0Var));
    }

    public final void E0(sc scVar, oy oyVar, gf1 gf1Var, t33 t33Var, pg3 pg3Var, gc4 gc4Var, boolean z, boolean z2) {
        boolean z3;
        if (this.M != z) {
            this.m0.I = z;
            this.e0 = null;
            this.f0 = null;
            ut0.U(this).I();
        }
        if (gf1Var == null) {
            gf1Var = this.k0;
        }
        oc4 oc4Var = this.l0;
        boolean z4 = true;
        if (j42.c(oc4Var.a, gc4Var)) {
            z3 = false;
        } else {
            oc4Var.a = gc4Var;
            z3 = true;
        }
        oc4Var.b = scVar;
        pg3 pg3Var2 = oc4Var.d;
        if (pg3Var2 != pg3Var) {
            oc4Var.d = pg3Var;
            pg3Var2 = pg3Var;
            z3 = true;
        }
        if (oc4Var.e != z2) {
            oc4Var.e = z2;
        } else {
            z4 = z3;
        }
        oc4Var.c = gf1Var;
        oc4Var.f = this.d0;
        ei0 ei0Var = this.o0;
        ei0Var.I = pg3Var;
        ei0Var.K = z2;
        ei0Var.L = oyVar;
        q4 q4Var = o7.b;
        pg3 pg3Var3 = pg3.I;
        if (pg3Var2 != pg3Var3) {
            pg3Var3 = pg3.J;
        }
        D0(q4Var, z, t33Var, pg3Var3, z4);
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        if (this.M && (this.e0 == null || this.f0 == null)) {
            this.e0 = new y1(this, (byte) 1);
            this.f0 = new p4(this, null);
        }
        y1 y1Var = this.e0;
        if (y1Var != null) {
            d82[] d82VarArr = aj4.a;
            cj4Var.c(ii4.d, new v4(null, y1Var));
        }
        p4 p4Var = this.f0;
        if (p4Var != null) {
            d82[] d82VarArr2 = aj4.a;
            cj4Var.c(ii4.e, p4Var);
        }
    }

    @Override // defpackage.t82
    public final boolean b(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    @Override // defpackage.g31
    public final Object n0(n6 n6Var, f31 f31Var) {
        oc4 oc4Var = this.l0;
        Object g = oc4Var.g(d53.J, new o1((Object) n6Var, (Object) oc4Var, (fj0) null, (byte) 13), f31Var);
        return g == el0.I ? g : wd5.a;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        p23 p23Var = this.i0;
        if (p23Var != null) {
            p23Var.b(ut0.U(this).g0);
        }
        k95 k95Var = this.j0;
        if (k95Var != null) {
            k95Var.b(ut0.U(this).g0);
        }
        if (isAttached()) {
            iu0 iu0Var = ut0.U(this).g0;
            mr0 mr0Var = this.k0;
            mr0Var.getClass();
            mr0Var.a = new up0(new ep(iu0Var));
        }
    }

    @Override // defpackage.g31, defpackage.k13
    public final void onDensityChange() {
        i82.t(this);
        p23 p23Var = this.i0;
        if (p23Var != null) {
            p23Var.b(ut0.U(this).g0);
        }
        k95 k95Var = this.j0;
        if (k95Var != null) {
            k95Var.b(ut0.U(this).g0);
        }
        y();
        if (isAttached()) {
            iu0 iu0Var = ut0.U(this).g0;
            mr0 mr0Var = this.k0;
            mr0Var.getClass();
            mr0Var.a = new up0(new ep(iu0Var));
        }
    }

    @Override // defpackage.g31, defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        int i;
        List list = kp3Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.L.invoke(cq3.a(((rp3) list.get(i2)).j()))).booleanValue()) {
                super.p(kp3Var, lp3Var, j);
                break;
            }
            i2++;
        }
        if (this.M) {
            if (this.U == null) {
                kp1 t = c21.t(this);
                j0(t);
                this.U = t;
            }
            lp3 lp3Var2 = lp3.I;
            if (lp3Var == lp3Var2 && kp3Var.f == 6) {
                if (!this.g0) {
                    this.i0 = new p23(this.l0, a5.S(this), new cc4(this, (byte) 0), ut0.U(this).g0);
                    this.g0 = true;
                }
                p23 p23Var = this.i0;
                if (p23Var != null) {
                    p23Var.i(getCoroutineScope());
                }
            }
            p23 p23Var2 = this.i0;
            if (p23Var2 != null) {
                p23Var2.h(kp3Var, lp3Var, j);
            }
            if (lp3Var == lp3Var2 && ((i = kp3Var.f) == 10 || i == 11 || i == 12)) {
                if (!this.h0) {
                    this.j0 = new k95(this.l0, new cc4(this, (byte) 1), ut0.U(this).g0);
                    this.h0 = true;
                }
                k95 k95Var = this.j0;
                if (k95Var != null) {
                    k95Var.g(getCoroutineScope());
                }
            }
            k95 k95Var2 = this.j0;
            if (k95Var2 != null) {
                k95Var2.f(kp3Var, lp3Var, j);
            }
        }
    }

    @Override // defpackage.t82
    public final boolean t(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (this.M) {
            long w = e21.w(keyEvent);
            int i = j82.O;
            if ((j82.a(w, k21.N()) || j82.a(e21.w(keyEvent), k21.O())) && c21.r(e21.C(keyEvent), 2) && !e21.F(keyEvent)) {
                boolean z = this.l0.d == pg3.I;
                ei0 ei0Var = this.o0;
                if (z) {
                    int k0 = (int) (ei0Var.k0() & 4294967295L);
                    floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(j82.a(e21.w(keyEvent), k21.O()) ? k0 : -k0));
                } else {
                    int k02 = (int) (ei0Var.k0() >> 32);
                    floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(j82.a(e21.w(keyEvent), k21.O()) ? k02 : -k02) << 32);
                }
                p70.g0(getCoroutineScope(), null, null, new ec4(this, floatToRawIntBits, null, (byte) 0), 3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g31
    public final void t0(o21 o21Var) {
        if (isAttached()) {
            p70.g0(this.d0.c(), null, null, new gu2((Object) o21Var, (Object) this, (fj0) null, (byte) 12), 3);
        }
    }
}

package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ma0 extends u1 {
    public rm1 d0;
    public boolean e0;
    public final w33 f0;
    public final w33 g0;
    public rp3 h0;
    public rv4 i0;
    public rv4 j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public boolean n0;
    public rz1 o0;
    public rv4 p0;
    public rv4 q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public boolean u0;

    public ma0(rm1 rm1Var, rm1 rm1Var2, t33 t33Var, t64 t64Var, boolean z) {
        super(t33Var, z, true, null, t64Var, rm1Var);
        this.d0 = rm1Var2;
        this.e0 = true;
        int i = or2.a;
        this.f0 = new w33(6);
        this.g0 = new w33(6);
        this.m0 = -1L;
        this.t0 = -1L;
    }

    public final void A0(long j, rz1 rz1Var) {
        if (this.O && !this.u0) {
            q0(rz1Var.c, true);
            this.t0 = j;
            if (!this.s0 && !this.r0) {
                x0();
            }
        }
        this.o0 = null;
        this.u0 = false;
        this.r0 = false;
        rv4 rv4Var = this.p0;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.p0 = null;
        this.s0 = false;
    }

    public final void B0(long j, rp3 rp3Var) {
        if (this.O && !this.n0) {
            q0(rp3Var.e(), false);
            this.m0 = j;
            if (!this.l0 && !this.k0) {
                x0();
            }
        }
        this.h0 = null;
        this.n0 = false;
        this.k0 = false;
        rv4 rv4Var = this.i0;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.i0 = null;
        this.l0 = false;
    }

    public final void C0() {
        char c;
        long j;
        long j2;
        char c2;
        w33 w33Var = this.f0;
        Object[] objArr = w33Var.c;
        long[] jArr = w33Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((v52) objArr[(i << 3) + i3]).e(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        w33Var.a();
        w33 w33Var2 = this.g0;
        Object[] objArr2 = w33Var2.c;
        long[] jArr2 = w33Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((e62) ((ka0) objArr2[(i4 << 3) + i6]).b()).e(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        w33Var2.a();
    }

    @Override // defpackage.zz1
    public final void R() {
        z0(true);
    }

    @Override // defpackage.u1
    public final void m0(cj4 cj4Var) {
        if (this.d0 != null) {
            eq eqVar = new eq(this, (byte) 2);
            d82[] d82VarArr = aj4.a;
            cj4Var.c(ii4.c, new v4(null, eqVar));
        }
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        C0();
    }

    @Override // defpackage.u1, defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        super.p(kp3Var, lp3Var, j);
        if (lp3Var != lp3.J) {
            if (lp3Var != lp3.K || this.h0 == null || this.l0) {
                return;
            }
            List list = kp3Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                rp3 rp3Var = (rp3) list.get(i);
                if (rp3Var.l() && rp3Var != this.h0) {
                    z0(false);
                    return;
                }
            }
            return;
        }
        if (this.h0 == null) {
            if (z15.e(kp3Var, true)) {
                rp3 rp3Var2 = (rp3) kp3Var.a.get(0);
                rp3Var2.a();
                this.h0 = rp3Var2;
                if (this.O) {
                    rv4 rv4Var = this.j0;
                    if (rv4Var != null && rv4Var.isActive()) {
                        ((gr5) j42.r(this, hf0.t)).getClass();
                        if (rp3Var2.k() - this.m0 < 40) {
                            this.n0 = true;
                            return;
                        }
                        this.k0 = true;
                        rv4 rv4Var2 = this.j0;
                        if (rv4Var2 != null) {
                            rv4Var2.e(null);
                        }
                        this.j0 = null;
                    }
                    this.l0 = false;
                    s0(rp3Var2);
                    if (this.d0 != null) {
                        this.i0 = p70.g0(getCoroutineScope(), null, null, new la0(this, null, (byte) 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean t = eg5.t(kp3Var);
        List list2 = kp3Var.a;
        if (t && !this.l0 && this.O && this.d0 != null) {
            rv4 rv4Var3 = this.i0;
            if (rv4Var3 != null) {
                rv4Var3.e(null);
            }
            this.i0 = null;
            rm1 rm1Var = this.d0;
            if (rm1Var != null) {
                rm1Var.invoke();
            }
            if (this.e0) {
                ((kn3) ((ts1) j42.r(this, hf0.l))).a(0);
            }
            this.l0 = true;
        }
        if (this.l0) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!dq2.o((rp3) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((rp3) list2.get(i3)).a();
                    }
                    return;
                }
            }
            rp3 rp3Var3 = (rp3) list2.get(0);
            rp3Var3.a();
            long k = rp3Var3.k();
            rp3 rp3Var4 = this.h0;
            rp3Var4.getClass();
            B0(k, rp3Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!dq2.n((rp3) list2.get(i4))) {
                long o0 = o0(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    rp3 rp3Var5 = (rp3) list2.get(i5);
                    if (rp3Var5.l() || dq2.f0(rp3Var5, j, o0)) {
                        z0(false);
                        return;
                    }
                }
                return;
            }
        }
        rp3 rp3Var6 = (rp3) list2.get(0);
        rp3Var6.a();
        long k2 = rp3Var6.k();
        rp3 rp3Var7 = this.h0;
        rp3Var7.getClass();
        B0(k2, rp3Var7);
    }

    @Override // defpackage.u1
    public final void u0() {
        C0();
    }

    @Override // defpackage.u1
    public final boolean v0(KeyEvent keyEvent) {
        boolean z;
        long w = e21.w(keyEvent);
        if (this.d0 != null) {
            w33 w33Var = this.f0;
            if (w33Var.d(w) == null) {
                w33Var.g(w, p70.g0(getCoroutineScope(), null, null, new la0(this, null, (byte) 2), 3));
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @Override // defpackage.u1
    public final void w0(KeyEvent keyEvent) {
        long w = e21.w(keyEvent);
        w33 w33Var = this.f0;
        boolean z = false;
        if (w33Var.d(w) != null) {
            v52 v52Var = (v52) w33Var.d(w);
            if (v52Var != null) {
                if (v52Var.isActive()) {
                    v52Var.e(null);
                } else {
                    z = true;
                }
            }
            w33Var.f(w);
        }
        if (z) {
            return;
        }
        x0();
    }

    @Override // defpackage.vp3
    public final void y() {
        mv1 mv1Var;
        t33 t33Var = this.K;
        if (t33Var != null && (mv1Var = this.W) != null) {
            t33Var.b(new nv1(mv1Var));
        }
        this.W = null;
        z0(false);
    }

    @Override // defpackage.zz1
    public final void z(pz1 pz1Var, lp3 lp3Var) {
        t0();
        if (this.O && this.S == null) {
            kp1 t = c21.t(this);
            j0(t);
            this.S = t;
        }
        int i = 0;
        if (lp3Var != lp3.J) {
            if (lp3Var != lp3.K || this.o0 == null || this.s0) {
                return;
            }
            ArrayList arrayList = (ArrayList) ((fd) pz1Var).a();
            int size = arrayList.size();
            while (i < size) {
                rz1 rz1Var = (rz1) arrayList.get(i);
                if (rz1Var.i && rz1Var != this.o0) {
                    z0(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.o0 == null) {
            fd fdVar = (fd) pz1Var;
            ArrayList arrayList2 = (ArrayList) fdVar.a();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (e41.v((rz1) arrayList2.get(i2))) {
                    rz1 rz1Var2 = (rz1) ((ArrayList) fdVar.a()).get(0);
                    rz1Var2.i = true;
                    this.o0 = rz1Var2;
                    if (this.O) {
                        rv4 rv4Var = this.q0;
                        if (rv4Var != null && rv4Var.isActive()) {
                            ((gr5) j42.r(this, hf0.t)).getClass();
                            if (rz1Var2.b - this.t0 < 40) {
                                this.u0 = true;
                                return;
                            }
                            this.r0 = true;
                            rv4 rv4Var2 = this.q0;
                            if (rv4Var2 != null) {
                                rv4Var2.e(null);
                            }
                            this.q0 = null;
                        }
                        this.s0 = false;
                        r0(rz1Var2);
                        if (this.d0 != null) {
                            this.p0 = p70.g0(getCoroutineScope(), null, null, new la0(this, null, (byte) 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.s0) {
            fd fdVar2 = (fd) pz1Var;
            ArrayList arrayList3 = (ArrayList) fdVar2.a();
            int size3 = arrayList3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                rz1 rz1Var3 = (rz1) arrayList3.get(i3);
                if (!rz1Var3.h || rz1Var3.d) {
                    ArrayList arrayList4 = (ArrayList) fdVar2.a();
                    int size4 = arrayList4.size();
                    while (i < size4) {
                        ((rz1) arrayList4.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            rz1 rz1Var4 = (rz1) ((ArrayList) fdVar2.a()).get(0);
            rz1Var4.i = true;
            long j = rz1Var4.b;
            rz1 rz1Var5 = this.o0;
            rz1Var5.getClass();
            A0(j, rz1Var5);
            return;
        }
        fd fdVar3 = (fd) pz1Var;
        ArrayList arrayList5 = (ArrayList) fdVar3.a();
        int size5 = arrayList5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            rz1 rz1Var6 = (rz1) arrayList5.get(i4);
            if (rz1Var6.i || !rz1Var6.h || rz1Var6.d) {
                float f = ((gr5) j42.r(this, hf0.t)).f();
                ArrayList arrayList6 = (ArrayList) fdVar3.a();
                int size6 = arrayList6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    rz1 rz1Var7 = (rz1) arrayList6.get(i5);
                    long j2 = rz1Var7.c;
                    rz1 rz1Var8 = this.o0;
                    rz1Var8.getClass();
                    boolean z = Math.abs(pd3.d(pd3.e(j2, rz1Var8.c))) > f;
                    if (rz1Var7.i || z) {
                        z0(true);
                        return;
                    }
                }
                return;
            }
        }
        rz1 rz1Var9 = (rz1) ((ArrayList) fdVar3.a()).get(0);
        rz1Var9.i = true;
        long j3 = rz1Var9.b;
        rz1 rz1Var10 = this.o0;
        rz1Var10.getClass();
        A0(j3, rz1Var10);
    }

    public final void z0(boolean z) {
        if (z) {
            this.o0 = null;
            rv4 rv4Var = this.p0;
            if (rv4Var != null) {
                rv4Var.e(null);
            }
            this.p0 = null;
            rv4 rv4Var2 = this.q0;
            if (rv4Var2 != null) {
                rv4Var2.e(null);
            }
            this.q0 = null;
            this.r0 = false;
            this.s0 = false;
            this.t0 = -1L;
            this.u0 = false;
        } else {
            this.h0 = null;
            rv4 rv4Var3 = this.i0;
            if (rv4Var3 != null) {
                rv4Var3.e(null);
            }
            this.i0 = null;
            rv4 rv4Var4 = this.j0;
            if (rv4Var4 != null) {
                rv4Var4.e(null);
            }
            this.j0 = null;
            this.k0 = false;
            this.l0 = false;
            this.m0 = -1L;
            this.n0 = false;
        }
        p0(z);
    }
}

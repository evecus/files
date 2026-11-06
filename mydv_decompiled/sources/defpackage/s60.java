package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class s60 extends u1 {
    public rp3 d0;
    public rz1 e0;

    @Override // defpackage.zz1
    public final void R() {
        z0(true);
    }

    @Override // defpackage.u1, defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        super.p(kp3Var, lp3Var, j);
        if (lp3Var != lp3.J) {
            if (lp3Var == lp3.K) {
                if (this.d0 != null) {
                    List list = kp3Var.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        rp3 rp3Var = (rp3) list.get(i);
                        if (rp3Var.l() && rp3Var != this.d0) {
                            z0(false);
                            break;
                        }
                        i++;
                    }
                }
                if (j42.c(this.T, "recognized")) {
                    this.T = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.d0 == null) {
            if (z15.e(kp3Var, true)) {
                rp3 rp3Var2 = (rp3) kp3Var.a.get(0);
                rp3Var2.a();
                this.d0 = rp3Var2;
                if (this.O) {
                    this.T = "waiting";
                    s0(rp3Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = kp3Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!dq2.n((rp3) list2.get(i2))) {
                long o0 = o0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    rp3 rp3Var3 = (rp3) list2.get(i3);
                    if (rp3Var3.l() || dq2.f0(rp3Var3, j, o0)) {
                        z0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((rp3) list2.get(0)).a();
        if (this.O) {
            this.T = "recognized";
            rp3 rp3Var4 = this.d0;
            rp3Var4.getClass();
            q0(rp3Var4.e(), false);
            x0();
        }
        this.d0 = null;
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
            if (lp3Var == lp3.K) {
                if (this.e0 != null) {
                    ArrayList arrayList = (ArrayList) ((fd) pz1Var).a();
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        rz1 rz1Var = (rz1) arrayList.get(i);
                        if (rz1Var.i && rz1Var != this.e0) {
                            z0(true);
                            break;
                        }
                        i++;
                    }
                }
                if (j42.c(this.T, "recognized")) {
                    this.T = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.e0 == null) {
            fd fdVar = (fd) pz1Var;
            ArrayList arrayList2 = (ArrayList) fdVar.a();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (e41.v((rz1) arrayList2.get(i2))) {
                    rz1 rz1Var2 = (rz1) ((ArrayList) fdVar.a()).get(0);
                    rz1Var2.i = true;
                    this.e0 = rz1Var2;
                    if (this.O) {
                        this.T = "waiting";
                        r0(rz1Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        fd fdVar2 = (fd) pz1Var;
        ArrayList arrayList3 = (ArrayList) fdVar2.a();
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            rz1 rz1Var3 = (rz1) arrayList3.get(i3);
            if (rz1Var3.i || !rz1Var3.h || rz1Var3.d) {
                float f = ((gr5) j42.r(this, hf0.t)).f();
                ArrayList arrayList4 = (ArrayList) fdVar2.a();
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    rz1 rz1Var4 = (rz1) arrayList4.get(i4);
                    long j = rz1Var4.c;
                    rz1 rz1Var5 = this.e0;
                    rz1Var5.getClass();
                    boolean z = Math.abs(pd3.d(pd3.e(j, rz1Var5.c))) > f;
                    if (rz1Var4.i || z) {
                        z0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((rz1) ((ArrayList) fdVar2.a()).get(0)).i = true;
        if (this.O) {
            this.T = "recognized";
            rz1 rz1Var6 = this.e0;
            rz1Var6.getClass();
            q0(rz1Var6.c, true);
            x0();
        }
        this.e0 = null;
    }

    public final void z0(boolean z) {
        if (z) {
            this.e0 = null;
        } else {
            this.d0 = null;
        }
        p0(z);
        this.T = "idle";
    }
}

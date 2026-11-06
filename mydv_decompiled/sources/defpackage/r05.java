package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r05 extends k13 implements xp3, iu0, vp3 {
    public Object I;
    public Object J;
    public Object[] K;
    public PointerInputEventHandler L;
    public rv4 M;
    public kp3 N = m05.a;
    public final b53 O;
    public final b53 P;
    public final b53 Q;
    public kp3 R;
    public long S;

    public r05(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.I = obj;
        this.J = obj2;
        this.K = objArr;
        this.L = pointerInputEventHandler;
        b53 b53Var = new b53(new q05[16]);
        this.O = b53Var;
        this.P = b53Var;
        this.Q = new b53(new q05[16]);
        this.S = 0L;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return ut0.U(this).g0.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    @Override // defpackage.vp3
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    @Override // defpackage.vp3
    public final void e0() {
        l0();
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return ut0.U(this).g0.getDensity();
    }

    @Override // defpackage.vp3
    public final /* synthetic */ long h() {
        return i82.c();
    }

    public final Object j0(hn1 hn1Var, fj0 fj0Var) {
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        q05 q05Var = new q05(this, k10Var);
        synchronized (this.P) {
            this.O.c(q05Var);
            new v84(mu0.G(mu0.n(q05Var, q05Var, hn1Var))).resumeWith(wd5.a);
        }
        k10Var.v(new oe(q05Var, (byte) 6));
        return k10Var.r();
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    public final void k0(kp3 kp3Var, lp3 lp3Var) {
        k10 k10Var;
        k10 k10Var2;
        synchronized (this.P) {
            b53 b53Var = this.Q;
            b53Var.d(b53Var.K, this.O);
        }
        try {
            int ordinal = lp3Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    b53 b53Var2 = this.Q;
                    int i = b53Var2.K - 1;
                    Object[] objArr = b53Var2.I;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            q05 q05Var = (q05) objArr[i];
                            if (lp3Var == q05Var.L && (k10Var2 = q05Var.K) != null) {
                                q05Var.K = null;
                                k10Var2.resumeWith(kp3Var);
                            }
                            i--;
                        }
                    }
                    this.Q.h();
                }
                if (ordinal != 2) {
                    throw new d92();
                }
            }
            b53 b53Var3 = this.Q;
            Object[] objArr2 = b53Var3.I;
            int i2 = b53Var3.K;
            for (int i3 = 0; i3 < i2; i3++) {
                q05 q05Var2 = (q05) objArr2[i3];
                if (lp3Var == q05Var2.L && (k10Var = q05Var2.K) != null) {
                    q05Var2.K = null;
                    k10Var.resumeWith(kp3Var);
                }
            }
            this.Q.h();
        } catch (Throwable th) {
            this.Q.h();
            throw th;
        }
    }

    public final void l0() {
        rv4 rv4Var = this.M;
        if (rv4Var != null) {
            rv4Var.r(new wp3());
            this.M = null;
        }
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        l0();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        l0();
        super.onDetach();
    }

    @Override // defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        this.S = j;
        if (lp3Var == lp3.I) {
            this.N = kp3Var;
        }
        fj0 fj0Var = null;
        if (this.M == null) {
            this.M = p70.g0(getCoroutineScope(), null, gl0.L, new ft2(this, fj0Var, (byte) 3), 1);
        }
        k0(kp3Var, lp3Var);
        List list = kp3Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kp3Var = null;
                break;
            } else if (!dq2.o((rp3) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.R = kp3Var;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    @Override // defpackage.vp3
    public final void y() {
        kp3 kp3Var = this.R;
        if (kp3Var == null) {
            return;
        }
        List list = kp3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((rp3) list.get(i)).f()) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    rp3 rp3Var = (rp3) list.get(i2);
                    arrayList.add(new rp3(rp3Var.d(), rp3Var.k(), rp3Var.e(), rp3Var.g(), rp3Var.k(), rp3Var.e(), rp3Var.f(), rp3Var.f(), rp3Var.j()));
                }
                kp3 kp3Var2 = new kp3(arrayList, null);
                this.N = kp3Var2;
                k0(kp3Var2, lp3.I);
                k0(kp3Var2, lp3.J);
                k0(kp3Var2, lp3.K);
                this.R = null;
                return;
            }
        }
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void D() {
    }
}

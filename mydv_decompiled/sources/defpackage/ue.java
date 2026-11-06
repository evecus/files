package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ue extends k13 implements ye0, kd3, w31, y92 {
    public final t33 I;
    public final rm1 J;
    public float K;
    public boolean M;
    public o63 Q;
    public p64 R;
    public a64 S;
    public b64 T;
    public long L = 0;
    public final e43 N = new e43();
    public final bh O = p70.a(0.0f);
    public final bh P = p70.a(0.0f);

    public ue(t33 t33Var, zt0 zt0Var) {
        this.I = t33Var;
        this.J = zt0Var;
    }

    @Override // defpackage.kd3
    public final void U() {
        j0(true);
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        long j;
        ya2 ya2Var = (ya2) zh0Var;
        ya2Var.a();
        r10 r10Var = ya2Var.I;
        o10 q = r10Var.J.q();
        b64 b64Var = this.T;
        if (b64Var != null) {
            p64 j0 = j0(false);
            b64Var.e(this.L, mw2.P(this.K), j0.c.a(), j0.d instanceof n64 ? 0.1f : 0.0f);
            b64Var.draw(ba.b(q));
        }
        float floatValue = ((Number) this.O.d()).floatValue();
        if (floatValue > 0.0f) {
            p64 j02 = j0(false);
            long c = x70.c(j02.c.a(), floatValue);
            if (j02.a) {
                float intBitsToFloat = Float.intBitsToFloat((int) (ya2Var.c() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ya2Var.c() & 4294967295L));
                pn pnVar = r10Var.J;
                long H = pnVar.H();
                pnVar.q().f();
                try {
                    ((ep) pnVar.b).o(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                    j = H;
                    try {
                        r7.g(ya2Var, c, this.K, 0L, 0.0f, 124);
                        r7.H(pnVar, j);
                    } catch (Throwable th) {
                        th = th;
                        r7.H(pnVar, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = H;
                }
            } else {
                r7.g(ya2Var, c, this.K, 0L, 0.0f, 124);
            }
        }
        if (((Number) this.P.d()).floatValue() > 0.0f) {
            o63 o63Var = this.Q;
            if (o63Var == null) {
                o63Var = new o63(this);
            }
            this.Q = o63Var;
            j0(false);
        }
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i(long j) {
        this.M = true;
        this.L = ut0.b0(j);
        if (l0(j0(false))) {
            mu0.I(this);
        }
        e43 e43Var = this.N;
        Object[] objArr = e43Var.a;
        int i = e43Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            k0((xs3) objArr[i2]);
        }
        e43Var.d();
    }

    public final p64 j0(boolean z) {
        boolean z2;
        p64 p64Var = this.R;
        r24 r24Var = new r24();
        if (z || p64Var == null) {
            mu0.P(this, new k9(r24Var, this, (byte) 14));
            Object obj = r24Var.I;
            if (obj == null) {
                j42.g0("resolvedConfiguration");
                throw null;
            }
            z2 = !((p64) obj).equals(p64Var);
        } else {
            r24Var.I = p64Var;
            z2 = false;
        }
        Object obj2 = r24Var.I;
        if (obj2 == null) {
            j42.g0("resolvedConfiguration");
            throw null;
        }
        p64 p64Var2 = (p64) obj2;
        this.R = p64Var2;
        if (z2) {
            l0(p64Var2);
            mu0.I(this);
        }
        Object obj3 = r24Var.I;
        if (obj3 != null) {
            return (p64) obj3;
        }
        j42.g0("resolvedConfiguration");
        throw null;
    }

    public final void k0(xs3 xs3Var) {
        b64 b64Var;
        if (!(xs3Var instanceof vs3)) {
            if (xs3Var instanceof ws3) {
                b64 b64Var2 = this.T;
                if (b64Var2 != null) {
                    b64Var2.d();
                    return;
                }
                return;
            }
            if (!(xs3Var instanceof us3) || (b64Var = this.T) == null) {
                return;
            }
            b64Var.d();
            return;
        }
        vs3 vs3Var = (vs3) xs3Var;
        long j = this.L;
        float f = this.K;
        a64 a64Var = this.S;
        if (a64Var == null) {
            Object obj = (View) j42.r(this, rb.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    s83.j(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    a64 a64Var2 = new a64(viewGroup.getContext());
                    viewGroup.addView(a64Var2);
                    a64Var = a64Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof a64) {
                        a64Var = (a64) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.S = a64Var;
        }
        b64 b = a64Var.b(this);
        p64 j0 = j0(false);
        b.b(vs3Var, j0.a, j, mw2.P(f), j0.c.a(), j0.d instanceof n64 ? 0.1f : 0.0f, new ce(this, (byte) 1));
        this.T = b;
        mu0.I(this);
    }

    public final boolean l0(p64 p64Var) {
        float P;
        if (!this.M) {
            return false;
        }
        iu0 iu0Var = ut0.U(this).g0;
        if (Float.isNaN(p64Var.b)) {
            boolean z = p64Var.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (this.L >> 32));
            P = pd3.d((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (z) {
                P += iu0Var.P(10.0f);
            }
        } else {
            P = iu0Var.P(p64Var.b);
        }
        boolean z2 = this.K == P;
        boolean z3 = !z2;
        if (!z2) {
            this.K = P;
        }
        return z3;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        j0(false);
        p70.g0(getCoroutineScope(), null, null, new ky(this, null, (byte) 7), 3);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        a64 a64Var = this.S;
        if (a64Var != null) {
            a64Var.a(this);
        }
        this.Q = null;
        this.R = null;
        this.M = false;
        this.L = 0L;
        this.K = 0.0f;
        this.N.d();
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }

    @Override // defpackage.y92
    public final void f(ca2 ca2Var) {
    }
}

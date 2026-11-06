package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g02 {
    public final b53 a = new b53(new e02[16]);
    public final jk3 b = ad4.w(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final jk3 d = ad4.w(Boolean.TRUE);

    public final void a(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-318043801);
        int i2 = (go1Var.i(this) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(null);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                go1Var.d0(-144841960);
                boolean i3 = go1Var.i(this);
                Object Q2 = go1Var.Q();
                if (i3 || Q2 == jpVar) {
                    Q2 = new f31(t43Var, this, (fj0) null);
                    go1Var.o0(Q2);
                }
                mw2.h(go1Var, (hn1) Q2, this);
                go1Var.q(false);
            } else {
                go1Var.d0(-143455237);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(this, i, (byte) 6);
        }
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lk0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ mk0 J;

    public /* synthetic */ lk0(mk0 mk0Var, cj4 cj4Var) {
        this.I = (byte) 3;
        this.J = mk0Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        boolean z = true;
        mk0 mk0Var = this.J;
        switch (b) {
            case 0:
                jk3 jk3Var = mk0Var.M.t;
                Boolean bool = Boolean.TRUE;
                jk3Var.setValue(bool);
                mk0Var.M.s.setValue(bool);
                oh2 oh2Var = mk0Var.M;
                CharSequence b2 = ((vc) ((pe1) obj)).b();
                b2.getClass();
                mk0.m0(oh2Var, (String) b2, mk0Var.N);
                return bool;
            case 1:
                List list = (List) obj;
                if (mk0Var.M.d() != null) {
                    v55 d = mk0Var.M.d();
                    d.getClass();
                    list.add(d.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                mk0.m0(mk0Var.M, ((oj) obj).J, mk0Var.N);
                return Boolean.TRUE;
            default:
                oj ojVar = (oj) obj;
                if (mk0Var.N) {
                    m55 m55Var = mk0Var.M.e;
                    StringBuilder sb = null;
                    if (m55Var != null) {
                        List k0 = p70.k0(new ue1(), new eb0(ojVar, 1));
                        oh2 oh2Var2 = mk0Var.M;
                        g12 g12Var = oh2Var2.d;
                        xj0 xj0Var = oh2Var2.v;
                        d55 g = g12Var.g(k0);
                        m55Var.a(null, g);
                        xj0Var.invoke(g);
                    } else {
                        d55 d55Var = mk0Var.L;
                        String str = d55Var.a.J;
                        long j = d55Var.b;
                        int i = d65.c;
                        int i2 = (int) (j >> 32);
                        int i3 = (int) (j & 4294967295L);
                        str.getClass();
                        ojVar.getClass();
                        if (i3 >= i2) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i2);
                            sb.append((CharSequence) ojVar);
                            sb.append((CharSequence) str, i3, str.length());
                        } else {
                            zy.o(hf1.v("End index (", i3, ") is less than start index (", i2, ")."));
                        }
                        String obj2 = sb.toString();
                        int length = ojVar.J.length() + ((int) (mk0Var.L.b >> 32));
                        mk0Var.M.v.invoke(new d55(4, obj2, ui4.c(length, length)));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ lk0(mk0 mk0Var, byte b) {
        this.I = b;
        this.J = mk0Var;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oy5 {
    public final a74 a;
    public final qu0 b = new qu0(5);

    public oy5(a74 a74Var) {
        this.a = a74Var;
    }

    public final void a(o84 o84Var, yp ypVar) {
        vp vpVar = (vp) ypVar.keySet();
        yp ypVar2 = vpVar.I;
        if (ypVar2.isEmpty()) {
            return;
        }
        byte b = 0;
        if (ypVar.K > 999) {
            jl2.g0(ypVar, new my5(this, o84Var, b));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i = ypVar2.K;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        q84 Y = o84Var.Y(sb.toString());
        Iterator it = vpVar.iterator();
        int i3 = 1;
        while (true) {
            gz1 gz1Var = (gz1) it;
            if (!gz1Var.hasNext()) {
                try {
                    break;
                } finally {
                    Y.close();
                }
            } else {
                Y.v(i3, (String) gz1Var.next());
                i3++;
            }
        }
        Y.getClass();
        int t = dq2.t(Y, "work_spec_id");
        if (t == -1) {
            return;
        }
        while (Y.T()) {
            List list = (List) ypVar.get(Y.H(t));
            if (list != null) {
                byte[] blob = Y.getBlob(0);
                dp0 dp0Var = dp0.b;
                list.add(c5.G(blob));
            }
        }
    }

    public final void b(o84 o84Var, yp ypVar) {
        vp vpVar = (vp) ypVar.keySet();
        yp ypVar2 = vpVar.I;
        if (ypVar2.isEmpty()) {
            return;
        }
        byte b = 1;
        if (ypVar.K > 999) {
            jl2.g0(ypVar, new my5(this, o84Var, b));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i = ypVar2.K;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        q84 Y = o84Var.Y(sb.toString());
        Iterator it = vpVar.iterator();
        int i3 = 1;
        while (true) {
            gz1 gz1Var = (gz1) it;
            if (!gz1Var.hasNext()) {
                try {
                    break;
                } finally {
                    Y.close();
                }
            } else {
                Y.v(i3, (String) gz1Var.next());
                i3++;
            }
        }
        Y.getClass();
        int t = dq2.t(Y, "work_spec_id");
        if (t == -1) {
            return;
        }
        while (Y.T()) {
            List list = (List) ypVar.get(Y.H(t));
            if (list != null) {
                list.add(Y.H(0));
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        g4.V(this.a, false, true, new pu0(str, (byte) 20));
    }

    public final sx5 d(String str) {
        str.getClass();
        return (sx5) g4.V(this.a, true, false, new pu0(str, (byte) 13));
    }

    public final ky5 e(String str) {
        str.getClass();
        return (ky5) g4.V(this.a, true, false, new pu0(str, (byte) 12));
    }

    public final List f(String str) {
        str.getClass();
        return (List) g4.V(this.a, true, false, new pu0(str, (byte) 21));
    }

    public final void g(String str, long j) {
        str.getClass();
        ((Number) g4.V(this.a, false, true, new ly5(j, str, (byte) 0))).intValue();
    }

    public final void h(int i, String str) {
        str.getClass();
        g4.V(this.a, false, true, new b15(str, i, (byte) 1));
    }

    public final void i(String str, long j) {
        str.getClass();
        g4.V(this.a, false, true, new ly5(j, str, (byte) 1));
    }

    public final void j(sx5 sx5Var, String str) {
        str.getClass();
        ((Number) g4.V(this.a, false, true, new ap3((Object) sx5Var, (Object) str, (byte) 21))).intValue();
    }

    public final void k(String str, int i) {
        str.getClass();
        g4.V(this.a, false, true, new b15(i, str));
    }
}

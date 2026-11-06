package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n73 {
    public final k73 a;
    public final cu4 b = new cu4(0);
    public int c;
    public String d;
    public String e;

    public n73(k73 k73Var) {
        this.a = k73Var;
    }

    public final i73 a(int i) {
        return c(i, this.a, null, false);
    }

    public final i73 b(String str, boolean z) {
        Object obj;
        k73 k73Var;
        str.getClass();
        Iterator it = ((ng0) qj4.w(new v2(this.b, (byte) 3))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            i73 i73Var = (i73) obj;
            if (qx4.t((String) i73Var.J.f, str, false) || i73Var.J.z(str) != null) {
                break;
            }
        }
        i73 i73Var2 = (i73) obj;
        if (i73Var2 != null) {
            return i73Var2;
        }
        if (!z || (k73Var = this.a.K) == null) {
            return null;
        }
        n73 n73Var = k73Var.N;
        n73Var.getClass();
        if (jx4.L(str)) {
            return null;
        }
        return n73Var.b(str, true);
    }

    public final i73 c(int i, i73 i73Var, i73 i73Var2, boolean z) {
        cu4 cu4Var = this.b;
        i73 i73Var3 = (i73) qb.y(cu4Var, i);
        if (i73Var2 != null) {
            if (j42.c(i73Var3, i73Var2) && j42.c(i73Var3.K, i73Var2.K)) {
                return i73Var3;
            }
            i73Var3 = null;
        } else if (i73Var3 != null) {
            return i73Var3;
        }
        k73 k73Var = this.a;
        if (z) {
            Iterator it = ((ng0) qj4.w(new v2(cu4Var, (byte) 3))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i73Var3 = null;
                    break;
                }
                i73 i73Var4 = (i73) it.next();
                i73Var3 = (!(i73Var4 instanceof k73) || i73Var4.equals(i73Var)) ? null : ((k73) i73Var4).N.c(i, k73Var, i73Var2, true);
                if (i73Var3 != null) {
                    break;
                }
            }
        }
        if (i73Var3 != null) {
            return i73Var3;
        }
        k73 k73Var2 = k73Var.K;
        if (k73Var2 == null || k73Var2.equals(i73Var)) {
            return null;
        }
        k73 k73Var3 = k73Var.K;
        k73Var3.getClass();
        return k73Var3.N.c(i, k73Var, i73Var2, z);
    }

    public final h73 d(h73 h73Var, pn pnVar, boolean z, i73 i73Var) {
        h73 h73Var2;
        ArrayList arrayList = new ArrayList();
        k73 k73Var = this.a;
        Iterator it = k73Var.iterator();
        while (true) {
            m73 m73Var = (m73) it;
            if (!m73Var.hasNext()) {
                break;
            }
            i73 i73Var2 = (i73) m73Var.next();
            h73Var2 = j42.c(i73Var2, i73Var) ? null : i73Var2.e(pnVar);
            if (h73Var2 != null) {
                arrayList.add(h73Var2);
            }
        }
        h73 h73Var3 = (h73) o70.c1(arrayList);
        k73 k73Var2 = k73Var.K;
        if (k73Var2 != null && z && !k73Var2.equals(i73Var)) {
            h73Var2 = k73Var2.f(pnVar, k73Var);
        }
        return (h73) o70.c1(dq.b1(new h73[]{h73Var, h73Var3, h73Var2}));
    }
}

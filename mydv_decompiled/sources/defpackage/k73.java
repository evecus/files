package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class k73 extends i73 implements Iterable, w72 {
    public static final /* synthetic */ int O = 0;
    public final n73 N;

    public k73(p73 p73Var) {
        super(p73Var);
        this.N = new n73(this);
    }

    @Override // defpackage.i73
    public final h73 e(pn pnVar) {
        h73 e = super.e(pnVar);
        n73 n73Var = this.N;
        n73Var.getClass();
        return n73Var.d(e, pnVar, false, n73Var.a);
    }

    @Override // defpackage.i73
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k73) || !super.equals(obj)) {
            return false;
        }
        n73 n73Var = this.N;
        int e = n73Var.b.e();
        n73 n73Var2 = ((k73) obj).N;
        if (e != n73Var2.b.e() || n73Var.c != n73Var2.c) {
            return false;
        }
        Iterator it = ((ng0) qj4.w(new v2(n73Var.b, (byte) 3))).iterator();
        while (it.hasNext()) {
            i73 i73Var = (i73) it.next();
            if (!i73Var.equals(qb.y(n73Var2.b, i73Var.J.b))) {
                return false;
            }
        }
        return true;
    }

    public final h73 f(pn pnVar, i73 i73Var) {
        return this.N.d(super.e(pnVar), pnVar, true, i73Var);
    }

    public final h73 h(String str, boolean z, i73 i73Var) {
        h73 h73Var;
        str.getClass();
        n73 n73Var = this.N;
        n73Var.getClass();
        k73 k73Var = n73Var.a;
        h73 z2 = k73Var.J.z(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = k73Var.iterator();
        while (true) {
            m73 m73Var = (m73) it;
            h73Var = null;
            if (!m73Var.hasNext()) {
                break;
            }
            i73 i73Var2 = (i73) m73Var.next();
            if (!j42.c(i73Var2, i73Var)) {
                if (i73Var2 instanceof k73) {
                    h73Var = ((k73) i73Var2).h(str, false, k73Var);
                } else {
                    i73Var2.getClass();
                    h73Var = i73Var2.J.z(str);
                }
            }
            if (h73Var != null) {
                arrayList.add(h73Var);
            }
        }
        h73 h73Var2 = (h73) o70.c1(arrayList);
        k73 k73Var2 = k73Var.K;
        if (k73Var2 != null && z && !k73Var2.equals(i73Var)) {
            h73Var = k73Var2.h(str, true, k73Var);
        }
        return (h73) o70.c1(dq.b1(new h73[]{z2, h73Var2, h73Var}));
    }

    @Override // defpackage.i73
    public final int hashCode() {
        n73 n73Var = this.N;
        int i = n73Var.c;
        cu4 cu4Var = n73Var.b;
        int e = cu4Var.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + cu4Var.c(i2)) * 31) + ((i73) cu4Var.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        n73 n73Var = this.N;
        n73Var.getClass();
        return new m73(n73Var);
    }

    @Override // defpackage.i73
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        n73 n73Var = this.N;
        String str = n73Var.e;
        n73Var.getClass();
        i73 b = (str == null || jx4.L(str)) ? null : n73Var.b(str, true);
        if (b == null) {
            b = n73Var.a(n73Var.c);
        }
        sb.append(" startDestination=");
        if (b == null) {
            String str2 = n73Var.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = n73Var.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(n73Var.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(b.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}

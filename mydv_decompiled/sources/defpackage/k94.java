package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k94 implements j94 {
    public final tm1 I;
    public final n43 J;
    public n43 K;

    public k94(Map map, tm1 tm1Var) {
        n43 n43Var;
        this.I = tm1Var;
        if (map == null || map.isEmpty()) {
            n43Var = null;
        } else {
            n43Var = new n43(map.size());
            for (Map.Entry entry : map.entrySet()) {
                n43Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.J = n43Var;
    }

    @Override // defpackage.j94
    public final i94 a(String str, rm1 rm1Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!o7.H(str.charAt(i))) {
                n43 n43Var = this.K;
                if (n43Var == null) {
                    long[] jArr = ia4.a;
                    n43Var = new n43();
                    this.K = n43Var;
                }
                Object g = n43Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    n43Var.m(str, g);
                }
                ((List) g).add(rm1Var);
                return new pn(n43Var, str, rm1Var, (byte) 12);
            }
        }
        s83.t("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.j94
    public final boolean c(Object obj) {
        return ((Boolean) this.I.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.j94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k94.d():java.util.Map");
    }

    @Override // defpackage.j94
    public final Object e(String str) {
        n43 n43Var = this.J;
        List list = n43Var != null ? (List) n43Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && n43Var != null) {
            List subList = list.subList(1, list.size());
            int f = n43Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = n43Var.c;
            Object obj = objArr[f];
            n43Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}

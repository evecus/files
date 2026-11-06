package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class iw0 {
    public static final String a = fr2.h("DiagnosticsWrkr");

    public static final String a(ay5 ay5Var, qy5 qy5Var, c15 c15Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ky5 ky5Var = (ky5) it.next();
            nx5 B = hc4.B(ky5Var);
            String str = ky5Var.a;
            c15Var.getClass();
            String str2 = B.a;
            int i = B.b;
            str2.getClass();
            a15 a15Var = (a15) g4.V(c15Var.a, true, false, new b15(str2, i, (byte) 0));
            Integer valueOf = a15Var != null ? Integer.valueOf(a15Var.c) : null;
            ay5Var.getClass();
            str.getClass();
            String Z0 = o70.Z0((List) g4.V(ay5Var.a, true, false, new pu0(str, (byte) 10)), ",", null, null, 0, null, 62);
            qy5Var.getClass();
            String Z02 = o70.Z0((List) g4.V(qy5Var.a, true, false, new pu0(str, (byte) 22)), ",", null, null, 0, null, 62);
            StringBuilder E = r7.E("\n", str, "\t ");
            E.append(ky5Var.c);
            E.append("\t ");
            E.append(valueOf);
            E.append("\t ");
            E.append(ky5Var.b.name());
            E.append("\t ");
            E.append(Z0);
            E.append("\t ");
            E.append(Z02);
            E.append('\t');
            sb.append(E.toString());
        }
        return sb.toString();
    }
}

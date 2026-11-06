package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qj4 extends rj4 {
    public static oj4 w(Iterator it) {
        it.getClass();
        return new ng0(new v70(it, (byte) 1));
    }

    public static oj4 x(Object obj, tm1 tm1Var) {
        return obj == null ? s91.a : new ep1(new q94(obj, (byte) 4), tm1Var);
    }

    public static String y(oj4 oj4Var, String str) {
        oj4Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : oj4Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            qi4.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List z(oj4 oj4Var) {
        Iterator it = oj4Var.iterator();
        if (!it.hasNext()) {
            return o91.I;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return p70.j0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

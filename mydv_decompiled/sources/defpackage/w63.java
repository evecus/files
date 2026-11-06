package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w63 {
    public final o63 a;
    public final fw4 b;
    public final fw4 c;
    public boolean d;
    public final p04 e;
    public final p04 f;
    public final u83 g;
    public final /* synthetic */ q73 h;

    public w63(q73 q73Var, u83 u83Var) {
        u83Var.getClass();
        this.h = q73Var;
        this.a = new o63((byte) 18);
        fw4 c = o7.c(o91.I);
        this.b = c;
        fw4 c2 = o7.c(t91.I);
        this.c = c2;
        this.e = sv2.j(c);
        this.f = sv2.j(c2);
        this.g = u83Var;
    }

    public final void a(p63 p63Var) {
        p63Var.getClass();
        synchronized (this.a) {
            fw4 fw4Var = this.b;
            fw4Var.i(null, o70.g1((Collection) fw4Var.getValue(), p63Var));
        }
    }

    public final p63 b(i73 i73Var, Bundle bundle) {
        a73 a73Var = this.h.b;
        a73Var.getClass();
        return o63.b(a73Var.a.c, i73Var, bundle, a73Var.i(), a73Var.p);
    }

    public final void c(p63 p63Var) {
        b73 b73Var;
        vr5 vr5Var;
        p63Var.getClass();
        a73 a73Var = this.h.b;
        fw4 fw4Var = a73Var.i;
        String str = p63Var.N;
        LinkedHashMap linkedHashMap = a73Var.x;
        boolean c = j42.c(linkedHashMap.get(p63Var), Boolean.TRUE);
        fw4 fw4Var2 = this.c;
        fw4Var2.i(null, zk4.t((Set) fw4Var2.getValue(), p63Var));
        linkedHashMap.remove(p63Var);
        pp ppVar = a73Var.f;
        if (ppVar.contains(p63Var)) {
            if (this.d) {
                return;
            }
            a73Var.s();
            fw4 fw4Var3 = a73Var.g;
            ArrayList arrayList = new ArrayList(ppVar);
            fw4Var3.getClass();
            fw4Var3.i(null, arrayList);
            ArrayList p = a73Var.p();
            fw4Var.getClass();
            fw4Var.i(null, p);
            return;
        }
        a73Var.r(p63Var);
        if (p63Var.P.j.i.compareTo(ki2.K) >= 0) {
            p63Var.a(ki2.I);
        }
        if (!ppVar.isEmpty()) {
            Iterator it = ppVar.iterator();
            while (it.hasNext()) {
                if (((p63) it.next()).N.equals(str)) {
                    break;
                }
            }
        }
        if (!c && (b73Var = a73Var.p) != null && (vr5Var = (vr5) b73Var.b.remove(str)) != null) {
            vr5Var.a();
        }
        a73Var.s();
        ArrayList p2 = a73Var.p();
        fw4Var.getClass();
        fw4Var.i(null, p2);
    }

    public final void d(p63 p63Var, boolean z) {
        p63Var.getClass();
        a73 a73Var = this.h.b;
        jt2 jt2Var = new jt2(this, p63Var, z);
        a73Var.getClass();
        u83 b = a73Var.t.b(p63Var.J.I);
        a73Var.x.put(p63Var, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            Object obj = a73Var.u.get(b);
            obj.getClass();
            ((w63) obj).d(p63Var, z);
            return;
        }
        y63 y63Var = a73Var.w;
        if (y63Var != null) {
            y63Var.invoke(p63Var);
            jt2Var.invoke();
            return;
        }
        ce ceVar = new ce(jt2Var, (byte) 26);
        pp ppVar = a73Var.f;
        int indexOf = ppVar.indexOf(p63Var);
        if (indexOf < 0) {
            il2.K("Ignoring pop of " + p63Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != ppVar.K) {
            a73Var.m(((p63) ppVar.get(i)).J.J.b, true, false);
        }
        a73.o(a73Var, p63Var);
        ceVar.invoke();
        a73Var.b.invoke();
        a73Var.b();
    }

    public final void e(p63 p63Var, boolean z) {
        Object obj;
        p63Var.getClass();
        w43 w43Var = this.e.I;
        fw4 fw4Var = this.c;
        Iterable iterable = (Iterable) fw4Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((p63) it.next()) == p63Var) {
                    Iterable iterable2 = (Iterable) ((fw4) w43Var).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((p63) it2.next()) == p63Var) {
                        }
                    }
                    return;
                }
            }
        }
        fw4Var.i(null, zk4.v((Set) fw4Var.getValue(), p63Var));
        List list = (List) ((fw4) w43Var).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            p63 p63Var2 = (p63) obj;
            if (!j42.c(p63Var2, p63Var) && ((List) ((fw4) w43Var).getValue()).lastIndexOf(p63Var2) < ((List) ((fw4) w43Var).getValue()).lastIndexOf(p63Var)) {
                break;
            }
        }
        p63 p63Var3 = (p63) obj;
        if (p63Var3 != null) {
            fw4Var.i(null, zk4.v((Set) fw4Var.getValue(), p63Var3));
        }
        d(p63Var, z);
    }

    public final void f(p63 p63Var) {
        p63Var.getClass();
        a73 a73Var = this.h.b;
        a73Var.getClass();
        u83 b = a73Var.t.b(p63Var.J.I);
        if (!b.equals(this.g)) {
            Object obj = a73Var.u.get(b);
            if (obj != null) {
                ((w63) obj).f(p63Var);
                return;
            } else {
                zy.e(hf1.z(new StringBuilder("NavigatorBackStack for "), p63Var.J.I, " should already be created"));
                return;
            }
        }
        tm1 tm1Var = a73Var.v;
        if (tm1Var != null) {
            tm1Var.invoke(p63Var);
            a(p63Var);
        } else {
            il2.K("Ignoring add of destination " + p63Var.J + " outside of the call to navigate(). ");
        }
    }
}

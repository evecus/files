package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f50 extends qr5 {
    public final kq5 b;
    public final wm4 c;
    public final fw4 d;
    public final p04 e;
    public final fw4 f;
    public final p04 g;
    public rv4 h;
    public final fw4 i;
    public final List j;
    public List k;
    public boolean l;

    public f50(kq5 kq5Var, wm4 wm4Var) {
        this.b = kq5Var;
        this.c = wm4Var;
        o91 o91Var = o91.I;
        fw4 c = o7.c(o91Var);
        this.d = c;
        this.e = sv2.j(c);
        fw4 c2 = o7.c(Boolean.FALSE);
        this.f = c2;
        this.g = sv2.j(c2);
        this.i = o7.c(null);
        o7.c(o91Var);
        o7.c(0);
        List k0 = p70.k0(new uj3("全部", ""), new uj3("公开课", "100000"), new uj3("游戏", "300205"), new uj3("二次元", "300206"), new uj3("音乐", "300209"), new uj3("影视", "300215"), new uj3("美食", "300204"), new uj3("知识", "300213"), new uj3("小剧场", "300214"), new uj3("生活vlog", "300216"), new uj3("体育", "300207"), new uj3("旅行", "300221"), new uj3("亲子", "300217"), new uj3("动物", "300220"), new uj3("三农", "300219"), new uj3("汽车", "300228"), new uj3("美妆穿搭", "300222"));
        this.j = k0;
        this.k = k0;
        c.i(null, p(k0));
    }

    public static ArrayList p(List list) {
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uj3 uj3Var = (uj3) it.next();
            arrayList.add(new b50((String) uj3Var.I, (String) uj3Var.J, o91.I, false, null, false));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r14, defpackage.gj0 r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f50.q(boolean, gj0):java.lang.Object");
    }

    public final void r(boolean z) {
        rv4 rv4Var;
        if (!z) {
            Iterable iterable = (Iterable) this.d.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!((b50) it.next()).c.isEmpty()) {
                        return;
                    }
                }
            }
        }
        if (z || (rv4Var = this.h) == null || !rv4Var.isActive()) {
            this.h = p70.g0(o7.B(this), null, null, new e50(this, z, null), 3);
        }
    }

    public final void s(int i, String str) {
        Object obj;
        str.getClass();
        Iterator it = ((Iterable) this.d.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (j42.c(((b50) obj).b, str)) {
                    break;
                }
            }
        }
        b50 b50Var = (b50) obj;
        if (b50Var == null || i < b50Var.c.size() - 3 || b50Var.d) {
            return;
        }
        t(str);
    }

    public final void t(String str) {
        str.getClass();
        fw4 fw4Var = this.d;
        List list = (List) fw4Var.getValue();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (j42.c(((b50) it.next()).b, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        b50 b50Var = (b50) list.get(i);
        if (b50Var.d) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, b50.a(b50Var, null, true, null, 39));
        fw4Var.getClass();
        fw4Var.i(null, arrayList);
        p70.g0(o7.B(this), null, null, new a40(this, str, (fj0) null), 3);
    }

    public final void u(int i) {
        if (i < 0 || i >= this.k.size()) {
            return;
        }
        String str = (String) ((uj3) this.k.get(i)).J;
        b50 b50Var = (b50) o70.V0(i, (List) this.d.getValue());
        if (b50Var == null || !b50Var.c.isEmpty() || b50Var.d) {
            return;
        }
        t(str);
    }
}

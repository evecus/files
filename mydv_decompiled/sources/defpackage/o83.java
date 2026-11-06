package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o83 {
    public final fw4 a = o7.c(p83.g);
    public final fw4 b;
    public final p04 c;
    public final pp d;
    public final pp e;
    public l83 f;
    public int g;
    public n83 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public o83() {
        fw4 c = o7.c(new m83());
        this.b = c;
        this.c = sv2.j(c);
        this.d = new pp();
        this.e = new pp();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(ts0 ts0Var, n83 n83Var, int i) {
        ts0Var.getClass();
        if (n83Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(n83Var);
            n83Var.a = ts0Var;
            ((m83) ((fw4) this.c.I).getValue()).getClass();
            n83Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(n83Var);
        ts0 ts0Var2 = n83Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(ts0Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        m83 m83Var;
        pp ppVar = this.d;
        if (!ppVar.isEmpty()) {
            Iterator it = ppVar.iterator();
            while (it.hasNext()) {
                if (((l83) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        pp ppVar2 = this.e;
        if (!ppVar2.isEmpty()) {
            Iterator it2 = ppVar2.iterator();
            while (it2.hasNext()) {
                if (((l83) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((n83) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((n83) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((n83) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        l83 l83Var = this.f;
        if (l83Var == null) {
            l83Var = c(0);
        }
        l83 l83Var2 = this.f;
        if (l83Var2 == null) {
            l83Var2 = c(0);
        }
        if (j42.c(l83Var2, l83Var)) {
            if (l83Var2 == null) {
                m83Var = new m83();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = ppVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((l83) it6.next()).b;
                }
                Iterator<E> it7 = ppVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((l83) it7.next()).b;
                }
                mu0 mu0Var = l83Var2.a;
                mk2 K = p70.K();
                u70.I0(K, arrayList);
                K.add(mu0Var);
                u70.I0(K, o91.I);
                m83Var = new m83(p70.D(K), arrayList.size());
            }
            fw4 fw4Var = this.b;
            if (j42.c((m83) fw4Var.getValue(), m83Var)) {
                return;
            }
            fw4Var.i(null, m83Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((n83) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((n83) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((n83) it10.next()).getClass();
            }
        }
    }

    public final l83 c(int i) {
        Object obj;
        Object obj2;
        pp ppVar = this.e;
        pp ppVar2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = ppVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((l83) obj).b) {
                    break;
                }
            }
            l83 l83Var = (l83) obj;
            if (l83Var != null) {
                return l83Var;
            }
            Iterator it2 = ppVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((l83) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (l83) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = ppVar2.iterator();
            while (it3.hasNext()) {
                ((l83) it3.next()).getClass();
            }
            Iterator it4 = ppVar.iterator();
            while (it4.hasNext()) {
                ((l83) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = ppVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((l83) obj2).b) {
                break;
            }
        }
        l83 l83Var2 = (l83) obj2;
        if (l83Var2 != null) {
            return l83Var2;
        }
        Iterator it6 = ppVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((l83) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (l83) obj3;
    }
}

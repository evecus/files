package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a73 {
    public final mn4 A;
    public final q73 a;
    public final v63 b;
    public k73 c;
    public Bundle d;
    public Bundle[] e;
    public final pp f = new pp();
    public final fw4 g;
    public final p04 h;
    public final fw4 i;
    public final p04 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public vi2 o;
    public b73 p;
    public final ArrayList q;
    public ki2 r;
    public final x63 s;
    public final v83 t;
    public final LinkedHashMap u;
    public tm1 v;
    public y63 w;
    public final LinkedHashMap x;
    public int y;
    public final ArrayList z;

    public a73(q73 q73Var, v63 v63Var) {
        this.a = q73Var;
        this.b = v63Var;
        o91 o91Var = o91.I;
        fw4 c = o7.c(o91Var);
        this.g = c;
        this.h = sv2.j(c);
        fw4 c2 = o7.c(o91Var);
        this.i = c2;
        this.j = sv2.j(c2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new ArrayList();
        this.r = ki2.J;
        this.s = new x63(this, (byte) 0);
        this.t = new v83();
        this.u = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.z = new ArrayList();
        this.A = o7.b(0, 2, ez.J);
    }

    public static i73 e(int i, i73 i73Var, i73 i73Var2, boolean z) {
        if (i73Var.J.b == i && (i73Var2 == null || (i73Var.equals(i73Var2) && j42.c(i73Var.K, i73Var2.K)))) {
            return i73Var;
        }
        k73 k73Var = i73Var instanceof k73 ? (k73) i73Var : null;
        if (k73Var == null) {
            k73Var = i73Var.K;
            k73Var.getClass();
        }
        return k73Var.N.c(i, k73Var, i73Var2, z);
    }

    public static /* synthetic */ void o(a73 a73Var, p63 p63Var) {
        a73Var.n(p63Var, false, new pp());
    }

    public final void a(i73 i73Var, Bundle bundle, p63 p63Var, List list) {
        Object obj;
        Object obj2;
        yc ycVar = this.a.c;
        i73 i73Var2 = p63Var.J;
        boolean z = i73Var2 instanceof yf1;
        pp ppVar = this.f;
        if (!z) {
            while (!ppVar.isEmpty() && (((p63) ppVar.last()).J instanceof yf1) && m(((p63) ppVar.last()).J.J.b, true, false)) {
            }
        }
        pp ppVar2 = new pp();
        Object obj3 = null;
        if (i73Var instanceof k73) {
            i73 i73Var3 = i73Var2;
            do {
                i73Var3.getClass();
                i73Var3 = i73Var3.K;
                if (i73Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (j42.c(((p63) obj2).J, i73Var3)) {
                                break;
                            }
                        }
                    }
                    p63 p63Var2 = (p63) obj2;
                    if (p63Var2 == null) {
                        p63Var2 = o63.b(ycVar, i73Var3, bundle, i(), this.p);
                    }
                    ppVar2.addFirst(p63Var2);
                    if (!ppVar.isEmpty() && ((p63) ppVar.last()).J == i73Var3) {
                        o(this, (p63) ppVar.last());
                    }
                }
                if (i73Var3 == null) {
                    break;
                }
            } while (i73Var3 != i73Var);
        }
        i73 i73Var4 = ppVar2.isEmpty() ? i73Var2 : ((p63) ppVar2.first()).J;
        while (i73Var4 != null && d(i73Var4.J.b, i73Var4) != i73Var4) {
            i73Var4 = i73Var4.K;
            if (i73Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (j42.c(((p63) obj).J, i73Var4)) {
                            break;
                        }
                    }
                }
                p63 p63Var3 = (p63) obj;
                if (p63Var3 == null) {
                    p63Var3 = o63.b(ycVar, i73Var4, i73Var4.c(bundle2), i(), this.p);
                }
                ppVar2.addFirst(p63Var3);
            }
        }
        if (!ppVar2.isEmpty()) {
            i73Var2 = ((p63) ppVar2.first()).J;
        }
        while (!ppVar.isEmpty() && (((p63) ppVar.last()).J instanceof k73)) {
            i73 i73Var5 = ((p63) ppVar.last()).J;
            i73Var5.getClass();
            if (qb.y(((k73) i73Var5).N.b, i73Var2.J.b) != null) {
                break;
            } else {
                o(this, (p63) ppVar.last());
            }
        }
        p63 p63Var4 = (p63) ppVar.h();
        if (p63Var4 == null) {
            p63Var4 = (p63) ppVar2.h();
        }
        if (!j42.c(p63Var4 != null ? p63Var4.J : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                i73 i73Var6 = ((p63) previous).J;
                k73 k73Var = this.c;
                k73Var.getClass();
                if (j42.c(i73Var6, k73Var)) {
                    obj3 = previous;
                    break;
                }
            }
            p63 p63Var5 = (p63) obj3;
            if (p63Var5 == null) {
                k73 k73Var2 = this.c;
                k73Var2.getClass();
                k73 k73Var3 = this.c;
                k73Var3.getClass();
                p63Var5 = o63.b(ycVar, k73Var2, k73Var3.c(bundle), i(), this.p);
            }
            ppVar2.addFirst(p63Var5);
        }
        Iterator it = ppVar2.iterator();
        while (it.hasNext()) {
            p63 p63Var6 = (p63) it.next();
            Object obj4 = this.u.get(this.t.b(p63Var6.J.I));
            if (obj4 == null) {
                zy.e(hf1.z(new StringBuilder("NavigatorBackStack for "), i73Var.I, " should already be created"));
                return;
            }
            ((w63) obj4).a(p63Var6);
        }
        ppVar.addAll(ppVar2);
        ppVar.addLast(p63Var);
        ArrayList g1 = o70.g1(ppVar2, p63Var);
        int size = g1.size();
        int i = 0;
        while (i < size) {
            Object obj5 = g1.get(i);
            i++;
            p63 p63Var7 = (p63) obj5;
            k73 k73Var4 = p63Var7.J.K;
            if (k73Var4 != null) {
                k(p63Var7, f(k73Var4.J.b));
            }
        }
    }

    public final boolean b() {
        pp ppVar;
        while (true) {
            ppVar = this.f;
            if (ppVar.isEmpty() || !(((p63) ppVar.last()).J instanceof k73)) {
                break;
            }
            o(this, (p63) ppVar.last());
        }
        p63 p63Var = (p63) ppVar.l();
        ArrayList arrayList = this.z;
        if (p63Var != null) {
            arrayList.add(p63Var);
        }
        this.y++;
        s();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList s1 = o70.s1(arrayList);
            arrayList.clear();
            int size = s1.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = s1.get(i2);
                i2++;
                p63 p63Var2 = (p63) obj;
                Iterator it = o70.r1(this.q).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        zl1.c();
                        return false;
                    }
                    i73 i73Var = p63Var2.J;
                    p63Var2.P.a();
                    throw null;
                }
                this.A.b(p63Var2);
            }
            ArrayList arrayList2 = new ArrayList(ppVar);
            fw4 fw4Var = this.g;
            fw4Var.getClass();
            fw4Var.i(null, arrayList2);
            ArrayList p = p();
            fw4 fw4Var2 = this.i;
            fw4Var2.getClass();
            fw4Var2.i(null, p);
        }
        return p63Var != null;
    }

    public final boolean c(ArrayList arrayList, i73 i73Var, boolean z, boolean z2) {
        boolean z3;
        n24 n24Var = new n24();
        pp ppVar = new pp();
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (true) {
            if (i >= size) {
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            u83 u83Var = (u83) arrayList.get(i);
            n24 n24Var2 = new n24();
            p63 p63Var = (p63) this.f.last();
            z3 = z2;
            y63 y63Var = new y63(n24Var2, n24Var, this, z3, ppVar);
            u83Var.getClass();
            p63Var.getClass();
            this.w = y63Var;
            u83Var.e(p63Var, z3);
            this.w = null;
            if (!n24Var2.I) {
                break;
            }
            i = i2;
        }
        if (z3) {
            final byte b2 = 1;
            LinkedHashMap linkedHashMap = this.m;
            if (!z) {
                Iterator it = new se1(qj4.x(i73Var, new do2((byte) 13)), new tm1(this) { // from class: z63
                    public final /* synthetic */ a73 J;

                    {
                        this.J = this;
                    }

                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        byte b3 = b;
                        a73 a73Var = this.J;
                        i73 i73Var2 = (i73) obj;
                        switch (b3) {
                            case 0:
                                i73Var2.getClass();
                                containsKey = a73Var.m.containsKey(Integer.valueOf(i73Var2.J.b));
                                break;
                            default:
                                i73Var2.getClass();
                                containsKey = a73Var.m.containsKey(Integer.valueOf(i73Var2.J.b));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, (byte) 1).iterator();
                while (true) {
                    re1 re1Var = (re1) it;
                    if (!re1Var.hasNext()) {
                        break;
                    }
                    Integer valueOf = Integer.valueOf(((i73) re1Var.next()).J.b);
                    t63 t63Var = (t63) ppVar.h();
                    linkedHashMap.put(valueOf, t63Var != null ? (String) t63Var.a.c : null);
                }
            }
            if (!ppVar.isEmpty()) {
                g72 g72Var = ((t63) ppVar.first()).a;
                String str = (String) g72Var.c;
                Iterator it2 = new se1(qj4.x(d(g72Var.b, null), new do2((byte) 14)), new tm1(this) { // from class: z63
                    public final /* synthetic */ a73 J;

                    {
                        this.J = this;
                    }

                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        byte b3 = b2;
                        a73 a73Var = this.J;
                        i73 i73Var2 = (i73) obj;
                        switch (b3) {
                            case 0:
                                i73Var2.getClass();
                                containsKey = a73Var.m.containsKey(Integer.valueOf(i73Var2.J.b));
                                break;
                            default:
                                i73Var2.getClass();
                                containsKey = a73Var.m.containsKey(Integer.valueOf(i73Var2.J.b));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, (byte) 1).iterator();
                while (true) {
                    re1 re1Var2 = (re1) it2;
                    if (!re1Var2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((i73) re1Var2.next()).J.b), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.n.put(str, ppVar);
                }
            }
        }
        this.b.invoke();
        return n24Var.I;
    }

    public final i73 d(int i, i73 i73Var) {
        i73 i73Var2;
        k73 k73Var = this.c;
        if (k73Var == null) {
            return null;
        }
        if (k73Var.J.b == i) {
            if (i73Var == null) {
                return k73Var;
            }
            if (j42.c(k73Var, i73Var) && i73Var.K == null) {
                return this.c;
            }
        }
        p63 p63Var = (p63) this.f.l();
        if (p63Var == null || (i73Var2 = p63Var.J) == null) {
            i73Var2 = this.c;
            i73Var2.getClass();
        }
        return e(i, i73Var2, i73Var, false);
    }

    public final p63 f(int i) {
        Object obj;
        pp ppVar = this.f;
        ListIterator<E> listIterator = ppVar.listIterator(ppVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p63) obj).J.J.b == i) {
                break;
            }
        }
        p63 p63Var = (p63) obj;
        if (p63Var != null) {
            return p63Var;
        }
        StringBuilder C = hf1.C("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        C.append(g());
        throw new IllegalArgumentException(C.toString().toString());
    }

    public final i73 g() {
        p63 p63Var = (p63) this.f.l();
        if (p63Var != null) {
            return p63Var.J;
        }
        return null;
    }

    public final k73 h() {
        k73 k73Var = this.c;
        if (k73Var != null) {
            k73Var.getClass();
            return k73Var;
        }
        zy.i("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final ki2 i() {
        return this.o == null ? ki2.K : this.r;
    }

    public final k73 j() {
        i73 i73Var;
        p63 p63Var = (p63) this.f.l();
        if (p63Var == null || (i73Var = p63Var.J) == null) {
            i73Var = this.c;
            i73Var.getClass();
        }
        k73 k73Var = i73Var instanceof k73 ? (k73) i73Var : null;
        if (k73Var != null) {
            return k73Var;
        }
        k73 k73Var2 = i73Var.K;
        k73Var2.getClass();
        return k73Var2;
    }

    public final void k(p63 p63Var, p63 p63Var2) {
        this.k.put(p63Var, p63Var2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(p63Var2) == null) {
            linkedHashMap.put(p63Var2, new wq());
        }
        Object obj = linkedHashMap.get(p63Var2);
        obj.getClass();
        ((wq) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f7, code lost:
    
        r10 = defpackage.o70.s1((java.util.Collection) ((defpackage.fw4) r8.e.I).getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0313, code lost:
    
        if (r11.hasPrevious() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0323, code lost:
    
        if (((defpackage.p63) r11.previous()).N.equals(r7.N) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0325, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032d, code lost:
    
        r10.set(r11, r7);
        r8.b.i(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0336, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x032c, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x032a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0339, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x033a, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0237, code lost:
    
        if (r27.J.b == r6.J.b) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0225, code lost:
    
        if (r11.equals(r6) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0239, code lost:
    
        r6 = new defpackage.pp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0244, code lost:
    
        if (defpackage.p70.X(r26.f) < r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0246, code lost:
    
        r10 = (defpackage.p63) defpackage.u70.L0(r26.f);
        r(r10);
        r16 = new defpackage.p63(r10.I, r10.J, r10.J.c(r28), r10.L, r10.M, r10.N, r10.O);
        r9 = r16.P;
        r11 = r10.L;
        r9.getClass();
        r11.getClass();
        r9.d = r11;
        r9 = r16.P;
        r9.k = r10.P.k;
        r9.b();
        r6.addFirst(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0295, code lost:
    
        r7 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029d, code lost:
    
        if (r7.hasNext() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x029f, code lost:
    
        r8 = (defpackage.p63) r7.next();
        r9 = r8.J.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a9, code lost:
    
        if (r9 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ab, code lost:
    
        k(r8, f(r9.J.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b6, code lost:
    
        r26.f.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02bc, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c4, code lost:
    
        if (r6.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c6, code lost:
    
        r7 = (defpackage.p63) r6.next();
        r8 = r26.t.b(r7.J.I);
        r9 = r7.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02dc, code lost:
    
        if (defpackage.i82.Y(r9) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02df, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02e0, code lost:
    
        if (r9 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e3, code lost:
    
        defpackage.il2.S(new defpackage.do2((byte) 17));
        r8.c(r9);
        r8 = r8.b();
        r9 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f6, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118 A[LOOP:1: B:13:0x0058->B:22:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e A[EDGE_INSN: B:23:0x011e->B:24:0x011e BREAK  A[LOOP:1: B:13:0x0058->B:22:0x0118], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x037f A[LOOP:2: B:38:0x0379->B:40:0x037f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.i73 r27, android.os.Bundle r28, defpackage.d83 r29) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a73.l(i73, android.os.Bundle, d83):void");
    }

    public final boolean m(int i, boolean z, boolean z2) {
        i73 i73Var;
        pp ppVar = this.f;
        if (ppVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = o70.h1(ppVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                i73Var = null;
                break;
            }
            i73Var = ((p63) it.next()).J;
            String str = i73Var.I;
            c8 c8Var = i73Var.J;
            u83 b = this.t.b(str);
            if (z || c8Var.b != i) {
                arrayList.add(b);
            }
            if (c8Var.b == i) {
                break;
            }
        }
        if (i73Var != null) {
            return c(arrayList, i73Var, z, z2);
        }
        int i2 = i73.M;
        il2.K("Ignoring popBackStack to destination " + mu0.v(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void n(p63 p63Var, boolean z, pp ppVar) {
        b73 b73Var;
        Set set;
        p63Var.getClass();
        pp ppVar2 = this.f;
        p63 p63Var2 = (p63) ppVar2.last();
        if (!j42.c(p63Var2, p63Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(p63Var.J);
            i73 i73Var = p63Var2.J;
            sb.append(", which is not the top of the back stack (");
            sb.append(i73Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        u70.L0(ppVar2);
        w63 w63Var = (w63) this.u.get(this.t.b(p63Var2.J.I));
        boolean z2 = true;
        if ((w63Var == null || (set = (Set) ((fw4) w63Var.f.I).getValue()) == null || !set.contains(p63Var2)) && !this.l.containsKey(p63Var2)) {
            z2 = false;
        }
        ki2 ki2Var = p63Var2.P.j.i;
        ki2 ki2Var2 = ki2.K;
        if (ki2Var.compareTo(ki2Var2) >= 0) {
            if (z) {
                p63Var2.a(ki2Var2);
                ppVar.addFirst(new t63(p63Var2));
            }
            if (z2) {
                p63Var2.a(ki2Var2);
            } else {
                p63Var2.a(ki2.I);
                r(p63Var2);
            }
        }
        if (z || z2 || (b73Var = this.p) == null) {
            return;
        }
        vr5 vr5Var = (vr5) b73Var.b.remove(p63Var2.N);
        if (vr5Var != null) {
            vr5Var.a();
        }
    }

    public final ArrayList p() {
        ki2 ki2Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ki2Var = ki2.L;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((fw4) ((w63) it.next()).f.I).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                p63 p63Var = (p63) obj;
                if (!arrayList.contains(p63Var) && p63Var.P.k.compareTo(ki2Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            u70.I0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            p63 p63Var2 = (p63) next;
            if (!arrayList.contains(p63Var2) && p63Var2.P.k.compareTo(ki2Var) >= 0) {
                arrayList3.add(next);
            }
        }
        u70.I0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((p63) obj2).J instanceof k73)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, d83 d83Var) {
        i73 h;
        p63 p63Var;
        i73 i73Var;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (j42.c((String) it.next(), str)) {
                it.remove();
            }
        }
        pp ppVar = (pp) p70.x(this.n).remove(str);
        yc ycVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        p63 p63Var2 = (p63) this.f.l();
        if (p63Var2 == null || (h = p63Var2.J) == null) {
            h = h();
        }
        if (ppVar != null) {
            Iterator it2 = ppVar.iterator();
            while (it2.hasNext()) {
                t63 t63Var = (t63) it2.next();
                g72 g72Var = t63Var.a;
                g72 g72Var2 = t63Var.a;
                i73 e = e(g72Var.b, h, null, true);
                if (e == null) {
                    int i3 = i73.M;
                    s83.n("Restore State failed: destination ", mu0.v(ycVar, g72Var2.b), " cannot be found from the current destination ", h);
                    return false;
                }
                ki2 i4 = i();
                b73 b73Var = this.p;
                ycVar.getClass();
                i4.getClass();
                Bundle bundle3 = (Bundle) g72Var2.d;
                if (bundle3 != null) {
                    Context context = ycVar.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new p63(ycVar, e, bundle2, i4, b73Var, (String) g72Var2.c, (Bundle) g72Var2.e));
                h = e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (!(((p63) obj).J instanceof k73)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList3.get(i6);
            i6++;
            p63 p63Var3 = (p63) obj2;
            List list = (List) o70.b1(arrayList2);
            if (j42.c((list == null || (p63Var = (p63) o70.a1(list)) == null || (i73Var = p63Var.J) == null) ? null : i73Var.I, p63Var3.J.I)) {
                list.add(p63Var3);
            } else {
                arrayList2.add(p70.n0(p63Var3));
            }
        }
        n24 n24Var = new n24();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            u83 b = this.t.b(((p63) o70.T0(list2)).J.I);
            ArrayList arrayList4 = arrayList;
            this.v = new v7(n24Var, arrayList4, new p24(), this, bundle, (byte) 6);
            b.d(list2, d83Var);
            this.v = null;
            arrayList = arrayList4;
        }
        return n24Var.I;
    }

    public final void r(p63 p63Var) {
        p63Var.getClass();
        p63 p63Var2 = (p63) this.k.remove(p63Var);
        if (p63Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        wq wqVar = (wq) linkedHashMap.get(p63Var2);
        Integer valueOf = wqVar != null ? Integer.valueOf(wqVar.a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            w63 w63Var = (w63) this.u.get(this.t.b(p63Var2.J.I));
            if (w63Var != null) {
                w63Var.c(p63Var2);
            }
            linkedHashMap.remove(p63Var2);
        }
    }

    public final void s() {
        wq wqVar;
        Set set;
        ArrayList s1 = o70.s1(this.f);
        if (s1.isEmpty()) {
            return;
        }
        int i = 0;
        ArrayList n0 = p70.n0(((p63) o70.a1(s1)).J);
        ArrayList arrayList = new ArrayList();
        if (o70.a1(n0) instanceof yf1) {
            Iterator it = o70.h1(s1).iterator();
            while (it.hasNext()) {
                i73 i73Var = ((p63) it.next()).J;
                arrayList.add(i73Var);
                if (!(i73Var instanceof yf1) && !(i73Var instanceof k73)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (p63 p63Var : o70.h1(s1)) {
            ki2 ki2Var = p63Var.P.k;
            i73 i73Var2 = p63Var.J;
            i73 i73Var3 = (i73) o70.U0(n0);
            ki2 ki2Var2 = ki2.M;
            ki2 ki2Var3 = ki2.L;
            if (i73Var3 != null && i73Var3.J.b == i73Var2.J.b) {
                if (ki2Var != ki2Var2) {
                    w63 w63Var = (w63) this.u.get(this.t.b(p63Var.J.I));
                    if (j42.c((w63Var == null || (set = (Set) ((fw4) w63Var.f.I).getValue()) == null) ? null : Boolean.valueOf(set.contains(p63Var)), Boolean.TRUE) || ((wqVar = (wq) this.l.get(p63Var)) != null && wqVar.a.get() == 0)) {
                        hashMap.put(p63Var, ki2Var3);
                    } else {
                        hashMap.put(p63Var, ki2Var2);
                    }
                }
                i73 i73Var4 = (i73) o70.U0(arrayList);
                if (i73Var4 != null && i73Var4.J.b == i73Var2.J.b) {
                    u70.K0(arrayList);
                }
                u70.K0(n0);
                k73 k73Var = i73Var2.K;
                if (k73Var != null) {
                    n0.add(k73Var);
                }
            } else if (arrayList.isEmpty() || i73Var2.J.b != ((i73) o70.T0(arrayList)).J.b) {
                p63Var.a(ki2.K);
            } else {
                i73 i73Var5 = (i73) u70.K0(arrayList);
                if (ki2Var == ki2Var2) {
                    p63Var.a(ki2Var3);
                } else if (ki2Var != ki2Var3) {
                    hashMap.put(p63Var, ki2Var3);
                }
                k73 k73Var2 = i73Var5.K;
                if (k73Var2 != null && !arrayList.contains(k73Var2)) {
                    arrayList.add(k73Var2);
                }
            }
        }
        int size = s1.size();
        while (i < size) {
            Object obj = s1.get(i);
            i++;
            p63 p63Var2 = (p63) obj;
            ki2 ki2Var4 = (ki2) hashMap.get(p63Var2);
            if (ki2Var4 != null) {
                p63Var2.a(ki2Var4);
            } else {
                p63Var2.P.b();
            }
        }
    }
}

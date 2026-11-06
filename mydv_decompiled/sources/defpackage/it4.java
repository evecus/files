package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class it4 implements kw4, Map, a82 {
    public ht4 I;
    public final xs4 J;
    public final xs4 K;
    public final xs4 L;

    public it4() {
        bm3 bm3Var = bm3.K;
        ns4 h = ws4.h();
        ht4 ht4Var = new ht4(h.g(), bm3Var);
        if (!(h instanceof zq1)) {
            ht4Var.b = new ht4(1L, bm3Var);
        }
        this.I = ht4Var;
        this.J = new xs4(this, (byte) 0);
        this.K = new xs4(this, (byte) 1);
        this.L = new xs4(this, (byte) 2);
    }

    public static boolean a(ht4 ht4Var, int i, om3 om3Var) {
        boolean z;
        synchronized (mw2.l) {
            int i2 = ht4Var.d;
            if (i2 == i) {
                ht4Var.c = om3Var;
                z = true;
                ht4Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void b(ht4 ht4Var) {
        bm3 bm3Var = bm3.K;
        synchronized (mw2.l) {
            ht4Var.c = bm3Var;
            ht4Var.d++;
        }
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.I;
    }

    @Override // java.util.Map
    public final void clear() {
        ns4 h;
        if (bm3.K != ((ht4) ws4.f(this.I)).c) {
            ht4 ht4Var = this.I;
            synchronized (ws4.c) {
                h = ws4.h();
                b((ht4) ws4.x(ht4Var, this, h));
            }
            ws4.m(h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().c.containsValue(obj);
    }

    @Override // defpackage.kw4
    public final /* synthetic */ mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        return null;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        this.I = (ht4) mw4Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.J;
    }

    public final ht4 f() {
        return (ht4) ws4.t(this.I, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((bm3) f().c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.K;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        om3 om3Var;
        int i;
        Object put;
        ns4 h;
        boolean a;
        do {
            synchronized (mw2.l) {
                ht4 ht4Var = (ht4) ws4.f(this.I);
                om3Var = ht4Var.c;
                i = ht4Var.d;
            }
            om3Var.getClass();
            dm3 dm3Var = (dm3) om3Var.builder();
            put = dm3Var.put(obj, obj2);
            om3 build = dm3Var.build();
            if (j42.c(build, om3Var)) {
                break;
            }
            ht4 ht4Var2 = this.I;
            synchronized (ws4.c) {
                h = ws4.h();
                a = a((ht4) ws4.x(ht4Var2, this, h), i, build);
            }
            ws4.m(h, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        om3 om3Var;
        int i;
        ns4 h;
        boolean a;
        do {
            synchronized (mw2.l) {
                ht4 ht4Var = (ht4) ws4.f(this.I);
                om3Var = ht4Var.c;
                i = ht4Var.d;
            }
            om3Var.getClass();
            dm3 dm3Var = (dm3) om3Var.builder();
            dm3Var.putAll(map);
            om3 build = dm3Var.build();
            if (j42.c(build, om3Var)) {
                return;
            }
            ht4 ht4Var2 = this.I;
            synchronized (ws4.c) {
                h = ws4.h();
                a = a((ht4) ws4.x(ht4Var2, this, h), i, build);
            }
            ws4.m(h, this);
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        om3 om3Var;
        int i;
        Object remove;
        ns4 h;
        boolean a;
        do {
            synchronized (mw2.l) {
                ht4 ht4Var = (ht4) ws4.f(this.I);
                om3Var = ht4Var.c;
                i = ht4Var.d;
            }
            om3Var.getClass();
            nm3 builder = om3Var.builder();
            remove = builder.remove(obj);
            om3 build = builder.build();
            if (j42.c(build, om3Var)) {
                break;
            }
            ht4 ht4Var2 = this.I;
            synchronized (ws4.c) {
                h = ws4.h();
                a = a((ht4) ws4.x(ht4Var2, this, h), i, build);
            }
            ws4.m(h, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        bm3 bm3Var = (bm3) f().c;
        bm3Var.getClass();
        return bm3Var.J;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((ht4) ws4.f(this.I)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.L;
    }
}

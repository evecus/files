package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xi2 extends li2 {
    public final boolean b;
    public pn c;
    public final at5 d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public ki2 i;
    public final fw4 j;

    public xi2(vi2 vi2Var, boolean z) {
        this.a = new ep((byte) 1);
        this.b = z;
        this.c = new pn((byte) 5);
        this.d = new at5(vi2Var);
        this.h = new ArrayList();
        ki2 ki2Var = ki2.J;
        this.i = ki2Var;
        this.j = o7.c(ki2Var);
    }

    @Override // defpackage.li2
    public final void a(ui2 ui2Var) {
        ti2 nh2Var;
        wi2 wi2Var;
        vi2 vi2Var;
        ui2Var.getClass();
        d("addObserver");
        ki2 ki2Var = this.i;
        ki2 ki2Var2 = ki2.I;
        if (ki2Var != ki2Var2) {
            ki2Var2 = ki2.J;
        }
        wi2 wi2Var2 = new wi2();
        wi2Var2.a = ki2Var2;
        HashMap hashMap = cj2.a;
        boolean z = ui2Var instanceof ti2;
        boolean z2 = ui2Var instanceof es0;
        if (z && z2) {
            nh2Var = new gs0((es0) ui2Var, (ti2) ui2Var);
        } else if (z2) {
            nh2Var = new gs0((es0) ui2Var, null);
        } else if (z) {
            nh2Var = (ti2) ui2Var;
        } else {
            Class<?> cls = ui2Var.getClass();
            if (cj2.b(cls) == 2) {
                Object obj = cj2.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    cj2.a((Constructor) list.get(0), ui2Var);
                    throw null;
                }
                int size = list.size();
                ro1[] ro1VarArr = new ro1[size];
                if (size > 0) {
                    cj2.a((Constructor) list.get(0), ui2Var);
                    throw null;
                }
                nh2Var = new ne0(ro1VarArr);
            } else {
                nh2Var = new nh2(ui2Var);
            }
        }
        wi2Var2.b = nh2Var;
        pn pnVar = this.c;
        pnVar.getClass();
        n43 n43Var = (n43) pnVar.b;
        id1 id1Var = (id1) n43Var.g(ui2Var);
        if (id1Var != null) {
            wi2Var = id1Var.J;
        } else {
            id1 id1Var2 = new id1(ui2Var, wi2Var2);
            n43Var.m(ui2Var, id1Var2);
            id1 id1Var3 = (id1) pnVar.d;
            if (id1Var3 == null) {
                pnVar.c = id1Var2;
                pnVar.d = id1Var2;
            } else {
                id1Var3.K = id1Var2;
                id1Var2.L = id1Var3;
                pnVar.d = id1Var2;
            }
            wi2Var = null;
        }
        if (wi2Var == null && (vi2Var = (vi2) this.d.a.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            ki2 c = c(ui2Var);
            this.e++;
            while (wi2Var2.a.compareTo(c) < 0) {
                pn pnVar2 = this.c;
                pnVar2.getClass();
                if (!((n43) pnVar2.b).c(ui2Var)) {
                    break;
                }
                ki2 ki2Var3 = wi2Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(ki2Var3);
                hi2 hi2Var = ji2.Companion;
                ki2 ki2Var4 = wi2Var2.a;
                hi2Var.getClass();
                ki2Var4.getClass();
                int ordinal = ki2Var4.ordinal();
                ji2 ji2Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : ji2.ON_RESUME : ji2.ON_START : ji2.ON_CREATE;
                if (ji2Var == null) {
                    zl1.n(wi2Var2.a, "no event up from ");
                    return;
                } else {
                    wi2Var2.a(vi2Var, ji2Var);
                    u70.M0(arrayList);
                    c = c(ui2Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.li2
    public final void b(ui2 ui2Var) {
        ui2Var.getClass();
        d("removeObserver");
        pn pnVar = this.c;
        pnVar.getClass();
        id1 id1Var = (id1) ((n43) pnVar.b).k(ui2Var);
        if (id1Var == null) {
            return;
        }
        id1 id1Var2 = id1Var.L;
        id1 id1Var3 = id1Var.K;
        if (id1Var2 == null) {
            pnVar.c = id1Var3;
        } else {
            id1Var2.K = id1Var3;
        }
        id1 id1Var4 = id1Var.K;
        if (id1Var4 == null) {
            pnVar.d = id1Var2;
        } else {
            id1Var4.L = id1Var2;
        }
        id1Var.M = true;
    }

    public final ki2 c(ui2 ui2Var) {
        pn pnVar = this.c;
        pnVar.getClass();
        ui2Var.getClass();
        id1 id1Var = (id1) ((n43) pnVar.b).g(ui2Var);
        id1 id1Var2 = id1Var != null ? id1Var.L : null;
        ki2 ki2Var = id1Var2 != null ? id1Var2.J.a : null;
        ArrayList arrayList = this.h;
        ki2 ki2Var2 = arrayList.isEmpty() ? null : (ki2) r7.w(arrayList, 1);
        ki2 ki2Var3 = this.i;
        if (ki2Var == null || ki2Var.compareTo(ki2Var3) >= 0) {
            ki2Var = ki2Var3;
        }
        return (ki2Var2 == null || ki2Var2.compareTo(ki2Var) >= 0) ? ki2Var : ki2Var2;
    }

    public final void d(String str) {
        if (this.b) {
            gp.u().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            zy.e(r7.C("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(ji2 ji2Var) {
        ji2Var.getClass();
        d("handleLifecycleEvent");
        f(ji2Var.a());
    }

    public final void f(ki2 ki2Var) {
        if (this.i == ki2Var) {
            return;
        }
        vi2 vi2Var = (vi2) this.d.a.get();
        ki2 ki2Var2 = this.i;
        ki2 ki2Var3 = ki2.J;
        ki2 ki2Var4 = ki2.I;
        if (ki2Var2 == ki2Var3 && ki2Var == ki2Var4) {
            throw new IllegalStateException(("State must be at least '" + ki2.K + "' to be moved to '" + ki2Var + "' in component " + vi2Var).toString());
        }
        if (ki2Var2 == ki2Var4 && ki2Var2 != ki2Var) {
            throw new IllegalStateException(("State is '" + ki2Var4 + "' and cannot be moved to `" + ki2Var + "` in component " + vi2Var).toString());
        }
        this.i = ki2Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.i == ki2Var4) {
            this.c = new pn((byte) 5);
        }
    }

    public final void g() {
        Object obj = this.d.a.get();
        if (obj == null) {
            zy.i("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        vi2 vi2Var = (vi2) obj;
        while (true) {
            pn pnVar = this.c;
            if (((n43) pnVar.b).e == 0) {
                break;
            }
            id1 id1Var = (id1) pnVar.c;
            if (id1Var == null) {
                s83.l("Collection is empty.");
                return;
            }
            ki2 ki2Var = id1Var.J.a;
            id1 id1Var2 = (id1) pnVar.d;
            if (id1Var2 == null) {
                s83.l("Collection is empty.");
                return;
            }
            ki2 ki2Var2 = id1Var2.J.a;
            if (ki2Var == ki2Var2 && this.i == ki2Var2) {
                break;
            }
            this.g = false;
            ki2 ki2Var3 = this.i;
            if (id1Var == null) {
                s83.l("Collection is empty.");
                return;
            }
            if (ki2Var3.compareTo(ki2Var) < 0) {
                pn pnVar2 = this.c;
                be beVar = new be(this, vi2Var, (byte) 21);
                pnVar2.getClass();
                for (id1 id1Var3 = (id1) pnVar2.d; id1Var3 != null; id1Var3 = id1Var3.L) {
                    if (!id1Var3.M) {
                        beVar.invoke(id1Var3);
                    }
                }
            }
            id1 id1Var4 = (id1) this.c.d;
            if (!this.g && id1Var4 != null && this.i.compareTo(id1Var4.J.a) > 0) {
                pn pnVar3 = this.c;
                m1 m1Var = new m1(this, vi2Var, (byte) 10);
                pnVar3.getClass();
                for (id1 id1Var5 = (id1) pnVar3.c; id1Var5 != null; id1Var5 = id1Var5.K) {
                    if (!id1Var5.M) {
                        m1Var.invoke(id1Var5);
                    }
                }
            }
        }
        this.g = false;
        this.j.h(this.i);
    }
}

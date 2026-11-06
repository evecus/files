package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j34 {
    public Set a;
    public ue0 b;
    public final b53 c;
    public o43 d;
    public b53 e;
    public final b53 f;
    public final b53 g;
    public o43 h;
    public n43 i;
    public ArrayList j;
    public ja4 k;

    public j34() {
        b53 b53Var = new b53(new lo1[16]);
        this.c = b53Var;
        o43 o43Var = ka4.a;
        this.d = new o43();
        this.e = b53Var;
        this.f = new b53(new Object[16]);
        this.g = new b53(new rm1[16]);
    }

    public static final boolean f(lo1 lo1Var, b53 b53Var) {
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            k34 k34Var = ((lo1) objArr[i2]).a;
            if (k34Var instanceof nl3) {
                b53 a = ((nl3) k34Var).a();
                if (a.k(lo1Var) || f(lo1Var, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        b53 b53Var = this.c;
        b53Var.h();
        this.d.e();
        this.e = b53Var;
        this.f.h();
        this.g.h();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                k34 k34Var = (k34) it.next();
                it.remove();
                k34Var.onAbandoned();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        b53 b53Var = this.f;
        byte b = 12;
        if (b53Var.K != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                o43 o43Var = this.h;
                int i = b53Var.K;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = b53Var.I[i];
                    try {
                        if (obj instanceof lo1) {
                            k34 k34Var = ((lo1) obj).a;
                            set.remove(k34Var);
                            k34Var.onForgotten();
                        }
                        if (obj instanceof ld0) {
                            if (o43Var == null || !o43Var.a(obj)) {
                                ((ld0) obj).d();
                            } else {
                                ((ld0) obj).b();
                            }
                        }
                    } catch (Throwable th) {
                        ue0 ue0Var = this.b;
                        if (ue0Var != null) {
                            c5.m0(th, new ka(ue0Var, obj, b));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        b53 b53Var2 = this.c;
        if (b53Var2.K != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = b53Var2.I;
                    int i2 = b53Var2.K;
                    for (int i3 = 0; i3 < i2; i3++) {
                        lo1 lo1Var = (lo1) objArr[i3];
                        k34 k34Var2 = lo1Var.a;
                        set2.remove(k34Var2);
                        try {
                            k34Var2.onRemembered();
                        } catch (Throwable th2) {
                            ue0 ue0Var2 = this.b;
                            if (ue0Var2 != null) {
                                c5.m0(th2, new ka(ue0Var2, lo1Var, b));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        b53 b53Var = this.g;
        if (b53Var.K != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = b53Var.I;
                int i = b53Var.K;
                for (int i2 = 0; i2 < i; i2++) {
                    ((rm1) objArr[i2]).invoke();
                }
                b53Var.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(lo1 lo1Var) {
        if (!this.d.a(lo1Var)) {
            ja4 ja4Var = this.k;
            if (ja4Var == null || !ja4Var.a(lo1Var)) {
                this.f.c(lo1Var);
                return;
            }
            return;
        }
        this.d.l(lo1Var);
        if (!this.e.k(lo1Var)) {
            b53 b53Var = this.c;
            if (!b53Var.k(lo1Var)) {
                f(lo1Var, b53Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(lo1Var.a);
    }

    public final void g(Set set, ue0 ue0Var) {
        a();
        this.a = set;
        this.b = ue0Var;
    }
}

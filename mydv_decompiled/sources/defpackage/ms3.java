package defpackage;

import android.os.Trace;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ms3 implements af2 {
    public final int a;
    public final pn b;
    public final tm1 c;
    public dh0 d;
    public uy4 e;
    public ty4 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public ls3 l;
    public boolean m;
    public long n;
    public long o;
    public long p = t13.b();
    public boolean q;
    public final /* synthetic */ u92 r;

    public ms3(u92 u92Var, int i, pn pnVar, tm1 tm1Var) {
        this.r = u92Var;
        this.a = i;
        this.b = pnVar;
        this.c = tm1Var;
    }

    @Override // defpackage.af2
    public final void a() {
        this.m = true;
    }

    public final void b() {
        ty4 ty4Var = this.f;
        if (ty4Var != null) {
            ty4Var.cancel();
        }
        this.f = null;
        uy4 uy4Var = this.e;
        if (uy4Var != null) {
            uy4Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(re reVar) {
        boolean d;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(reVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(reVar);
        }
        z9.k("compose:lazy:prefetch:execute:item", -1L);
        return d;
    }

    @Override // defpackage.af2
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    public final boolean d(re reVar) {
        long j;
        int i = this.a;
        long j2 = i;
        z9.k("compose:lazy:prefetch:execute:item", j2);
        me2 me2Var = (me2) ((le2) this.r.b).b.invoke();
        if (!this.h) {
            int a = me2Var.a();
            if (i >= 0 && i < a) {
                Object c = me2Var.c(i);
                Object obj = this.j;
                if (obj != null && !c.equals(obj)) {
                    b();
                    return false;
                }
                Object d = me2Var.d(i);
                pn pnVar = this.b;
                fs fsVar = (fs) pnVar.d;
                if (pnVar.c != d || fsVar == null) {
                    n43 n43Var = (n43) pnVar.b;
                    Object g = n43Var.g(d);
                    Object obj2 = g;
                    if (g == null) {
                        fs fsVar2 = new fs();
                        fsVar2.e = -1;
                        n43Var.m(d, fsVar2);
                        obj2 = fsVar2;
                    }
                    fsVar = (fs) obj2;
                    pnVar.c = d;
                    pnVar.d = fsVar;
                }
                e();
                long a2 = reVar.a();
                this.n = a2;
                this.p = t13.b();
                this.o = 0L;
                z9.k("compose:lazy:prefetch:available_time_nanos", a2);
                if (e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.n, fsVar.a + fsVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(c, d, fsVar);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, fsVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        ty4 ty4Var = this.f;
                        if (ty4Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = ty4Var.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        fsVar.c = fs.a(this.o, fsVar.c);
                    } finally {
                    }
                }
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        uy4 uy4Var = this.e;
                        if (uy4Var == null) {
                            throw hf1.q("Should precompose before resolving nested prefetch states");
                        }
                        r24 r24Var = new r24();
                        uy4Var.a(new o73(r24Var, (byte) 1));
                        List list = (List) r24Var.I;
                        this.l = list != null ? new ls3(this, list) : null;
                        this.k = true;
                    } finally {
                    }
                }
                ls3 ls3Var = this.l;
                if (ls3Var != null ? ls3Var.c(reVar, fsVar.e, this.m) : false) {
                    return true;
                }
                ls3 ls3Var2 = this.l;
                if (ls3Var2 != null && ls3Var2.d()) {
                    h();
                    z9.k("compose:lazy:prefetch:execute:item", j2);
                    ls3 ls3Var3 = this.l;
                    if (ls3Var3 != null) {
                        ls3Var3.e();
                    }
                }
                dh0 dh0Var = this.d;
                if (!this.g && dh0Var != null) {
                    if (!g(this.n, fsVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = dh0Var.a;
                        if (this.h) {
                            t02.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            t02.a("Request was already measured!");
                        }
                        this.g = true;
                        uy4 uy4Var2 = this.e;
                        if (uy4Var2 == null) {
                            throw hf1.q("performComposition() must be called before performMeasure()");
                        }
                        int c2 = uy4Var2.c();
                        for (int i2 = 0; i2 < c2; i2++) {
                            uy4Var2.d(i2, j3);
                        }
                        Trace.endSection();
                        h();
                        fsVar.d = fs.a(this.o, fsVar.d);
                        tm1 tm1Var = this.c;
                        if (tm1Var != null) {
                            tm1Var.invoke(this);
                        }
                    } finally {
                    }
                }
                ls3 ls3Var4 = this.l;
                if (this.g && this.k && ls3Var4 != null) {
                    int a3 = ls3Var4.a();
                    int i3 = fsVar.e;
                    fsVar.e = i3 == -1 ? a3 : ((i3 * 3) + a3) / 4;
                    if (ls3Var4.b() < a3) {
                        fsVar.d = j;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        ty4 ty4Var;
        return this.i || ((ty4Var = this.f) != null && ty4Var.i());
    }

    public final void f(Object obj, Object obj2, fs fsVar) {
        ty4 daVar;
        ty4 ty4Var = this.f;
        if (ty4Var == null) {
            u92 u92Var = this.r;
            hn1 a = ((le2) u92Var.b).a(this.a, obj, obj2);
            kb2 a2 = ((vy4) u92Var.c).a();
            if (a2.I.K()) {
                a2.l(obj, a, true);
                daVar = new da((Object) a2, obj, (byte) 2);
            } else {
                daVar = new g12((Object) a2, obj, (byte) 18);
            }
            ty4Var = daVar;
            this.f = ty4Var;
            this.j = obj;
        }
        this.q = false;
        while (!ty4Var.i() && !this.q) {
            ty4Var.e(new eq0(this, fsVar, (byte) 9));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            fsVar.b = fs.a(j, fsVar.b);
        } else {
            fsVar.a = fs.a(j, fsVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long b = t13.b();
        long b2 = o75.b(b, this.p);
        long j = b2 >> 1;
        jp jpVar = t41.J;
        if ((((int) b2) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
        }
        this.o = j;
        long j2 = this.n - j;
        this.n = j2;
        this.p = b;
        z9.k("compose:lazy:prefetch:available_time_nanos", j2);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}

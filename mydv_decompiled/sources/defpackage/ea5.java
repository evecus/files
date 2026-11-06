package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ea5 {
    public final ss4 a;
    public final ea5 b;
    public final String c;
    public final jk3 d;
    public final jk3 f;
    public final jk3 i;
    public final gt4 j;
    public final gt4 k;
    public final jk3 l;
    public final wu0 m;
    public final jk3 e = ad4.w(null);
    public final hk3 g = new hk3(0);
    public final hk3 h = new hk3(Long.MIN_VALUE);

    public ea5(ss4 ss4Var, ea5 ea5Var, String str) {
        this.a = ss4Var;
        this.b = ea5Var;
        this.c = str;
        this.d = ad4.w(ss4Var.d());
        this.f = ad4.w(new aa5(ss4Var.d(), ss4Var.d()));
        Boolean bool = Boolean.FALSE;
        this.i = ad4.w(bool);
        this.j = new gt4();
        this.k = new gt4();
        this.l = ad4.w(bool);
        this.m = dt4.b(new w95(this, (byte) 1));
        ss4Var.h(this);
    }

    public final void a(Object obj, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(obj) : go1Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(this) ? 32 : 16;
        }
        byte b = 0;
        if (!go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            go1Var.W();
        } else if (i()) {
            go1Var.d0(467722849);
            go1Var.q(false);
        } else {
            go1Var.d0(466062241);
            s(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z || Q == jpVar) {
                Q = dt4.b(new w95(this, b));
                go1Var.o0(Q);
            }
            if (((Boolean) ((cw4) Q).getValue()).booleanValue()) {
                go1Var.d0(466470356);
                Object Q2 = go1Var.Q();
                if (Q2 == jpVar) {
                    Q2 = mw2.w(go1Var);
                    go1Var.o0(Q2);
                }
                dl0 dl0Var = (dl0) Q2;
                boolean i4 = go1Var.i(dl0Var) | (i3 == 32);
                Object Q3 = go1Var.Q();
                if (i4 || Q3 == jpVar) {
                    Q3 = new m1(dl0Var, this, (byte) 19);
                    go1Var.o0(Q3);
                }
                mw2.f(dl0Var, this, (tm1) Q3, go1Var);
                go1Var.q(false);
            } else {
                go1Var.d0(467712929);
                go1Var.q(false);
            }
            go1Var.q(false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qc0((byte) 5, i, (Object) this, obj);
        }
    }

    public final long b() {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ba5) gt4Var.get(i)).T.h());
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((ea5) gt4Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) gt4Var.get(i);
            ba5Var.N = null;
            ba5Var.M = null;
            ba5Var.Q = false;
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ea5) gt4Var2.get(i2)).c();
        }
    }

    public final Object d() {
        return this.a.d();
    }

    public final boolean e() {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            if (((ba5) gt4Var.get(i)).M != null) {
                return true;
            }
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ea5) gt4Var2.get(i2)).e()) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        ea5 ea5Var = this.b;
        return ea5Var != null ? ea5Var.f() : this.g.h();
    }

    public final z95 g() {
        return (z95) this.f.getValue();
    }

    public final Object h() {
        return this.d.getValue();
    }

    public final boolean i() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void j(long j, boolean z) {
        hk3 hk3Var = this.h;
        long h = hk3Var.h();
        ss4 ss4Var = this.a;
        if (h == Long.MIN_VALUE) {
            hk3Var.i(j);
            ((jk3) ss4Var.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((jk3) ss4Var.a).getValue()).booleanValue()) {
            ((jk3) ss4Var.a).setValue(Boolean.TRUE);
        }
        q(false);
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) gt4Var.get(i);
            jk3 jk3Var = ba5Var.O;
            jk3 jk3Var2 = ba5Var.O;
            if (!((Boolean) jk3Var.getValue()).booleanValue()) {
                long b = z ? ba5Var.c().b() : j;
                ba5Var.f(ba5Var.c().f(b));
                ba5Var.S = ba5Var.c().d(b);
                a25 c = ba5Var.c();
                c.getClass();
                if (r7.a(c, b)) {
                    jk3Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) jk3Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ea5 ea5Var = (ea5) gt4Var2.get(i2);
            jk3 jk3Var3 = ea5Var.d;
            ss4 ss4Var2 = ea5Var.a;
            if (!j42.c(jk3Var3.getValue(), ss4Var2.d())) {
                ea5Var.j(j, z);
            }
            if (!j42.c(ea5Var.d.getValue(), ss4Var2.d())) {
                z2 = false;
            }
        }
        if (z2) {
            k();
        }
    }

    public final void k() {
        this.h.i(Long.MIN_VALUE);
        ss4 ss4Var = this.a;
        if (ss4Var instanceof z43) {
            ss4Var.g(this.d.getValue());
        }
        p(0L);
        ((jk3) ss4Var.a).setValue(Boolean.FALSE);
        gt4 gt4Var = this.k;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ((ea5) gt4Var.get(i)).k();
        }
    }

    public final void l(float f) {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) gt4Var.get(i);
            ba5Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                a25 a25Var = ba5Var.N;
                if (a25Var != null) {
                    ba5Var.c().h(a25Var.c);
                    ba5Var.M = null;
                    ba5Var.N = null;
                }
                Object obj = f == -4.0f ? ba5Var.c().d : ba5Var.c().c;
                ba5Var.c().h(obj);
                ba5Var.c().i(obj);
                ba5Var.f(obj);
                ba5Var.T.i(ba5Var.c().b());
            } else {
                ba5Var.P.i(f);
            }
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ea5) gt4Var2.get(i2)).l(f);
        }
    }

    public final void m(Object obj, Object obj2) {
        this.h.i(Long.MIN_VALUE);
        ss4 ss4Var = this.a;
        ((jk3) ss4Var.a).setValue(Boolean.FALSE);
        boolean i = i();
        jk3 jk3Var = this.d;
        if (!i || !j42.c(ss4Var.d(), obj) || !j42.c(jk3Var.getValue(), obj2)) {
            if (!j42.c(ss4Var.d(), obj) && (ss4Var instanceof z43)) {
                ss4Var.g(obj);
            }
            jk3Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new aa5(obj, obj2));
        }
        gt4 gt4Var = this.k;
        int size = gt4Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            ea5 ea5Var = (ea5) gt4Var.get(i2);
            ea5Var.getClass();
            if (ea5Var.i()) {
                ea5Var.m(ea5Var.a.d(), ea5Var.d.getValue());
            }
        }
        gt4 gt4Var2 = this.j;
        int size2 = gt4Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ba5) gt4Var2.get(i3)).e(0L);
        }
    }

    public final void n(long j) {
        hk3 hk3Var = this.h;
        if (hk3Var.h() == Long.MIN_VALUE) {
            hk3Var.i(j);
        }
        p(j);
        q(false);
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ((ba5) gt4Var.get(i)).e(j);
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ea5 ea5Var = (ea5) gt4Var2.get(i2);
            if (!j42.c(ea5Var.d.getValue(), ea5Var.a.d())) {
                ea5Var.n(j);
            }
        }
    }

    public final void o(ch4 ch4Var) {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) gt4Var.get(i);
            jk3 jk3Var = ba5Var.R;
            if (!j42.c(ba5Var.c().c, ba5Var.c().d)) {
                ba5Var.N = ba5Var.c();
                ba5Var.M = ch4Var;
            }
            ba5Var.L.setValue(new a25(ba5Var.V, ba5Var.I, jk3Var.getValue(), jk3Var.getValue(), ba5Var.S.c()));
            ba5Var.T.i(ba5Var.c().b());
            ba5Var.Q = true;
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ea5) gt4Var2.get(i2)).o(ch4Var);
        }
    }

    public final void p(long j) {
        if (this.b == null) {
            this.g.i(j);
        }
    }

    public final void q(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void r() {
        a25 a25Var;
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) gt4Var.get(i);
            ch4 ch4Var = ba5Var.M;
            if (ch4Var != null && (a25Var = ba5Var.N) != null) {
                long Q = mw2.Q(ch4Var.c() * ch4Var.g());
                Object f = a25Var.f(Q);
                if (ba5Var.Q) {
                    ba5Var.c().i(f);
                }
                ba5Var.c().h(f);
                ba5Var.T.i(ba5Var.c().b());
                if (ba5Var.P.h() == -2.0f || ba5Var.Q) {
                    ba5Var.f(f);
                } else {
                    ba5Var.e(ba5Var.W.f());
                }
                if (Q >= ch4Var.c()) {
                    ba5Var.M = null;
                    ba5Var.N = null;
                } else {
                    ch4Var.j(false);
                }
            }
        }
        gt4 gt4Var2 = this.k;
        int size2 = gt4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ea5) gt4Var2.get(i2)).r();
        }
    }

    public final void s(Object obj) {
        jk3 jk3Var = this.d;
        if (j42.c(jk3Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new aa5(jk3Var.getValue(), obj));
        ss4 ss4Var = this.a;
        if (!j42.c(ss4Var.d(), jk3Var.getValue())) {
            ss4Var.g(jk3Var.getValue());
        }
        jk3Var.setValue(obj);
        if (this.h.h() == Long.MIN_VALUE) {
            q(true);
        }
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        for (int i = 0; i < size; i++) {
            ((ba5) gt4Var.get(i)).P.i(-2.0f);
        }
    }

    public final String toString() {
        gt4 gt4Var = this.j;
        int size = gt4Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ba5) gt4Var.get(i)) + ", ";
        }
        return str;
    }
}

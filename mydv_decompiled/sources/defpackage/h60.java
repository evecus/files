package defpackage;

import androidx.media3.common.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h60 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public h60(d70 d70Var) {
        this.a = (byte) 1;
        this.d = 0;
        Charset charset = p32.a;
        this.e = d70Var;
        d70Var.k = this;
    }

    public static void q0(int i) {
        if ((i & 3) != 0) {
            throw x42.e();
        }
    }

    public static void r0(int i) {
        if ((i & 7) != 0) {
            throw x42.e();
        }
    }

    public void A(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(d70Var.l()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int E = d70Var.E();
        if ((E & 7) != 0) {
            throw z42.e();
        }
        int d = d70Var.d() + E;
        do {
            list.add(Long.valueOf(d70Var.l()));
        } while (d70Var.d() < d);
    }

    public float B() {
        o0(5);
        return ((d70) this.e).m();
    }

    public void C(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof pf1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int E = d70Var.E();
                q0(E);
                int d = d70Var.d() + E;
                do {
                    n32Var.add(Float.valueOf(d70Var.m()));
                } while (d70Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw x42.c();
            }
            do {
                n32Var.add(Float.valueOf(d70Var.m()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        pf1 pf1Var = (pf1) n32Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int E2 = d70Var.E();
            q0(E2);
            int d2 = d70Var.d() + E2;
            do {
                pf1Var.d(d70Var.m());
            } while (d70Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw x42.c();
        }
        do {
            pf1Var.d(d70Var.m());
            if (d70Var.e()) {
                return;
            } else {
                D2 = d70Var.D();
            }
        } while (D2 == this.b);
        this.d = D2;
    }

    public void D(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int E = d70Var.E();
            if ((E & 3) != 0) {
                throw z42.e();
            }
            int d = d70Var.d() + E;
            do {
                list.add(Float.valueOf(d70Var.m()));
            } while (d70Var.d() < d);
            return;
        }
        if (i != 5) {
            throw z42.b();
        }
        do {
            list.add(Float.valueOf(d70Var.m()));
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public Object E(ra4 ra4Var, mc1 mc1Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object c = ra4Var.c();
            ra4Var.g(c, this, mc1Var);
            ra4Var.a(c);
            if (this.b == this.c) {
                return c;
            }
            throw z42.e();
        } finally {
            this.c = i;
        }
    }

    public Object F(ra4 ra4Var, mc1 mc1Var) {
        o0(3);
        return E(ra4Var, mc1Var);
    }

    public void G(List list, ra4 ra4Var, mc1 mc1Var) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b;
        if ((i & 7) != 3) {
            throw z42.b();
        }
        do {
            list.add(E(ra4Var, mc1Var));
            if (d70Var.e() || this.d != 0) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == i);
        this.d = D;
    }

    public int H() {
        o0(0);
        return ((d70) this.e).n();
    }

    public void I(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Integer.valueOf(d70Var.n()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Integer.valueOf(d70Var.n()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                h22Var.d(d70Var.n());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            h22Var.d(d70Var.n());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public void J(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(d70Var.n()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Integer.valueOf(d70Var.n()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public long K() {
        o0(0);
        return ((d70) this.e).o();
    }

    public void L(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof lr2;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Long.valueOf(d70Var.o()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Long.valueOf(d70Var.o()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        lr2 lr2Var = (lr2) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                lr2Var.d(d70Var.o());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            lr2Var.d(d70Var.o());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public void M(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(d70Var.o()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Long.valueOf(d70Var.o()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public Object N(ra4 ra4Var, mc1 mc1Var) {
        d70 d70Var = (d70) this.e;
        int E = d70Var.E();
        if (d70Var.b >= 100) {
            throw new z42("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int g = d70Var.g(E);
        Object c = ra4Var.c();
        d70Var.b++;
        ra4Var.g(c, this, mc1Var);
        ra4Var.a(c);
        d70Var.a(0);
        d70Var.b--;
        d70Var.f(g);
        return c;
    }

    public Object O(ra4 ra4Var, mc1 mc1Var) {
        o0(2);
        return N(ra4Var, mc1Var);
    }

    public int P() {
        o0(5);
        return ((d70) this.e).x();
    }

    public void Q(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int E = d70Var.E();
                q0(E);
                int d = d70Var.d() + E;
                do {
                    n32Var.add(Integer.valueOf(d70Var.x()));
                } while (d70Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw x42.c();
            }
            do {
                n32Var.add(Integer.valueOf(d70Var.x()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int E2 = d70Var.E();
            q0(E2);
            int d2 = d70Var.d() + E2;
            do {
                h22Var.d(d70Var.x());
            } while (d70Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw x42.c();
        }
        do {
            h22Var.d(d70Var.x());
            if (d70Var.e()) {
                return;
            } else {
                D2 = d70Var.D();
            }
        } while (D2 == this.b);
        this.d = D2;
    }

    public void R(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int E = d70Var.E();
            if ((E & 3) != 0) {
                throw z42.e();
            }
            int d = d70Var.d() + E;
            do {
                list.add(Integer.valueOf(d70Var.x()));
            } while (d70Var.d() < d);
            return;
        }
        if (i != 5) {
            throw z42.b();
        }
        do {
            list.add(Integer.valueOf(d70Var.x()));
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public long S() {
        o0(1);
        return ((d70) this.e).y();
    }

    public void T(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof lr2;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n32Var.add(Long.valueOf(d70Var.y()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int E = d70Var.E();
            r0(E);
            int d = d70Var.d() + E;
            do {
                n32Var.add(Long.valueOf(d70Var.y()));
            } while (d70Var.d() < d);
            return;
        }
        lr2 lr2Var = (lr2) n32Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                lr2Var.d(d70Var.y());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int E2 = d70Var.E();
        r0(E2);
        int d2 = d70Var.d() + E2;
        do {
            lr2Var.d(d70Var.y());
        } while (d70Var.d() < d2);
    }

    public void U(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(d70Var.y()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int E = d70Var.E();
        if ((E & 7) != 0) {
            throw z42.e();
        }
        int d = d70Var.d() + E;
        do {
            list.add(Long.valueOf(d70Var.y()));
        } while (d70Var.d() < d);
    }

    public int V() {
        o0(0);
        return ((d70) this.e).z();
    }

    public void W(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Integer.valueOf(d70Var.z()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Integer.valueOf(d70Var.z()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                h22Var.d(d70Var.z());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            h22Var.d(d70Var.z());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public void X(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(d70Var.z()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Integer.valueOf(d70Var.z()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public long Y() {
        o0(0);
        return ((d70) this.e).A();
    }

    public void Z(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof lr2;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Long.valueOf(d70Var.A()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Long.valueOf(d70Var.A()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        lr2 lr2Var = (lr2) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                lr2Var.d(d70Var.A());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            lr2Var.d(d70Var.A());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public void a(Object obj) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = obj;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            dq.Q0(0, i3, length, objArr, objArr2);
            dq.Q0(i4, 0, this.b, (Object[]) this.e, objArr2);
            this.e = objArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public void a0(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(d70Var.A()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Long.valueOf(d70Var.A()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public sh4 b(int i) {
        return new sh4(fb4.t((u55) this.e, i), i, 1L);
    }

    public String b0() {
        o0(2);
        return ((d70) this.e).B();
    }

    public int c() {
        return this.d - this.c;
    }

    public void c0(n32 n32Var, boolean z) {
        String B;
        int D;
        d70 d70Var = (d70) this.e;
        if ((this.b & 7) != 2) {
            throw x42.c();
        }
        do {
            if (z) {
                n0(2);
                B = d70Var.C();
            } else {
                n0(2);
                B = d70Var.B();
            }
            n32Var.add(B);
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public int d() {
        switch (this.a) {
            case 1:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    i = ((d70) this.e).D();
                    this.b = i;
                }
                return (i == 0 || i == this.c) ? Log.LOG_LEVEL_OFF : i >>> 3;
            default:
                int i2 = this.d;
                if (i2 != 0) {
                    this.b = i2;
                    this.d = 0;
                } else {
                    i2 = ((d70) this.e).D();
                    this.b = i2;
                }
                return (i2 == 0 || i2 == this.c) ? Log.LOG_LEVEL_OFF : i2 >>> 3;
        }
    }

    public void d0(List list, boolean z) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        if ((this.b & 7) != 2) {
            throw z42.b();
        }
        if (!(list instanceof ch2) || z) {
            do {
                list.add(z ? e0() : b0());
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        ch2 ch2Var = (ch2) list;
        do {
            ch2Var.b(k());
            if (d70Var.e()) {
                return;
            } else {
                D2 = d70Var.D();
            }
        } while (D2 == this.b);
        this.d = D2;
    }

    public int e() {
        return this.b;
    }

    public String e0() {
        o0(2);
        return ((d70) this.e).C();
    }

    public void f(Object obj, qa4 qa4Var, lc1 lc1Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            qa4Var.j(obj, this, lc1Var);
            if (this.b == this.c) {
            } else {
                throw x42.e();
            }
        } finally {
            this.c = i;
        }
    }

    public int f0() {
        o0(0);
        return ((d70) this.e).E();
    }

    public void g(Object obj, qa4 qa4Var, lc1 lc1Var) {
        d70 d70Var = (d70) this.e;
        int E = d70Var.E();
        if (d70Var.b >= 100) {
            throw new x42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int g = d70Var.g(E);
        d70Var.b++;
        qa4Var.j(obj, this, lc1Var);
        d70Var.a(0);
        d70Var.b--;
        d70Var.f(g);
    }

    public void g0(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Integer.valueOf(d70Var.E()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Integer.valueOf(d70Var.E()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                h22Var.d(d70Var.E());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            h22Var.d(d70Var.E());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public boolean h() {
        o0(0);
        return ((d70) this.e).h();
    }

    public void h0(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(d70Var.E()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Integer.valueOf(d70Var.E()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public void i(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof rw;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Boolean.valueOf(d70Var.h()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Boolean.valueOf(d70Var.h()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        rw rwVar = (rw) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                rwVar.d(d70Var.h());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            rwVar.d(d70Var.h());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public long i0() {
        o0(0);
        return ((d70) this.e).F();
    }

    public void j(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(d70Var.h()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Boolean.valueOf(d70Var.h()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public void j0(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof lr2;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Long.valueOf(d70Var.F()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Long.valueOf(d70Var.F()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        lr2 lr2Var = (lr2) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                lr2Var.d(d70Var.F());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            lr2Var.d(d70Var.F());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public f00 k() {
        o0(2);
        d70 d70Var = (d70) this.e;
        byte[] bArr = d70Var.d;
        int u = d70Var.u();
        int i = d70Var.e;
        int i2 = d70Var.g;
        if (u <= i - i2 && u > 0) {
            f00 c = f00.c(bArr, i2, u);
            d70Var.g += u;
            return c;
        }
        if (u == 0) {
            return f00.K;
        }
        byte[] q = d70Var.q(u);
        if (q != null) {
            return f00.c(q, 0, q.length);
        }
        int i3 = d70Var.g;
        int i4 = d70Var.e;
        int i5 = i4 - i3;
        d70Var.i += i4;
        d70Var.g = 0;
        d70Var.e = 0;
        ArrayList r = d70Var.r(u - i5);
        byte[] bArr2 = new byte[u];
        System.arraycopy(bArr, i3, bArr2, 0, i5);
        int size = r.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = r.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i5, bArr3.length);
            i5 += bArr3.length;
        }
        f00 f00Var = f00.K;
        return new f00(bArr2);
    }

    public void k0(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(d70Var.F()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Long.valueOf(d70Var.F()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public g00 l() {
        n0(2);
        d70 d70Var = (d70) this.e;
        byte[] bArr = d70Var.d;
        int u = d70Var.u();
        int i = d70Var.e;
        int i2 = d70Var.g;
        if (u <= i - i2 && u > 0) {
            e00 e = g00.e(bArr, i2, u);
            d70Var.g += u;
            return e;
        }
        if (u == 0) {
            return g00.J;
        }
        if (u < 0) {
            throw x42.d();
        }
        byte[] q = d70Var.q(u);
        if (q != null) {
            return g00.e(q, 0, q.length);
        }
        int i3 = d70Var.g;
        int i4 = d70Var.e;
        int i5 = i4 - i3;
        d70Var.i += i4;
        d70Var.g = 0;
        d70Var.e = 0;
        ArrayList r = d70Var.r(u - i5);
        byte[] bArr2 = new byte[u];
        System.arraycopy(bArr, i3, bArr2, 0, i5);
        int size = r.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = r.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i5, bArr3.length);
            i5 += bArr3.length;
        }
        e00 e00Var = g00.J;
        return new e00(bArr2);
    }

    public void l0(int i) {
        if (((d70) this.e).d() != i) {
            throw x42.f();
        }
    }

    public void m(n32 n32Var) {
        int D;
        d70 d70Var = (d70) this.e;
        if ((this.b & 7) != 2) {
            throw x42.c();
        }
        do {
            n32Var.add(l());
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public void m0(int i) {
        if (((d70) this.e).d() != i) {
            throw z42.f();
        }
    }

    public void n(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        if ((this.b & 7) != 2) {
            throw z42.b();
        }
        do {
            list.add(k());
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public void n0(int i) {
        if ((this.b & 7) != i) {
            throw x42.c();
        }
    }

    public double o() {
        o0(1);
        return ((d70) this.e).i();
    }

    public void o0(int i) {
        if ((this.b & 7) != i) {
            throw z42.b();
        }
    }

    public void p(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof ry0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n32Var.add(Double.valueOf(d70Var.i()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int E = d70Var.E();
            r0(E);
            int d = d70Var.d() + E;
            do {
                n32Var.add(Double.valueOf(d70Var.i()));
            } while (d70Var.d() < d);
            return;
        }
        ry0 ry0Var = (ry0) n32Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ry0Var.d(d70Var.i());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int E2 = d70Var.E();
        r0(E2);
        int d2 = d70Var.d() + E2;
        do {
            ry0Var.d(d70Var.i());
        } while (d70Var.d() < d2);
    }

    public boolean p0() {
        int i;
        d70 d70Var = (d70) this.e;
        if (d70Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return d70Var.I(i);
    }

    public void q(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(d70Var.i()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int E = d70Var.E();
        if ((E & 7) != 0) {
            throw z42.e();
        }
        int d = d70Var.d() + E;
        do {
            list.add(Double.valueOf(d70Var.i()));
        } while (d70Var.d() < d);
    }

    public int r() {
        o0(0);
        return ((d70) this.e).j();
    }

    public void s(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n32Var.add(Integer.valueOf(d70Var.j()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int d = d70Var.d() + d70Var.E();
            do {
                n32Var.add(Integer.valueOf(d70Var.j()));
            } while (d70Var.d() < d);
            l0(d);
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                h22Var.d(d70Var.j());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int d2 = d70Var.d() + d70Var.E();
        do {
            h22Var.d(d70Var.j());
        } while (d70Var.d() < d2);
        l0(d2);
    }

    public void t(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(d70Var.j()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        if (i != 2) {
            throw z42.b();
        }
        int d = d70Var.d() + d70Var.E();
        do {
            list.add(Integer.valueOf(d70Var.j()));
        } while (d70Var.d() < d);
        m0(d);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "";
            case 4:
                int i = this.b;
                u55 u55Var = (u55) this.e;
                s44 t = fb4.t(u55Var, i);
                int i2 = this.c;
                s44 t2 = fb4.t(u55Var, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(t);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(t2);
                sb.append("), prevOffset=");
                return nt3.n(sb, i3, ")");
            default:
                return super.toString();
        }
    }

    public Object u(cx5 cx5Var, Class cls, mc1 mc1Var) {
        switch (cx5Var.ordinal()) {
            case 0:
                return Double.valueOf(o());
            case 1:
                return Float.valueOf(B());
            case 2:
                return Long.valueOf(K());
            case 3:
                return Long.valueOf(i0());
            case 4:
                return Integer.valueOf(H());
            case 5:
                return Long.valueOf(y());
            case 6:
                return Integer.valueOf(v());
            case 7:
                return Boolean.valueOf(h());
            case 8:
                return e0();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                o0(2);
                return N(tx3.c.a(cls), mc1Var);
            case 11:
                return k();
            case 12:
                return Integer.valueOf(f0());
            case 13:
                return Integer.valueOf(r());
            case 14:
                return Integer.valueOf(P());
            case 15:
                return Long.valueOf(S());
            case 16:
                return Integer.valueOf(V());
            case 17:
                return Long.valueOf(Y());
        }
    }

    public int v() {
        o0(5);
        return ((d70) this.e).k();
    }

    public void w(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof h22;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int E = d70Var.E();
                q0(E);
                int d = d70Var.d() + E;
                do {
                    n32Var.add(Integer.valueOf(d70Var.k()));
                } while (d70Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw x42.c();
            }
            do {
                n32Var.add(Integer.valueOf(d70Var.k()));
                if (d70Var.e()) {
                    return;
                } else {
                    D = d70Var.D();
                }
            } while (D == this.b);
            this.d = D;
            return;
        }
        h22 h22Var = (h22) n32Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int E2 = d70Var.E();
            q0(E2);
            int d2 = d70Var.d() + E2;
            do {
                h22Var.d(d70Var.k());
            } while (d70Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw x42.c();
        }
        do {
            h22Var.d(d70Var.k());
            if (d70Var.e()) {
                return;
            } else {
                D2 = d70Var.D();
            }
        } while (D2 == this.b);
        this.d = D2;
    }

    public void x(List list) {
        int D;
        d70 d70Var = (d70) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int E = d70Var.E();
            if ((E & 3) != 0) {
                throw z42.e();
            }
            int d = d70Var.d() + E;
            do {
                list.add(Integer.valueOf(d70Var.k()));
            } while (d70Var.d() < d);
            return;
        }
        if (i != 5) {
            throw z42.b();
        }
        do {
            list.add(Integer.valueOf(d70Var.k()));
            if (d70Var.e()) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == this.b);
        this.d = D;
    }

    public long y() {
        o0(1);
        return ((d70) this.e).l();
    }

    public void z(n32 n32Var) {
        int D;
        int D2;
        d70 d70Var = (d70) this.e;
        boolean z = n32Var instanceof lr2;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n32Var.add(Long.valueOf(d70Var.l()));
                    if (d70Var.e()) {
                        return;
                    } else {
                        D = d70Var.D();
                    }
                } while (D == this.b);
                this.d = D;
                return;
            }
            if (i2 != 2) {
                throw x42.c();
            }
            int E = d70Var.E();
            r0(E);
            int d = d70Var.d() + E;
            do {
                n32Var.add(Long.valueOf(d70Var.l()));
            } while (d70Var.d() < d);
            return;
        }
        lr2 lr2Var = (lr2) n32Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                lr2Var.d(d70Var.l());
                if (d70Var.e()) {
                    return;
                } else {
                    D2 = d70Var.D();
                }
            } while (D2 == this.b);
            this.d = D2;
            return;
        }
        if (i3 != 2) {
            throw x42.c();
        }
        int E2 = d70Var.E();
        r0(E2);
        int d2 = d70Var.d() + E2;
        do {
            lr2Var.d(d70Var.l());
        } while (d70Var.d() < d2);
    }

    public /* synthetic */ h60(byte b) {
        this.a = b;
    }

    public h60(d70 d70Var, byte b) {
        this.a = (byte) 2;
        this.d = 0;
        Charset charset = r32.a;
        this.e = d70Var;
        d70Var.k = this;
    }

    public h60(int i, int i2, int i3, u55 u55Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = u55Var;
    }
}

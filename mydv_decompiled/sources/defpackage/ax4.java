package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ax4 implements Encoder, me0 {
    public final ee0 a;
    public final i62 b;
    public final pz5 c;
    public final ax4[] d;
    public final o63 e;
    public final n62 f;
    public boolean g;
    public String h;
    public String i;

    public ax4(ee0 ee0Var, i62 i62Var, pz5 pz5Var, ax4[] ax4VarArr) {
        ee0Var.getClass();
        this.a = ee0Var;
        this.b = i62Var;
        this.c = pz5Var;
        this.d = ax4VarArr;
        this.e = i62Var.b;
        this.f = i62Var.a;
        int ordinal = pz5Var.ordinal();
        if (ax4VarArr != null) {
            ax4 ax4Var = ax4VarArr[ordinal];
            if (ax4Var == null && ax4Var == this) {
                return;
            }
            ax4VarArr[ordinal] = this;
        }
    }

    public final void A(SerialDescriptor serialDescriptor, int i, int i2) {
        serialDescriptor.getClass();
        x(serialDescriptor, i);
        m(i2);
    }

    public final void B(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        x(serialDescriptor, i);
        p(j);
    }

    public final void C(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        x(serialDescriptor, i);
        o(kSerializer, obj);
    }

    public final void D(gt3 gt3Var, int i, short s) {
        x(gt3Var, i);
        f(s);
    }

    public final void E(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        x(serialDescriptor, i);
        r(str);
    }

    @Override // defpackage.me0
    public final void a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ee0 ee0Var = this.a;
        ee0Var.getClass();
        ee0Var.a = false;
        ee0Var.e(this.c.J);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final o63 b() {
        return this.e;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final me0 c(SerialDescriptor serialDescriptor) {
        ax4 ax4Var;
        serialDescriptor.getClass();
        i62 i62Var = this.b;
        pz5 p = li4.p(i62Var, serialDescriptor);
        char c = p.I;
        ee0 ee0Var = this.a;
        ee0Var.e(c);
        ee0Var.a = true;
        String str = this.h;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = serialDescriptor.a();
            }
            ee0Var.c();
            ee0Var.j(str);
            ee0Var.e(':');
            r(str2);
            this.h = null;
            this.i = null;
        }
        if (this.c == p) {
            return this;
        }
        ax4[] ax4VarArr = this.d;
        return (ax4VarArr == null || (ax4Var = ax4VarArr[p.ordinal()]) == null) ? new ax4(ee0Var, i62Var, p, ax4VarArr) : ax4Var;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void d() {
        this.a.h("null");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(double d) {
        if (this.g) {
            r(String.valueOf(d));
        } else {
            ((yw0) this.a.b).q(String.valueOf(d));
        }
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new w62(mu0.O(Double.valueOf(d), null), null, 2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(short s) {
        if (this.g) {
            r(String.valueOf((int) s));
        } else {
            this.a.i(s);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        if (this.g) {
            r(String.valueOf((int) b));
        } else {
            this.a.d(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(boolean z) {
        if (this.g) {
            r(String.valueOf(z));
        } else {
            ((yw0) this.a.b).q(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(float f) {
        if (this.g) {
            r(String.valueOf(f));
        } else {
            ((yw0) this.a.b).q(String.valueOf(f));
        }
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new w62(mu0.O(Float.valueOf(f), null), null, 2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(char c) {
        r(String.valueOf(c));
    }

    @Override // defpackage.me0
    public final void k(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (obj != null || this.f.d) {
            serialDescriptor.getClass();
            kSerializer.getClass();
            x(serialDescriptor, i);
            if (kSerializer.getDescriptor().c()) {
                o(kSerializer, obj);
            } else if (obj == null) {
                d();
            } else {
                o(kSerializer, obj);
            }
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        r(serialDescriptor.g(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(int i) {
        if (this.g) {
            r(String.valueOf(i));
        } else {
            this.a.f(i);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean a = bx4.a(serialDescriptor);
        pz5 pz5Var = this.c;
        i62 i62Var = this.b;
        ee0 ee0Var = this.a;
        if (a) {
            if (!(ee0Var instanceof ie0)) {
                ee0Var = new ie0((yw0) ee0Var.b, this.g);
            }
            return new ax4(ee0Var, i62Var, pz5Var, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(r62.a)) {
            if (!(ee0Var instanceof he0)) {
                ee0Var = new he0((yw0) ee0Var.b, this.g);
            }
            return new ax4(ee0Var, i62Var, pz5Var, null);
        }
        if (this.h != null) {
            this.i = serialDescriptor.a();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3 != defpackage.j60.I) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003a, code lost:
    
        if (defpackage.j42.c(r3, defpackage.sx4.g) == false) goto L20;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(kotlinx.serialization.KSerializer r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax4.o(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void p(long j) {
        if (this.g) {
            r(String.valueOf(j));
        } else {
            this.a.g(j);
        }
    }

    @Override // defpackage.me0
    public final boolean q(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.f.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void r(String str) {
        str.getClass();
        this.a.j(str);
    }

    public final me0 s(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return c(serialDescriptor);
    }

    public final void t(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        x(serialDescriptor, i);
        h(z);
    }

    public final void u(gt3 gt3Var, int i, byte b) {
        x(gt3Var, i);
        g(b);
    }

    public final void v(gt3 gt3Var, int i, char c) {
        x(gt3Var, i);
        j(c);
    }

    public final void w(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        x(serialDescriptor, i);
        e(d);
    }

    public final void x(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int ordinal = this.c.ordinal();
        ee0 ee0Var = this.a;
        boolean z = true;
        if (ordinal == 1) {
            if (!ee0Var.a) {
                ee0Var.e(',');
            }
            ee0Var.c();
            return;
        }
        if (ordinal == 2) {
            if (ee0Var.a) {
                this.g = true;
                ee0Var.c();
                return;
            }
            if (i % 2 == 0) {
                ee0Var.e(',');
                ee0Var.c();
            } else {
                ee0Var.e(':');
                ee0Var.k();
                z = false;
            }
            this.g = z;
            return;
        }
        if (ordinal != 3) {
            if (!ee0Var.a) {
                ee0Var.e(',');
            }
            ee0Var.c();
            qb.V(this.b, serialDescriptor);
            r(serialDescriptor.g(i));
            ee0Var.e(':');
            ee0Var.k();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            ee0Var.e(',');
            ee0Var.k();
            this.g = false;
        }
    }

    public final void y(gt3 gt3Var, int i, float f) {
        x(gt3Var, i);
        i(f);
    }

    public final Encoder z(gt3 gt3Var, int i) {
        x(gt3Var, i);
        return n(gt3Var.i(i));
    }
}

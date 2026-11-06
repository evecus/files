package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class xc2 extends x0 {
    public byte[] K;
    public final int L;

    public xc2(byte[] bArr, int i) {
        this.K = bArr;
        this.L = i;
    }

    @Override // defpackage.x0
    public final a0 A() {
        return ((x0) u()).A();
    }

    @Override // defpackage.x0
    public final fn0 B() {
        return ((x0) u()).B();
    }

    @Override // defpackage.x0
    public final r0 C() {
        return ((x0) u()).C();
    }

    @Override // defpackage.x0
    public final z0 D() {
        return ((x0) u()).D();
    }

    public final synchronized void E() {
        f0 f0Var;
        if (this.K != null) {
            k0 k0Var = new k0(this.K, this.L);
            try {
                u0 n = k0Var.n();
                if (n == null) {
                    f0Var = new f0(0);
                } else {
                    f0 f0Var2 = new f0();
                    do {
                        f0Var2.a(n);
                        n = k0Var.n();
                    } while (n != null);
                    f0Var = f0Var2;
                }
                k0Var.close();
                this.I = f0Var.d();
                this.K = null;
            } catch (IOException e) {
                throw new t0("malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // defpackage.x0, defpackage.u0, defpackage.n0
    public final int hashCode() {
        E();
        return super.hashCode();
    }

    @Override // defpackage.x0, java.lang.Iterable
    public final Iterator iterator() {
        E();
        return super.iterator();
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.K;
        }
        if (bArr != null) {
            uu2Var.P(bArr, 48, z);
        } else {
            super.u().n(uu2Var, z);
        }
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.K;
        }
        return bArr != null ? uu2.z(bArr.length, z) : super.u().q(z);
    }

    @Override // defpackage.x0
    public final int size() {
        E();
        return this.I.length;
    }

    @Override // defpackage.x0, defpackage.u0
    public final u0 t() {
        E();
        return super.t();
    }

    @Override // defpackage.x0, defpackage.u0
    public final u0 u() {
        E();
        return super.u();
    }

    @Override // defpackage.x0
    public final e0 y(int i) {
        E();
        return this.I[i];
    }

    @Override // defpackage.x0
    public final Enumeration z() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.K;
        }
        if (bArr == null) {
            return new w0(this);
        }
        int i = this.L;
        vc2 vc2Var = new vc2();
        vc2Var.a = new k0(bArr, i);
        vc2Var.b = vc2Var.a();
        return vc2Var;
    }
}

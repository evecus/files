package defpackage;

import java.io.IOException;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class n06 extends jq implements Destroyable {
    public final k06 J;
    public final byte[] K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public volatile long O;
    public volatile ss P;
    public volatile boolean Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n06(m06 m06Var) {
        super(true);
        k06 k06Var = m06Var.a;
        q06 q06Var = k06Var.a;
        String str = q06Var.d;
        this.J = k06Var;
        int i = q06Var.e;
        byte[] bArr = m06Var.i;
        if (bArr != null) {
            int i2 = k06Var.b;
            t06 a = t06.a((i2 + 7) / 8, i2, i, bArr);
            this.O = a.a;
            this.K = a.b;
            this.L = a.c;
            byte[] bArr2 = a.d;
            this.M = bArr2;
            byte[] bArr3 = a.e;
            this.N = bArr3;
            try {
                ss ssVar = (ss) ry5.b(a.f, ss.class, bArr2);
                long j = ssVar.J;
                j = j < 0 ? (1 << i2) - 1 : j;
                q06 q06Var2 = k06Var.a;
                this.P = ssVar.h(j, q06Var2.c, q06Var2.e);
                this.P.e(k06Var, this.O);
                this.P.g(k06Var, bArr3);
                return;
            } catch (IOException e) {
                throw k21.V(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw k21.V(e2.getMessage(), e2);
            } catch (IllegalStateException e3) {
                throw k21.V(e3.getMessage(), e3);
            }
        }
        this.O = m06Var.b;
        byte[] bArr4 = m06Var.d;
        this.K = ry5.m("secretKeySeed", i, bArr4);
        this.L = ry5.m("secretKeyPRF", i, m06Var.e);
        byte[] bArr5 = m06Var.f;
        this.M = ry5.m("publicSeed", i, bArr5);
        this.N = ry5.m("root", i, m06Var.g);
        ss ssVar2 = m06Var.h;
        if (ssVar2 == null) {
            long j2 = m06Var.b;
            int i3 = k06Var.b;
            if (!h06.a(i3, j2)) {
                s83.t("index out of bounds");
                throw null;
            }
            long j3 = (1 << i3) - 1;
            ssVar2 = j2 > j3 ? new ss(j3) : new ss(k06Var, j2, bArr5, bArr4);
        }
        this.P = ssVar2;
        long j4 = m06Var.c;
        if (j4 >= 0 && j4 != this.P.J) {
            s83.t("maxIndex set but not reflected in state");
            throw null;
        }
        try {
            this.P.e(k06Var, m06Var.b);
            if (m06Var.h != null) {
                this.P.g(k06Var, m06Var.g);
            }
        } catch (IllegalStateException e4) {
            throw k21.V(e4.getMessage(), e4);
        }
    }

    public final s06 a() {
        s06 s06Var;
        synchronized (this) {
            s06Var = new s06(this.J.a.c, this.O, b(), this.M, this.N, this.K, this.L);
        }
        return s06Var;
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = (this.P.J - this.O) + 1;
        }
        return j;
    }

    public final d95 c() {
        d95 d95Var;
        synchronized (this) {
            try {
                try {
                    d95Var = new d95(this.O, ry5.i(this.P, this.M));
                } catch (IOException e) {
                    throw k21.W("error encoding BDS state map", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d95Var;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.Q) {
            this.Q = true;
            g4.q(this.K);
            g4.q(this.L);
            this.P.a();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n06.class == obj.getClass()) {
                n06 n06Var = (n06) obj;
                if (t06.b(a(), n06Var.a())) {
                    d95 c = c();
                    d95 c2 = n06Var.c();
                    if (g4.w((byte[]) c.b, (byte[]) c2.b) & (c.a == c2.a)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return g4.N(this.M) + ((g4.N(this.N) + (g4.N(this.J.a.c.I) * 31)) * 31);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.Q;
    }
}

package defpackage;

import java.io.IOException;
import java.util.Arrays;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class v06 extends jq implements Destroyable {
    public final q06 J;
    public final byte[] K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public volatile qs O;
    public volatile boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v06(u06 u06Var) {
        super(true);
        Throwable th;
        qs qsVar;
        q06 q06Var = u06Var.a;
        this.J = q06Var;
        int i = q06Var.e;
        byte[] bArr = u06Var.i;
        if (bArr != null) {
            t06 a = t06.a(4, q06Var.a, i, bArr);
            int i2 = (int) a.a;
            this.K = a.b;
            this.L = a.c;
            byte[] bArr2 = a.d;
            this.M = bArr2;
            byte[] bArr3 = a.e;
            this.N = bArr3;
            try {
                qs qsVar2 = (qs) ry5.b(a.f, qs.class, bArr2);
                q06 q06Var2 = u06Var.a;
                q0 q0Var = q06Var2.c;
                int i3 = q06Var2.e;
                qsVar2.getClass();
                this.O = new qs(qsVar2, q0Var, i3);
                qs qsVar3 = this.O;
                qsVar3.d(q06Var);
                if (qsVar3.R != i2) {
                    throw new IllegalStateException("BDS state has wrong index");
                }
                this.O.f(bArr3);
                return;
            } catch (IOException e) {
                throw k21.V(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw k21.V(e2.getMessage(), e2);
            } catch (IllegalStateException e3) {
                throw k21.V(e3.getMessage(), e3);
            }
        }
        byte[] bArr4 = u06Var.d;
        this.K = ry5.m("secretKeySeed", i, bArr4);
        this.L = ry5.m("secretKeyPRF", i, u06Var.e);
        byte[] bArr5 = u06Var.f;
        this.M = ry5.m("publicSeed", i, bArr5);
        this.N = ry5.m("root", i, u06Var.g);
        qs qsVar4 = u06Var.h;
        if (qsVar4 != null) {
            this.O = qsVar4;
            th = null;
        } else {
            int i4 = u06Var.b;
            int i5 = q06Var.a;
            int i6 = q06Var.b;
            if (!h06.a(i5, i4)) {
                s83.t("index out of bounds");
                throw null;
            }
            int i7 = (1 << i5) - 1;
            if (i4 > i7) {
                qsVar = new qs(new mc3(new yz(q06Var.c, q06Var.e)), i5, i6, i4);
                qsVar.T = i7;
                qsVar.R = i4;
                qsVar.S = true;
                th = null;
            } else {
                byte[] e4 = g06.e(0, 0, 0L);
                th = null;
                qs qsVar5 = new qs(new mc3(new yz(q06Var.c, q06Var.e)), i5, i6, i7);
                qsVar5.a(bArr5, bArr4, e4);
                while (qsVar5.R < i4) {
                    qsVar5.b(bArr5, bArr4, e4);
                    qsVar5.S = false;
                }
                qsVar = qsVar5;
            }
            this.O = qsVar;
        }
        int i8 = u06Var.c;
        if (i8 >= 0 && i8 != this.O.T) {
            s83.t("maxIndex set but not reflected in state");
            throw th;
        }
        try {
            qs qsVar6 = this.O;
            q06 q06Var3 = this.J;
            int i9 = u06Var.b;
            qsVar6.d(q06Var3);
            if (qsVar6.R != i9) {
                throw new IllegalStateException("BDS state has wrong index");
            }
            if (u06Var.h != null) {
                this.O.f(u06Var.g);
            }
        } catch (IllegalStateException e5) {
            throw k21.V(e5.getMessage(), e5);
        }
    }

    public final s06 a() {
        s06 s06Var;
        synchronized (this) {
            s06Var = new s06(this.J.c, this.O.R, b(), this.M, this.N, this.K, this.L);
        }
        return s06Var;
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = (this.O.T - this.O.R) + 1;
        }
        return j;
    }

    public final d95 c() {
        d95 d95Var;
        synchronized (this) {
            try {
                try {
                    d95Var = new d95(this.O.R, ry5.i(this.O, this.M));
                } catch (IOException e) {
                    throw k21.W("error encoding BDS state", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d95Var;
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.P) {
            this.P = true;
            g4.q(this.K);
            g4.q(this.L);
            mc3 mc3Var = this.O.I;
            if (mc3Var != null) {
                Arrays.fill((byte[]) mc3Var.c, (byte) 0);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v06.class == obj.getClass()) {
                v06 v06Var = (v06) obj;
                if (t06.b(a(), v06Var.a())) {
                    d95 c = c();
                    d95 c2 = v06Var.c();
                    if (g4.w((byte[]) c.b, (byte[]) c2.b) & (c.a == c2.a)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return g4.N(this.M) + ((g4.N(this.N) + (g4.N(this.J.c.I) * 31)) * 31);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.P;
    }
}

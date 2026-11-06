package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ip1 implements we1 {
    public final we1 a;
    public final xn1 b;

    public ip1(we1 we1Var, xn1 xn1Var) {
        this.a = we1Var;
        this.b = xn1Var;
    }

    @Override // defpackage.we1
    public final int a() {
        return this.a.a() * this.b.a[r2.length - 1];
    }

    @Override // defpackage.we1
    public final BigInteger b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip1)) {
            return false;
        }
        ip1 ip1Var = (ip1) obj;
        return this.a.equals(ip1Var.a) && this.b.equals(ip1Var.b);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.b.hashCode(), 16) ^ this.a.hashCode();
    }
}

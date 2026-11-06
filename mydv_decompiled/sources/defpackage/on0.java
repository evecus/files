package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class on0 extends u0 implements b1 {
    public static final y J = new y(on0.class, (byte) 15);
    public final byte[] I;

    public on0(byte[] bArr) {
        this.I = bArr;
    }

    @Override // defpackage.b1
    public final String e() {
        return ix4.a(this.I);
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof on0) {
            return Arrays.equals(this.I, ((on0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 19, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    public final String toString() {
        return ix4.a(this.I);
    }
}

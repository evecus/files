package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xz3 implements wz3 {
    public final String I;
    public final ht5 J;
    public final vz3 K;
    public final m16 L;
    public final m16 M;
    public final m16 N;
    public final float[] O;
    public final float[] P;

    public xz3(String str, ht5 ht5Var, vz3 vz3Var, m16 m16Var, m16 m16Var2, m16 m16Var3, hn1 hn1Var) {
        ht5Var.getClass();
        m16Var.getClass();
        m16Var2.getClass();
        m16Var3.getClass();
        this.I = str;
        this.J = ht5Var;
        this.K = vz3Var;
        this.L = m16Var;
        this.M = m16Var2;
        this.N = m16Var3;
        w80.a("RGB");
        m16 m16Var4 = zz3.a;
        float f = m16Var.a;
        float f2 = m16Var2.a;
        float f3 = m16Var3.a;
        float f4 = m16Var.b;
        float f5 = m16Var2.b;
        float f6 = m16Var3.b;
        float[] fArr = {f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6};
        m16 m16Var5 = ht5Var.b;
        float[] L = il2.L(fArr);
        float f7 = m16Var5.a;
        float f8 = m16Var5.c;
        float f9 = (f7 * f8) / m16Var5.b;
        float a = m16Var5.a();
        float[] u = il2.u((L[2] * a) + (L[1] * f8) + (L[0] * f9), (L[5] * a) + (L[4] * f8) + (L[3] * f9), (L[8] * a) + (L[7] * f8) + (L[6] * f9), fArr);
        this.O = u;
        this.P = il2.L(u);
    }

    @Override // defpackage.wz3
    public final float[] b() {
        return this.O;
    }

    @Override // defpackage.wz3
    public final float[] d() {
        return this.P;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz3)) {
            return false;
        }
        wz3 wz3Var = (wz3) obj;
        if (!this.I.equals(wz3Var.getName()) || !j42.c(this.J, wz3Var.h()) || !this.K.equals(wz3Var.j())) {
            return false;
        }
        if (!(obj instanceof xz3)) {
            return Arrays.equals(this.O, wz3Var.b()) && Arrays.equals(this.P, wz3Var.d());
        }
        xz3 xz3Var = (xz3) obj;
        return j42.c(this.L, xz3Var.L) && j42.c(this.M, xz3Var.M) && j42.c(this.N, xz3Var.N);
    }

    @Override // defpackage.wz3
    public final tz3 g(float f, float f2, float f3, float f4) {
        return new tz3(f, f2, f3, f4, this);
    }

    @Override // defpackage.u80
    public final String getName() {
        return this.I;
    }

    @Override // defpackage.jt5
    public final ht5 h() {
        return this.J;
    }

    public final int hashCode() {
        return this.N.hashCode() + ((this.M.hashCode() + ((this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + (this.I.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.wz3
    public final vz3 j() {
        return this.K;
    }

    public final String toString() {
        return this.I;
    }
}

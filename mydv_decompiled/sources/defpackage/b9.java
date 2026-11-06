package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b9 extends k13 implements na2 {
    public v8 I;
    public long J;
    public long K;

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        final v8 v8Var = this.I;
        long j2 = this.J;
        q65[] q65VarArr = p65.b;
        final float q = (j2 & 1095216660480L) == 0 ? Float.NaN : ww2Var.q(j2);
        long j3 = this.K;
        float q2 = (1095216660480L & j3) != 0 ? ww2Var.q(j3) : Float.NaN;
        boolean z = v8Var instanceof dv1;
        final bn3 u = pw2Var.u(z ? dh0.a(j, 0, 0, 0, 0, 11) : dh0.a(j, 0, 0, 0, 0, 14));
        int R = u.R(v8Var);
        if (R == Integer.MIN_VALUE) {
            R = 0;
        }
        int i = z ? u.J : u.I;
        int g = (z ? dh0.g(j) : dh0.h(j)) - i;
        final int r = ut0.r((!Float.isNaN(q) ? ww2Var.X(q) : 0) - R, 0, g);
        final int r2 = ut0.r(((!Float.isNaN(q2) ? ww2Var.X(q2) : 0) - i) + R, 0, g - r);
        int i2 = u.I;
        if (!z) {
            i2 = Math.max(i2 + r + r2, dh0.j(j));
        }
        final int i3 = i2;
        int i4 = u.J;
        if (z) {
            i4 = Math.max(i4 + r + r2, dh0.i(j));
        }
        final int i5 = i4;
        return ww2Var.A(i3, i5, p91.I, new tm1() { // from class: w8
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3 an3Var = (an3) obj;
                boolean z2 = v8.this instanceof dv1;
                float f = q;
                int i6 = r;
                int i7 = r2;
                bn3 bn3Var = u;
                int i8 = z2 ? 0 : !r11.c(f, Float.NaN) ? i6 : (i3 - i7) - bn3Var.I;
                if (!z2) {
                    i6 = 0;
                } else if (r11.c(f, Float.NaN)) {
                    i6 = (i5 - i7) - bn3Var.J;
                }
                an3.i(an3Var, bn3Var, i8, i6);
                return wd5.a;
            }
        });
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}

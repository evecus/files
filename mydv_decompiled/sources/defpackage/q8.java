package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q8 implements sk0, pz, l54, p75, h5, jj1, a93, mp, ip {
    public static final q8 D0;
    public static final /* synthetic */ q8 Y;
    public static final q7 Z;
    public static final sg a0;
    public static final sg b0;
    public static final sg c0;
    public static final sg d0;
    public static final o90 e0;
    public static final xb g0;
    public static final /* synthetic */ q8 t0;
    public static final q8 u0;
    public static final q8 v0;
    public static final q8 w0;
    public static final /* synthetic */ q8 x0;
    public final /* synthetic */ byte I;
    public static final vv J = new vv(-1.0f, -1.0f);
    public static final vv K = new vv(0.0f, -1.0f);
    public static final vv L = new vv(1.0f, -1.0f);
    public static final vv M = new vv(-1.0f, 0.0f);
    public static final vv N = new vv(0.0f, 0.0f);
    public static final vv O = new vv(1.0f, 0.0f);
    public static final vv P = new vv(-1.0f, 1.0f);
    public static final vv Q = new vv(0.0f, 1.0f);
    public static final vv R = new vv(1.0f, 1.0f);
    public static final uv S = new uv(-1.0f);
    public static final uv T = new uv(0.0f);
    public static final uv U = new uv(1.0f);
    public static final tv V = new tv(-1.0f);
    public static final tv W = new tv(0.0f);
    public static final tv X = new tv(1.0f);
    public static final xb f0 = new xb(0);
    public static final xb h0 = new xb(2);
    public static final /* synthetic */ q8 i0 = new q8(3);
    public static final q8 j0 = new q8(4);
    public static final q8 k0 = new q8(5);
    public static final da2 l0 = da2.I;
    public static final lu0 m0 = new lu0(1.0f, 1.0f);
    public static final q8 n0 = new q8(6);
    public static final m14 o0 = new m14(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final q8 p0 = new q8(8);
    public static final /* synthetic */ q8 q0 = new q8(9);
    public static final /* synthetic */ q8 r0 = new q8(10);
    public static final /* synthetic */ q8 s0 = new q8(11);
    public static final q8 y0 = new q8(17);
    public static final q8 z0 = new q8(18);
    public static final q8 A0 = new q8(19);
    public static final q8 B0 = new q8(20);
    public static final q8 C0 = new q8(21);
    public static final ow5 E0 = new ow5();

    static {
        byte b = 1;
        Y = new q8(b);
        byte b2 = 12;
        Z = new q7(b2);
        byte b3 = 13;
        a0 = new sg(b3);
        byte b4 = 14;
        b0 = new sg(b4);
        byte b5 = 15;
        c0 = new sg(b5);
        byte b6 = 16;
        d0 = new sg(b6);
        byte b7 = 22;
        e0 = new o90(b7);
        g0 = new xb(b);
        t0 = new q8(b2);
        u0 = new q8(b3);
        v0 = new q8(b4);
        w0 = new q8(b5);
        x0 = new q8(b6);
        D0 = new q8(b7);
    }

    public /* synthetic */ q8(byte b) {
        this.I = b;
    }

    @Override // defpackage.a93
    public /* synthetic */ long C(int i, long j) {
        return 0L;
    }

    @Override // defpackage.a93
    public /* synthetic */ long V(int i, long j, long j2) {
        return 0L;
    }

    @Override // defpackage.q75
    public o75 a() {
        return new o75(t13.b());
    }

    @Override // defpackage.mp
    public float b() {
        switch (this.I) {
        }
        return 0.0f;
    }

    @Override // defpackage.pz
    public long c() {
        return 9205357640488583168L;
    }

    @Override // defpackage.ip
    public void d(iu0 iu0Var, int i, int[] iArr, da2 da2Var, int[] iArr2) {
        byte b = this.I;
        da2 da2Var2 = da2.I;
        int i2 = 0;
        switch (b) {
            case 28:
                if (da2Var == da2Var2) {
                    i42.H0(i, iArr, iArr2, false);
                    break;
                } else {
                    i42.H0(i, iArr, iArr2, true);
                    break;
                }
            default:
                if (da2Var == da2Var2) {
                    int i3 = 0;
                    for (int i4 : iArr) {
                        i3 += i4;
                    }
                    int i5 = i - i3;
                    int length = iArr.length;
                    int i6 = 0;
                    while (i2 < length) {
                        int i7 = iArr[i2];
                        iArr2[i6] = i5;
                        i5 += i7;
                        i2++;
                        i6++;
                    }
                    break;
                } else {
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i8 = iArr[length2];
                        iArr2[length2] = i2;
                        i2 += i8;
                    }
                    break;
                }
        }
    }

    @Override // defpackage.mp
    public void e(iu0 iu0Var, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.I) {
            case 27:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                i42.H0(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.p75
    public o75 f() {
        return new o75(t13.b());
    }

    public boolean g(Object obj, Object obj2) {
        switch (this.I) {
            case 14:
                return false;
            case 17:
                return obj == obj2;
            default:
                return j42.c(obj, obj2);
        }
    }

    @Override // defpackage.a93
    public /* synthetic */ Object g0(long j, long j2, fj0 fj0Var) {
        return i82.u();
    }

    @Override // defpackage.pz
    public iu0 getDensity() {
        return m0;
    }

    @Override // defpackage.pz
    public da2 getLayoutDirection() {
        return l0;
    }

    public String toString() {
        switch (this.I) {
            case 14:
                return "NeverEqualPolicy";
            case 17:
                return "ReferentialEqualityPolicy";
            case 19:
                return "Start";
            case 20:
                return "StructuralEqualityPolicy";
            case 21:
                int i = t13.J;
                return "TimeSource(System.nanoTime())";
            case 27:
                return "Arrangement#Bottom";
            case 28:
                return "Arrangement#Center";
            case 29:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.a93
    public /* synthetic */ Object w(long j, fj0 fj0Var) {
        return i82.v();
    }
}

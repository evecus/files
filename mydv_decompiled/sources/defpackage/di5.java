package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class di5 implements zh5 {
    public final p33 I;
    public final q33 J;
    public final short K;
    public final l61 L;
    public int[] M = yh5.a;
    public float[] N;
    public hj O;
    public hj P;
    public hj Q;
    public hj R;
    public float[] S;
    public float[] T;
    public ep U;

    /* JADX WARN: Multi-variable type inference failed */
    public di5(p33 p33Var, q33 q33Var, int i, l61 l61Var) {
        this.I = p33Var;
        this.J = q33Var;
        this.K = i;
        this.L = l61Var;
        float[] fArr = yh5.b;
        this.N = fArr;
        this.S = fArr;
        this.T = fArr;
        this.U = yh5.c;
    }

    @Override // defpackage.xh5
    public final boolean a() {
        return false;
    }

    public final int b(int i) {
        int i2;
        p33 p33Var = this.I;
        int i3 = p33Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            zy.o("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = p33Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        l61 l61Var;
        float f;
        p33 p33Var = this.I;
        if (i >= p33Var.b - 1) {
            f = i2;
        } else {
            int a = p33Var.a(i);
            int a2 = p33Var.a(i + 1);
            if (i2 != a) {
                int i3 = a2 - a;
                ci5 ci5Var = (ci5) this.J.b(a);
                if (ci5Var == null || (l61Var = ci5Var.b) == null) {
                    l61Var = this.L;
                }
                float f2 = i3;
                float a3 = l61Var.a((i2 - a) / f2);
                return z ? a3 : ((f2 * a3) + a) / 1000.0f;
            }
            f = a;
        }
        return f / 1000.0f;
    }

    @Override // defpackage.xh5
    public final hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        long j2 = j / 1000000;
        int[] iArr = yh5.a;
        long h = h();
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 > h ? h : j2;
        if (j3 < 0) {
            return hjVar3;
        }
        e(hjVar, hjVar2, hjVar3);
        hj hjVar4 = this.P;
        hjVar4.getClass();
        int i = 0;
        if (this.U != yh5.c) {
            int i2 = (int) j3;
            float c = c(b(i2), i2, false);
            float[] fArr = this.T;
            dp[][] dpVarArr = (dp[][]) this.U.J;
            float f = dpVarArr[0][0].a;
            float f2 = dpVarArr[dpVarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (dp[] dpVarArr2 : dpVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    dp dpVar = dpVarArr2[i4];
                    if (f2 <= dpVar.b) {
                        if (dpVar.p) {
                            fArr[i3] = dpVar.q;
                            fArr[i3 + 1] = dpVar.r;
                        } else {
                            dpVar.c(f2);
                            fArr[i3] = dpVar.a();
                            fArr[i3 + 1] = dpVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                hjVar4.e(fArr[i], i);
                i++;
            }
        } else {
            hj i5 = i((j3 - 1) * 1000000, hjVar, hjVar2, hjVar3);
            hj i6 = i(j3 * 1000000, hjVar, hjVar2, hjVar3);
            int b = i5.b();
            while (i < b) {
                hjVar4.e((i5.a(i) - i6.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return hjVar4;
    }

    public final void e(hj hjVar, hj hjVar2, hj hjVar3) {
        float[] fArr;
        boolean z = this.U != yh5.c;
        hj hjVar4 = this.O;
        q33 q33Var = this.J;
        p33 p33Var = this.I;
        if (hjVar4 == null) {
            this.O = hjVar.c();
            this.P = hjVar3.c();
            int i = p33Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = p33Var.a(i2) / 1000.0f;
            }
            this.N = fArr2;
            int i3 = p33Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.M = iArr;
        }
        if (z) {
            if (this.U != yh5.c && j42.c(this.Q, hjVar) && j42.c(this.R, hjVar2)) {
                return;
            }
            this.Q = hjVar;
            this.R = hjVar2;
            int b = hjVar.b() + (hjVar.b() % 2);
            this.S = new float[b];
            this.T = new float[b];
            int i5 = p33Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int a = p33Var.a(i6);
                ci5 ci5Var = (ci5) q33Var.b(a);
                if (a == 0 && ci5Var == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = hjVar.a(i7);
                    }
                } else if (a == this.K && ci5Var == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = hjVar2.a(i8);
                    }
                } else {
                    ci5Var.getClass();
                    hj hjVar5 = ci5Var.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = hjVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.U = new ep(this.M, this.N, fArr3);
        }
    }

    @Override // defpackage.zh5
    public final int f() {
        return 0;
    }

    @Override // defpackage.zh5
    public final int h() {
        return this.K;
    }

    @Override // defpackage.xh5
    public final hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        hj hjVar4;
        hj hjVar5;
        dp[][] dpVarArr;
        hj hjVar6 = hjVar;
        long j2 = j / 1000000;
        int[] iArr = yh5.a;
        long h = h();
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= h) {
            h = j2;
        }
        int i = (int) h;
        q33 q33Var = this.J;
        ci5 ci5Var = (ci5) q33Var.b(i);
        if (ci5Var != null) {
            return ci5Var.a;
        }
        if (i >= this.K) {
            return hjVar2;
        }
        if (i <= 0) {
            return hjVar6;
        }
        e(hjVar6, hjVar2, hjVar3);
        hj hjVar7 = this.O;
        hjVar7.getClass();
        int i2 = 0;
        if (this.U != yh5.c) {
            float c = c(b(i), i, false);
            float[] fArr = this.S;
            dp[][] dpVarArr2 = (dp[][]) this.U.J;
            int length = dpVarArr2.length - 1;
            float f = dpVarArr2[0][0].a;
            float f2 = dpVarArr2[length][0].b;
            int length2 = fArr.length;
            if (c < f || c > f2) {
                if (c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = c - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    dp dpVar = dpVarArr2[length][i4];
                    boolean z = dpVar.p;
                    float f4 = dpVar.r;
                    float f5 = dpVar.q;
                    if (z) {
                        float f6 = dpVar.a;
                        float f7 = dpVar.k;
                        float f8 = dpVar.c;
                        dpVarArr = dpVarArr2;
                        fArr[i3] = (f5 * f3) + ((dpVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = dpVar.d;
                        fArr[i3 + 1] = (f4 * f3) + ((dpVar.f - f10) * f9) + f10;
                    } else {
                        dpVarArr = dpVarArr2;
                        dpVar.c(f);
                        fArr[i3] = (dpVar.a() * f3) + (dpVar.n * dpVar.h) + f5;
                        fArr[i3 + 1] = (dpVar.b() * f3) + (dpVar.o * dpVar.i) + f4;
                    }
                    i3 += 2;
                    i4++;
                    dpVarArr2 = dpVarArr;
                }
            } else {
                int length3 = dpVarArr2.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        dp dpVar2 = dpVarArr2[i5][i7];
                        if (c <= dpVar2.b) {
                            if (dpVar2.p) {
                                float f11 = dpVar2.a;
                                float f12 = dpVar2.k;
                                float f13 = dpVar2.c;
                                fArr[i6] = ((dpVar2.e - f13) * (c - f11) * f12) + f13;
                                float f14 = dpVar2.d;
                                fArr[i6 + 1] = ((dpVar2.f - f14) * (c - f11) * f12) + f14;
                            } else {
                                dpVar2.c(c);
                                fArr[i6] = (dpVar2.n * dpVar2.h) + dpVar2.q;
                                fArr[i6 + 1] = (dpVar2.o * dpVar2.i) + dpVar2.r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                hjVar7.e(fArr[i8], i8);
            }
        } else {
            int b = b(i);
            float c2 = c(b, i, true);
            p33 p33Var = this.I;
            ci5 ci5Var2 = (ci5) q33Var.b(p33Var.a(b));
            if (ci5Var2 != null && (hjVar5 = ci5Var2.a) != null) {
                hjVar6 = hjVar5;
            }
            ci5 ci5Var3 = (ci5) q33Var.b(p33Var.a(b + 1));
            if (ci5Var3 == null || (hjVar4 = ci5Var3.a) == null) {
                hjVar4 = hjVar2;
            }
            int b2 = hjVar7.b();
            for (int i9 = 0; i9 < b2; i9++) {
                hjVar7.e((hjVar4.a(i9) * c2) + ((1.0f - c2) * hjVar6.a(i9)), i9);
            }
        }
        return hjVar7;
    }

    @Override // defpackage.xh5
    public final hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return d(k(hjVar, hjVar2, hjVar3), hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return h() * 1000000;
    }
}

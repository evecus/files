package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q44 implements iu0, xe0 {
    public float I;
    public dy4 J;
    public ey4 K;
    public ey4 L;
    public ey4 M;
    public ey4 N;
    public q33 O;
    public q33 P;
    public q33 Q;
    public long R;
    public int S;
    public bj T;
    public bj U;
    public g12 V;

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return 1.0f;
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.xe0
    public final Object Q(xx3 xx3Var) {
        dy4 dy4Var = this.J;
        dy4Var.getClass();
        return j42.r(dy4Var, xx3Var);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    public final void a(long j) {
        f((byte) 34, this.T, this.U);
        bj bjVar = this.T;
        bj bjVar2 = this.U;
        ze5 ze5Var = ze5.a;
        if (bjVar == ze5Var) {
            if ((this.S & 2) != 0) {
                q33 q33Var = this.O;
                if (q33Var == null || (bjVar = (bj) q33Var.b(51)) == null) {
                    bjVar = r44.a;
                }
            } else {
                bjVar = null;
            }
        }
        if (bjVar2 == ze5Var) {
            if ((this.S & 2) != 0) {
                q33 q33Var2 = this.P;
                if (q33Var2 == null || (bjVar2 = (bj) q33Var2.b(51)) == null) {
                    bjVar2 = r44.a;
                }
            } else {
                bjVar2 = null;
            }
        }
        this.S = (bjVar == null || bjVar2 == null) ? this.S & (-3) : this.S | 2;
        g(51, bjVar, bjVar2);
        ey4 ey4Var = this.K;
        if (ey4Var != null) {
            ey4Var.b(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q44.b():void");
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    public final int d() {
        int i;
        g12 g12Var = this.V;
        int i2 = 0;
        if (g12Var == null) {
            return 0;
        }
        q33 q33Var = (q33) g12Var.K;
        int[] iArr = q33Var.b;
        Object[] objArr = q33Var.c;
        long[] jArr = q33Var.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            if (i7 < 50) {
                                j |= 1 << ((byte) i7);
                            } else {
                                i |= 1 << (i7 - 50);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    i2 = i;
                    break;
                }
                i3++;
            }
        }
        i = i2;
        return fy4.e(i) | fy4.g(j);
    }

    public final void f(byte b, bj bjVar, bj bjVar2) {
        ze5 ze5Var = ze5.a;
        if (bjVar == ze5Var) {
            long j = this.R;
            if (b >= 50 || (j & (1 << b)) == 0) {
                bjVar = null;
            } else {
                q33 q33Var = this.O;
                if (q33Var == null || (bjVar = (bj) q33Var.b(b)) == null) {
                    bjVar = r44.a;
                }
            }
        }
        if (bjVar2 == ze5Var) {
            long j2 = this.R;
            if (b >= 50 || (j2 & (1 << b)) == 0) {
                bjVar2 = null;
            } else {
                q33 q33Var2 = this.P;
                if (q33Var2 == null || (bjVar2 = (bj) q33Var2.b(b)) == null) {
                    bjVar2 = r44.a;
                }
            }
        }
        this.R = (bjVar == null || bjVar2 == null) ? this.R & (~(1 << b)) : this.R | (1 << b);
        g(b, bjVar, bjVar2);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    public final void g(int i, bj bjVar, bj bjVar2) {
        if (bjVar == null || bjVar.equals(r44.a)) {
            q33 q33Var = this.O;
            if (q33Var != null) {
            }
        } else {
            q33 q33Var2 = this.O;
            if (q33Var2 == null) {
                q33 q33Var3 = q22.a;
                q33Var2 = new q33();
                this.O = q33Var2;
            }
            q33Var2.i(i, bjVar);
        }
        if (bjVar2 != null && !bjVar2.equals(r44.a)) {
            q33 q33Var4 = this.P;
            if (q33Var4 == null) {
                q33 q33Var5 = q22.a;
                q33Var4 = new q33();
                this.P = q33Var4;
            }
            q33Var4.i(i, bjVar2);
            return;
        }
        q33 q33Var6 = this.P;
        if (q33Var6 != null) {
            bj bjVar3 = (bj) q33Var6.b(i);
            q33Var6.g(i);
            if (bjVar3 != null) {
                q33 q33Var7 = this.Q;
                if (q33Var7 == null) {
                    q33 q33Var8 = q22.a;
                    q33Var7 = new q33();
                    this.Q = q33Var7;
                }
                q33Var7.i(i, bjVar3);
            }
        }
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I;
    }

    public final void h(int i, ey4 ey4Var) {
        ey4 ey4Var2 = this.K;
        if (ey4Var2 == null) {
            ey4Var2 = fy4.n;
        }
        ey4 ey4Var3 = ey4Var2;
        ey4Var3.f(ey4Var);
        g12 g12Var = this.V;
        if (g12Var == null) {
            return;
        }
        ey4 ey4Var4 = this.N;
        if (ey4Var4 == null && (ey4Var4 = this.L) == null) {
            return;
        }
        ey4 ey4Var5 = ey4Var4;
        if (g12Var.D()) {
            this.N = null;
            this.V = null;
            return;
        }
        int i2 = i & 1;
        int i3 = i & 8;
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 32;
        int i7 = i & 16;
        long j = (i2 != 0 ? fy4.b : 0L) | (i3 != 0 ? fy4.c : 0L) | (i4 != 0 ? fy4.d : 0L) | (i5 != 0 ? fy4.e : 0L) | (i6 != 0 ? fy4.f : 0L) | (i7 != 0 ? fy4.g : 0L);
        int i8 = (i2 != 0 ? fy4.h : 0) | (i3 != 0 ? fy4.i : 0) | (i4 != 0 ? fy4.j : 0) | (i5 != 0 ? fy4.k : 0) | (i6 != 0 ? fy4.l : 0);
        int i9 = i7 != 0 ? fy4.m : 0;
        long z = g12Var.z();
        int i10 = (int) (z >> 50);
        long i11 = j & fy4.i(i10, 2251799813685247L & z);
        int h = (i8 | i9) & fy4.h(i10, i11);
        if (i11 == 0 && h == 0) {
            return;
        }
        fy4.a(ey4Var5, ey4Var3, g12Var, i11, h, ey4Var);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }
}

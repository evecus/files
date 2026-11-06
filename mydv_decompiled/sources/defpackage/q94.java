package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q94 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ q94(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rm1
    public final Object invoke() {
        char c;
        char c2;
        long j;
        long j2;
        boolean z = true;
        long j3 = -9187201950435737472L;
        char c3 = 7;
        boolean z2 = false;
        Object[] objArr = 0;
        switch (this.I) {
            case 0:
                return qb.N((wr5) this.J);
            case 1:
                w94 w94Var = (w94) this.J;
                w94Var.k().a(new l14(w94Var, objArr == true ? 1 : 0));
                return wd5.a;
            case 2:
                ub4 ub4Var = (ub4) this.J;
                tc tcVar = (tc) j42.r(ub4Var, lh3.a);
                ub4Var.U = tcVar;
                ub4Var.V = tcVar != null ? new sc(tcVar.a, tcVar.b, tcVar.c, tcVar.d) : null;
                return wd5.a;
            case 3:
                jh4 jh4Var = (jh4) this.J;
                ea5 ea5Var = jh4Var.e;
                jh4Var.f = ea5Var != null ? ((Number) ea5Var.m.getValue()).longValue() : 0L;
                return wd5.a;
            case 4:
                return this.J;
            case 5:
                uj4 uj4Var = (uj4) this.J;
                return Integer.valueOf(mu0.E(uj4Var, uj4Var.j));
            case 6:
                long j4 = 128;
                kt4 kt4Var = (kt4) this.J;
                while (true) {
                    synchronized (kt4Var.g) {
                        try {
                            if (kt4Var.c) {
                                c = c3;
                            } else {
                                kt4Var.c = z;
                                try {
                                    b53 b53Var = kt4Var.f;
                                    Object[] objArr2 = b53Var.I;
                                    int i = b53Var.K;
                                    int i2 = 0;
                                    while (i2 < i) {
                                        jt4 jt4Var = (jt4) objArr2[i2];
                                        o43 o43Var = jt4Var.g;
                                        tm1 tm1Var = jt4Var.a;
                                        Object[] objArr3 = o43Var.b;
                                        long[] jArr = o43Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i3 = 0;
                                            while (true) {
                                                long j5 = jArr[i3];
                                                c2 = c3;
                                                long[] jArr2 = jArr;
                                                if ((((~j5) << c2) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                    int i5 = 0;
                                                    while (i5 < i4) {
                                                        if ((j5 & 255) < j4) {
                                                            tm1Var.invoke(objArr3[(i3 << 3) + i5]);
                                                        }
                                                        j5 >>= 8;
                                                        i5++;
                                                        j4 = 128;
                                                    }
                                                    if (i4 != 8) {
                                                    }
                                                }
                                                if (i3 != length) {
                                                    i3++;
                                                    c3 = c2;
                                                    jArr = jArr2;
                                                    j4 = 128;
                                                }
                                            }
                                        } else {
                                            c2 = c3;
                                        }
                                        o43Var.e();
                                        i2++;
                                        c3 = c2;
                                        j4 = 128;
                                    }
                                    c = c3;
                                    kt4Var.c = false;
                                } finally {
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!kt4Var.c()) {
                        return wd5.a;
                    }
                    c3 = c;
                    z = true;
                    j4 = 128;
                }
            case 7:
                kb2 a = ((vy4) this.J).a();
                wa2 wa2Var = a.I;
                if (a.V != ((a53) wa2Var.p()).I.K) {
                    n43 n43Var = a.N;
                    Object[] objArr4 = n43Var.c;
                    long[] jArr3 = n43Var.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j6 = jArr3[i6];
                            if ((((~j6) << 7) & j6 & j3) != j3) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j6 & 255) < 128) {
                                        j2 = j3;
                                        ((cb2) objArr4[(i6 << 3) + i8]).d = true;
                                    } else {
                                        j2 = j3;
                                    }
                                    j6 >>= 8;
                                    i8++;
                                    j3 = j2;
                                }
                                j = j3;
                                if (i7 != 8) {
                                }
                            } else {
                                j = j3;
                            }
                            if (i6 != length2) {
                                i6++;
                                j3 = j;
                            }
                        }
                    }
                    if (wa2Var.P != null) {
                        if (!wa2Var.o0.e) {
                            wa2.W(wa2Var, false, 7);
                        }
                    } else if (!wa2Var.r()) {
                        wa2.Y(wa2Var, false, 7);
                    }
                }
                return wd5.a;
            case 8:
                return new BaseInputConnection(((l55) this.J).a, false);
            case 9:
                k65 k65Var = (k65) this.J;
                k65Var.T = null;
                ut0.U(k65Var).I();
                ut0.U(k65Var).H();
                mu0.I(k65Var);
                return Boolean.TRUE;
            case 10:
                vh5 vh5Var = (vh5) this.J;
                wd5 wd5Var = wd5.a;
                vh5Var.L.setValue(wd5Var);
                return wd5Var;
            case 11:
                ((hu2) this.J).v(ab4.Q);
                return wd5.a;
            default:
                ((zd1) this.J).f();
                return wd5.a;
        }
    }
}

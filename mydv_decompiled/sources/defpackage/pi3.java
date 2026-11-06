package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pi3 {
    public final ep a;
    public final q33 b;
    public final r33 c;
    public final o33 d;
    public final q33 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final bf2 n;
    public final pn o;

    public pi3(ep epVar, bf2 bf2Var, ej3 ej3Var) {
        this.a = epVar;
        q33 q33Var = q22.a;
        this.b = new q33();
        this.c = new r33();
        int i = j22.a;
        this.d = new o33();
        this.e = new q33();
        this.g = -1;
        this.h = Log.LOG_LEVEL_OFF;
        this.i = Integer.MIN_VALUE;
        this.n = bf2Var;
        this.o = new pn(ej3Var);
    }

    public final int a(pn pnVar, int i, boolean z) {
        List list;
        List list2;
        q33 q33Var = this.e;
        if (q33Var.a(i)) {
            Object b = q33Var.b(i);
            b.getClass();
            return ((o00) b).b;
        }
        q33 q33Var2 = this.b;
        int i2 = 0;
        if (q33Var2.a(i)) {
            if (!z || (list2 = (List) q33Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((af2) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        n00 n00Var = new n00(this, pnVar, (byte) 0);
        long j = pnVar.D().u;
        bf2 bf2Var = (bf2) pnVar.d;
        if (bf2Var == null) {
            j42.g0("state");
            throw null;
        }
        q33Var2.i(i, p70.j0(bf2Var.a(i, j, true, new m1(n00Var, pnVar, (byte) 14))));
        if (!z || (list = (List) q33Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((af2) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(pn pnVar, int i, int i2) {
        int i3;
        int i4;
        q33 q33Var = this.e;
        o00 o00Var = (o00) q33Var.b(i);
        jp jpVar = o00.c;
        if (o00Var != null) {
            o00Var.b = i2;
            o00Var.a = jpVar;
        } else {
            o00Var = new o00();
            o00Var.a = jpVar;
            o00Var.b = i2;
        }
        q33Var.i(i, o00Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            n00 n00Var = new n00(this, pnVar, (byte) 1);
            long j = pnVar.D().u;
            bf2 bf2Var = (bf2) pnVar.d;
            if (bf2Var == null) {
                j42.g0("state");
                throw null;
            }
            this.b.i(i4, p70.j0(bf2Var.a(i4, j, true, new m1(n00Var, pnVar, (byte) 14))));
        }
        h();
    }

    public final void d(pn pnVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int P = mw2.P(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (P > i8) {
                    P = i8;
                }
                this.j = P;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int a = a(pnVar, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (a == -1) {
                    return;
                }
                this.h--;
                this.j -= a;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int P2 = mw2.P(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (P2 > i9) {
                P2 = i9;
            }
            this.k = P2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int a2 = a(pnVar, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (a2 == -1) {
                return;
            }
            this.i++;
            this.k -= a2;
        }
    }

    public final void e(float f, zi3 zi3Var) {
        pi3 pi3Var;
        boolean z;
        int i;
        int i2;
        int i3;
        pn pnVar = this.o;
        pnVar.c = zi3Var;
        pnVar.d = this.n;
        float f2 = -f;
        h();
        if (pnVar.z()) {
            sp0.S(pnVar.D());
            pnVar.D();
            this.m = pnVar.I();
            int x = pnVar.x();
            int B = pnVar.B();
            int I = pnVar.I();
            int F = pnVar.F();
            int E = pnVar.E();
            q33 q33Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - F;
                this.h = x;
                while (this.j > 0 && (i3 = this.h) > 0 && q33Var.a(i3 - 1)) {
                    Object b = q33Var.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((o00) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - E;
                this.i = B;
                while (this.k > 0 && (i2 = this.i) < I - 1 && q33Var.a(i2 + 1)) {
                    Object b2 = q33Var.b(this.i + 1);
                    b2.getClass();
                    int i4 = ((o00) b2).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, I - 1);
            }
        }
        if (pnVar.z()) {
            sp0.S(pnVar.D());
            if (pnVar.D().t != null) {
                i = ((jj3) this.a.J).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            pi3Var = this;
            pi3Var.d(pnVar, pnVar.x(), pnVar.B(), i, pnVar.E(), pnVar.F(), f2, f2 <= 0.0f ? true : z);
        } else {
            pi3Var = this;
        }
        pi3Var.f = f2;
        pi3Var.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        r33 r33Var = this.c;
        r33Var.b();
        q33 q33Var = this.b;
        int[] iArr3 = q33Var.b;
        long[] jArr3 = q33Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            r33Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        o33 o33Var = this.d;
        int[] iArr4 = o33Var.b;
        long[] jArr4 = o33Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                r33Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        q33 q33Var2 = this.e;
        int[] iArr5 = q33Var2.b;
        long[] jArr5 = q33Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            r33Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr6 = r33Var.b;
        long[] jArr6 = r33Var.a;
        int length4 = jArr6.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr6[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr6[(i15 << 3) + i17];
                        List list = (List) q33Var.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((af2) list.get(i19)).cancel();
                            }
                        }
                        int c4 = o33Var.c(i18);
                        if (c4 >= 0) {
                            o33Var.e--;
                            long[] jArr7 = o33Var.a;
                            int i20 = o33Var.d;
                            int i21 = c4 >> 3;
                            int i22 = (c4 & 7) << 3;
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                            long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr7[i21] = j8;
                            jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        q33Var2.g(i18);
                    } else {
                        iArr2 = iArr6;
                        jArr2 = jArr6;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr6 = iArr2;
                    jArr6 = jArr2;
                }
                iArr = iArr6;
                jArr = jArr6;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
                jArr = jArr6;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr6 = iArr;
            jArr6 = jArr;
        }
    }

    public final void g() {
        this.h = Log.LOG_LEVEL_OFF;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        q33 q33Var = this.b;
        long[] jArr = q33Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = q33Var.b[i4];
                        List list = (List) q33Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((af2) list.get(i6)).cancel();
                        }
                        q33Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h() {
        z9.k("prefetchWindowStartExtraSpace", this.j);
        z9.k("prefetchWindowEndExtraSpace", this.k);
        z9.k("prefetchWindowStartIndex", this.h);
        z9.k("prefetchWindowEndIndex", this.i);
    }
}

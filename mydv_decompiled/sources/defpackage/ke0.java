package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ke0 {
    public static final ze3 a = new ze3("provider");
    public static final ze3 b = new ze3("provider");
    public static final ze3 c = new ze3("compositionLocalMap");
    public static final ze3 d = new ze3("providers");
    public static final ze3 e = new ze3("reference");

    public static final void a(String str) {
        throw new rd0(r7.C("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new rd0(r7.C("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [o91] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public static final q23 c(oj0 oj0Var, r23 r23Var, wr4 wr4Var, ap apVar) {
        r23 r23Var2;
        jp jpVar;
        tr4 tr4Var;
        ?? r9;
        bo1 bo1Var;
        long[] jArr;
        bo1 bo1Var2;
        jp jpVar2;
        tr4 tr4Var2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i4;
        long j2;
        long[] jArr4;
        int i5;
        int i6;
        jp jpVar3 = de0.a;
        tr4 tr4Var3 = new tr4();
        if (wr4Var.e != null) {
            tr4Var3.d();
        }
        if (wr4Var.f != null) {
            tr4Var3.S = new q33();
        }
        int i7 = wr4Var.t;
        if (apVar != null && wr4Var.E(i7) > 0) {
            int i8 = wr4Var.v;
            while (i8 > 0 && !wr4Var.x(i8)) {
                i8 = wr4Var.F(i8, wr4Var.b);
            }
            if (i8 >= 0 && wr4Var.x(i8)) {
                Object D = wr4Var.D(i8);
                int i9 = i8 + 1;
                int t = wr4Var.t(i8) + i8;
                int i10 = 0;
                while (i9 < t) {
                    int t2 = wr4Var.t(i9) + i9;
                    if (t2 > i7) {
                        break;
                    }
                    i10 += wr4Var.x(i9) ? 1 : wr4Var.E(i9);
                    i9 = t2;
                }
                int E = wr4Var.x(i7) ? 1 : wr4Var.E(i7);
                apVar.b(D);
                apVar.f(i10, E);
                apVar.g();
            }
        }
        bo1 a2 = r23Var.a();
        if (a2.a()) {
            oj0Var.getClass();
            we0 we0Var = (we0) oj0Var;
            if (we0Var.V.e > 0) {
                r9 = new ArrayList();
                n43 n43Var = we0Var.V;
                long[] jArr5 = n43Var.a;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr5[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j3 & 255) < 128) {
                                    int i15 = i12;
                                    int i16 = (i11 << 3) + i14;
                                    bo1Var2 = a2;
                                    Object obj = n43Var.b[i16];
                                    Object obj2 = n43Var.c[i16];
                                    obj.getClass();
                                    jArr2 = jArr5;
                                    if (obj2 instanceof o43) {
                                        o43 o43Var = (o43) obj2;
                                        Object[] objArr = o43Var.b;
                                        long[] jArr6 = o43Var.a;
                                        j = j3;
                                        int length2 = jArr6.length - 2;
                                        jpVar2 = jpVar3;
                                        tr4Var2 = tr4Var3;
                                        if (length2 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j4 = jArr6[i17];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j4 & 255) < 128) {
                                                            i4 = i19;
                                                            int i20 = (i17 << 3) + i4;
                                                            j2 = j4;
                                                            Object obj3 = objArr[i20];
                                                            x04 x04Var = (x04) obj;
                                                            jArr4 = jArr6;
                                                            bo1 bo1Var3 = x04Var.c;
                                                            if (bo1Var3 != null) {
                                                                bo1 i21 = ut0.i(bo1Var2);
                                                                i6 = i14;
                                                                bo1 i22 = ut0.i(bo1Var3);
                                                                int c2 = wr4Var.c(i21);
                                                                i5 = length;
                                                                int i23 = wr4Var.b[(c2 * 5) + 3] + c2;
                                                                int i24 = i22.a;
                                                                if (c2 <= i24 && i24 < i23) {
                                                                    r9.add(new uj3(x04Var, obj3));
                                                                    o43Var.m(i20);
                                                                }
                                                                j4 = j2 >> i15;
                                                                i19 = i4 + 1;
                                                                jArr6 = jArr4;
                                                                length = i5;
                                                                i14 = i6;
                                                            }
                                                        } else {
                                                            i4 = i19;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i5 = length;
                                                        i6 = i14;
                                                        j4 = j2 >> i15;
                                                        i19 = i4 + 1;
                                                        jArr6 = jArr4;
                                                        length = i5;
                                                        i14 = i6;
                                                    }
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                    if (i18 != i15) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                }
                                                if (i17 == length2) {
                                                    break;
                                                }
                                                i17++;
                                                jArr6 = jArr3;
                                                length = i;
                                                i14 = i2;
                                                i15 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i14;
                                        }
                                        z2 = o43Var.b();
                                    } else {
                                        jpVar2 = jpVar3;
                                        tr4Var2 = tr4Var3;
                                        i = length;
                                        j = j3;
                                        i2 = i14;
                                        obj2.getClass();
                                        x04 x04Var2 = (x04) obj;
                                        bo1 bo1Var4 = x04Var2.c;
                                        if (bo1Var4 != null) {
                                            bo1 i25 = ut0.i(bo1Var2);
                                            bo1 i26 = ut0.i(bo1Var4);
                                            int c3 = wr4Var.c(i25);
                                            int i27 = wr4Var.b[(c3 * 5) + 3] + c3;
                                            int i28 = i26.a;
                                            if (c3 <= i28 && i28 < i27) {
                                                r9.add(new uj3(x04Var2, obj2));
                                                z = true;
                                                z2 = z;
                                            }
                                        }
                                        z = false;
                                        z2 = z;
                                    }
                                    if (z2) {
                                        n43Var.l(i16);
                                    }
                                    i3 = 8;
                                } else {
                                    bo1Var2 = a2;
                                    jpVar2 = jpVar3;
                                    tr4Var2 = tr4Var3;
                                    jArr2 = jArr5;
                                    i = length;
                                    j = j3;
                                    i2 = i14;
                                    i3 = i12;
                                }
                                j3 = j >> i3;
                                i14 = i2 + 1;
                                i12 = i3;
                                a2 = bo1Var2;
                                jArr5 = jArr2;
                                jpVar3 = jpVar2;
                                tr4Var3 = tr4Var2;
                                length = i;
                            }
                            bo1Var = a2;
                            jpVar = jpVar3;
                            tr4Var = tr4Var3;
                            jArr = jArr5;
                            int i29 = length;
                            if (i13 != i12) {
                                break;
                            }
                            length = i29;
                        } else {
                            bo1Var = a2;
                            jpVar = jpVar3;
                            tr4Var = tr4Var3;
                            jArr = jArr5;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        a2 = bo1Var;
                        jArr5 = jArr;
                        jpVar3 = jpVar;
                        tr4Var3 = tr4Var;
                    }
                } else {
                    jpVar = jpVar3;
                    tr4Var = tr4Var3;
                }
            } else {
                jpVar = jpVar3;
                tr4Var = tr4Var3;
                r9 = o91.I;
            }
            r23Var2 = r23Var;
            r23Var2.f(o70.f1(r23Var.c(), r9));
        } else {
            r23Var2 = r23Var;
            jpVar = jpVar3;
            tr4Var = tr4Var3;
        }
        wr4 j5 = tr4Var.j();
        try {
            j5.d();
            jp jpVar4 = jpVar;
            j5.R(126665345, null, false, jpVar4);
            wr4.y(j5);
            j5.T(r23Var2.d());
            List C = wr4Var.C(ut0.i(r23Var2.a()), j5);
            j5.M();
            j5.i();
            j5.j();
            j5.e(true);
            tr4 tr4Var4 = tr4Var;
            q23 q23Var = new q23(tr4Var4);
            if (!C.isEmpty()) {
                int size = C.size();
                for (int i30 = 0; i30 < size; i30++) {
                    bo1 bo1Var5 = (bo1) C.get(i30);
                    if (tr4Var4.l(bo1Var5)) {
                        int c4 = tr4Var4.c(bo1Var5);
                        int d2 = vr4.d(c4, tr4Var4.I);
                        int i31 = c4 + 1;
                        if (((i31 < tr4Var4.J ? tr4Var4.I[(i31 * 5) + 4] : tr4Var4.K.length) - d2 > 0 ? tr4Var4.K[d2] : jpVar4) instanceof x04) {
                            je0 je0Var = new je0(oj0Var, r23Var2);
                            j5 = tr4Var4.j();
                            try {
                                vt0.e(j5, C, je0Var);
                                j5.e(true);
                                return q23Var;
                            } finally {
                            }
                        }
                    }
                }
            }
            return q23Var;
        } finally {
        }
    }
}

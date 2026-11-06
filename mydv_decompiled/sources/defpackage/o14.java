package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.extractor.ts.PsExtractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o14 {
    public final p22 a;
    public final AndroidComposeView b;
    public final tl c;
    public final f75 d;
    public final e43 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Object i;
    public long j;
    public final eq k;
    public final m43 l;

    public o14(q33 q33Var, AndroidComposeView androidComposeView) {
        this.a = q33Var;
        this.b = androidComposeView;
        tl tlVar = new tl();
        tlVar.b = new long[PsExtractor.AUDIO_STREAM];
        tlVar.c = new long[PsExtractor.AUDIO_STREAM];
        this.c = tlVar;
        this.d = new f75();
        this.e = new e43();
        this.j = -1L;
        this.k = new eq(this, (byte) 26);
        this.l = new m43();
    }

    public static boolean c(na3 na3Var) {
        mr1 mr1Var = na3Var.B0;
        return (mr1Var == null || sp0.X(mr1Var.b())) ? false : true;
    }

    public static long f(wa2 wa2Var) {
        ja3 ja3Var = wa2Var.n0;
        na3 na3Var = ja3Var.d;
        long j = 0;
        for (na3 na3Var2 = ja3Var.c; na3Var2 != null && na3Var2 != na3Var; na3Var2 = na3Var2.e0) {
            if (c(na3Var2)) {
                return 9223372034707292159L;
            }
            j = r22.c(j, na3Var2.n0);
        }
        return j;
    }

    public static void i(wa2 wa2Var) {
        if (!wa2Var.K || c(wa2Var.n0.d)) {
            return;
        }
        wa2Var.K = false;
        if (wa2Var.M) {
            wa2Var.L = f(wa2Var);
            wa2Var.M = false;
        }
        if (r22.a(wa2Var.L, 9223372034707292159L)) {
            return;
        }
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            i((wa2) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.a():void");
    }

    public final long b(wa2 wa2Var) {
        if (wa2Var.O == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.b)[d(wa2Var)];
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.wa2 r8) {
        /*
            r7 = this;
            int r0 = r8.O
            r1 = -4
            if (r0 != r1) goto L7
        L5:
            r0 = r1
            goto L3b
        L7:
            int r2 = r8.J
            tl r7 = r7.c
            java.lang.Object r3 = r7.b
            long[] r3 = (long[]) r3
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            if (r0 < 0) goto L25
            int r5 = r7.a
            int r5 = r5 + (-2)
            if (r0 >= r5) goto L25
            int r5 = r0 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            r6 = r2 & r4
            if (r5 != r6) goto L25
            goto L3b
        L25:
            r0 = r2 & r4
            int r7 = r7.a
            r2 = 0
        L2a:
            int r5 = r7 + (-2)
            if (r2 >= r5) goto L5
            int r5 = r2 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            if (r5 != r0) goto L38
            r0 = r2
            goto L3b
        L38:
            int r2 = r2 + 3
            goto L2a
        L3b:
            if (r0 == r1) goto L3e
            goto L56
        L3e:
            int r7 = r8.J
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutNode "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " not found in RectList"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            defpackage.q02.a(r7)
        L56:
            r8.O = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o14.d(wa2):int");
    }

    public final void e(wa2 wa2Var) {
        wa2Var.K = true;
        ja3 ja3Var = wa2Var.n0;
        na3 na3Var = ja3Var.d;
        tw2 tw2Var = wa2Var.o0.p;
        int V = tw2Var.V();
        float U = tw2Var.U();
        m43 m43Var = this.l;
        m43Var.a = 0.0f;
        m43Var.b = 0.0f;
        m43Var.c = V;
        m43Var.d = U;
        while (true) {
            if (na3Var == null) {
                break;
            }
            wa2 wa2Var2 = na3Var.c0;
            if (na3Var == wa2Var2.n0.d && !wa2Var2.K) {
                if (!r22.a(b(wa2Var2), 9223372034707292159L)) {
                    m43Var.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            mr1 mr1Var = na3Var.B0;
            if (mr1Var != null) {
                float[] b = mr1Var.b();
                if (!sp0.X(b)) {
                    nw2.c(b, m43Var);
                }
            }
            long j = na3Var.n0;
            m43Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            na3Var = na3Var.e0;
        }
        int i = (int) m43Var.a;
        int i2 = (int) m43Var.b;
        int i3 = (int) m43Var.c;
        int i4 = (int) m43Var.d;
        int i5 = wa2Var.J;
        int i6 = wa2Var.O;
        tl tlVar = this.c;
        if (i6 != -4) {
            int d = d(wa2Var);
            long[] jArr = (long[]) tlVar.b;
            jArr[d] = (i << 32) | (i2 & 4294967295L);
            jArr[d + 1] = (4294967295L & i4) | (i3 << 32);
            int i7 = d + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            wa2 v = wa2Var.v();
            wa2Var.O = tlVar.f(i5, i, i2, i3, i4, v != null ? v.J : -1, v != null ? d(v) : -4, ja3Var.c(1024), ja3Var.c(16), this.d.a.a(i5));
        }
        wa2Var.N = false;
        this.f = true;
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i8 = A.K;
        for (int i9 = 0; i9 < i8; i9++) {
            wa2 wa2Var3 = (wa2) objArr[i9];
            if (wa2Var3.L()) {
                e(wa2Var3);
            }
        }
    }

    public final void g(wa2 wa2Var) {
        long j;
        boolean L = wa2Var.L();
        ja3 ja3Var = wa2Var.n0;
        if (L && wa2Var.N) {
            wa2 v = wa2Var.v();
            if (v == null || v.K) {
                j = v == null ? 0L : 9223372034707292159L;
            } else {
                if (v.M) {
                    v.M = false;
                    v.L = f(v);
                }
                j = v.L;
            }
            na3 na3Var = ja3Var.d;
            if (r22.a(j, 9223372034707292159L) || c(na3Var)) {
                e(wa2Var);
            } else if (wa2Var.K) {
                e(wa2Var);
                i(wa2Var);
            } else {
                long c = r22.c(j, na3Var.n0);
                tw2 tw2Var = wa2Var.o0.p;
                int V = tw2Var.V();
                int U = tw2Var.U();
                int i = wa2Var.O;
                tl tlVar = this.c;
                if (i != -4) {
                    int d = d(wa2Var);
                    if (v != null) {
                        int d2 = d(v);
                        int i2 = (int) (c >> 32);
                        int i3 = (int) (c & 4294967295L);
                        long[] jArr = (long[]) tlVar.b;
                        long j2 = jArr[d2];
                        int i4 = ((int) (j2 >> 32)) + i2;
                        int i5 = ((int) j2) + i3;
                        int i6 = U + i5;
                        long j3 = jArr[d];
                        int i7 = i4 - ((int) (j3 >> 32));
                        int i8 = i5 - ((int) j3);
                        int i9 = d + 2;
                        long j4 = jArr[i9];
                        jArr[d] = (i5 & 4294967295L) | (i4 << 32);
                        jArr[d + 1] = ((V + i4) << 32) | (i6 & 4294967295L);
                        jArr[i9] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i7 != 0 || i8 != 0) {
                            tlVar.h(j4, d, i7, i8);
                        }
                    } else {
                        int d3 = d(wa2Var);
                        int i10 = (int) (c >> 32);
                        int i11 = (int) (c & 4294967295L);
                        long[] jArr2 = (long[]) tlVar.b;
                        long j5 = jArr2[d3];
                        jArr2[d3] = (i10 << 32) | (i11 & 4294967295L);
                        jArr2[d3 + 1] = ((U + i11) & 4294967295L) | ((V + i10) << 32);
                        int i12 = d3 + 2;
                        long j6 = jArr2[i12];
                        jArr2[i12] = (((j6 >> 63) & 1) << 60) | j6;
                        int i13 = i10 - ((int) (j5 >> 32));
                        int i14 = i11 - ((int) j5);
                        if (i13 != 0 || i14 != 0) {
                            tlVar.h(j6, d3, i13, i14);
                        }
                    }
                } else {
                    int i15 = wa2Var.J;
                    boolean c2 = ja3Var.c(1024);
                    boolean c3 = ja3Var.c(16);
                    boolean a = this.d.a.a(i15);
                    if (v != null) {
                        int i16 = v.J;
                        int d4 = d(v);
                        int i17 = (int) (c >> 32);
                        int i18 = (int) (c & 4294967295L);
                        int i19 = i15 & 33554431;
                        long[] jArr3 = (long[]) tlVar.b;
                        if ((((int) jArr3[d4 + 2]) & 33554431) != (33554431 & i16)) {
                            q02.a("Inserted child " + i19 + " without valid parent index or parent " + i16 + " not found");
                        }
                        long j7 = jArr3[d4];
                        int i20 = ((int) (j7 >> 32)) + i17;
                        int i21 = ((int) j7) + i18;
                        wa2Var.O = tlVar.f(i19, i20, i21, i20 + V, i21 + U, i16, d4, c2, c3, a);
                    } else {
                        int i22 = (int) (c >> 32);
                        int i23 = (int) (c & 4294967295L);
                        wa2Var.O = tlVar.f(i15, i22, i23, i22 + V, i23 + U, -1, -4, c2, c3, a);
                    }
                }
            }
            wa2Var.N = false;
            this.f = true;
            j();
        }
    }

    public final void h(wa2 wa2Var) {
        if (wa2Var.O != -4) {
            int d = d(wa2Var);
            long[] jArr = (long[]) this.c.b;
            jArr[d] = -1;
            jArr[d + 1] = -1;
            jArr[d + 2] = n14.a;
            wa2Var.O = -4;
            wa2Var.N = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        Object obj = this.i;
        boolean z = obj != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.b;
            if (obj != null) {
                androidComposeView.removeDelayedExecution(obj);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.j = max;
            this.i = androidComposeView.executeDelayed(max - currentTimeMillis, this.k);
        }
    }
}

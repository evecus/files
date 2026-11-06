package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zg2 implements gc4 {
    public static final da x = sp0.Z(new zw1((byte) 4), new c22((byte) 16));
    public boolean a;
    public sg2 b;
    public final vg2 c;
    public final jk3 d = new jk3(tg2.a, q8.v0);
    public final yv e = new yv((byte) 3);
    public final jk3 f;
    public final jk3 g;
    public wa2 h;
    public final td2 i;
    public final ks j;
    public final cy k;
    public final boolean l;
    public final bf2 m;
    public final qs0 n;
    public float o;
    public int p;
    public final q33 q;
    public final t33 r;
    public final ye2 s;
    public final ie2 t;
    public final t43 u;
    public final t43 v;
    public final g12 w;

    public zg2(int[] iArr, int[] iArr2) {
        this.c = new vg2(iArr, iArr2, new s62(2, this, zg2.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f = ad4.w(bool);
        this.g = ad4.w(bool);
        this.i = new td2(this, (byte) 2);
        this.j = new ks();
        this.k = new cy((byte) 1);
        this.l = true;
        this.m = new bf2(null);
        this.n = new qs0(new tf2(this, (byte) 3));
        this.p = -1;
        q33 q33Var = q22.a;
        this.q = new q33();
        this.r = new t33();
        this.s = new ye2();
        this.t = new ie2();
        this.u = vt0.m();
        this.v = vt0.m();
        this.w = new g12((byte) 19);
    }

    public static Object i(zg2 zg2Var, int i, k05 k05Var) {
        zg2Var.getClass();
        Object d = zg2Var.d(d53.I, new vd2(zg2Var, i, null, (byte) 1), k05Var);
        return d == el0.I ? d : wd5.a;
    }

    @Override // defpackage.gc4
    public final boolean a() {
        return this.n.a();
    }

    @Override // defpackage.gc4
    public final boolean b() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final boolean c() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.n.d(r7, r8, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.j.d(r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.d53 r7, defpackage.hn1 r8, defpackage.gj0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.yg2
            if (r0 == 0) goto L13
            r0 = r9
            yg2 r0 = (defpackage.yg2) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            yg2 r0 = new yg2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.K
            int r1 = r0.M
            r2 = 0
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.mu0.V(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L31:
            k05 r7 = r0.J
            r8 = r7
            hn1 r8 = (defpackage.hn1) r8
            d53 r7 = r0.I
            defpackage.mu0.V(r9)
            goto L5b
        L3c:
            defpackage.mu0.V(r9)
            jk3 r9 = r6.d
            java.lang.Object r9 = r9.getValue()
            sg2 r1 = defpackage.tg2.a
            if (r9 != r1) goto L5b
            r0.I = r7
            r9 = r8
            k05 r9 = (defpackage.k05) r9
            r0.J = r9
            r0.M = r4
            ks r9 = r6.j
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.I = r2
            r0.J = r2
            r0.M = r3
            qs0 r6 = r6.n
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg2.d(d53, hn1, gj0):java.lang.Object");
    }

    @Override // defpackage.gc4
    public final float e(float f) {
        return this.n.e(f);
    }

    public final void f(sg2 sg2Var, boolean z, boolean z2) {
        Object obj;
        ns4 i;
        tm1 e;
        ns4 j;
        vg2 vg2Var = this.c;
        g12 g12Var = this.w;
        if (!z && this.a) {
            this.b = sg2Var;
            i = o63.i();
            e = i != null ? i.e() : null;
            j = o63.j(i);
            try {
                if (g12Var.B() && Arrays.equals(sg2Var.a, vg2Var.b) && Arrays.equals(sg2Var.b, vg2Var.d)) {
                    g12Var.U();
                }
                return;
            } finally {
            }
        }
        if (z) {
            this.a = true;
        }
        float f = this.o;
        float f2 = sg2Var.c;
        List list = sg2Var.m;
        int[] iArr = sg2Var.a;
        int[] iArr2 = sg2Var.b;
        this.o = f - f2;
        this.d.setValue(sg2Var);
        if (z2) {
            vg2Var.d = iArr2;
            vg2Var.e.i(vg2.b(vg2Var.b, iArr2));
        } else {
            vg2Var.getClass();
            int a = vg2.a(iArr);
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((ug2) obj).a == a) {
                    break;
                } else {
                    i2++;
                }
            }
            ug2 ug2Var = (ug2) obj;
            vg2Var.g = ug2Var != null ? ug2Var.b : null;
            vg2Var.h.c(a);
            if (vg2Var.f || sg2Var.l > 0) {
                vg2Var.f = true;
                i = o63.i();
                e = i != null ? i.e() : null;
                j = o63.j(i);
                try {
                    vg2Var.b = iArr;
                    vg2Var.c.i(vg2.a(iArr));
                    vg2Var.d = iArr2;
                    vg2Var.e.i(vg2.b(iArr, iArr2));
                } finally {
                }
            }
            if (this.p != -1 && !list.isEmpty()) {
                int i3 = ((ug2) o70.T0(list)).a;
                int i4 = ((ug2) o70.a1(list)).a;
                int i5 = this.p;
                if (i3 > i5 || i5 > i4) {
                    this.p = -1;
                    q33 q33Var = this.q;
                    Object[] objArr = q33Var.c;
                    long[] jArr = q33Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((af2) objArr[(i6 << 3) + i8]).cancel();
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                            }
                            if (i6 == length) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    q33Var.c();
                }
            }
        }
        this.g.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.f.setValue(Boolean.valueOf(sg2Var.f));
        if (z) {
            g12Var.Z(sg2Var.e, sg2Var.k, sg2Var.t);
        }
    }

    public final sg2 g() {
        return (sg2) this.d.getValue();
    }

    public final void h(float f, sg2 sg2Var) {
        q33 q33Var;
        int g;
        int i;
        long h;
        if (!this.l || sg2Var.m.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List list = sg2Var.m;
        int i2 = z ? ((ug2) o70.a1(list)).a : ((ug2) o70.T0(list)).a;
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        int[] iArr = y22.a;
        r33 r33Var = new r33();
        pd2 pd2Var = sg2Var.i;
        int[] iArr2 = pd2Var.b;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            q33Var = this.q;
            if (i3 >= length) {
                break;
            }
            yv yvVar = this.e;
            if (z) {
                g = i2 + 1;
                int length2 = yvVar.a + ((int[]) yvVar.b).length;
                while (true) {
                    if (g >= length2) {
                        g = yvVar.a + ((int[]) yvVar.b).length;
                        break;
                    } else if (yvVar.b(g, i3)) {
                        break;
                    } else {
                        g++;
                    }
                }
            } else {
                g = yvVar.g(i2, i3);
            }
            int i4 = g;
            if (i4 < 0 || i4 >= sg2Var.l || r33Var.c(i4)) {
                break;
            }
            r33Var.b[r33Var.d(i4)] = i4;
            if (!q33Var.a(i4)) {
                boolean C = sg2Var.j.C(i4);
                int i5 = C ? 0 : i3;
                int i6 = C ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = pd2Var.a;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (sg2Var.u == pg3.I) {
                    if (i < 0) {
                        s02.a("width must be >= 0");
                    }
                    h = eh0.h(i, i, 0, Log.LOG_LEVEL_OFF);
                } else {
                    if (i < 0) {
                        s02.a("height must be >= 0");
                    }
                    h = eh0.h(0, Log.LOG_LEVEL_OFF, i, i);
                }
                q33Var.i(i4, this.m.a(i4, h, true, null));
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = q33Var.a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = q33Var.b[i12];
                        af2 af2Var = (af2) q33Var.c[i12];
                        boolean c = r33Var.c(i13);
                        if (!c) {
                            af2Var.cancel();
                        }
                        if (!c) {
                            q33Var.h(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class s43 extends ns4 {
    public static final int[] n = new int[0];
    public final tm1 e;
    public final tm1 f;
    public int g;
    public o43 h;
    public ArrayList i;
    public us4 j;
    public int[] k;
    public int l;
    public boolean m;

    public s43(long j, us4 us4Var, tm1 tm1Var, tm1 tm1Var2) {
        super(j, us4Var);
        this.e = tm1Var;
        this.f = tm1Var2;
        this.j = us4.M;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ws4.c) {
            this.j = this.j.h(j);
        }
    }

    public final void B(us4 us4Var) {
        synchronized (ws4.c) {
            this.j = this.j.f(us4Var);
        }
    }

    public void C(o43 o43Var) {
        this.h = o43Var;
    }

    public s43 D(tm1 tm1Var, tm1 tm1Var2) {
        y83 y83Var;
        if (this.c) {
            jr3.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            jr3.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ws4.c;
        synchronized (obj) {
            long j = ws4.e;
            ws4.e = j + 1;
            ws4.d = ws4.d.h(j);
            us4 d = d();
            r(d.h(j));
            y83Var = new y83(j, ws4.a(d, g() + 1, j), ws4.i(tm1Var, e(), true), ws4.j(tm1Var2, i()), this);
        }
        if (this.m || this.c) {
            return y83Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = ws4.e;
            ws4.e = j2 + 1;
            s(j2);
            ws4.d = ws4.d.h(g());
        }
        r(ws4.a(d(), g + 1, g()));
        return y83Var;
    }

    @Override // defpackage.ns4
    public final void b() {
        ws4.d = ws4.d.d(g()).c(this.j);
    }

    @Override // defpackage.ns4
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ws4.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ns4
    public int h() {
        return this.g;
    }

    @Override // defpackage.ns4
    public tm1 i() {
        return this.f;
    }

    @Override // defpackage.ns4
    public void k() {
        this.l++;
    }

    @Override // defpackage.ns4
    public void l() {
        if (this.l <= 0) {
            jr3.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        o43 x = x();
        if (x != null) {
            if (this.m) {
                jr3.b("Unsupported operation on a snapshot that has been applied");
            }
            C(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (mw4 c = ((kw4) objArr[(i2 << 3) + i4]).c(); c != null; c = c.b) {
                                    long j2 = c.a;
                                    if (j2 == g || o70.O0(this.j, Long.valueOf(j2))) {
                                        ba4 ba4Var = ws4.a;
                                        c.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.ns4
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ns4
    public void n(kw4 kw4Var) {
        o43 x = x();
        if (x == null) {
            o43 o43Var = ka4.a;
            x = new o43();
            C(x);
        }
        x.d(kw4Var);
    }

    @Override // defpackage.ns4
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ws4.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ns4
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ns4
    public ns4 u(tm1 tm1Var) {
        z83 z83Var;
        if (this.c) {
            jr3.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            jr3.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = ws4.c;
        synchronized (obj) {
            long j = ws4.e;
            ws4.e = j + 1;
            ws4.d = ws4.d.h(j);
            z83Var = new z83(j, ws4.a(d(), g + 1, j), ws4.i(tm1Var, e(), true), this);
        }
        if (this.m || this.c) {
            return z83Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = ws4.e;
            ws4.e = j2 + 1;
            s(j2);
            ws4.d = ws4.d.h(g());
        }
        r(ws4.a(d(), g2 + 1, g()));
        return z83Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (ws4.c) {
            long j = ws4.e;
            ws4.e = j + 1;
            s(j);
            ws4.d = ws4.d.h(g());
        }
        r(ws4.a(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.wi4 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s43.w():wi4");
    }

    public o43 x() {
        return this.h;
    }

    @Override // defpackage.ns4
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public tm1 e() {
        return this.e;
    }

    public final wi4 z(long j, o43 o43Var, HashMap hashMap, us4 us4Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        us4 us4Var2;
        Object[] objArr;
        long[] jArr;
        us4 us4Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        mw4 d;
        us4 f = d().h(g()).f(this.j);
        Object[] objArr3 = o43Var.b;
        long[] jArr3 = o43Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            kw4 kw4Var = (kw4) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            mw4 c = kw4Var.c();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            mw4 s = ws4.s(c, j, us4Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                mw4 s2 = ws4.s(c, g(), f);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    us4Var3 = f;
                                    mw4 s3 = ws4.s(c, g(), d());
                                    if (s3 == null) {
                                        ws4.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (d = (mw4) hashMap.get(s)) == null) {
                                        d = kw4Var.d(s2, s, s3);
                                    }
                                    if (d == null) {
                                        return new ps4(this);
                                    }
                                    if (!d.equals(s3)) {
                                        if (d.equals(s)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new uj3(kw4Var, s.b(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(kw4Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!d.equals(s2) ? new uj3(kw4Var, d) : new uj3(kw4Var, s2.b(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            us4Var3 = f;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            us4Var3 = f;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        f = us4Var3;
                    }
                    us4Var2 = f;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    us4Var2 = f;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                f = us4Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                uj3 uj3Var = (uj3) arrayList3.get(i5);
                kw4 kw4Var2 = (kw4) uj3Var.I;
                mw4 mw4Var = (mw4) uj3Var.J;
                mw4Var.a = j;
                synchronized (ws4.c) {
                    mw4Var.b = kw4Var2.c();
                    kw4Var2.e(mw4Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                o43Var.l((kw4) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = o70.f1(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return qs4.f;
    }
}

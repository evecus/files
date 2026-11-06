package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jk2 implements uw2 {
    public final /* synthetic */ byte a;
    public final Object b;

    public jk2(qr4 qr4Var, t43 t43Var) {
        this.a = (byte) 2;
        this.b = qr4Var;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        switch (this.a) {
        }
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        switch (this.a) {
        }
        return i82.m(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        int i;
        final int i2;
        int i3;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        boolean z = true;
        p91 p91Var = p91.I;
        switch (b) {
            case 0:
                return ww2Var.A(dh0.h(j), dh0.g(j), p91Var, new be(list, this, (byte) 22));
            case 1:
                list.getClass();
                final int h = dh0.h(j);
                final int g = dh0.g(j);
                final int X = ww2Var.X(24.0f);
                final int X2 = ww2Var.X(16.0f);
                long b2 = eh0.b(0, 0, 0, 0, 15);
                final bn3 u = ((pw2) list.get(0)).u(b2);
                final bn3 u2 = ((pw2) list.get(2)).u(b2);
                int i5 = (((h - (X * 2)) - (X2 * 2)) - u.I) - u2.I;
                if (i5 < 0) {
                    i5 = 0;
                }
                pw2 pw2Var = (pw2) list.get(1);
                int X3 = ww2Var.X(24.0f);
                if (!((X3 >= 0) & (i5 >= 0))) {
                    s02.a("width and height must be >= 0");
                }
                final bn3 u3 = pw2Var.u(eh0.h(i5, i5, X3, X3));
                final bn3 u4 = ((pw2) list.get(3)).u(b2);
                final rm1 rm1Var = (rm1) obj;
                final int i6 = i5;
                return ww2Var.A(h, g, p91Var, new tm1() { // from class: gm5
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj2) {
                        an3 an3Var = (an3) obj2;
                        an3Var.getClass();
                        bn3 bn3Var = bn3.this;
                        int i7 = bn3Var.J;
                        int i8 = g;
                        int i9 = X;
                        an3.i(an3Var, bn3Var, i9, (i8 - i7) / 2);
                        int i10 = bn3Var.I + i9 + X2;
                        bn3 bn3Var2 = u3;
                        an3.i(an3Var, bn3Var2, i10, (i8 - bn3Var2.J) / 2);
                        int i11 = h;
                        bn3 bn3Var3 = u2;
                        an3.i(an3Var, bn3Var3, (i11 - i9) - bn3Var3.I, (i8 - bn3Var3.J) / 2);
                        bn3 bn3Var4 = u4;
                        if (bn3Var4.I > 0 && bn3Var4.J > 0) {
                            float floatValue = (((Number) rm1Var.invoke()).floatValue() * i6) + i10;
                            int i12 = bn3Var4.I;
                            int i13 = i11 - i12;
                            if (i13 < 0) {
                                i13 = 0;
                            }
                            an3.i(an3Var, bn3Var4, ut0.r(mw2.P(floatValue - (i12 / 2.0f)), 0, i13), (-bn3Var4.J) - r7.b(12.0f, an3Var));
                        }
                        return wd5.a;
                    }
                });
            default:
                qr4 qr4Var = (qr4) obj;
                byte b3 = qr4Var.a;
                float[] fArr = qr4Var.g;
                int size = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        pw2 pw2Var2 = (pw2) list.get(i7);
                        if (qg5.T(pw2Var2) == zq4.I) {
                            final bn3 u5 = pw2Var2.u(j);
                            int size2 = list.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                pw2 pw2Var3 = (pw2) list.get(i8);
                                if (qg5.T(pw2Var3) == zq4.J) {
                                    bn3 u6 = qr4Var.c() ? pw2Var3.u(dh0.a(eh0.j(j, 0, -u5.J, 1), 0, 0, 0, 0, 14)) : pw2Var3.u(dh0.a(eh0.j(j, -u5.I, 0, 2), 0, 0, 0, 0, 11));
                                    final p24 p24Var = new p24();
                                    final p24 p24Var2 = new p24();
                                    float b4 = qr4Var.b();
                                    fArr.getClass();
                                    if (!j42.b(b4, fArr.length == 0 ? null : Float.valueOf(fArr[0])) && !j42.b(b4, dq.i1(fArr))) {
                                        z = false;
                                    }
                                    int R = u6.R(or4.a);
                                    int i9 = R != Integer.MIN_VALUE ? R : 0;
                                    int i10 = u5.I;
                                    int i11 = u5.J;
                                    boolean c = qr4Var.c();
                                    int i12 = u6.I;
                                    int i13 = u6.J;
                                    if (c) {
                                        i3 = Math.max(i12, i10);
                                        i4 = i11 + i13;
                                        i = (i3 - u6.I) / 2;
                                        int i14 = i11 / 2;
                                        p24Var.I = (i3 - u5.I) / 2;
                                        p24Var2.I = (i14 - (u5.J / 2)) + ((b3 <= 0 || z) ? mw2.P(i13 * b4) : mw2.P((i13 - (i9 * 2)) * b4) + i9);
                                        i2 = i14;
                                    } else {
                                        int i15 = i10 + i12;
                                        int max = Math.max(i13, i11);
                                        i = i10 / 2;
                                        int i16 = (max - u6.J) / 2;
                                        p24Var.I = (((b3 <= 0 || z) ? mw2.P(u6.I * b4) : mw2.P((u6.I - (i9 * 2)) * b4) + i9) + i) - (u5.I / 2);
                                        p24Var2.I = (max - u5.J) / 2;
                                        i2 = i16;
                                        i3 = i15;
                                        i4 = max;
                                    }
                                    final int i17 = i;
                                    qr4Var.h.i(i3);
                                    qr4Var.i.i(i4);
                                    final bn3 bn3Var = u6;
                                    return ww2Var.A(i3, i4, p91Var, new tm1() { // from class: lr4
                                        @Override // defpackage.tm1
                                        public final Object invoke(Object obj2) {
                                            an3 an3Var = (an3) obj2;
                                            an3.i(an3Var, bn3.this, i17, i2);
                                            an3.i(an3Var, u5, p24Var.I, p24Var2.I);
                                            return wd5.a;
                                        }
                                    });
                                }
                            }
                            dl2.b("Collection contains no element matching the predicate.");
                            zy.n();
                        } else {
                            i7++;
                        }
                    } else {
                        dl2.b("Collection contains no element matching the predicate.");
                        zy.n();
                    }
                }
                return null;
        }
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        switch (this.a) {
        }
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        switch (this.a) {
        }
        return i82.s(this, b42Var, list, i);
    }

    public /* synthetic */ jk2(rm1 rm1Var, byte b) {
        this.a = b;
        this.b = rm1Var;
    }
}

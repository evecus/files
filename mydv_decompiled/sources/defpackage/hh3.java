package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hh3 implements uw2 {
    public final tm1 a;
    public final boolean b;
    public final c45 c;
    public final c45 d;
    public final c45 e;
    public final ji3 f;
    public final float g;

    public hh3(tm1 tm1Var, boolean z, f45 f45Var, c45 c45Var, c45 c45Var2, c45 c45Var3, ji3 ji3Var, float f) {
        this.a = tm1Var;
        this.b = z;
        this.c = c45Var;
        this.d = c45Var2;
        this.e = c45Var3;
        this.f = ji3Var;
        this.g = f;
    }

    public static final int e(int i, hh3 hh3Var, int i2, int i3, bn3 bn3Var, bn3 bn3Var2) {
        if (hh3Var.b) {
            i3 = Math.round(((i2 - bn3Var2.J) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (bn3Var != null ? bn3Var.J : 0) / 2);
    }

    public final int a(iu0 iu0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int N = j42.N(i5, i7, i3, i4, vt0.H(f, i6, 0));
        ji3 ji3Var = this.f;
        float P = iu0Var.P(ji3Var.d());
        return eh0.f(Math.max(i, Math.max(i2, mw2.P(vt0.G(P, Math.max(P, i6 / 2.0f), f) + N + iu0Var.P(ji3Var.a())))) + i8, j);
    }

    public final int b(iu0 iu0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, vt0.H(f, i6, 0))) + i + i2;
        ji3 ji3Var = this.f;
        da2 da2Var = da2.I;
        return eh0.g(Math.max(max, mw2.P((i6 + iu0Var.P(ji3Var.c(da2Var) + ji3Var.b(da2Var))) * f)), j);
    }

    public final int c(b42 b42Var, List list, int i, hn1 hn1Var) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        Object obj6;
        Object obj7;
        hh3 hh3Var = this;
        float a = hh3Var.c.a();
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (j42.c(c21.y((a42) obj), "Leading")) {
                break;
            }
            i7++;
        }
        a42 a42Var = (a42) obj;
        if (a42Var != null) {
            i2 = c21.I(i, a42Var.t(Log.LOG_LEVEL_OFF));
            i3 = ((Number) hn1Var.invoke(a42Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (j42.c(c21.y((a42) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        a42 a42Var2 = (a42) obj2;
        if (a42Var2 != null) {
            i2 = c21.I(i2, a42Var2.t(Log.LOG_LEVEL_OFF));
            i4 = ((Number) hn1Var.invoke(a42Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (j42.c(c21.y((a42) obj3), "Label")) {
                break;
            }
            i9++;
        }
        Object obj8 = (a42) obj3;
        int intValue = obj8 != null ? ((Number) hn1Var.invoke(obj8, Integer.valueOf(vt0.H(a, i2, i)))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (j42.c(c21.y((a42) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        a42 a42Var3 = (a42) obj4;
        if (a42Var3 != null) {
            i5 = ((Number) hn1Var.invoke(a42Var3, Integer.valueOf(i2))).intValue();
            i2 = c21.I(i2, a42Var3.t(Log.LOG_LEVEL_OFF));
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (j42.c(c21.y((a42) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        a42 a42Var4 = (a42) obj5;
        if (a42Var4 != null) {
            i6 = ((Number) hn1Var.invoke(a42Var4, Integer.valueOf(i2))).intValue();
            i2 = c21.I(i2, a42Var4.t(Log.LOG_LEVEL_OFF));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        int i12 = 0;
        while (i12 < size6) {
            Object obj9 = list.get(i12);
            if (j42.c(c21.y((a42) obj9), "TextField")) {
                int intValue2 = ((Number) hn1Var.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (j42.c(c21.y((a42) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                Object obj10 = (a42) obj6;
                int intValue3 = obj10 != null ? ((Number) hn1Var.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (j42.c(c21.y((a42) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                Object obj11 = (a42) obj7;
                return hh3Var.a(b42Var, i3, i4, i5, i6, intValue2, intValue, intValue3, obj11 != null ? ((Number) hn1Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, eh0.b(0, 0, 0, 0, 15), a);
            }
            i12++;
            i6 = i6;
            hh3Var = this;
            i5 = i5;
        }
        dl2.b("Collection contains no element matching the predicate.");
        zy.n();
        return 0;
    }

    public final int d(b42 b42Var, List list, int i, hn1 hn1Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (j42.c(c21.y((a42) obj7), "TextField")) {
                int intValue = ((Number) hn1Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (j42.c(c21.y((a42) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                a42 a42Var = (a42) obj2;
                int intValue2 = a42Var != null ? ((Number) hn1Var.invoke(a42Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (j42.c(c21.y((a42) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                a42 a42Var2 = (a42) obj3;
                int intValue3 = a42Var2 != null ? ((Number) hn1Var.invoke(a42Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (j42.c(c21.y((a42) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                a42 a42Var3 = (a42) obj4;
                int intValue4 = a42Var3 != null ? ((Number) hn1Var.invoke(a42Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (j42.c(c21.y((a42) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                a42 a42Var4 = (a42) obj5;
                int intValue5 = a42Var4 != null ? ((Number) hn1Var.invoke(a42Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (j42.c(c21.y((a42) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                a42 a42Var5 = (a42) obj6;
                int intValue6 = a42Var5 != null ? ((Number) hn1Var.invoke(a42Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (j42.c(c21.y((a42) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                a42 a42Var6 = (a42) obj;
                return b(b42Var, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, a42Var6 != null ? ((Number) hn1Var.invoke(a42Var6, Integer.valueOf(i))).intValue() : 0, eh0.b(0, 0, 0, 0, 15), this.c.a());
            }
        }
        dl2.b("Collection contains no element matching the predicate.");
        zy.n();
        return 0;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return c(b42Var, list, i, new zw1((byte) 20));
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        return d(b42Var, list, i, new zw1((byte) 18));
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(final ww2 ww2Var, List list, long j) {
        Object obj;
        Object obj2;
        bn3 bn3Var;
        int i;
        bn3 bn3Var2;
        Object obj3;
        bn3 bn3Var3;
        int i2;
        bn3 bn3Var4;
        Object obj4;
        bn3 bn3Var5;
        int i3;
        bn3 bn3Var6;
        Object obj5;
        long j2;
        Object obj6;
        Object obj7;
        bn3 bn3Var7;
        int i4;
        r24 r24Var;
        int i5;
        r24 r24Var2;
        bn3 bn3Var8;
        int i6;
        long j3;
        int i7;
        bn3 bn3Var9;
        bn3 bn3Var10;
        int i8;
        bn3 bn3Var11;
        pw2 pw2Var;
        hh3 hh3Var;
        ww2 ww2Var2;
        bn3 bn3Var12;
        int i9;
        bn3 bn3Var13;
        bn3 bn3Var14;
        int i10;
        int i11;
        int i12;
        r24 r24Var3;
        int i13;
        hh3 hh3Var2;
        bn3 bn3Var15;
        bn3 bn3Var16;
        int i14;
        bn3 bn3Var17;
        int i15;
        ww2 ww2Var3;
        float f;
        List list2 = list;
        float a = this.c.a();
        ji3 ji3Var = this.f;
        int X = ww2Var.X(ji3Var.a());
        long a2 = dh0.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i16);
            if (j42.c(qg5.T((pw2) obj), "Leading")) {
                break;
            }
            i16++;
        }
        pw2 pw2Var2 = (pw2) obj;
        bn3 u = pw2Var2 != null ? pw2Var2.u(a2) : null;
        int i17 = u != null ? u.I : 0;
        int max = Math.max(0, u != null ? u.J : 0);
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i18);
            if (j42.c(qg5.T((pw2) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        pw2 pw2Var3 = (pw2) obj2;
        if (pw2Var3 != null) {
            bn3Var = u;
            i = i17;
            bn3Var2 = pw2Var3.u(eh0.j(a2, -i17, 0, 2));
        } else {
            bn3Var = u;
            i = i17;
            bn3Var2 = null;
        }
        int i19 = i + (bn3Var2 != null ? bn3Var2.I : 0);
        int max2 = Math.max(max, bn3Var2 != null ? bn3Var2.J : 0);
        int size3 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i20);
            int i21 = size3;
            if (j42.c(qg5.T((pw2) obj3), "Prefix")) {
                break;
            }
            i20++;
            size3 = i21;
        }
        pw2 pw2Var4 = (pw2) obj3;
        if (pw2Var4 != null) {
            bn3Var3 = bn3Var2;
            i2 = i19;
            bn3Var4 = pw2Var4.u(eh0.j(a2, -i19, 0, 2));
        } else {
            bn3Var3 = bn3Var2;
            i2 = i19;
            bn3Var4 = null;
        }
        int i22 = i2 + (bn3Var4 != null ? bn3Var4.I : 0);
        int max3 = Math.max(max2, bn3Var4 != null ? bn3Var4.J : 0);
        int size4 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i23);
            int i24 = size4;
            if (j42.c(qg5.T((pw2) obj4), "Suffix")) {
                break;
            }
            i23++;
            size4 = i24;
        }
        pw2 pw2Var5 = (pw2) obj4;
        if (pw2Var5 != null) {
            bn3Var5 = bn3Var4;
            i3 = i22;
            bn3Var6 = pw2Var5.u(eh0.j(a2, -i22, 0, 2));
        } else {
            bn3Var5 = bn3Var4;
            i3 = i22;
            bn3Var6 = null;
        }
        int i25 = i3 + (bn3Var6 != null ? bn3Var6.I : 0);
        int max4 = Math.max(max3, bn3Var6 != null ? bn3Var6.J : 0);
        int size5 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i26);
            int i27 = size5;
            if (j42.c(qg5.T((pw2) obj5), "Label")) {
                break;
            }
            i26++;
            size5 = i27;
        }
        pw2 pw2Var6 = (pw2) obj5;
        r24 r24Var4 = new r24();
        int X2 = ww2Var.X(ji3Var.c(ww2Var.getLayoutDirection())) + ww2Var.X(ji3Var.b(ww2Var.getLayoutDirection()));
        int i28 = -vt0.H(a, i25 + X2, X2);
        int i29 = -X;
        bn3 u2 = pw2Var6 != null ? pw2Var6.u(eh0.i(i28, i29, a2)) : null;
        r24Var4.I = u2;
        if (u2 != null) {
            float f2 = u2.I;
            j2 = (Float.floatToRawIntBits(u2.J) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        } else {
            j2 = 0;
        }
        this.a.invoke(new fq4(j2));
        int size6 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i30);
            if (j42.c(qg5.T((pw2) obj6), "Supporting")) {
                break;
            }
            i30++;
        }
        pw2 pw2Var7 = (pw2) obj6;
        int Q = pw2Var7 != null ? pw2Var7.Q(dh0.j(j)) : 0;
        bn3 bn3Var18 = (bn3) r24Var4.I;
        int max5 = Math.max((bn3Var18 != null ? bn3Var18.J : 0) / 2, ww2Var.X(ji3Var.d()));
        long j4 = j;
        long i31 = eh0.i(-i25, (i29 - max5) - Q, j4);
        pw2 pw2Var8 = pw2Var7;
        long a3 = dh0.a(i31, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i32 = 0;
        while (i32 < size7) {
            pw2 pw2Var9 = pw2Var8;
            pw2 pw2Var10 = (pw2) list2.get(i32);
            int i33 = max5;
            int i34 = size7;
            if (j42.c(qg5.T(pw2Var10), "TextField")) {
                bn3 u3 = pw2Var10.u(a3);
                long a4 = dh0.a(a3, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i35 = 0;
                while (true) {
                    if (i35 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i35);
                    int i36 = size8;
                    if (j42.c(qg5.T((pw2) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i35++;
                    size8 = i36;
                }
                pw2 pw2Var11 = (pw2) obj7;
                bn3 u4 = pw2Var11 != null ? pw2Var11.u(a4) : null;
                int max6 = Math.max(max4, Math.max(u3.J, u4 != null ? u4.J : 0) + i33 + X);
                int i37 = bn3Var != null ? bn3Var.I : 0;
                bn3 bn3Var19 = bn3Var3;
                int i38 = bn3Var3 != null ? bn3Var19.I : 0;
                bn3 bn3Var20 = bn3Var5;
                int i39 = bn3Var5 != null ? bn3Var20.I : 0;
                if (bn3Var6 != null) {
                    i4 = bn3Var6.I;
                    bn3Var7 = bn3Var19;
                } else {
                    bn3Var7 = bn3Var19;
                    i4 = 0;
                }
                int i40 = u3.I;
                bn3 bn3Var21 = bn3Var7;
                bn3 bn3Var22 = (bn3) r24Var4.I;
                if (bn3Var22 != null) {
                    i5 = bn3Var22.I;
                    r24Var = r24Var4;
                } else {
                    r24Var = r24Var4;
                    i5 = 0;
                }
                if (u4 != null) {
                    bn3Var8 = u3;
                    i6 = i37;
                    r24Var2 = r24Var;
                    j3 = j4;
                    i7 = u4.I;
                    bn3Var9 = u4;
                    bn3Var10 = bn3Var6;
                    i8 = i39;
                    bn3Var11 = bn3Var20;
                    pw2Var = pw2Var9;
                    hh3Var = this;
                    bn3Var12 = bn3Var;
                    i9 = max6;
                    bn3Var13 = bn3Var21;
                    ww2Var2 = ww2Var;
                } else {
                    r24Var2 = r24Var;
                    bn3Var8 = u3;
                    i6 = i37;
                    j3 = j4;
                    i7 = 0;
                    bn3Var9 = u4;
                    bn3Var10 = bn3Var6;
                    i8 = i39;
                    bn3Var11 = bn3Var20;
                    pw2Var = pw2Var9;
                    hh3Var = this;
                    ww2Var2 = ww2Var;
                    bn3Var12 = bn3Var;
                    i9 = max6;
                    bn3Var13 = bn3Var21;
                }
                final int b = hh3Var.b(ww2Var2, i6, i38, i8, i4, i40, i5, i7, j3, a);
                bn3 u5 = pw2Var != null ? pw2Var.u(dh0.a(eh0.j(a2, 0, -i9, 1), 0, b, 0, 0, 9)) : null;
                int i41 = u5 != null ? u5.J : 0;
                bn3 bn3Var23 = bn3Var12;
                int i42 = bn3Var12 != null ? bn3Var23.J : 0;
                final bn3 bn3Var24 = bn3Var13;
                int i43 = bn3Var13 != null ? bn3Var24.J : 0;
                bn3 bn3Var25 = bn3Var11;
                int i44 = bn3Var25 != null ? bn3Var25.J : 0;
                bn3 bn3Var26 = bn3Var10;
                int i45 = bn3Var26 != null ? bn3Var26.J : 0;
                bn3 bn3Var27 = bn3Var8;
                int i46 = bn3Var27.J;
                r24 r24Var5 = r24Var2;
                bn3 bn3Var28 = (bn3) r24Var5.I;
                int i47 = bn3Var28 != null ? bn3Var28.J : 0;
                int i48 = i41;
                final bn3 bn3Var29 = bn3Var9;
                if (bn3Var29 != null) {
                    bn3Var14 = bn3Var26;
                    i10 = i45;
                    i11 = i46;
                    i12 = bn3Var29.J;
                } else {
                    bn3Var14 = bn3Var26;
                    i10 = i45;
                    i11 = i46;
                    i12 = 0;
                }
                if (u5 != null) {
                    r24Var3 = r24Var5;
                    i13 = u5.J;
                    bn3Var15 = bn3Var25;
                    bn3Var16 = bn3Var27;
                    i14 = i47;
                    bn3Var17 = bn3Var23;
                    i15 = 0;
                    ww2Var3 = ww2Var;
                    f = a;
                    hh3Var2 = this;
                } else {
                    r24Var3 = r24Var5;
                    i13 = 0;
                    hh3Var2 = this;
                    bn3Var15 = bn3Var25;
                    bn3Var16 = bn3Var27;
                    i14 = i47;
                    bn3Var17 = bn3Var23;
                    i15 = 0;
                    ww2Var3 = ww2Var;
                    f = a;
                }
                final int a5 = hh3Var2.a(ww2Var3, i42, i43, i44, i10, i11, i14, i12, i13, j, f);
                final float f3 = f;
                int i49 = a5 - i48;
                int size9 = list.size();
                int i50 = i15;
                while (i50 < size9) {
                    pw2 pw2Var12 = (pw2) list.get(i50);
                    if (j42.c(qg5.T(pw2Var12), "Container")) {
                        final bn3 u6 = pw2Var12.u(eh0.a(b != Integer.MAX_VALUE ? b : i15, b, i49 != Integer.MAX_VALUE ? i49 : i15, i49));
                        final bn3 bn3Var30 = bn3Var17;
                        final bn3 bn3Var31 = bn3Var15;
                        final bn3 bn3Var32 = bn3Var14;
                        final r24 r24Var6 = r24Var3;
                        final bn3 bn3Var33 = bn3Var16;
                        final bn3 bn3Var34 = u5;
                        return ww2Var.A(b, a5, p91.I, new tm1() { // from class: fh3
                            @Override // defpackage.tm1
                            public final Object invoke(Object obj9) {
                                hh3 hh3Var3;
                                int i51;
                                int i52;
                                int i53;
                                int i54;
                                hh3 hh3Var4;
                                int i55;
                                int i56;
                                bn3 bn3Var35;
                                int i57;
                                float f4;
                                float f5;
                                float f6;
                                an3 an3Var = (an3) obj9;
                                bn3 bn3Var36 = (bn3) r24Var6.I;
                                hh3 hh3Var5 = hh3.this;
                                final c45 c45Var = hh3Var5.d;
                                final c45 c45Var2 = hh3Var5.e;
                                float density = an3Var.getDensity();
                                da2 layoutDirection = ww2Var.getLayoutDirection();
                                float density2 = an3Var.getDensity() * hh3Var5.g;
                                ji3 ji3Var2 = hh3Var5.f;
                                an3.g(an3Var, u6, 0, 0);
                                bn3 bn3Var37 = bn3Var34;
                                int i58 = a5 - (bn3Var37 != null ? bn3Var37.J : 0);
                                int P = mw2.P(ji3Var2.d() * density);
                                bn3 bn3Var38 = bn3Var30;
                                if (bn3Var38 != null) {
                                    an3.i(an3Var, bn3Var38, 0, Math.round(((i58 - bn3Var38.J) / 2.0f) * 1.0f));
                                }
                                final byte b2 = 2;
                                int i59 = b;
                                bn3 bn3Var39 = bn3Var24;
                                if (bn3Var36 != null) {
                                    int round = hh3Var5.b ? Math.round(((i58 - bn3Var36.J) / 2.0f) * 1.0f) : P;
                                    hh3Var3 = hh3Var5;
                                    int i60 = -(bn3Var36.J / 2);
                                    float f7 = f3;
                                    int H = vt0.H(f7, round, i60);
                                    float d0 = i42.d0(ji3Var2, layoutDirection) * density;
                                    float c0 = i42.c0(ji3Var2, layoutDirection) * density;
                                    if (bn3Var38 == null) {
                                        f4 = d0;
                                    } else {
                                        f4 = d0;
                                        float f8 = bn3Var38.I;
                                        float f9 = f4 - density2;
                                        if (f9 < 0.0f) {
                                            f9 = 0.0f;
                                        }
                                        d0 = f8 + f9;
                                    }
                                    if (bn3Var39 == null) {
                                        f5 = d0;
                                        f6 = c0;
                                    } else {
                                        f5 = d0;
                                        float f10 = c0 - density2;
                                        f6 = bn3Var39.I + (f10 >= 0.0f ? f10 : 0.0f);
                                    }
                                    da2 da2Var = da2.I;
                                    float f11 = layoutDirection == da2Var ? f4 : c0;
                                    float round2 = Math.round((1.0f + (layoutDirection == da2Var ? -1.0f : (-1.0f) * (-1.0f))) * (((i59 - mw2.P(f5 + f6)) - bn3Var36.I) / 2.0f)) + (layoutDirection == da2Var ? f5 : f6);
                                    i51 = P;
                                    an3.g(an3Var, bn3Var36, mw2.P(vt0.G(round2, Math.round((1.0f + (layoutDirection != da2Var ? (-1.0f) * (-1.0f) : -1.0f)) * (((i59 - mw2.P(f4 + c0)) - bn3Var36.I) / 2.0f)) + f11, f7)), H);
                                } else {
                                    hh3Var3 = hh3Var5;
                                    i51 = P;
                                }
                                bn3 bn3Var40 = bn3Var31;
                                if (bn3Var40 != null) {
                                    if (bn3Var38 != null) {
                                        bn3Var35 = bn3Var40;
                                        i57 = bn3Var38.I;
                                    } else {
                                        bn3Var35 = bn3Var40;
                                        i57 = 0;
                                    }
                                    hh3 hh3Var6 = hh3Var3;
                                    int i61 = i51;
                                    int e = hh3.e(0, hh3Var6, i58, i61, bn3Var36, bn3Var35);
                                    i53 = 0;
                                    hh3Var3 = hh3Var6;
                                    i51 = i61;
                                    int i62 = i57;
                                    bn3Var40 = bn3Var35;
                                    i52 = i58;
                                    final byte b3 = 0;
                                    an3.j(an3Var, bn3Var40, i62, e, new tm1() { // from class: gh3
                                        @Override // defpackage.tm1
                                        public final Object invoke(Object obj10) {
                                            byte b4 = b3;
                                            wd5 wd5Var = wd5.a;
                                            c45 c45Var3 = c45Var2;
                                            n54 n54Var = (n54) obj10;
                                            switch (b4) {
                                                case 0:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                case 1:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                default:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                            }
                                            return wd5Var;
                                        }
                                    }, 4);
                                } else {
                                    i52 = i58;
                                    i53 = 0;
                                }
                                int i63 = (bn3Var40 != null ? bn3Var40.I : 0) + (bn3Var38 != null ? bn3Var38.I : 0);
                                int i64 = i52;
                                bn3 bn3Var41 = bn3Var33;
                                int i65 = i53;
                                hh3 hh3Var7 = hh3Var3;
                                int i66 = i51;
                                an3.i(an3Var, bn3Var41, i63, hh3.e(i65, hh3Var7, i64, i66, bn3Var36, bn3Var41));
                                bn3 bn3Var42 = bn3Var29;
                                if (bn3Var42 != null) {
                                    int e2 = hh3.e(i65, hh3Var7, i64, i66, bn3Var36, bn3Var42);
                                    i54 = i65;
                                    hh3Var4 = hh3Var7;
                                    i56 = i66;
                                    i55 = i64;
                                    final byte b4 = 1;
                                    an3.j(an3Var, bn3Var42, i63, e2, new tm1() { // from class: gh3
                                        @Override // defpackage.tm1
                                        public final Object invoke(Object obj10) {
                                            byte b42 = b4;
                                            wd5 wd5Var = wd5.a;
                                            c45 c45Var3 = c45Var;
                                            n54 n54Var = (n54) obj10;
                                            switch (b42) {
                                                case 0:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                case 1:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                default:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                            }
                                            return wd5Var;
                                        }
                                    }, 4);
                                } else {
                                    i54 = i65;
                                    hh3Var4 = hh3Var7;
                                    i55 = i64;
                                    i56 = i66;
                                }
                                bn3 bn3Var43 = bn3Var32;
                                if (bn3Var43 != null) {
                                    int i67 = i55;
                                    i55 = i67;
                                    an3.j(an3Var, bn3Var43, (i59 - (bn3Var39 != null ? bn3Var39.I : 0)) - bn3Var43.I, hh3.e(i54, hh3Var4, i67, i56, bn3Var36, bn3Var43), new tm1() { // from class: gh3
                                        @Override // defpackage.tm1
                                        public final Object invoke(Object obj10) {
                                            byte b42 = b2;
                                            wd5 wd5Var = wd5.a;
                                            c45 c45Var3 = c45Var2;
                                            n54 n54Var = (n54) obj10;
                                            switch (b42) {
                                                case 0:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                case 1:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                                default:
                                                    n54Var.b(c45Var3.a());
                                                    break;
                                            }
                                            return wd5Var;
                                        }
                                    }, 4);
                                    an3Var = an3Var;
                                }
                                if (bn3Var39 != null) {
                                    an3.i(an3Var, bn3Var39, i59 - bn3Var39.I, Math.round(((i55 - bn3Var39.J) / 2.0f) * 1.0f));
                                }
                                if (bn3Var37 != null) {
                                    an3.i(an3Var, bn3Var37, 0, i55);
                                }
                                return wd5.a;
                            }
                        });
                    }
                    i50++;
                    a5 = a5;
                }
                dl2.b("Collection contains no element matching the predicate.");
                zy.n();
                return null;
            }
            i32++;
            j4 = j;
            pw2Var8 = pw2Var9;
            size7 = i34;
            bn3Var5 = bn3Var5;
            list2 = list2;
            max5 = i33;
        }
        dl2.b("Collection contains no element matching the predicate.");
        zy.n();
        return null;
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return c(b42Var, list, i, new zw1((byte) 19));
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return d(b42Var, list, i, new zw1((byte) 17));
    }
}

package defpackage;

import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kc implements uw2 {
    public static final kc b = new kc(0);
    public static final kc c = new kc(1);
    public static final kc d = new kc(2);
    public static final kc e = new kc(3);
    public static final kc f = new kc(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ kc(byte b2) {
        this.a = b2;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        long j2;
        bn3 bn3Var;
        byte b2 = this.a;
        final byte b3 = 2;
        p91 p91Var = p91.I;
        final byte b4 = 1;
        final byte b5 = 0;
        switch (b2) {
            case 0:
                final ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    bn3 u = ((pw2) list.get(i3)).u(j);
                    i = Math.max(i, u.I);
                    i2 = Math.max(i2, u.J);
                    arrayList.add(u);
                }
                if (list.isEmpty()) {
                    i = dh0.j(j);
                    i2 = dh0.i(j);
                }
                return ww2Var.A(i, i2, p91Var, new tm1() { // from class: jc
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b6 = b5;
                        wd5 wd5Var = wd5.a;
                        ArrayList arrayList2 = arrayList;
                        an3 an3Var = (an3) obj;
                        switch (b6) {
                            case 0:
                                int size2 = arrayList2.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    an3.i(an3Var, (bn3) arrayList2.get(i4), 0, 0);
                                }
                                break;
                            case 1:
                                int size3 = arrayList2.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    an3.i(an3Var, (bn3) arrayList2.get(i5), 0, 0);
                                }
                                break;
                            default:
                                int size4 = arrayList2.size();
                                for (int i6 = 0; i6 < size4; i6++) {
                                    an3.g(an3Var, (bn3) arrayList2.get(i6), 0, 0);
                                }
                                break;
                        }
                        return wd5Var;
                    }
                });
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return ww2Var.A(0, 0, p91Var, ne.J);
                }
                if (size2 == 1) {
                    bn3 u2 = ((pw2) list.get(0)).u(j);
                    return ww2Var.A(u2.I, u2.J, p91Var, new oe(u2, b5));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i4 = 0;
                int i5 = 0;
                while (b5 < size3) {
                    bn3 u3 = ((pw2) list.get(b5)).u(j);
                    i4 = Math.max(i4, u3.I);
                    i5 = Math.max(i5, u3.J);
                    arrayList2.add(u3);
                    b5++;
                }
                return ww2Var.A(i4, i5, p91Var, new oe(arrayList2, b4));
            case 2:
                final ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    arrayList3.add(((pw2) list.get(i6)).u(j));
                }
                return ww2Var.A(dh0.h(j), dh0.g(j), p91Var, new tm1() { // from class: jc
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b6 = b4;
                        wd5 wd5Var = wd5.a;
                        ArrayList arrayList22 = arrayList3;
                        an3 an3Var = (an3) obj;
                        switch (b6) {
                            case 0:
                                int size22 = arrayList22.size();
                                for (int i42 = 0; i42 < size22; i42++) {
                                    an3.i(an3Var, (bn3) arrayList22.get(i42), 0, 0);
                                }
                                break;
                            case 1:
                                int size32 = arrayList22.size();
                                for (int i52 = 0; i52 < size32; i52++) {
                                    an3.i(an3Var, (bn3) arrayList22.get(i52), 0, 0);
                                }
                                break;
                            default:
                                int size42 = arrayList22.size();
                                for (int i62 = 0; i62 < size42; i62++) {
                                    an3.g(an3Var, (bn3) arrayList22.get(i62), 0, 0);
                                }
                                break;
                        }
                        return wd5Var;
                    }
                });
            case 3:
                list.getClass();
                pw2 pw2Var = (pw2) o70.U0(list);
                if (pw2Var != null) {
                    j2 = j;
                    bn3Var = pw2Var.u(dh0.a(j2, 0, Log.LOG_LEVEL_OFF, 0, 0, 12));
                } else {
                    j2 = j;
                    bn3Var = null;
                }
                return (bn3Var == null || bn3Var.I > dh0.h(j2)) ? ww2Var.A(0, 0, p91Var, new m90((byte) 4)) : ww2Var.A(bn3Var.I, bn3Var.J, p91Var, new b2(bn3Var, (byte) 2));
            default:
                final ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size5; i9++) {
                    bn3 u4 = ((pw2) list.get(i9)).u(j);
                    i7 = Math.max(i7, u4.I);
                    i8 = Math.max(i8, u4.J);
                    arrayList4.add(u4);
                }
                return ww2Var.A(i7, i8, p91Var, new tm1() { // from class: jc
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b6 = b3;
                        wd5 wd5Var = wd5.a;
                        ArrayList arrayList22 = arrayList4;
                        an3 an3Var = (an3) obj;
                        switch (b6) {
                            case 0:
                                int size22 = arrayList22.size();
                                for (int i42 = 0; i42 < size22; i42++) {
                                    an3.i(an3Var, (bn3) arrayList22.get(i42), 0, 0);
                                }
                                break;
                            case 1:
                                int size32 = arrayList22.size();
                                for (int i52 = 0; i52 < size32; i52++) {
                                    an3.i(an3Var, (bn3) arrayList22.get(i52), 0, 0);
                                }
                                break;
                            default:
                                int size42 = arrayList22.size();
                                for (int i62 = 0; i62 < size42; i62++) {
                                    an3.g(an3Var, (bn3) arrayList22.get(i62), 0, 0);
                                }
                                break;
                        }
                        return wd5Var;
                    }
                });
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
}

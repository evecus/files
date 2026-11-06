package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y13 {
    public final ArrayList a;

    public y13(n74 n74Var, n74 n74Var2) {
        float f;
        Throwable th;
        float f2;
        List list;
        Iterator it;
        float f3;
        int i;
        int i2;
        float I;
        int i3;
        uj3 uj3Var;
        uj3 uj3Var2;
        float W;
        ax2 L = sv2.L(new jp((byte) 24), n74Var);
        ax2 L2 = sv2.L(new jp((byte) 24), n74Var2);
        List list2 = L.K;
        List list3 = L2.K;
        List list4 = qd1.a;
        list2.getClass();
        list3.getClass();
        mk2 K = p70.K();
        int size = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (((lx3) list2.get(i5)).b instanceof nd1) {
                K.add(list2.get(i5));
            }
        }
        mk2 D = p70.D(K);
        mk2 K2 = p70.K();
        int size2 = list3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (((lx3) list3.get(i6)).b instanceof nd1) {
                K2.add(list3.get(i6));
            }
        }
        mk2 D2 = p70.D(K2);
        D.getClass();
        D2.getClass();
        mk2 K3 = p70.K();
        ListIterator listIterator = D.listIterator(0);
        while (true) {
            lk2 lk2Var = (lk2) listIterator;
            if (!lk2Var.hasNext()) {
                break;
            }
            lx3 lx3Var = (lx3) lk2Var.next();
            ListIterator listIterator2 = D2.listIterator(0);
            while (true) {
                lk2 lk2Var2 = (lk2) listIterator2;
                if (lk2Var2.hasNext()) {
                    lx3 lx3Var2 = (lx3) lk2Var2.next();
                    pd1 pd1Var = lx3Var.b;
                    pd1 pd1Var2 = lx3Var2.b;
                    pd1Var.getClass();
                    pd1Var2.getClass();
                    if ((pd1Var instanceof nd1) && (pd1Var2 instanceof nd1) && ((nd1) pd1Var).b != ((nd1) pd1Var2).b) {
                        W = Float.MAX_VALUE;
                    } else {
                        long a0 = sp0.a0(qd1.a(pd1Var), qd1.a(pd1Var2));
                        W = (sp0.W(a0) * sp0.W(a0)) + (sp0.V(a0) * sp0.V(a0));
                    }
                    if (W != Float.MAX_VALUE) {
                        K3.add(new hy0(W, lx3Var, lx3Var2));
                    }
                }
            }
        }
        mk2 D3 = p70.D(K3);
        byte b = 2;
        List k1 = o70.k1(D3, new se3(b));
        float f4 = 1.0f;
        int i7 = 1;
        if (k1.isEmpty()) {
            list = qd1.a;
        } else {
            if (k1.size() != 1) {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = k1.iterator();
                while (it2.hasNext()) {
                    hy0 hy0Var = (hy0) it2.next();
                    lx3 lx3Var3 = hy0Var.b;
                    lx3 lx3Var4 = hy0Var.c;
                    float f5 = lx3Var3.a;
                    byte b2 = b;
                    float f6 = lx3Var4.a;
                    if (linkedHashSet.contains(lx3Var3) || linkedHashSet2.contains(lx3Var4)) {
                        it = it2;
                        f3 = f4;
                    } else {
                        Float valueOf = Float.valueOf(f5);
                        int size3 = arrayList.size();
                        f3 = f4;
                        p70.q0(arrayList.size(), size3);
                        int i8 = size3 - i7;
                        int i9 = i4;
                        while (true) {
                            if (i9 > i8) {
                                i = i7;
                                i2 = -(i9 + 1);
                                break;
                            }
                            i2 = (i9 + i8) >>> 1;
                            i = i7;
                            int p = j42.p((Float) ((uj3) arrayList.get(i2)).I, valueOf);
                            if (p < 0) {
                                i9 = i2 + 1;
                            } else if (p <= 0) {
                                break;
                            } else {
                                i8 = i2 - 1;
                            }
                            i7 = i;
                        }
                        if (i2 >= 0) {
                            s83.t("There can't be two features with the same progress");
                            throw null;
                        }
                        int i10 = (-i2) - 1;
                        int size4 = arrayList.size();
                        int i11 = i;
                        if (size4 >= i11) {
                            uj3 uj3Var3 = (uj3) arrayList.get(((i10 + size4) - i11) % size4);
                            float floatValue = ((Number) uj3Var3.I).floatValue();
                            float floatValue2 = ((Number) uj3Var3.J).floatValue();
                            uj3 uj3Var4 = (uj3) arrayList.get(i10 % size4);
                            it = it2;
                            float floatValue3 = ((Number) uj3Var4.I).floatValue();
                            float floatValue4 = ((Number) uj3Var4.J).floatValue();
                            if (sv2.R(f5, floatValue) >= 1.0E-4f && sv2.R(f5, floatValue3) >= 1.0E-4f && sv2.R(f6, floatValue2) >= 1.0E-4f && sv2.R(f6, floatValue4) >= 1.0E-4f) {
                                if (size4 > 1) {
                                    if (floatValue4 >= floatValue2) {
                                        if (floatValue2 <= f6) {
                                            if (f6 > floatValue4) {
                                            }
                                        }
                                    } else if (f6 < floatValue2 && f6 > floatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i10, new uj3(Float.valueOf(f5), Float.valueOf(f6)));
                        linkedHashSet.add(lx3Var3);
                        linkedHashSet2.add(lx3Var4);
                    }
                    b = b2;
                    f4 = f3;
                    it2 = it;
                    i4 = 0;
                    i7 = 1;
                }
                f = f4;
                th = null;
                f2 = 1.0E-4f;
                list = arrayList;
                uj3[] uj3VarArr = (uj3[]) list.toArray(new uj3[0]);
                uy0 uy0Var = new uy0((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length));
                n33 n33Var = uy0Var.a;
                n33 n33Var2 = uy0Var.b;
                I = sv2.I(n33Var, n33Var2, 0.0f);
                ArrayList arrayList2 = L2.J;
                if (0.0f <= I || I > f) {
                    s83.t("Cutting point is expected to be between 0 and 1");
                    throw th;
                }
                if (I < f2) {
                    i3 = 1;
                } else {
                    int size5 = arrayList2.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size5) {
                            i12 = -1;
                            break;
                        }
                        Object obj = arrayList2.get(i13);
                        i13++;
                        zw2 zw2Var = (zw2) obj;
                        float f7 = zw2Var.c;
                        if (I <= zw2Var.d && f7 <= I) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    uj3 a = ((zw2) arrayList2.get(i12)).a(I);
                    zw2 zw2Var2 = (zw2) a.I;
                    ArrayList n0 = p70.n0(((zw2) a.J).a);
                    int size6 = arrayList2.size();
                    for (int i14 = 1; i14 < size6; i14++) {
                        n0.add(((zw2) arrayList2.get((i14 + i12) % arrayList2.size())).a);
                    }
                    n0.add(zw2Var2.a);
                    n33 n33Var3 = new n33(arrayList2.size() + 2);
                    int size7 = arrayList2.size() + 2;
                    int i15 = 0;
                    while (i15 < size7) {
                        n33Var3.a(i15 == 0 ? 0.0f : i15 == arrayList2.size() + 1 ? f : sg5.c(((zw2) arrayList2.get(((i12 + i15) - 1) % arrayList2.size())).d - I));
                        i15++;
                    }
                    i3 = 1;
                    mk2 K4 = p70.K();
                    int size8 = list3.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        K4.add(new lx3(sg5.c(((lx3) list3.get(i16)).a - I), ((lx3) list3.get(i16)).b));
                    }
                    L2 = new ax2(L2.I, p70.D(K4), n0, n33Var3);
                }
                ArrayList arrayList3 = new ArrayList();
                zw2 zw2Var3 = (zw2) o70.V0(0, L);
                zw2 zw2Var4 = (zw2) o70.V0(0, L2);
                int i17 = i3;
                int i18 = i17;
                while (zw2Var3 != null && zw2Var4 != null) {
                    float f8 = i18 == L.J.size() ? f : zw2Var3.d;
                    float I2 = i17 == L2.J.size() ? f : sv2.I(n33Var2, n33Var, sg5.c(zw2Var4.d + I));
                    float min = Math.min(f8, I2);
                    float f9 = 1.0E-6f + min;
                    if (f8 > f9) {
                        uj3Var = zw2Var3.a(min);
                    } else {
                        uj3 uj3Var5 = new uj3(zw2Var3, o70.V0(i18, L));
                        i18++;
                        uj3Var = uj3Var5;
                    }
                    zw2 zw2Var5 = (zw2) uj3Var.I;
                    zw2Var3 = (zw2) uj3Var.J;
                    if (I2 > f9) {
                        uj3Var2 = zw2Var4.a(sg5.c(sv2.I(n33Var, n33Var2, min) - I));
                    } else {
                        uj3 uj3Var6 = new uj3(zw2Var4, o70.V0(i17, L2));
                        i17++;
                        uj3Var2 = uj3Var6;
                    }
                    zw2 zw2Var6 = (zw2) uj3Var2.I;
                    zw2Var4 = (zw2) uj3Var2.J;
                    arrayList3.add(new uj3(zw2Var5.a, zw2Var6.a));
                }
                if (zw2Var3 == null && zw2Var4 == null) {
                    this.a = arrayList3;
                    return;
                } else {
                    s83.t("Expected both Polygon's Cubic to be fully matched");
                    throw th;
                }
            }
            hy0 hy0Var2 = (hy0) o70.T0(k1);
            float f10 = hy0Var2.b.a;
            float f11 = hy0Var2.c.a;
            list = p70.k0(new uj3(Float.valueOf(f10), Float.valueOf(f11)), new uj3(Float.valueOf((f10 + 0.5f) % 1.0f), Float.valueOf((f11 + 0.5f) % 1.0f)));
        }
        f = 1.0f;
        th = null;
        f2 = 1.0E-4f;
        uj3[] uj3VarArr2 = (uj3[]) list.toArray(new uj3[0]);
        uy0 uy0Var2 = new uy0((uj3[]) Arrays.copyOf(uj3VarArr2, uj3VarArr2.length));
        n33 n33Var4 = uy0Var2.a;
        n33 n33Var22 = uy0Var2.b;
        I = sv2.I(n33Var4, n33Var22, 0.0f);
        ArrayList arrayList22 = L2.J;
        if (0.0f <= I) {
        }
        s83.t("Cutting point is expected to be between 0 and 1");
        throw th;
    }
}

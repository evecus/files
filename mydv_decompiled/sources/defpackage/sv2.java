package defpackage;

import android.os.Bundle;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sv2 {
    public static hx1 a;
    public static hx1 b;

    public static int A(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    public static final Class B(t72 t72Var) {
        t72Var.getClass();
        Class a2 = ((i60) t72Var).a();
        a2.getClass();
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class C(t72 t72Var) {
        Class a2 = ((i60) t72Var).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static String D(Class cls) {
        LinkedHashMap linkedHashMap = v83.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            t83 t83Var = (t83) cls.getAnnotation(t83.class);
            str = t83Var != null ? t83Var.value() : null;
            if (str == null || str.length() <= 0) {
                s83.h("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static Object E(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final boolean F(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final boolean G(wa2 wa2Var) {
        if (wa2Var.P == null) {
            return false;
        }
        wa2 v = wa2Var.v();
        return (v != null ? v.P : null) == null || wa2Var.o0.b;
    }

    public static final boolean H(h74 h74Var) {
        long j = h74Var.e;
        return (j >>> 32) == (4294967295L & j) && j == h74Var.f && j == h74Var.g && j == h74Var.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float I(defpackage.n33 r7, defpackage.n33 r8, float r9) {
        /*
            r7.getClass()
            r8.getClass()
            r0 = 0
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 > 0) goto L8f
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L8f
            r1 = 0
            int r2 = r7.b
            u22 r1 = defpackage.ut0.c0(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L1c:
            r2 = r1
            t22 r2 = (defpackage.t22) r2
            boolean r2 = r2.K
            if (r2 == 0) goto L89
            r2 = r1
            l22 r2 = (defpackage.l22) r2
            int r2 = r2.nextInt()
            float r3 = r7.b(r2)
            int r4 = r2 + 1
            int r5 = r7.b
            int r5 = r4 % r5
            float r5 = r7.b(r5)
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 < 0) goto L45
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L1c
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L1c
            goto L4d
        L45:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4d
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L1c
        L4d:
            int r0 = r7.b
            int r4 = r4 % r0
            float r0 = r7.b(r4)
            float r1 = r7.b(r2)
            float r0 = r0 - r1
            float r0 = defpackage.sg5.c(r0)
            float r1 = r8.b(r4)
            float r3 = r8.b(r2)
            float r1 = r1 - r3
            float r1 = defpackage.sg5.c(r1)
            r3 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L74
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L7e
        L74:
            float r7 = r7.b(r2)
            float r9 = r9 - r7
            float r7 = defpackage.sg5.c(r9)
            float r7 = r7 / r0
        L7e:
            float r8 = r8.b(r2)
            float r1 = r1 * r7
            float r1 = r1 + r8
            float r7 = defpackage.sg5.c(r1)
            return r7
        L89:
            java.lang.String r7 = "Collection contains no element matching the predicate."
            defpackage.s83.l(r7)
            return r0
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid progress: "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv2.I(n33, n33, float):float");
    }

    public static int J(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Log.LOG_LEVEL_OFF;
    }

    public static Map K(uj3... uj3VarArr) {
        if (uj3VarArr.length <= 0) {
            return p91.I;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(uj3VarArr.length));
        S(linkedHashMap, uj3VarArr);
        return linkedHashMap;
    }

    public static ax2 L(jp jpVar, n74 n74Var) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = n74Var.a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            pd1 pd1Var = (pd1) list2.get(i);
            int size2 = pd1Var.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((pd1Var instanceof nd1) && i2 == pd1Var.a.size() / 2) {
                    arrayList2.add(new uj3(pd1Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(pd1Var.a.get(i2));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int J = p70.J(arrayList, 9);
        if (J == 0) {
            list = p70.j0(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(J + 1);
            arrayList3.add(valueOf);
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                km0 km0Var = (km0) obj;
                float floatValue = valueOf.floatValue();
                km0Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (jp.c(km0Var, Float.POSITIVE_INFINITY) & 4294967295L));
                if (intBitsToFloat < 0.0f) {
                    s83.t("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                valueOf = Float.valueOf(floatValue + intBitsToFloat);
                arrayList3.add(valueOf);
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) o70.a1(list)).floatValue();
        n33 n33Var = new n33(list.size());
        int size4 = list.size();
        for (int i4 = 0; i4 < size4; i4++) {
            n33Var.a(((Number) list.get(i4)).floatValue() / floatValue2);
        }
        mk2 K = p70.K();
        int size5 = arrayList2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            int intValue = ((Number) ((uj3) arrayList2.get(i5)).J).intValue();
            K.add(new lx3(sg5.c((n33Var.b(intValue + 1) + n33Var.b(intValue)) / 2.0f), (pd1) ((uj3) arrayList2.get(i5)).I));
        }
        return new ax2(jpVar, p70.D(K), arrayList, n33Var);
    }

    public static Map M(Object obj, Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        int size = linkedHashMap.size();
        if (size == 0) {
            return p91.I;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static final ArrayList N(Map map, tm1 tm1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            n63 n63Var = (n63) entry.getValue();
            Boolean bool = n63Var != null ? Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !n63Var.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) tm1Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static LinkedHashMap O(uj3... uj3VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(uj3VarArr.length));
        S(linkedHashMap, uj3VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap P(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final long Q(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final float R(float f, float f2) {
        float abs = Math.abs(f - f2);
        return Math.min(abs, 1.0f - abs);
    }

    public static final void S(HashMap hashMap, uj3[] uj3VarArr) {
        for (uj3 uj3Var : uj3VarArr) {
            hashMap.put(uj3Var.I, uj3Var.J);
        }
    }

    public static final void T(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final long U(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final p04 V(zf1 zf1Var, dl0 dl0Var, sn4 sn4Var, Object obj) {
        da daVar;
        p40 p40Var;
        zf1 f;
        k20.b.getClass();
        j20 j20Var = j20.a;
        byte b2 = 11;
        if (!(zf1Var instanceof p40) || (f = (p40Var = (p40) zf1Var).f()) == null) {
            daVar = new da(zf1Var, l91.I, b2);
        } else {
            if (p40Var.J != -3) {
            }
            daVar = new da(f, p40Var.I, b2);
        }
        fw4 c = o7.c(obj);
        return new p04(c, p70.f0(dl0Var, (tk0) daVar.K, sn4Var.equals(rn4.a) ? gl0.I : gl0.L, new xg1(sn4Var, (zf1) daVar.J, c, obj, null)));
    }

    public static Map W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p91.I;
        }
        int i = 0;
        if (size == 1) {
            uj3 uj3Var = (uj3) arrayList.get(0);
            uj3Var.getClass();
            Map singletonMap = Collections.singletonMap(uj3Var.I, uj3Var.J);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            uj3 uj3Var2 = (uj3) obj;
            linkedHashMap.put(uj3Var2.I, uj3Var2.J);
        }
        return linkedHashMap;
    }

    public static Map X(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return p91.I;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap Y(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static int Z(hz3 hz3Var, iz3 iz3Var, int i, int[] iArr) {
        int i2;
        int i3;
        iArr.getClass();
        int ordinal = iz3Var.ordinal();
        if (ordinal == 0) {
            i2 = (iArr[A(i, hz3Var.d, hz3Var.f)] - iArr[A(i, hz3Var.d, hz3Var.e)]) - iArr[A(i, hz3Var.c, hz3Var.f)];
            i3 = iArr[A(i, hz3Var.c, hz3Var.e)];
        } else if (ordinal == 1) {
            i2 = (iArr[A(hz3Var.b, i, hz3Var.f)] - iArr[A(hz3Var.b, i, hz3Var.e)]) - iArr[A(hz3Var.a, i, hz3Var.f)];
            i3 = iArr[A(hz3Var.a, i, hz3Var.e)];
        } else {
            if (ordinal != 2) {
                s83.v();
                return 0;
            }
            i2 = (iArr[A(hz3Var.b, hz3Var.d, i)] - iArr[A(hz3Var.b, hz3Var.c, i)]) - iArr[A(hz3Var.a, hz3Var.d, i)];
            i3 = iArr[A(hz3Var.a, hz3Var.c, i)];
        }
        return i2 + i3;
    }

    public static final void a(sw0 sw0Var, fe0 fe0Var, int i) {
        sw0 sw0Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(294589392);
        if ((((go1Var.i(sw0Var) ? 4 : 2) | i) & 3) == 2 && go1Var.F()) {
            go1Var.W();
            sw0Var2 = sw0Var;
        } else {
            h94 Q = mu0.Q(go1Var);
            p04 p04Var = sw0Var.b().e;
            t43 f = wi4.f(p04Var, p04Var.getValue(), go1Var, 0, 0);
            List list = (List) f.getValue();
            boolean booleanValue = ((Boolean) go1Var.k(x12.a)).booleanValue();
            boolean g = go1Var.g(list);
            Object Q2 = go1Var.Q();
            Object obj = de0.a;
            Object obj2 = Q2;
            if (g || Q2 == obj) {
                gt4 gt4Var = new gt4();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    p63 p63Var = (p63) obj3;
                    if (booleanValue || p63Var.P.j.i.compareTo(ki2.L) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                gt4Var.addAll(arrayList);
                go1Var.o0(gt4Var);
                obj2 = gt4Var;
            }
            gt4 gt4Var2 = (gt4) obj2;
            f(gt4Var2, (List) f.getValue(), go1Var, 0);
            p04 p04Var2 = sw0Var.b().f;
            t43 f2 = wi4.f(p04Var2, p04Var2.getValue(), go1Var, 0, 0);
            Object Q3 = go1Var.Q();
            if (Q3 == obj) {
                Q3 = new gt4();
                go1Var.o0(Q3);
            }
            gt4 gt4Var3 = (gt4) Q3;
            go1Var.d0(-367418626);
            ListIterator listIterator = gt4Var2.listIterator();
            while (true) {
                lk2 lk2Var = (lk2) listIterator;
                if (!lk2Var.hasNext()) {
                    break;
                }
                p63 p63Var2 = (p63) lk2Var.next();
                i73 i73Var = p63Var2.J;
                i73Var.getClass();
                rw0 rw0Var = (rw0) i73Var;
                boolean i2 = go1Var.i(sw0Var) | go1Var.i(p63Var2);
                Object Q4 = go1Var.Q();
                if (i2 || Q4 == obj) {
                    Q4 = new k9(sw0Var, p63Var2, (byte) 5);
                    go1Var.o0(Q4);
                }
                gt4 gt4Var4 = gt4Var3;
                sw0 sw0Var3 = sw0Var;
                d4.b((rm1) Q4, rw0Var.f(), p70.u0(1129586364, new mw0(p63Var2, sw0Var3, Q, gt4Var4, rw0Var), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                sw0Var = sw0Var3;
                gt4Var3 = gt4Var4;
            }
            sw0Var2 = sw0Var;
            gt4 gt4Var5 = gt4Var3;
            go1Var.q(false);
            Set set = (Set) f2.getValue();
            boolean g2 = go1Var.g(f2) | go1Var.i(sw0Var2);
            Object Q5 = go1Var.Q();
            if (g2 || Q5 == obj) {
                Q5 = new nw0(f2, sw0Var2, gt4Var5, (fj0) null);
                go1Var.o0(Q5);
            }
            mw2.i(set, gt4Var5, (hn1) Q5, go1Var);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new y1(sw0Var2, i, (byte) 6);
        }
    }

    public static AbstractList a0(List list, pn1 pn1Var) {
        return list instanceof RandomAccess ? new tl2(list, pn1Var) : new ul2(list, pn1Var);
    }

    public static v44 b(int i, qk1 qk1Var) {
        return new v44(i, qk1Var, new ok1(new nk1[0]));
    }

    public static final void b0(n33 n33Var) {
        n33Var.getClass();
        int i = n33Var.b;
        if (i == 0) {
            dq2.K0("FloatList is empty.");
            throw null;
        }
        float f = n33Var.a[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float b2 = n33Var.b(i2);
            if (b2 < 0.0f || b2 >= 1.0f) {
                s83.h("FloatMapping - Progress outside of range: ".concat(n33.c(n33Var, 31)));
                return;
            }
            if (R(b2, f) <= 1.0E-4f) {
                s83.h("FloatMapping - Progress repeats a value: ".concat(n33.c(n33Var, 31)));
                return;
            } else if (b2 < f && (i3 = i3 + 1) > 1) {
                s83.h("FloatMapping - Progress wraps more than once: ".concat(n33.c(n33Var, 31)));
                return;
            } else {
                i2++;
                f = b2;
            }
        }
    }

    public static final void c(ji2 ji2Var, vi2 vi2Var, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-709389590);
        int i2 = i | 16 | (go1Var.i(rm1Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                vi2Var = (vi2) go1Var.k(mq2.a);
            } else {
                go1Var.W();
            }
            go1Var.r();
            if (ji2Var == ji2.ON_DESTROY) {
                s83.t("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            t43 x = ad4.x(rm1Var, go1Var);
            boolean g = go1Var.g(x) | go1Var.i(vi2Var);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new m6((Object) vi2Var, (Object) ji2Var, (Object) x, (byte) 14);
                go1Var.o0(Q);
            }
            mw2.e(vi2Var, (tm1) Q, go1Var);
        } else {
            go1Var.W();
        }
        vi2 vi2Var2 = vi2Var;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) ji2Var, (Object) vi2Var2, (Object) rm1Var, i, (byte) 5);
        }
    }

    public static int c0(hz3 hz3Var, int[] iArr) {
        iArr.getClass();
        hz3Var.getClass();
        return ((((((iArr[A(hz3Var.b, hz3Var.d, hz3Var.f)] - iArr[A(hz3Var.b, hz3Var.d, hz3Var.e)]) - iArr[A(hz3Var.b, hz3Var.c, hz3Var.f)]) + iArr[A(hz3Var.b, hz3Var.c, hz3Var.e)]) - iArr[A(hz3Var.a, hz3Var.d, hz3Var.f)]) + iArr[A(hz3Var.a, hz3Var.d, hz3Var.e)]) + iArr[A(hz3Var.a, hz3Var.c, hz3Var.f)]) - iArr[A(hz3Var.a, hz3Var.c, hz3Var.e)];
    }

    public static final void d(Boolean bool, Object obj, vi2 vi2Var, tm1 tm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(696924721);
        if ((i & 6) == 0) {
            i2 = (go1Var.i(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(obj) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(tm1Var) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                vi2Var = (vi2) go1Var.k(mq2.a);
            } else {
                go1Var.W();
            }
            int i3 = i2 & (-897);
            go1Var.r();
            boolean g = go1Var.g(bool) | go1Var.g(obj) | go1Var.g(vi2Var);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new bj2(vi2Var.k());
                go1Var.o0(Q);
            }
            e(vi2Var, (bj2) Q, tm1Var, go1Var, (i3 >> 3) & 896);
        } else {
            go1Var.W();
        }
        vi2 vi2Var2 = vi2Var;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qi2(bool, obj, vi2Var2, tm1Var, i, (byte) 0);
        }
    }

    public static final void e(vi2 vi2Var, bj2 bj2Var, tm1 tm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(228371534);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (go1Var.i(vi2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(bj2Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tm1Var) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean i3 = go1Var.i(bj2Var) | ((i2 & 896) == 256) | go1Var.i(vi2Var);
            Object Q = go1Var.Q();
            if (i3 || Q == de0.a) {
                Q = new ig(vi2Var, bj2Var, tm1Var, b2);
                go1Var.o0(Q);
            }
            mw2.f(vi2Var, bj2Var, (tm1) Q, go1Var);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0((Object) vi2Var, (Object) bj2Var, (Object) tm1Var, i, (byte) 4);
        }
    }

    public static final void f(List list, Collection collection, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1537894851);
        if ((((go1Var.i(list) ? 4 : 2) | i | (go1Var.i(collection) ? 32 : 16)) & 19) == 18 && go1Var.F()) {
            go1Var.W();
        } else {
            boolean booleanValue = ((Boolean) go1Var.k(x12.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                p63 p63Var = (p63) it.next();
                xi2 xi2Var = p63Var.P.j;
                boolean h = go1Var.h(booleanValue) | go1Var.i(list) | go1Var.i(p63Var);
                Object Q = go1Var.Q();
                if (h || Q == de0.a) {
                    Q = new jw0(p63Var, list, booleanValue);
                    go1Var.o0(Q);
                }
                mw2.e(xi2Var, (tm1) Q, go1Var);
            }
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uh0((byte) 1, i, list, collection);
        }
    }

    public static final m14 g(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new m14(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final h74 h(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new h74(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static void i(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = q52.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = ln3.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final p04 j(w43 w43Var) {
        return new p04(w43Var, null);
    }

    public static int k(hz3 hz3Var, iz3 iz3Var, int[] iArr) {
        int i;
        int i2;
        iArr.getClass();
        int ordinal = iz3Var.ordinal();
        if (ordinal == 0) {
            i = (-iArr[A(hz3Var.a, hz3Var.d, hz3Var.f)]) + iArr[A(hz3Var.a, hz3Var.d, hz3Var.e)] + iArr[A(hz3Var.a, hz3Var.c, hz3Var.f)];
            i2 = iArr[A(hz3Var.a, hz3Var.c, hz3Var.e)];
        } else if (ordinal == 1) {
            i = (-iArr[A(hz3Var.b, hz3Var.c, hz3Var.f)]) + iArr[A(hz3Var.b, hz3Var.c, hz3Var.e)] + iArr[A(hz3Var.a, hz3Var.c, hz3Var.f)];
            i2 = iArr[A(hz3Var.a, hz3Var.c, hz3Var.e)];
        } else {
            if (ordinal != 2) {
                s83.v();
                return 0;
            }
            i = (-iArr[A(hz3Var.b, hz3Var.d, hz3Var.e)]) + iArr[A(hz3Var.b, hz3Var.c, hz3Var.e)] + iArr[A(hz3Var.a, hz3Var.d, hz3Var.e)];
            i2 = iArr[A(hz3Var.a, hz3Var.c, hz3Var.e)];
        }
        return i - i2;
    }

    public static final q04 l(eq4 eq4Var) {
        eq4Var.getClass();
        return new q04(eq4Var);
    }

    public static final s04 m(ut4 ut4Var) {
        ut4Var.getClass();
        return new s04(ut4Var);
    }

    public static zu2 n(zu2 zu2Var) {
        return zu2Var.b();
    }

    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        s83.t(str);
    }

    public static void p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        zy.m(str);
    }

    public static void r(l73 l73Var, String str, List list, tc0 tc0Var, int i) {
        if ((i & 2) != 0) {
            list = o91.I;
        }
        v83 v83Var = l73Var.f;
        v83Var.getClass();
        kd0 kd0Var = new kd0((jd0) v83Var.b(D(jd0.class)), str, tc0Var);
        for (y53 y53Var : list) {
            kd0Var.c.put(y53Var.a, y53Var.b);
        }
        l73Var.h.add(kd0Var.a());
    }

    public static final long s(long j, x41 x41Var) {
        long j2;
        int ordinal = x41Var.ordinal();
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                zy.h(x41Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zj1 t(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 16
            if (r0 < r1) goto Le
            hr0 r0 = new hr0
            r0.<init>(r2)
            goto L13
        Le:
            jp r0 = new jp
            r0.<init>(r2)
        L13:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            q(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2c:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2c
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2c
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2c
            goto L49
        L48:
            r4 = r5
        L49:
            if (r4 != 0) goto L4d
        L4b:
            r1 = r5
            goto L7a
        L4d:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.p(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L5b:
            if (r3 >= r6) goto L69
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L5b
        L69:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            xj1 r1 = new xj1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>(r2, r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4b
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            zj1 r5 = new zj1
            yj1 r0 = new yj1
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv2.t(android.content.Context):zj1");
    }

    public static zu2 u() {
        return new zu2();
    }

    public static double v(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d3 * d3) + (d2 * d2) + (d * d);
    }

    public static Map w(bs1 bs1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator l = bs1Var.l();
        while (l.hasNext()) {
            Object b2 = bs1Var.b(l.next());
            Object obj = linkedHashMap.get(b2);
            if (obj == null && !linkedHashMap.containsKey(b2)) {
                obj = new p24();
            }
            p24 p24Var = (p24) obj;
            p24Var.I++;
            linkedHashMap.put(b2, p24Var);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof w72) && !(entry instanceof z72)) {
                p70.z0(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((p24) entry.getValue()).I));
        }
        return p70.x(linkedHashMap);
    }

    public static final int x(int i, me2 me2Var, Object obj) {
        int e;
        return (obj == null || me2Var.a() == 0 || (i < me2Var.a() && obj.equals(me2Var.c(i))) || (e = me2Var.e(obj)) == -1) ? i : e;
    }

    public static final yw2 y(pe2 pe2Var, int i, long j, wi3 wi3Var, long j2, tv tvVar, da2 da2Var, int i2, q33 q33Var) {
        List list;
        Object c = wi3Var.c(i);
        List list2 = (List) q33Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List a2 = pe2Var.a(i);
            int size = a2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((pw2) a2.get(i3)).u(j));
            }
            q33Var.i(i, arrayList);
            list = arrayList;
        }
        return new yw2(i, i2, list, j2, c, tvVar, da2Var);
    }

    public static final hx1 z() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(10.0f, 20.0f);
        epVar.M(-6.0f);
        epVar.v(4.0f);
        epVar.M(6.0f);
        epVar.v(5.0f);
        epVar.M(-8.0f);
        epVar.v(3.0f);
        epVar.x(12.0f, 3.0f);
        epVar.x(2.0f, 12.0f);
        epVar.v(3.0f);
        epVar.M(8.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }
}

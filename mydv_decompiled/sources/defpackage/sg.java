package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements hn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ sg(byte b) {
        this.I = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r7v10, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        na0 na0Var;
        byte b = this.I;
        Bundle bundle = null;
        int i = 0;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                mw2.N((wa2) obj).setUpdateBlock((tm1) obj2);
                return wd5Var;
            case 1:
                mw2.N((wa2) obj).setReleaseBlock((tm1) obj2);
                return wd5Var;
            case 2:
                mw2.N((wa2) obj).setModifier((l13) obj2);
                return wd5Var;
            case 3:
                mw2.N((wa2) obj).setDensity((iu0) obj2);
                return wd5Var;
            case 4:
                mw2.N((wa2) obj).setLifecycleOwner((vi2) obj2);
                return wd5Var;
            case 5:
                mw2.N((wa2) obj).setSavedStateRegistryOwner((w94) obj2);
                return wd5Var;
            case 6:
                ir5 N = mw2.N((wa2) obj);
                int ordinal = ((da2) obj2).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        s83.v();
                        return null;
                    }
                    i = 1;
                }
                N.setLayoutDirection(i);
                return wd5Var;
            case 7:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                }
                return wd5Var;
            case 8:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                }
                return wd5Var;
            case 9:
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                }
                return wd5Var;
            case 10:
                fe0 fe0Var4 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                go1 go1Var4 = (go1) fe0Var4;
                if (go1Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    mu0.b("↑↓", "切换视频", go1Var4, 54);
                    mu0.b("←", "相关视频推荐", go1Var4, 54);
                    mu0.b("→", "调整进度", go1Var4, 54);
                    mu0.b("OK", "暂停/继续播放", go1Var4, 54);
                    mu0.b("↩", "使用导航栏，连续点击多次可退出应用", go1Var4, 54);
                } else {
                    go1Var4.W();
                }
                return wd5Var;
            case 11:
                fe0 fe0Var5 = (fe0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    go1Var5.W();
                }
                return wd5Var;
            case 12:
                fe0 fe0Var6 = (fe0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    go1Var6.W();
                }
                return wd5Var;
            case 13:
                ((wa2) ((xd0) obj)).g0((l13) obj2);
                return wd5Var;
            case 14:
                af0 af0Var = (af0) obj2;
                wa2 wa2Var = (wa2) ((xd0) obj);
                wa2Var.j0 = af0Var;
                ja3 ja3Var = wa2Var.n0;
                i51 i51Var = hf0.h;
                zl3 zl3Var = (zl3) af0Var;
                zl3Var.getClass();
                wa2Var.c0((iu0) p70.r0(zl3Var, i51Var));
                zl3 zl3Var2 = (zl3) af0Var;
                da2 da2Var = (da2) p70.r0(zl3Var2, hf0.n);
                if (wa2Var.h0 != da2Var) {
                    wa2Var.h0 = da2Var;
                    wa2Var.H();
                    wa2 v = wa2Var.v();
                    if (v != null) {
                        v.E();
                    } else {
                        qh3 qh3Var = wa2Var.V;
                        if (qh3Var != null) {
                            qh3Var.invalidateRootLayer();
                        }
                    }
                    wa2Var.F();
                    for (k13 k13Var = ja3Var.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
                        k13Var.onLayoutDirectionChange();
                    }
                }
                wa2Var.h0((gr5) p70.r0(zl3Var2, hf0.t));
                if ((ja3Var.f.getAggregateChildKindSet$ui() & 32768) != 0) {
                    for (k13 k13Var2 = ja3Var.f; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                        if ((k13Var2.getKindSet$ui() & 32768) != 0) {
                            wt0 wt0Var = k13Var2;
                            ?? r7 = 0;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof ye0) {
                                    k13 node = ((k13) ((ye0) wt0Var)).getNode();
                                    if (node.isAttached()) {
                                        oa3.d(node);
                                    } else {
                                        node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                                    }
                                } else if ((wt0Var.getKindSet$ui() & 32768) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var3 = wt0Var.J;
                                    int i2 = 0;
                                    wt0Var = wt0Var;
                                    r7 = r7;
                                    while (k13Var3 != null) {
                                        if ((k13Var3.getKindSet$ui() & 32768) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                wt0Var = k13Var3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r7.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r7.c(k13Var3);
                                            }
                                        }
                                        k13Var3 = k13Var3.getChild$ui();
                                        wt0Var = wt0Var;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r7);
                            }
                        }
                        if ((k13Var2.getAggregateChildKindSet$ui() & 32768) != 0) {
                        }
                    }
                }
                return wd5Var;
            case 15:
                ((wa2) ((xd0) obj)).f0((uw2) obj2);
                return wd5Var;
            case 16:
                ((Integer) obj2).getClass();
                ((wa2) ((xd0) obj)).getClass();
                return wd5Var;
            case 17:
                tk0 tk0Var = (tk0) obj;
                rk0 rk0Var = (rk0) obj2;
                tk0Var.getClass();
                rk0Var.getClass();
                tk0 minusKey = tk0Var.minusKey(rk0Var.getKey());
                l91 l91Var = l91.I;
                if (minusKey == l91Var) {
                    return rk0Var;
                }
                q8 q8Var = q8.i0;
                vk0 vk0Var = (vk0) minusKey.get(q8Var);
                if (vk0Var == null) {
                    na0Var = new na0(rk0Var, minusKey);
                } else {
                    tk0 minusKey2 = minusKey.minusKey(q8Var);
                    if (minusKey2 == l91Var) {
                        return new na0(vk0Var, rk0Var);
                    }
                    na0Var = new na0(vk0Var, new na0(rk0Var, minusKey2));
                }
                return na0Var;
            case 18:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 19:
                return ((tk0) obj).plus((rk0) obj2);
            case 20:
                return ((tk0) obj).plus((rk0) obj2);
            case 21:
                is0 is0Var = (is0) obj2;
                return p70.k0(Integer.valueOf(is0Var.d.b.h()), Float.valueOf(ut0.q(is0Var.d.c.h(), -0.5f, 0.5f)), Integer.valueOf(is0Var.l()));
            case 22:
                return Boolean.valueOf(j42.c(obj, obj2));
            case 23:
                Map d = ((eg2) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 24:
                q73 q73Var = (q73) obj2;
                a73 a73Var = q73Var.b;
                LinkedHashMap linkedHashMap = a73Var.n;
                pp ppVar = a73Var.f;
                LinkedHashMap linkedHashMap2 = a73Var.m;
                ArrayList arrayList = new ArrayList();
                Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                for (Map.Entry entry : sv2.X(a73Var.t.a).entrySet()) {
                    ((u83) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                    sv2.T(b0, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", b0);
                }
                if (!ppVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it = ppVar.iterator();
                    while (it.hasNext()) {
                        p63 p63Var = (p63) it.next();
                        p63Var.getClass();
                        int i3 = p63Var.J.J.b;
                        String str = p63Var.N;
                        r63 r63Var = p63Var.P;
                        Bundle a = r63Var.a();
                        Bundle b02 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                        r63Var.h.q(b02);
                        Bundle b03 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                        b03.putString("nav-entry-state:id", str);
                        b03.putInt("nav-entry-state:destination-id", i3);
                        if (a == null) {
                            a = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                        }
                        b03.putBundle("nav-entry-state:args", a);
                        b03.putBundle("nav-entry-state:saved-state", b02);
                        arrayList2.add(b03);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue7 = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = intValue7;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(str2);
                        i4 = i5;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    sv2.T(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        pp ppVar2 = (pp) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = ppVar2.iterator();
                        while (it2.hasNext()) {
                            g72 g72Var = ((t63) it2.next()).a;
                            Bundle b04 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                            b04.putString("nav-entry-state:id", (String) g72Var.c);
                            b04.putInt("nav-entry-state:destination-id", g72Var.b);
                            Bundle bundle2 = (Bundle) g72Var.d;
                            if (bundle2 == null) {
                                bundle2 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                            }
                            b04.putBundle("nav-entry-state:args", bundle2);
                            b04.putBundle("nav-entry-state:saved-state", (Bundle) g72Var.e);
                            arrayList5.add(b04);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
                    }
                    sv2.T(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (q73Var.e) {
                    if (bundle == null) {
                        bundle = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", q73Var.e);
                }
                return bundle;
            case 25:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 26:
                h94 h94Var = (h94) obj2;
                Map map = h94Var.I;
                n43 n43Var = h94Var.J;
                Object[] objArr = n43Var.b;
                Object[] objArr2 = n43Var.c;
                long[] jArr = n43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj3 = objArr[i9];
                                    Map d2 = ((j94) objArr2[i9]).d();
                                    if (d2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 27:
                return obj2;
            case 28:
                oj ojVar = (oj) obj2;
                return p70.u(ojVar.J, ea4.a(ojVar.I, ea4.a, (f94) obj));
            default:
                return Integer.valueOf(((m35) obj2).a);
        }
    }
}

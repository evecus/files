package defpackage;

import com.github.mytv.dv.model.DanmakuItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wo0 {
    public final yo0 a;
    public List b;
    public List c;
    public final HashMap d;
    public final HashSet e;
    public final ArrayList f;
    public long[] g;
    public float h;
    public float i;
    public to0 j;
    public Long k;
    public boolean l;
    public boolean m;

    public wo0(yo0 yo0Var) {
        this.a = yo0Var;
        o91 o91Var = o91.I;
        this.b = o91Var;
        this.c = o91Var;
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new ArrayList();
        this.g = new long[0];
        this.l = true;
    }

    public final Collection a() {
        Collection values = this.d.values();
        values.getClass();
        return values;
    }

    public final List b(float f, float f2, to0 to0Var, long j) {
        Long l;
        to0Var.getClass();
        float f3 = to0Var.b;
        float f4 = 0.0f;
        if (f <= 0.0f || f2 <= 0.0f) {
            return o91.I;
        }
        int i = 1;
        if (this.h != f || this.i != f2 || !j42.c(this.j, to0Var) || ((l = this.k) != null && j < l.longValue())) {
            this.l = true;
        }
        this.h = f;
        this.i = f2;
        this.j = to0Var;
        this.k = Long.valueOf(j);
        long j2 = j - 1000;
        boolean z = this.l;
        long j3 = 0;
        HashSet hashSet = this.e;
        ArrayList arrayList = this.f;
        if (z) {
            arrayList.clear();
            hashSet.clear();
            int i2 = (int) ((f2 * to0Var.a) / f3);
            if (i2 < 1) {
                i2 = 1;
            }
            this.g = new long[i2];
        } else {
            u70.J0(arrayList, new cc(j2, (byte) 2));
            if (this.m) {
                long[] jArr = this.g;
                Arrays.fill(jArr, 0, jArr.length, 0L);
                Iterator it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    uo0 uo0Var = (uo0) next;
                    long[] jArr2 = this.g;
                    float f5 = f4;
                    int i3 = uo0Var.c;
                    jArr2[i3] = Math.max(jArr2[i3], uo0Var.g);
                    j3 = j3;
                    f4 = f5;
                    arrayList = arrayList;
                }
            }
        }
        float f6 = f4;
        long j4 = j3;
        ArrayList arrayList2 = arrayList;
        if (!this.l && !this.m) {
            return arrayList2;
        }
        float f7 = to0Var.f;
        Float valueOf = Float.valueOf(f7);
        if (f7 <= f6) {
            valueOf = null;
        }
        float floatValue = (valueOf != null ? valueOf.floatValue() : f) / to0Var.e;
        for (DanmakuItem danmakuItem : this.c) {
            if (hashSet.add(danmakuItem.getDanmakuId()) && danmakuItem.getStatus() == i && !danmakuItem.isAd()) {
                xw2 xw2Var = (xw2) sv2.E(danmakuItem.getText(), this.d);
                int length = this.g.length;
                int i4 = -1;
                long j5 = Long.MAX_VALUE;
                for (int i5 = 0; i5 < length; i5++) {
                    long offsetTime = danmakuItem.getOffsetTime() - this.g[i5];
                    if (offsetTime >= j4 && offsetTime < j5) {
                        i4 = i5;
                        j5 = offsetTime;
                    }
                }
                if (i4 >= 0) {
                    long offsetTime2 = danmakuItem.getOffsetTime() + ((long) (((xw2Var.a * 2.0f) + to0Var.d) / floatValue));
                    this.g[i4] = offsetTime2;
                    long offsetTime3 = danmakuItem.getOffsetTime() + ((long) (((2.0f * xw2Var.a) + f) / floatValue));
                    if (offsetTime3 >= j2) {
                        arrayList2.add(new uo0(danmakuItem, xw2Var, i4, (i4 * f3) + to0Var.c, floatValue, offsetTime3, offsetTime2));
                    }
                }
                i = 1;
            }
        }
        this.l = false;
        this.m = false;
        return arrayList2;
    }

    public final boolean c(List list) {
        list.getClass();
        int i = 0;
        if (list.equals(this.b)) {
            return false;
        }
        List list2 = this.b;
        int J = sv2.J(p70.J(list2, 10));
        if (J < 16) {
            J = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J);
        for (Object obj : list2) {
            linkedHashMap.put(((DanmakuItem) obj).getDanmakuId(), obj);
        }
        int J2 = sv2.J(p70.J(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(J2 >= 16 ? J2 : 16);
        for (Object obj2 : list) {
            linkedHashMap2.put(((DanmakuItem) obj2).getDanmakuId(), obj2);
        }
        DanmakuItem danmakuItem = (DanmakuItem) o70.b1(this.c);
        long offsetTime = danmakuItem != null ? danmakuItem.getOffsetTime() : Long.MIN_VALUE;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DanmakuItem danmakuItem2 = (DanmakuItem) it.next();
                DanmakuItem danmakuItem3 = (DanmakuItem) linkedHashMap.get(danmakuItem2.getDanmakuId());
                if ((danmakuItem3 != null && !danmakuItem3.equals(danmakuItem2)) || (danmakuItem3 == null && danmakuItem2.getOffsetTime() < offsetTime)) {
                    this.l = true;
                    break;
                }
            }
        }
        this.e.retainAll(linkedHashMap2.keySet());
        u70.J0(this.f, new v1(linkedHashMap2, (byte) 14));
        this.b = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (hashSet.add(((DanmakuItem) obj3).getDanmakuId())) {
                arrayList.add(obj3);
            }
        }
        this.c = o70.k1(arrayList, new xi1((byte) 8));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list) {
            DanmakuItem danmakuItem4 = (DanmakuItem) obj4;
            if (danmakuItem4.getStatus() == 1 && !danmakuItem4.isAd()) {
                arrayList2.add(obj4);
            }
        }
        HashSet hashSet2 = new HashSet();
        int size = arrayList2.size();
        while (i < size) {
            Object obj5 = arrayList2.get(i);
            i++;
            hashSet2.add(((DanmakuItem) obj5).getText());
        }
        HashMap hashMap = this.d;
        hashMap.keySet().retainAll(hashSet2);
        Iterator it2 = hashSet2.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next = it2.next();
            next.getClass();
            String str = (String) next;
            if (hashMap.get(str) == null) {
                hashMap.put(str, (xw2) this.a.invoke(str));
            }
        }
        this.m = true;
        return true;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j25 {
    public static final h25 f = new h25();
    public final zs1 a;
    public zs1 b;
    public ArrayList c;
    public ArrayList d;
    public HashMap e;

    public j25(zs1 zs1Var) {
        zs1Var.getClass();
        this.a = zs1Var;
    }

    public final zs1 a() {
        return (zs1) c().get(0);
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            zs1 zs1Var = this.a;
            arrayList2.add(new zs1(o7.Q(d, zs1Var.c, zs1Var.d)));
        }
        ArrayList P = p70.P(p70.j0(arrayList2));
        this.d = P;
        return P;
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b());
        arrayList2.add(this.a);
        t70.H0(new i25(this), arrayList2);
        this.c = arrayList2;
        return arrayList2;
    }

    public final double d(zs1 zs1Var) {
        zs1Var.getClass();
        Object obj = ((HashMap) e()).get(f());
        obj.getClass();
        double doubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) e()).get(a());
        obj2.getClass();
        double doubleValue2 = doubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) e()).get(zs1Var);
        obj3.getClass();
        double doubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) e()).get(a());
        obj4.getClass();
        double doubleValue4 = doubleValue3 - ((Number) obj4).doubleValue();
        if (doubleValue2 == 0.0d) {
            return 0.5d;
        }
        return doubleValue4 / doubleValue2;
    }

    public final Map e() {
        HashMap hashMap = this.e;
        if (hashMap != null) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zs1 zs1Var = (zs1) obj;
            hashMap2.put(zs1Var, Double.valueOf(h25.a(zs1Var)));
        }
        this.e = hashMap2;
        return hashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j25) && j42.c(this.a, ((j25) obj).a);
    }

    public final zs1 f() {
        return (zs1) c().get(c().size() - 1);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.a + ")";
    }
}

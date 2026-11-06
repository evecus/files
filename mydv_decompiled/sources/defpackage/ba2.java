package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ba2 {
    public static final j81 g = new j81((byte) 10);
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final Set f;

    public ba2(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet;
        this.f = set;
    }

    public final int a(v71 v71Var) {
        ic2 j = eg5.j(v71Var);
        synchronized (this) {
            Integer num = (Integer) this.b.get(j);
            if (num != null) {
                int intValue = num.intValue();
                this.e.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % mc2.c;
                if (i == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (i + 1) % mc2.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(j, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(ro roVar) {
        Object d = tq1.a.d(this.a, qc2.b, eg5.w(this.d), new k((Object) this, (fj0) null, (byte) 8), roVar);
        return d == el0.I ? d : wd5.a;
    }
}

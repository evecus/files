package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j85 {
    public final double a;
    public final double b;
    public final HashMap c = new HashMap();

    public j85(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.c;
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            int Q = o7.Q(this.a, 200.0d, i);
            double d = j42.y(Q).b;
            p70.l0(Q);
            obj = Double.valueOf(d);
            hashMap.put(valueOf, obj);
        }
        return ((Number) obj).doubleValue();
    }
}

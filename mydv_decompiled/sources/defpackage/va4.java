package defpackage;

import android.util.LruCache;
import com.materialkolor.DynamicColorSchemeKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class va4 {
    public static final LruCache a = new LruCache(256);

    public static void a(long j, vj3 vj3Var, double d) {
        vj3Var.getClass();
        int i0 = qb.i0(j);
        a90 a90Var = a90.L;
        ua4 ua4Var = new ua4(i0, vj3Var, true, d, a90Var);
        LruCache lruCache = a;
        if (lruCache.get(ua4Var) != null) {
            return;
        }
        lruCache.put(ua4Var, DynamicColorSchemeKt.m136dynamicColorSchemeN98v4SY$default(j, true, false, null, null, null, null, null, null, vj3Var, d, a90Var, null, null, 12796, null));
    }

    public static k80 b(long j, boolean z, vj3 vj3Var, double d) {
        vj3Var.getClass();
        int i0 = qb.i0(j);
        a90 a90Var = a90.L;
        ua4 ua4Var = new ua4(i0, vj3Var, z, d, a90Var);
        LruCache lruCache = a;
        k80 k80Var = (k80) lruCache.get(ua4Var);
        if (k80Var != null) {
            return k80Var;
        }
        k80 m136dynamicColorSchemeN98v4SY$default = DynamicColorSchemeKt.m136dynamicColorSchemeN98v4SY$default(j, z, false, null, null, null, null, null, null, vj3Var, d, a90Var, null, null, 12796, null);
        lruCache.put(ua4Var, m136dynamicColorSchemeN98v4SY$default);
        return m136dynamicColorSchemeN98v4SY$default;
    }
}

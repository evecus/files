package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ha5 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final ba2 d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final n12 h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;
    public final hq1 o;

    public ha5(Context context, int i, boolean z, ba2 ba2Var, int i2, boolean z2, AtomicInteger atomicInteger, n12 n12Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, hq1 hq1Var) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = ba2Var;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = n12Var;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
        this.o = hq1Var;
    }

    public static ha5 a(ha5 ha5Var, int i, AtomicInteger atomicInteger, n12 n12Var, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new ha5(ha5Var.a, ha5Var.b, ha5Var.c, ha5Var.d, (i2 & 16) != 0 ? ha5Var.e : i, (i2 & 32) != 0 ? ha5Var.f : true, (i2 & 64) != 0 ? ha5Var.g : atomicInteger, (i2 & 128) != 0 ? ha5Var.h : n12Var, (i2 & 256) != 0 ? ha5Var.i : atomicBoolean, (i2 & 512) != 0 ? ha5Var.j : j, (i2 & 1024) != 0 ? ha5Var.k : 0, (i2 & 4096) != 0 ? ha5Var.l : true, (i2 & 8192) != 0 ? ha5Var.m : num, ha5Var.n, ha5Var.o);
    }

    public final ha5 b(n12 n12Var, int i) {
        return a(this, i, null, n12Var, null, 0L, null, 65391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ha5) {
            ha5 ha5Var = (ha5) obj;
            return this.a.equals(ha5Var.a) && this.b == ha5Var.b && this.c == ha5Var.c && this.d == ha5Var.d && this.e == ha5Var.e && this.f == ha5Var.f && j42.c(this.g, ha5Var.g) && j42.c(this.h, ha5Var.h) && j42.c(this.i, ha5Var.i) && this.j == ha5Var.j && this.k == ha5Var.k && this.l == ha5Var.l && j42.c(this.m, ha5Var.m) && j42.c(this.n, ha5Var.n) && this.o == ha5Var.o;
        }
        return false;
    }

    public final int hashCode() {
        int Q = (((((((i82.Q(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((((this.d.hashCode() + (((((this.a.hashCode() * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31)) * 31) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31) + this.k) * 31) - 1) * 31) + (this.l ? 1231 : 1237)) * 31;
        Integer num = this.m;
        int hashCode = (Q + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.n;
        return this.o.hashCode() + ((hashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) v11.c(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ", glanceComponents=" + this.o + ')';
    }
}

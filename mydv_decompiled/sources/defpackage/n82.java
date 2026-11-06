package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class n82 extends q13 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final t33 e;
    public final boolean f;

    public n82(Map map, Map map2, Map map3, Map map4, t33 t33Var, boolean z) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = t33Var;
        this.f = z;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new q82(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n82)) {
            return false;
        }
        n82 n82Var = (n82) obj;
        return this.a.equals(n82Var.a) && this.b.equals(n82Var.b) && this.c.equals(n82Var.c) && this.d.equals(n82Var.d) && j42.c(this.e, n82Var.e) && this.f == n82Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        t33 t33Var = this.e;
        return ((hashCode + (t33Var == null ? 0 : t33Var.hashCode())) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "KeyEventsElement(onKeyTap=" + this.a + ", onKeyLongTap=" + this.b + ", onKeyLongTapRepeat=" + this.c + ", onKeyLongTapRelease=" + this.d + ", interactionSource=" + this.e + ", playInteractionSounds=" + this.f + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        q82 q82Var = (q82) k13Var;
        q82Var.I = this.a;
        q82Var.J = this.b;
        q82Var.K = this.c;
        q82Var.L = this.d;
        t33 t33Var = q82Var.M;
        boolean z = this.f;
        t33 t33Var2 = this.e;
        boolean z2 = (t33Var == t33Var2 && q82Var.N == z) ? false : true;
        q82Var.M = t33Var2;
        q82Var.N = z;
        if (z2 && q82Var.isAttached()) {
            rv4 rv4Var = q82Var.S;
            fj0 fj0Var = null;
            if (rv4Var != null) {
                rv4Var.e(null);
            }
            q82Var.S = null;
            t33 t33Var3 = q82Var.M;
            if (t33Var3 != null && q82Var.N) {
                q82Var.S = p70.g0(q82Var.getCoroutineScope(), null, null, new q30(t33Var3, q82Var, fj0Var, (byte) 3), 3);
            }
        }
    }
}

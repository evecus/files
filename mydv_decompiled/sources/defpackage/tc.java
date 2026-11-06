package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tc {
    public final Context a;
    public final iu0 b;
    public final long c;
    public final li3 d;

    public tc(Context context, iu0 iu0Var, long j, li3 li3Var) {
        this.a = context;
        this.b = iu0Var;
        this.c = j;
        this.d = li3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        tc tcVar = (tc) obj;
        if (!j42.c(this.a, tcVar.a) || !j42.c(this.b, tcVar.b)) {
            return false;
        }
        long j = tcVar.c;
        int i = x70.h;
        return zc5.a(this.c, j) && this.d.equals(tcVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = x70.h;
        return this.d.hashCode() + pt1.l(hashCode, 31, this.c);
    }
}

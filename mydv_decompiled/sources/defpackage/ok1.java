package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ok1 {
    public final List a;

    public ok1(nk1... nk1VarArr) {
        if (nk1VarArr.length <= 0) {
            this.a = dq.o1(nk1VarArr);
        } else {
            nk1 nk1Var = nk1VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ok1) {
            return this.a.equals(((ok1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.a + ")";
    }
}

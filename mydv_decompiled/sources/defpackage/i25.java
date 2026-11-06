package defpackage;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i25 implements Comparator {
    public final /* synthetic */ j25 I;

    public i25(j25 j25Var) {
        this.I = j25Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        j25 j25Var = this.I;
        return j42.p((Comparable) ((HashMap) j25Var.e()).get((zs1) obj), (Comparable) ((HashMap) j25Var.e()).get((zs1) obj2));
    }
}

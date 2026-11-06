package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yo extends q13 {
    public final boolean a;
    public final tm1 b;

    public yo(tm1 tm1Var, boolean z) {
        this.a = z;
        this.b = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        tj0 tj0Var = new tj0();
        tj0Var.I = this.a;
        tj0Var.J = this.b;
        return tj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo)) {
            return false;
        }
        yo yoVar = (yo) obj;
        return this.a == yoVar.a && this.b == yoVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (pt1.o(this.a) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("semantics");
        fq b = z12Var.b();
        boolean z = this.a;
        b.b(Boolean.valueOf(z), "mergeDescendants");
        ki4 ki4Var = new ki4();
        ki4Var.K = z;
        this.b.invoke(ki4Var);
        fq b2 = z12Var.b();
        int J = sv2.J(p70.J(ki4Var, 10));
        if (J < 16) {
            J = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J);
        Iterator it = ki4Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((bj4) entry.getKey()).a, entry.getValue());
        }
        b2.b(linkedHashMap, "properties");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        tj0 tj0Var = (tj0) k13Var;
        tj0Var.I = this.a;
        tj0Var.J = this.b;
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y34 extends v71 {
    public lq1 c;

    public y34() {
        super(2);
        this.c = jq1.a;
    }

    @Override // defpackage.k71
    public final k71 a() {
        y34 y34Var = new y34();
        y34Var.c = this.c;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((k71) obj).a());
        }
        y34Var.b.addAll(arrayList2);
        return y34Var;
    }

    @Override // defpackage.k71
    public final lq1 b() {
        return this.c;
    }

    @Override // defpackage.k71
    public final void c(lq1 lq1Var) {
        this.c = lq1Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.c + ", children=[\n" + d() + "\n])";
    }
}

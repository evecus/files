package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n71 extends v71 {
    public lq1 c;
    public int d;
    public int e;

    public n71() {
        super(3);
        this.c = jq1.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.k71
    public final k71 a() {
        n71 n71Var = new n71();
        n71Var.c = this.c;
        n71Var.d = this.d;
        n71Var.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((k71) obj).a());
        }
        n71Var.b.addAll(arrayList2);
        return n71Var;
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
        return "EmittableColumn(modifier=" + this.c + ", verticalAlignment=" + ((Object) s8.b(this.d)) + ", horizontalAlignment=" + ((Object) r8.b(this.e)) + ", children=[\n" + d() + "\n])";
    }
}

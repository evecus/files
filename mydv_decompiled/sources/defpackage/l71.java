package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l71 extends v71 {
    public lq1 c;
    public t8 d;

    public l71() {
        super(3);
        this.c = jq1.a;
        this.d = t8.c;
    }

    @Override // defpackage.k71
    public final k71 a() {
        l71 l71Var = new l71();
        l71Var.c = this.c;
        l71Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((k71) obj).a());
        }
        l71Var.b.addAll(arrayList2);
        return l71Var;
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
        return "EmittableBox(modifier=" + this.c + ", contentAlignment=" + this.d + "children=[\n" + d() + "\n])";
    }
}

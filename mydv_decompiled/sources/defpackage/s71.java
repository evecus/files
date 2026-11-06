package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s71 extends v71 {
    public long c;
    public rq4 d;

    public s71() {
        super(3);
        this.c = 9205357640488583168L;
        this.d = qq4.a;
    }

    @Override // defpackage.k71
    public final k71 a() {
        s71 s71Var = new s71();
        s71Var.c = this.c;
        s71Var.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((k71) obj).a());
        }
        s71Var.b.addAll(arrayList2);
        return s71Var;
    }

    @Override // defpackage.k71
    public final lq1 b() {
        lq1 b;
        ArrayList arrayList = this.b;
        k71 k71Var = (k71) (arrayList.size() == 1 ? arrayList.get(0) : null);
        return (k71Var == null || (b = k71Var.b()) == null) ? fb4.n(jq1.a) : b;
    }

    @Override // defpackage.k71
    public final void c(lq1 lq1Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) v11.c(this.c)) + ", sizeMode=" + this.d + ", children=[\n" + d() + "\n])";
    }
}

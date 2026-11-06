package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nd1 extends pd1 {
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(List list, boolean z) {
        super(list);
        list.getClass();
        this.b = z;
    }

    @Override // defpackage.pd1
    public final pd1 a(jp3 jp3Var) {
        mk2 K = p70.K();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            K.add(((km0) list.get(i)).e(jp3Var));
        }
        return new nd1(p70.D(K), this.b);
    }

    public final String toString() {
        return "Corner: cubics=" + o70.Z0(this.a, ", ", null, null, 0, new m90((byte) 23), 30) + " convex=" + this.b;
    }
}

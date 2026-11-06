package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class pd1 {
    public final List a;

    public pd1(List list) {
        list.getClass();
        this.a = list;
    }

    public pd1 a(jp3 jp3Var) {
        mk2 K = p70.K();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            K.add(((km0) list.get(i)).e(jp3Var));
        }
        mk2 D = p70.D(K);
        D.getClass();
        return new od1(D);
    }
}

package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ m1(s1 s1Var, byte b) {
        this.a = b;
        this.b = s1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new p1(this.b);
            case 1:
                return new o1(this.b);
            default:
                return new q1(this.b);
        }
    }
}

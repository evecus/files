package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l4 extends v3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public l4(z6 z6Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        return new k4(this.i, this.h);
    }
}

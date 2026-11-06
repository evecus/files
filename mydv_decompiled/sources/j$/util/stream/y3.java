package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y3 extends v3 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y3(z6 z6Var, Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        switch (this.h) {
            case 0:
                return new p4((LongBinaryOperator) this.i);
            case 1:
                return new b4((DoubleBinaryOperator) this.i);
            case 2:
                return new g4((BinaryOperator) this.i);
            default:
                return new m4((IntBinaryOperator) this.i);
        }
    }
}

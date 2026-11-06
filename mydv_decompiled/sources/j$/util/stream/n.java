package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n extends e5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        byte b = this.b;
        l5 l5Var = this.a;
        a aVar = this.c;
        switch (b) {
            case 0:
                l5Var.accept((l5) ((DoubleFunction) ((p) aVar).m).apply(d));
                break;
            case 1:
                l5Var.accept(((DoubleUnaryOperator) ((q) aVar).m).applyAsDouble(d));
                break;
            default:
                ((DoubleConsumer) ((q) aVar).m).accept(d);
                l5Var.accept(d);
                break;
        }
    }
}

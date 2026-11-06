package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b1 extends g5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        byte b = this.b;
        l5 l5Var = this.a;
        a aVar = this.c;
        switch (b) {
            case 0:
                l5Var.accept((l5) ((LongFunction) ((p) aVar).m).apply(j));
                break;
            default:
                ((LongConsumer) ((e1) aVar).m).accept(j);
                l5Var.accept(j);
                break;
        }
    }
}

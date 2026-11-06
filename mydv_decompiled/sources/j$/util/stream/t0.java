package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class t0 extends f5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        byte b = this.b;
        l5 l5Var = this.a;
        a aVar = this.c;
        switch (b) {
            case 0:
                l5Var.accept((l5) ((IntFunction) ((p) aVar).m).apply(i));
                break;
            default:
                ((IntConsumer) ((u0) aVar).m).accept(i);
                l5Var.accept(i);
                break;
        }
    }
}

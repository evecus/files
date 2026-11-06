package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n6 extends t6 implements j$.util.u0 {
    public final /* synthetic */ o6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, int i, int i2, int i3, int i4) {
        super(o6Var, i, i2, i3, i4);
        this.g = o6Var;
    }

    @Override // j$.util.stream.t6
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.t6
    public final j$.util.d1 c(int i, int i2, int i3, int i4) {
        return new n6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.C(this, consumer);
    }
}

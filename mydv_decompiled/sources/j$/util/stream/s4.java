package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s4 extends w4 implements i5 {
    @Override // j$.util.stream.w4, j$.util.stream.l5
    public final void accept(double d) {
        this.b++;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // j$.util.stream.r4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        this.b += ((w4) q4Var).b;
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void n(Double d) {
        v3.d(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }
}

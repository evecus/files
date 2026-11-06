package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e0 extends j0 implements i5 {
    public static final d0 c;
    public static final d0 d;

    static {
        z6 z6Var = z6.DOUBLE_VALUE;
        j$.time.format.a aVar = new j$.time.format.a((byte) 28);
        j$.time.format.a aVar2 = new j$.time.format.a((byte) 29);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new d0(true, z6Var, b0Var, aVar, aVar2);
        d = new d0(false, z6Var, b0Var, new j$.time.format.a((byte) 28), new j$.time.format.a((byte) 29));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(double d2) {
        n(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Double) this.b).doubleValue());
        }
        return null;
    }
}

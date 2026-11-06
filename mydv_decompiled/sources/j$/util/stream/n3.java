package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n3 extends r3 implements i5 {
    public final double[] h;

    public n3(n3 n3Var, Spliterator spliterator, long j, long j2) {
        super(n3Var, spliterator, j, j2, n3Var.h.length);
        this.h = n3Var.h;
    }

    @Override // j$.util.stream.r3
    public final r3 a(Spliterator spliterator, long j, long j2) {
        return new n3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.r3, j$.util.stream.l5
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void n(Double d) {
        v3.d(this, d);
    }

    public n3(Spliterator spliterator, a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.h = dArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }
}

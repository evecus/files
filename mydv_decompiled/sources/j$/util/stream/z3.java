package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class z3 implements q4, i5 {
    public double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    public z3(double d, DoubleBinaryOperator doubleBinaryOperator) {
        this.b = d;
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.l5
    public final void accept(double d) {
        this.a = this.c.applyAsDouble(this.a, d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.a);
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        accept(((z3) q4Var).a);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void n(Double d) {
        v3.d(this, d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}

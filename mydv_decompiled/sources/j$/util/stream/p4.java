package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p4 implements q4, k5 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    public p4(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.l5
    public final void accept(long j) {
        if (!this.a) {
            this.b = this.c.applyAsLong(this.b, j);
        } else {
            this.a = false;
            this.b = j;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.d0.c : new j$.util.d0(this.b);
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        p4 p4Var = (p4) q4Var;
        if (p4Var.a) {
            return;
        }
        accept(p4Var.b);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void l(Long l) {
        v3.i(this, l);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}

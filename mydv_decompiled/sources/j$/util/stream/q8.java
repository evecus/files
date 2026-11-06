package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q8 extends u8 implements DoubleConsumer, j$.util.u0 {
    public double e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Spliterator spliterator, byte b) {
        super(spliterator);
        this.f = b;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // j$.util.stream.u8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new q8((j$.util.u0) spliterator, this, (byte) 0);
            default:
                return new q8((j$.util.u0) spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.u0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        byte b = this.f;
        Spliterator spliterator = this.a;
        DoublePredicate doublePredicate = null;
        switch (b) {
            case 0:
                if (!this.c) {
                    return ((j$.util.u0) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this);
                if (tryAdvance && a()) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                if (!tryAdvance) {
                    return tryAdvance;
                }
                doubleConsumer.accept(this.e);
                return tryAdvance;
            default:
                if (this.c && a() && ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this)) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.u0) trySplit();
            default:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.u0) super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Spliterator spliterator, u8 u8Var, byte b) {
        super(spliterator, u8Var);
        this.f = b;
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.l(this, consumer);
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.d1) trySplit();
            default:
                return trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.C(this, consumer);
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}

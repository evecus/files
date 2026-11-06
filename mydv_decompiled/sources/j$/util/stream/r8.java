package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class r8 extends u8 implements IntConsumer, j$.util.x0 {
    public int e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(Spliterator spliterator, byte b) {
        super(spliterator);
        this.f = b;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.u8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new r8((j$.util.x0) spliterator, this, (byte) 0);
            default:
                return new r8((j$.util.x0) spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.x0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        byte b = this.f;
        Spliterator spliterator = this.a;
        IntPredicate intPredicate = null;
        switch (b) {
            case 0:
                if (!this.c) {
                    return ((j$.util.x0) spliterator).tryAdvance(intConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.x0) spliterator).tryAdvance((IntConsumer) this);
                if (tryAdvance && a()) {
                    intPredicate.test(this.e);
                    throw null;
                }
                if (!tryAdvance) {
                    return tryAdvance;
                }
                intConsumer.accept(this.e);
                return tryAdvance;
            default:
                if (this.c && a() && ((j$.util.x0) spliterator).tryAdvance((IntConsumer) this)) {
                    intPredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        switch (this.f) {
            case 0:
                return (j$.util.x0) trySplit();
            default:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.x0) super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(Spliterator spliterator, u8 u8Var, byte b) {
        super(spliterator, u8Var);
        this.f = b;
    }

    @Override // j$.util.stream.u8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.m(this, consumer);
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
        return j$.time.a.D(this, consumer);
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}

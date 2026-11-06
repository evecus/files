package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h extends n implements Spliterator {
    public final /* synthetic */ byte i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j[] jVarArr, int i, int i2, int i3, long j, byte b) {
        super(jVarArr, i, i2, i3);
        this.i = b;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j a = a();
                    if (a == null) {
                        break;
                    } else {
                        consumer.n(a.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    j a2 = a();
                    if (a2 == null) {
                        break;
                    } else {
                        consumer.n(a2.c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return j$.time.a.q(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
        }
        return j$.time.a.s(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                j a = a();
                if (a != null) {
                    consumer.n(a.b);
                    break;
                } else {
                    break;
                }
            default:
                consumer.getClass();
                j a2 = a();
                if (a2 != null) {
                    consumer.n(a2.c);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                j[] jVarArr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new h(jVarArr, this.h, i3, i2, j, (byte) 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                j[] jVarArr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new h(jVarArr2, this.h, i6, i5, j2, (byte) 1);
        }
    }
}

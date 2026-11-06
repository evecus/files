package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c3 extends b3 implements v1 {
    @Override // j$.util.stream.l5
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            j$.time.h.g("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)});
        } else {
            this.b = i2 + 1;
            iArr[i2] = i;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.v1, j$.util.stream.x1
    public final b2 build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        j$.time.h.g("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
        return null;
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        int[] iArr = this.a;
        if (j == iArr.length) {
            this.b = 0;
        } else {
            j$.time.h.g("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void d(Integer num) {
        v3.g(this, num);
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final void end() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return;
        }
        j$.time.h.g("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
    }

    @Override // j$.util.stream.b3
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    @Override // j$.util.stream.x1
    public final /* bridge */ /* synthetic */ f2 build() {
        build();
        return this;
    }
}

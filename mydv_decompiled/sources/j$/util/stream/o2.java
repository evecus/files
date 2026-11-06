package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class o2 extends q2 implements b2 {
    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.r(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return v3.u(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        v3.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.e2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.f2
    public final j$.util.d1 spliterator() {
        return new f3(this);
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return new f3(this);
    }
}

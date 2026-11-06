package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class v2 extends z2 implements z1 {
    @Override // j$.util.stream.z2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final Object b() {
        return v3.g;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.q(this, consumer);
    }

    @Override // j$.util.stream.z2, j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return v3.t(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        v3.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final j$.util.d1 spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.z2, j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }
}

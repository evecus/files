package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class z2 implements f2 {
    @Override // j$.util.stream.f2
    public f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return v3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.f2
    public final int o() {
        return 0;
    }

    public final void g(Object obj) {
    }

    public final void f(int i, Object obj) {
    }
}

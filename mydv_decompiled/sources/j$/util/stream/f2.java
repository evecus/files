package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface f2 {
    f2 a(int i);

    long count();

    void forEach(Consumer consumer);

    f2 j(long j, long j2, IntFunction intFunction);

    void k(Object[] objArr, int i);

    Object[] m(IntFunction intFunction);

    int o();

    Spliterator spliterator();
}

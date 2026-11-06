package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    g onClose(Runnable runnable);

    g parallel();

    g sequential();

    Spliterator spliterator();

    g unordered();
}

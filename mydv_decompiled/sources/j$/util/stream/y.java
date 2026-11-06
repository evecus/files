package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class y extends z {
    @Override // j$.util.stream.a
    public final boolean M() {
        return false;
    }

    @Override // j$.util.stream.g
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final c0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final c0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.h(this.f) ? this : new v(this, y6.r, (byte) 0);
    }
}

package j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class f1 implements Iterator, Consumer {
    public boolean a = false;
    public Object b;
    public final /* synthetic */ Spliterator c;

    public f1(Spliterator spliterator) {
        this.c = spliterator;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.a = true;
        this.b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

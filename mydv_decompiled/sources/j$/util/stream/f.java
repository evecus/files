package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements BaseStream {
    public final /* synthetic */ g a;

    public /* synthetic */ f(g gVar) {
        this.a = gVar;
    }

    public static /* synthetic */ BaseStream h(g gVar) {
        if (gVar == null) {
            return null;
        }
        return gVar instanceof e ? ((e) gVar).a : gVar instanceof c0 ? b0.h((c0) gVar) : gVar instanceof IntStream ? IntStream.Wrapper.convert((IntStream) gVar) : gVar instanceof l1 ? k1.h((l1) gVar) : gVar instanceof Stream ? Stream.Wrapper.convert((Stream) gVar) : new f(gVar);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        g gVar = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return h(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return h(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return h(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return h(this.a.unordered());
    }
}

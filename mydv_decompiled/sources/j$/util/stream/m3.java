package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class m3 extends s6 implements d2, w1 {
    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.u6, j$.util.stream.e2
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    @Override // j$.util.stream.u6, j$.util.stream.e2
    public final void f(int i, Object obj) {
        super.f(i, (long[]) obj);
    }

    @Override // j$.util.stream.u6, j$.util.stream.e2
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return v3.v(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        v3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void l(Long l) {
        v3.i(this, l);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.m(this, intFunction);
    }

    @Override // j$.util.stream.f2
    public final int o() {
        return 0;
    }

    @Override // j$.util.stream.s6, j$.util.stream.u6, java.lang.Iterable, j$.util.stream.f2
    public final j$.util.d1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.s6
    /* renamed from: v */
    public final j$.util.a1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.s6, j$.util.stream.u6, java.lang.Iterable, j$.util.stream.f2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.stream.w1, j$.util.stream.x1
    public final d2 build() {
        return this;
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}

package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements k5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ m7(LongConsumer longConsumer, byte b) {
        this.a = b;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        byte b = this.a;
        LongConsumer longConsumer = this.b;
        switch (b) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((s6) longConsumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        byte b = this.a;
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.l5
    public final void end() {
        byte b = this.a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void l(Long l) {
        switch (this.a) {
            case 0:
                v3.i(this, l);
                break;
            default:
                v3.i(this, l);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.time.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                v3.k();
                throw null;
            default:
                v3.k();
                throw null;
        }
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                v3.c();
                throw null;
            default:
                v3.c();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
                break;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void f() {
    }

    private final void g() {
    }
}

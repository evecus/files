package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements l5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ b8(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                ((v6) consumer).n(obj);
                break;
            default:
                consumer.n(obj);
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
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                v3.l();
                throw null;
            default:
                v3.l();
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

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void f() {
    }

    private final void g() {
    }
}

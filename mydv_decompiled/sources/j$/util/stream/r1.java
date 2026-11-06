package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class r1 implements l5 {
    public boolean a;
    public boolean b;

    public r1(s1 s1Var) {
        this.b = !s1Var.b;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}

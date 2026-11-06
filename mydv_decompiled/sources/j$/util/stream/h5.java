package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class h5 implements l5 {
    public final l5 a;

    public h5(l5 l5Var) {
        this.a = (l5) Objects.requireNonNull(l5Var);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public void c(long j) {
        this.a.c(j);
    }

    @Override // j$.util.stream.l5
    public boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.l5
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }
}

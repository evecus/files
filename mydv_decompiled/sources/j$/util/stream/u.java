package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class u extends e5 {
    public boolean b;
    public final j$.util.e0 c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, l5 l5Var) {
        super(l5Var);
        this.d = qVar;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.e0(l5Var2, (byte) 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        c0 c0Var = (c0) ((j$.util.p) this.d.m).apply(d);
        if (c0Var != null) {
            try {
                boolean z = this.b;
                j$.util.e0 e0Var = this.c;
                if (z) {
                    j$.util.u0 spliterator = c0Var.sequential().spliterator();
                    while (!this.a.e() && spliterator.tryAdvance((DoubleConsumer) e0Var)) {
                    }
                } else {
                    c0Var.sequential().forEach(e0Var);
                }
            } catch (Throwable th) {
                try {
                    c0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c0Var != null) {
            c0Var.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}

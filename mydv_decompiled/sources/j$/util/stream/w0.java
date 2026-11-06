package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class w0 extends f5 {
    public boolean b;
    public final j$.util.i0 c;
    public final /* synthetic */ u0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.d = u0Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.i0(l5Var2, (byte) 1);
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((l0) this.d.m).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.i0 i0Var = this.c;
                if (z) {
                    j$.util.x0 spliterator = intStream.sequential().spliterator();
                    while (!this.a.e() && spliterator.tryAdvance((IntConsumer) i0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(i0Var);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}

package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class d1 extends g5 {
    public boolean b;
    public final j$.util.m0 c;
    public final /* synthetic */ e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, l5 l5Var) {
        super(l5Var);
        this.d = e1Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.m0(l5Var2, (byte) 1);
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        l1 l1Var = (l1) ((j$.util.p) this.d.m).apply(j);
        if (l1Var != null) {
            try {
                boolean z = this.b;
                j$.util.m0 m0Var = this.c;
                if (z) {
                    j$.util.a1 spliterator = l1Var.sequential().spliterator();
                    while (!this.a.e() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                    }
                } else {
                    l1Var.sequential().forEach(m0Var);
                }
            } catch (Throwable th) {
                try {
                    l1Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (l1Var != null) {
            l1Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}

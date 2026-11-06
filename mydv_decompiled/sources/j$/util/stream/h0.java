package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h0 extends j0 implements k5 {
    public static final d0 c;
    public static final d0 d;

    static {
        z6 z6Var = z6.LONG_VALUE;
        f0 f0Var = new f0((byte) 2);
        f0 f0Var2 = new f0((byte) 3);
        j$.util.d0 d0Var = j$.util.d0.c;
        c = new d0(true, z6Var, d0Var, f0Var, f0Var2);
        d = new d0(false, z6Var, d0Var, new f0((byte) 2), new f0((byte) 3));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.g(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.d0(((Long) this.b).longValue());
        }
        return null;
    }
}

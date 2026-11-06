package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class g0 extends j0 implements j5 {
    public static final d0 c;
    public static final d0 d;

    static {
        z6 z6Var = z6.INT_VALUE;
        f0 f0Var = new f0((byte) 0);
        f0 f0Var2 = new f0((byte) 1);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new d0(true, z6Var, c0Var, f0Var, f0Var2);
        d = new d0(false, z6Var, c0Var, new f0((byte) 0), new f0((byte) 1));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Integer) this.b).intValue());
        }
        return null;
    }
}

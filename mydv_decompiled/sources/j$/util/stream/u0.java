package j$.util.stream;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class u0 extends z0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a1 a1Var, IntConsumer intConsumer) {
        super(a1Var, 0);
        this.l = (byte) 0;
        this.m = intConsumer;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new t0(this, l5Var, (byte) 1);
            case 1:
                return new w0(this, l5Var);
            case 2:
                return new l(this, l5Var, (byte) 4);
            default:
                return new y4(this, l5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}

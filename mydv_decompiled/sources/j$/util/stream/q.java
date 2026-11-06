package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q extends y {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, DoubleConsumer doubleConsumer) {
        super(zVar, 0);
        this.l = (byte) 2;
        this.m = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new n(this, l5Var, (byte) 1);
            case 1:
                return new u(this, l5Var);
            case 2:
                return new n(this, l5Var, (byte) 2);
            case 3:
                return new l(this, l5Var, (byte) 6);
            default:
                return new y4(this, l5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}

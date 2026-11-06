package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p extends c5 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d5 d5Var, Consumer consumer) {
        super(d5Var, 0);
        this.l = (byte) 3;
        this.m = consumer;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new n(this, l5Var, (byte) 0);
            case 1:
                return new t0(this, l5Var, (byte) 0);
            case 2:
                return new b1(this, l5Var, (byte) 0);
            case 3:
                return new l(this, l5Var, (byte) 1);
            case 4:
                return new l(this, l5Var, (byte) 2);
            case 5:
                return new l(this, l5Var, (byte) 3);
            default:
                return new k(this, l5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}

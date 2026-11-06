package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e1 extends h1 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, LongConsumer longConsumer) {
        super(i1Var, 0);
        this.l = (byte) 1;
        this.m = longConsumer;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new d1(this, l5Var);
            case 1:
                return new b1(this, l5Var, (byte) 1);
            case 2:
                return new y4(this, l5Var);
            default:
                return new l(this, l5Var, (byte) 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}

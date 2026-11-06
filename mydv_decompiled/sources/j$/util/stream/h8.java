package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h8 extends b5 implements m8 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(d5 d5Var, int i, Predicate predicate, byte b) {
        super(d5Var, i);
        this.l = b;
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final f2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                return (f2) new p8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (f2) new o8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        byte b = 0;
        switch (this.l) {
            case 0:
                return y6.ORDERED.h(aVar.f) ? K(aVar, spliterator, new g2(b)).spliterator() : new t8(aVar.T(spliterator), this.m, (byte) 1);
            default:
                return y6.ORDERED.h(aVar.f) ? K(aVar, spliterator, new g2(b)).spliterator() : new t8(aVar.T(spliterator), this.m, (byte) 0);
        }
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new k(this, l5Var);
            default:
                return new i8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.m8
    public n8 h(x1 x1Var, boolean z) {
        return new i8(this, x1Var, z);
    }
}

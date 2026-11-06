package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class r extends e5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 1:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 2:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public void c(long j) {
        switch (this.b) {
            case 2:
                this.a.c(-1L);
                break;
            case 3:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public boolean e() {
        switch (this.b) {
            case 3:
                return this.a.e();
            default:
                return super.e();
        }
    }
}

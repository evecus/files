package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class v0 extends f5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            case 1:
                this.a.accept(i);
                return;
            case 2:
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            case 5:
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
            default:
                IntPredicate intPredicate2 = null;
                intPredicate2.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public void c(long j) {
        switch (this.b) {
            case 5:
                this.a.c(-1L);
                break;
            case 6:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public boolean e() {
        switch (this.b) {
            case 6:
                return this.a.e();
            default:
                return super.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
    }
}

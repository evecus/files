package j$.util.stream;

import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c1 extends g5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(l5 l5Var) {
        super(l5Var);
        this.b = (byte) 0;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(j);
                return;
            case 1:
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                LongPredicate longPredicate2 = null;
                longPredicate2.test(j);
                throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public void c(long j) {
        switch (this.b) {
            case 4:
                this.a.c(-1L);
                break;
            case 5:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public boolean e() {
        switch (this.b) {
            case 5:
                return this.a.e();
            default:
                return super.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
    }
}

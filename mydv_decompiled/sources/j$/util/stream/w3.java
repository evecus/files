package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class w3 extends v3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public w3(z6 z6Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        return new o4(this.i, this.h);
    }
}

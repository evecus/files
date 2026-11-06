package j$.util.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements IntFunction, LongFunction, BinaryOperator, Consumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ g2(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        byte b = this.a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.time.a.d(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            default:
                return new Double[i];
            case 8:
                return new Object[i];
            case 9:
                return new Integer[i];
            case 10:
                return new Long[i];
            case 11:
                return new Double[i];
            case 14:
                return new Integer[i];
            case 15:
                return new Integer[i];
            case 16:
                return new Long[i];
            case 17:
                return new Long[i];
            case 18:
                return new Double[i];
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.time.a.e(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 1:
                return v3.F(j);
            case 2:
            default:
                return v3.O(j);
            case 3:
                return v3.N(j);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new n2((z1) obj, (z1) obj2);
            case 3:
            case 5:
            default:
                return new r2((f2) obj, (f2) obj2);
            case 4:
                return new o2((b2) obj, (b2) obj2);
            case 6:
                return new p2((d2) obj, (d2) obj2);
        }
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(Object obj) {
    }
}

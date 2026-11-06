package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BiConsumer b;

    public /* synthetic */ o(BiConsumer biConsumer, byte b) {
        this.a = b;
        this.b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.time.a.d(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        byte b = this.a;
        BiConsumer biConsumer = this.b;
        switch (b) {
            case 0:
                biConsumer.accept(obj, obj2);
                break;
            case 1:
                biConsumer.accept(obj, obj2);
                break;
            default:
                biConsumer.accept(obj, obj2);
                break;
        }
        return obj;
    }
}

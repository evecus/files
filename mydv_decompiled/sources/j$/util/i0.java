package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.l5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements IntConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ i0(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(Integer.valueOf(i));
                break;
            default:
                ((l5) consumer).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}

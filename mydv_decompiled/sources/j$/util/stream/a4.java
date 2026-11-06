package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a4 extends v3 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a4(z6 z6Var, Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        byte b = this.h;
        Object obj = this.j;
        Object obj2 = this.k;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new x3((Supplier) obj3, (ObjLongConsumer) obj2, (o) obj);
            case 1:
                return new d4((Supplier) obj3, (ObjDoubleConsumer) obj2, (o) obj);
            case 2:
                return new f4(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new j4((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new n4((Supplier) obj3, (ObjIntConsumer) obj2, (o) obj);
        }
    }
}

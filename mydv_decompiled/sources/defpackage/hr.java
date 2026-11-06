package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class hr implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ Function andThen(Function function) {
        byte b = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
        }
        return Integer.valueOf(Integer.bitCount(num.intValue()));
    }

    public /* synthetic */ Function compose(Function function) {
        byte b = this.a;
        return Function$CC.$default$compose(this, function);
    }
}

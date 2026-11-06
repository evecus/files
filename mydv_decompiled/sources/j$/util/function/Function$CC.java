package j$.util.function;

import j$.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, (byte) 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, (byte) 1);
    }
}

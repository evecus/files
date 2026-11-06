package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l63 implements Comparator, j$.util.Comparator {
    public static final l63 J = new l63(0);
    public static final l63 K = new l63(1);
    public final /* synthetic */ byte I;

    public /* synthetic */ l63(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.I) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.I) {
            case 0:
                return K;
            default:
                return J;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        byte b = this.I;
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        byte b = this.I;
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        byte b = this.I;
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        byte b = this.I;
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator a;
        byte b = this.I;
        a = Comparator.EL.a(this, Comparator.CC.comparing(function));
        return a;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        byte b = this.I;
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}

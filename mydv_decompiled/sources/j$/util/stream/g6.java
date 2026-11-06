package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class g6 extends b5 {
    public final boolean l;
    public final Comparator m;

    public g6(d5 d5Var, Comparator comparator) {
        super(d5Var, y6.q | y6.p);
        this.l = false;
        this.m = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final f2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (y6.SORTED.h(aVar.f) && this.l) {
            return aVar.C(spliterator, false, intFunction);
        }
        Object[] m = aVar.C(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(m, this.m);
        return new j2(m);
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (y6.SORTED.h(i) && this.l) {
            return l5Var;
        }
        boolean h = y6.SIZED.h(i);
        Comparator comparator = this.m;
        return h ? new l6(l5Var, comparator) : new h6(l5Var, comparator);
    }

    public g6(d5 d5Var) {
        super(d5Var, y6.q | y6.o);
        this.l = true;
        this.m = j$.util.e.INSTANCE;
    }
}

package j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h4 extends v3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ i k;

    public h4(z6 z6Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, i iVar) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = iVar;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        return new i4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final int f() {
        Set<Collector.Characteristics> characteristics = this.k.a.characteristics();
        if (characteristics != null && !characteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = characteristics.iterator().next();
            if (next instanceof h) {
                Iterator<Collector.Characteristics> it = characteristics.iterator();
                while (it.hasNext()) {
                    try {
                        h hVar = (h) it.next();
                        hashSet.add(hVar == null ? null : hVar == h.CONCURRENT ? Collector.Characteristics.CONCURRENT : hVar == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e) {
                        j$.util.f.a(e, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    j$.util.f.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = characteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? h.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH);
                    } catch (ClassCastException e2) {
                        j$.util.f.a(e2, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            characteristics = hashSet;
        }
        if (characteristics.contains(h.UNORDERED)) {
            return y6.r;
        }
        return 0;
    }
}

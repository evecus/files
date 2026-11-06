package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class m extends b5 {
    public static k2 U(a aVar, Spliterator spliterator) {
        j$.time.format.a aVar2 = new j$.time.format.a((byte) 12);
        j$.time.format.a aVar3 = new j$.time.format.a((byte) 13);
        j$.time.format.a aVar4 = new j$.time.format.a((byte) 14);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        Objects.requireNonNull(aVar4);
        return new k2((Collection) new a4(z6.REFERENCE, aVar4, aVar3, aVar2, (byte) 3).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final f2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (y6.DISTINCT.h(aVar.f)) {
            return aVar.C(spliterator, false, intFunction);
        }
        if (y6.ORDERED.h(aVar.f)) {
            return U(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.r rVar = new j$.util.concurrent.r(atomicBoolean, concurrentHashMap, (byte) 4);
        Objects.requireNonNull(rVar);
        new p0(rVar, false).g(aVar, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new k2(keySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        return y6.DISTINCT.h(aVar.f) ? aVar.T(spliterator) : y6.ORDERED.h(aVar.f) ? U(aVar, spliterator).spliterator() : new h7(aVar.T(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        return y6.DISTINCT.h(i) ? l5Var : y6.SORTED.h(i) ? new k(l5Var) : new l(l5Var);
    }
}

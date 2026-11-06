package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n5 extends b5 {
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(d5 d5Var, int i, long j, long j2) {
        super(d5Var, i);
        this.l = j;
        this.m = j2;
    }

    @Override // j$.util.stream.a
    public final f2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long G = aVar.G(spliterator);
        if (G > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return v3.A(aVar, v3.Y(aVar2.I(), spliterator, this.l, this.m), true, intFunction);
        }
        if (y6.ORDERED.h(aVar.f)) {
            return (f2) new v5(this, aVar, spliterator, intFunction, this.l, this.m).invoke();
        }
        Spliterator T = aVar.T(spliterator);
        long j3 = this.l;
        long j4 = this.m;
        if (j3 <= G) {
            long j5 = G - j3;
            j = j4 >= 0 ? Math.min(j4, j5) : j5;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return v3.A(this, new y7(T, j2, j), true, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        long G = aVar.G(spliterator);
        if (G > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator T = aVar.T(spliterator);
            long j = this.l;
            return new s7(T, j, v3.z(j, this.m));
        }
        if (y6.ORDERED.h(aVar.f)) {
            return ((f2) new v5(this, aVar, spliterator, new g2((byte) 0), this.l, this.m).invoke()).spliterator();
        }
        Spliterator T2 = aVar.T(spliterator);
        long j2 = this.l;
        long j3 = this.m;
        if (j2 <= G) {
            long j4 = G - j2;
            j3 = j3 >= 0 ? Math.min(j3, j4) : j4;
            j2 = 0;
        }
        return new y7(T2, j2, j3);
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        return new m5(this, l5Var);
    }
}

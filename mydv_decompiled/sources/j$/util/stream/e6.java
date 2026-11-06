package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e6 extends y0 implements m8 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(a aVar, int i, byte b) {
        super(aVar, i);
        this.l = b;
    }

    @Override // j$.util.stream.a
    public final f2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                if (y6.SORTED.h(aVar.f)) {
                    return aVar.C(spliterator, false, intFunction);
                }
                int[] iArr = (int[]) ((b2) aVar.C(spliterator, true, intFunction)).b();
                Arrays.sort(iArr);
                return new b3(iArr);
            case 1:
                return (f2) new p8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (f2) new o8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public Spliterator L(a aVar, Spliterator spliterator) {
        switch (this.l) {
            case 1:
                return y6.ORDERED.h(aVar.f) ? K(aVar, spliterator, new g2((byte) 14)).spliterator() : new r8((j$.util.x0) aVar.T(spliterator), (byte) 1);
            case 2:
                return y6.ORDERED.h(aVar.f) ? K(aVar, spliterator, new g2((byte) 15)).spliterator() : new r8((j$.util.x0) aVar.T(spliterator), (byte) 0);
            default:
                return super.L(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                Objects.requireNonNull(l5Var);
                if (y6.SORTED.h(i)) {
                    return l5Var;
                }
                return y6.SIZED.h(i) ? new j6(l5Var) : new b6(l5Var);
            case 1:
                return new v0(this, l5Var, (byte) 6);
            default:
                return new j8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.m8
    public n8 h(x1 x1Var, boolean z) {
        return new j8(this, x1Var, z);
    }
}

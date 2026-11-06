package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class q2 extends i2 implements e2 {
    @Override // j$.util.stream.e2
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        Object newArray = newArray((int) j);
        f(0, newArray);
        return newArray;
    }

    @Override // j$.util.stream.e2
    public final void f(int i, Object obj) {
        f2 f2Var = this.a;
        ((e2) f2Var).f(i, obj);
        ((e2) this.b).f(i + ((int) ((e2) f2Var).count()), obj);
    }

    @Override // j$.util.stream.e2
    public final void g(Object obj) {
        ((e2) this.a).g(obj);
        ((e2) this.b).g(obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}

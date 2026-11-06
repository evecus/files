package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class z5 extends h5 {
    public final Comparator b;
    public boolean c;

    public z5(l5 l5Var, Comparator comparator) {
        super(l5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean e() {
        this.c = true;
        return false;
    }
}

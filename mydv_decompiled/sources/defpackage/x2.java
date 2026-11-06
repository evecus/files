package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x2 extends y2 implements RandomAccess {
    public final y2 I;
    public final int J;
    public final int K;

    public x2(y2 y2Var, int i, int i2) {
        this.I = y2Var;
        this.J = i;
        p70.F(i, i2, y2Var.c());
        this.K = i2 - i;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.K;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.K;
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.I.get(this.J + i);
    }

    @Override // defpackage.y2, java.util.List
    public final List subList(int i, int i2) {
        p70.F(i, i2, this.K);
        int i3 = this.J;
        return new x2(this.I, i + i3, i3 + i2);
    }
}

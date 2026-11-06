package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o41 implements oj4, q41 {
    public final oj4 a;
    public final int b;

    public o41(oj4 oj4Var, int i) {
        oj4Var.getClass();
        this.a = oj4Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.q41
    public final oj4 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new o41(this, i) : new o41(this.a, i2);
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        return new n41(this);
    }
}

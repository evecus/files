package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ep1 implements oj4 {
    public final /* synthetic */ byte a = 1;
    public final tm1 b;
    public final Object c;

    public ep1(oj4 oj4Var, tm1 tm1Var) {
        oj4Var.getClass();
        this.c = oj4Var;
        this.b = tm1Var;
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new dp1(this);
            default:
                return new v95(this);
        }
    }

    public ep1(rm1 rm1Var, tm1 tm1Var) {
        this.c = rm1Var;
        this.b = tm1Var;
    }
}

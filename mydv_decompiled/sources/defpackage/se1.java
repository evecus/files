package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class se1 implements oj4 {
    public final /* synthetic */ byte a;
    public final oj4 b;
    public final tm1 c;

    public /* synthetic */ se1(oj4 oj4Var, tm1 tm1Var, byte b) {
        this.a = b;
        this.b = oj4Var;
        this.c = tm1Var;
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new re1(this);
            default:
                return new re1(this, (byte) 0);
        }
    }
}

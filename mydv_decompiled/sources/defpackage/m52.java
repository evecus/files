package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m52 extends t95 {
    public final /* synthetic */ pn1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m52(Iterator it, pn1 pn1Var) {
        super(it);
        this.J = pn1Var;
    }

    @Override // defpackage.t95
    public final Object a(Object obj) {
        return this.J.apply(obj);
    }
}

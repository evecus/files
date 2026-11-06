package defpackage;

import com.github.mytv.dv.model.Comment;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class km5 implements jn1 {
    public final /* synthetic */ List I;

    public km5(List list) {
        this.I = list;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zd2 zd2Var = (zd2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((go1) fe0Var).g(zd2Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            Comment comment = (Comment) this.I.get(intValue);
            go1Var.d0(1447837095);
            on5.b(comment, go1Var, Comment.$stable);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}

package defpackage;

import com.github.mytv.dv.model.Author;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hw3 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ ki1 K;
    public final /* synthetic */ ki1 L;

    public hw3(List list, tm1 tm1Var, ki1 ki1Var, ki1 ki1Var2) {
        this.I = list;
        this.J = tm1Var;
        this.K = ki1Var;
        this.L = ki1Var2;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        rm1 rm1Var;
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
            Author author = (Author) this.I.get(intValue);
            go1Var.d0(-393905008);
            tm1 tm1Var = this.J;
            boolean g = go1Var.g(tm1Var) | go1Var.i(author);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = new gw3(tm1Var, author, (byte) 0);
                go1Var.o0(Q);
            }
            rm1 rm1Var2 = (rm1) Q;
            if (intValue == 0) {
                go1Var.d0(-393780575);
                boolean z = (((i & 14) ^ 6) > 4 && go1Var.g(zd2Var)) || (i & 6) == 4;
                ki1 ki1Var = this.K;
                boolean g2 = z | go1Var.g(ki1Var);
                Object Q2 = go1Var.Q();
                if (g2 || Q2 == jpVar) {
                    Q2 = new vv3(zd2Var, ki1Var, (byte) 1);
                    go1Var.o0(Q2);
                }
                rm1Var = (rm1) Q2;
                go1Var.q(false);
            } else {
                go1Var.d0(-393668790);
                go1Var.q(false);
                rm1Var = null;
            }
            rm1 rm1Var3 = rm1Var;
            l13 l13Var = i13.a;
            if (intValue == 0) {
                l13Var = j42.x(l13Var, this.L);
            }
            mw3.t(author, rm1Var2, rm1Var3, l13Var, go1Var, Author.$stable);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}

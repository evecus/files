package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nw0 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(t43 t43Var, sw0 sw0Var, gt4 gt4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = t43Var;
        this.K = sw0Var;
        this.L = gt4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        t43 t43Var = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                return new nw0(t43Var, (sw0) obj3, (gt4) obj2, fj0Var);
            default:
                return new nw0((Aweme) obj3, t43Var, (t43) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((nw0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((nw0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        t43 t43Var = this.J;
        Object obj3 = this.L;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                mu0.V(obj);
                sw0 sw0Var = (sw0) obj2;
                gt4 gt4Var = (gt4) obj3;
                for (p63 p63Var : (Set) t43Var.getValue()) {
                    if (!((List) ((fw4) sw0Var.b().e.I).getValue()).contains(p63Var) && !gt4Var.contains(p63Var)) {
                        sw0Var.b().c(p63Var);
                    }
                }
                break;
            default:
                t43 t43Var2 = (t43) obj3;
                mu0.V(obj);
                Aweme aweme = (Aweme) obj2;
                if (aweme != null) {
                    if (!on5.N(aweme)) {
                        aweme = null;
                    }
                    if (aweme != null) {
                        if (((Aweme) t43Var.getValue()) == null) {
                            t43Var.setValue(aweme);
                        }
                        if (((String) t43Var2.getValue()).length() == 0) {
                            String authenticationToken = aweme.getAuthenticationToken();
                            if (authenticationToken.length() == 0) {
                                authenticationToken = aweme.getVideo().getAuthenticationToken();
                            }
                            if (authenticationToken.length() > 0) {
                                t43Var2.setValue(authenticationToken);
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(Aweme aweme, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = aweme;
        this.J = t43Var;
        this.L = t43Var2;
    }
}

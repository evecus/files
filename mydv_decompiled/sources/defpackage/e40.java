package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e40 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public final /* synthetic */ ag2 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ List M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(ag2 ag2Var, t43 t43Var, List list, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = ag2Var;
        this.L = t43Var;
        this.M = list;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        t43 t43Var = this.L;
        ag2 ag2Var = this.K;
        List list = this.M;
        switch (b) {
            case 0:
                return new e40(ag2Var, list, t43Var, fj0Var);
            case 1:
                return new e40(ag2Var, t43Var, list, fj0Var);
            default:
                return new e40(list, ag2Var, t43Var, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((e40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String awemeId;
        byte b = this.I;
        int i = 0;
        wd5 wd5Var = wd5.a;
        ag2 ag2Var = this.K;
        List list = this.M;
        el0 el0Var = el0.I;
        t43 t43Var = this.L;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    zf1 p = o7.p(wi4.w(new d40(ag2Var, (byte) 0)));
                    y30 y30Var = new y30(list, t43Var, (byte) 1);
                    this.J = true;
                    if (p.collect(y30Var, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    Aweme aweme = (Aweme) t43Var.getValue();
                    int i2 = -1;
                    if (aweme != null && (awemeId = aweme.getAwemeId()) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (j42.c(((Aweme) it.next()).getAwemeId(), awemeId)) {
                                    i2 = i;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    if (i2 > 0 && i2 != ((gk3) ag2Var.e.b).h()) {
                        this.J = true;
                        if (ag2Var.f(i2, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    int size = list.size();
                    int intValue = ((Number) t43Var.getValue()).intValue();
                    if (intValue >= 0 && intValue < size) {
                        int intValue2 = ((Number) t43Var.getValue()).intValue();
                        this.J = true;
                        if (ag2.j(ag2Var, intValue2, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(ag2 ag2Var, List list, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = ag2Var;
        this.M = list;
        this.L = t43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(List list, ag2 ag2Var, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = list;
        this.K = ag2Var;
        this.L = t43Var;
    }
}

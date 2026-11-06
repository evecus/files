package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eq1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(dn2 dn2Var, String str, int i, ag2 ag2Var, it4 it4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.K = dn2Var;
        this.L = str;
        this.N = i;
        this.M = ag2Var;
        this.O = it4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                eq1 eq1Var = new eq1(obj4, obj3, this.N, obj2, fj0Var, (byte) 0);
                eq1Var.K = obj;
                return eq1Var;
            case 1:
                eq1 eq1Var2 = new eq1(obj4, obj3, this.N, obj2, fj0Var, (byte) 1);
                eq1Var2.K = obj;
                return eq1Var2;
            case 2:
                return new eq1((dn2) this.K, (String) obj4, this.N, (ag2) obj3, (it4) obj2, fj0Var);
            case 3:
                return new eq1((List) this.K, (gu3) obj4, (rm1) obj3, (zg2) obj2, this.N, fj0Var);
            default:
                return new eq1(obj4, obj3, this.N, obj2, fj0Var, (byte) 4);
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
        return ((eq1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        t43 t43Var;
        Object D0;
        byte b = this.I;
        Object[] objArr = 0;
        int i = this.N;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.O;
        Object obj3 = this.M;
        Object obj4 = this.L;
        el0 el0Var = el0.I;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    dl0 dl0Var = (dl0) this.K;
                    Context context = (Context) obj3;
                    Bundle bundle = (Bundle) obj2;
                    this.J = true;
                    if (((gq1) obj4).doOptionsChanged$glance_appwidget(dl0Var, context, this.N, bundle, this) == el0Var) {
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
                    dl0 dl0Var2 = (dl0) this.K;
                    Context context2 = (Context) obj3;
                    String str = (String) obj2;
                    this.J = true;
                    if (((gq1) obj4).doLambda$glance_appwidget(dl0Var2, context2, this.N, str, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            case 2:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    dn2 dn2Var = (dn2) this.K;
                    if (dn2Var != null) {
                        List list = dn2Var.b;
                        if (!list.isEmpty()) {
                            String str2 = (String) obj4;
                            uj3 uj3Var = str2 != null ? (uj3) ((it4) obj2).get(str2) : null;
                            Integer num = new Integer(i);
                            if (num.intValue() < 0) {
                                num = null;
                            }
                            int intValue = num != null ? num.intValue() : 0;
                            ag2 ag2Var = (ag2) obj3;
                            if (uj3Var != null) {
                                intValue = ((Number) uj3Var.I).intValue();
                            }
                            int r = ut0.r(intValue, 0, list.size() - 1);
                            int intValue2 = uj3Var != null ? ((Number) uj3Var.J).intValue() : 0;
                            this.J = true;
                            ag2Var.getClass();
                            Object d = ag2Var.d(d53.I, new zf2(ag2Var, r, intValue2, null), this);
                            if (d != el0Var) {
                                d = wd5Var;
                            }
                            if (d == el0Var) {
                                break;
                            }
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
            case 3:
                List list2 = (List) this.K;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    if (!list2.isEmpty()) {
                        gu3 gu3Var = (gu3) obj4;
                        if (gu3Var.c && !gu3Var.a && !gu3Var.b) {
                            byte b2 = 2;
                            w84 w = wi4.w(new wa1((zg2) obj2, list2, i, b2));
                            uv3 uv3Var = new uv3(b2, fj0Var, objArr == true ? 1 : 0);
                            this.J = true;
                            if (sp0.L(w, uv3Var, this) == el0Var) {
                                break;
                            }
                        }
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ((rm1) obj3).invoke();
                break;
            default:
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    t43Var = (t43) obj4;
                    os0 os0Var = sx0.a;
                    r30 r30Var = new r30((String) obj3, i, (cy3) obj2, (fj0) null);
                    this.K = t43Var;
                    this.J = true;
                    D0 = p70.D0(os0Var, r30Var, this);
                    if (D0 == el0Var) {
                        break;
                    }
                } else if (!z5) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t43Var = (t43) this.K;
                    mu0.V(obj);
                    D0 = obj;
                }
                t43Var.setValue(D0);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq1(Object obj, Object obj2, int i, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = i;
        this.O = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(List list, gu3 gu3Var, rm1 rm1Var, zg2 zg2Var, int i, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 3;
        this.K = list;
        this.L = gu3Var;
        this.M = rm1Var;
        this.O = zg2Var;
        this.N = i;
    }
}

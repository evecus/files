package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hj1 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public boolean K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(u45 u45Var, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = u45Var;
        this.K = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new hj1((ij1) obj2, fj0Var);
            default:
                return new hj1((u45) obj2, this.K, fj0Var);
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
        return ((hj1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        v60 v60Var;
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        oj ojVar = null;
        switch (b) {
            case 0:
                ij1 ij1Var = (ij1) obj3;
                fw4 fw4Var = ij1Var.d;
                LinkedHashSet linkedHashSet = ij1Var.m;
                fw4 fw4Var2 = ij1Var.h;
                fw4 fw4Var3 = ij1Var.j;
                boolean z2 = this.K;
                if (!z2) {
                    mu0.V(obj);
                    fw4Var2.i(null, Boolean.TRUE);
                    fw4Var3.h(null);
                    boolean booleanValue = ((Boolean) ((fw4) ij1Var.c.g0.I).getValue()).booleanValue();
                    kq5 kq5Var = ij1Var.b;
                    long j = ij1Var.l;
                    this.J = booleanValue;
                    this.K = true;
                    Object j2 = kq5Var.j(j, this);
                    if (j2 != el0Var) {
                        obj2 = j2;
                        z = booleanValue;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z = this.J;
                    mu0.V(obj);
                    obj2 = ((h54) obj).I;
                }
                if (!(obj2 instanceof g54)) {
                    uj3 uj3Var = (uj3) obj2;
                    List list = (List) uj3Var.I;
                    long longValue = ((Number) uj3Var.J).longValue();
                    if (z) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            Aweme aweme = (Aweme) obj4;
                            if (aweme.getVideo().getWidth() >= aweme.getVideo().getHeight()) {
                                arrayList.add(obj4);
                            }
                        }
                        list = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list) {
                        Aweme aweme2 = (Aweme) obj5;
                        if (aweme2.getAwemeId().length() <= 0 || !linkedHashSet.contains(aweme2.getAwemeId())) {
                            arrayList2.add(obj5);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj6 = arrayList2.get(i);
                            i++;
                            Aweme aweme3 = (Aweme) obj6;
                            if (aweme3.getAwemeId().length() > 0) {
                                linkedHashSet.add(aweme3.getAwemeId());
                            }
                        }
                        fw4Var.i(null, o70.f1((Collection) fw4Var.getValue(), arrayList2));
                    } else if (((List) fw4Var.getValue()).isEmpty()) {
                        fw4Var3.i(null, "暂无关注视频，请确认已关注其他用户");
                    }
                    ij1Var.l = longValue;
                }
                Throwable a = h54.a(obj2);
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "加载失败";
                    }
                    fw4Var3.i(null, message);
                }
                fw4Var2.i(null, Boolean.FALSE);
                break;
            default:
                u45 u45Var = (u45) obj3;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    boolean z4 = this.K;
                    if (!d65.c(u45Var.l().b)) {
                        ojVar = fb4.q(u45Var.l());
                        if (z4) {
                            int e = d65.e(u45Var.l().b);
                            u45Var.c.invoke(u45.b(u45Var.l().a, ui4.c(e, e)));
                            u45Var.r(ks1.I);
                        }
                    }
                    if (ojVar != null && (v60Var = u45Var.g) != null) {
                        u60 W = a5.W(ojVar);
                        this.J = true;
                        ((ca) v60Var).a(W);
                        if (wd5Var == el0Var) {
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(ij1 ij1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = ij1Var;
    }
}

package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a40 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(fj0 fj0Var, tm1 tm1Var, a74 a74Var, boolean z) {
        super(2, fj0Var);
        this.L = a74Var;
        this.K = z;
        this.M = tm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                a40 a40Var = new a40(this.K, (ki1) obj2, fj0Var);
                a40Var.L = obj;
                return a40Var;
            case 1:
                return new a40((f50) this.L, (String) obj2, fj0Var);
            case 2:
                return new a40(fj0Var, (tm1) obj2, (a74) this.L, this.K);
            default:
                return new a40((t33) this.L, this.K, (vs3) obj2, fj0Var);
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
        return ((a40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.M;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.L;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (!this.K) {
                        this.L = dl0Var;
                        this.J = true;
                        if (rt0.n(100L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a((ki1) obj3);
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
            case 1:
                String str = (String) obj3;
                f50 f50Var = (f50) this.L;
                fw4 fw4Var = f50Var.d;
                boolean z3 = this.K;
                if (!z3) {
                    mu0.V(obj);
                    boolean booleanValue = ((Boolean) ((fw4) f50Var.c.g0.I).getValue()).booleanValue();
                    int i = j42.c(str, "") ? 15 : 10;
                    kq5 kq5Var = f50Var.b;
                    this.J = booleanValue;
                    this.K = true;
                    Object s = kq5Var.s(i, this, str);
                    if (s == el0Var) {
                        break;
                    } else {
                        obj2 = s;
                        z = booleanValue;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z = this.J;
                    mu0.V(obj);
                    obj2 = ((h54) obj).I;
                }
                ArrayList s1 = o70.s1((Collection) fw4Var.getValue());
                int size = s1.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj4 = s1.get(i3);
                        i3++;
                        if (!j42.c(((b50) obj4).b, str)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    if (!(obj2 instanceof g54)) {
                        List list = (List) obj2;
                        if (z) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : list) {
                                Aweme aweme = (Aweme) obj5;
                                if (aweme.getVideo().getWidth() >= aweme.getVideo().getHeight()) {
                                    arrayList.add(obj5);
                                }
                            }
                            list = arrayList;
                        }
                        b50 b50Var = (b50) s1.get(i2);
                        ArrayList f1 = o70.f1(b50Var.c, list);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = f1.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj6 = f1.get(i4);
                            i4++;
                            if (hashSet.add(((Aweme) obj6).getAwemeId())) {
                                arrayList2.add(obj6);
                            }
                        }
                        s1.set(i2, b50.a(b50Var, arrayList2, false, null, 19));
                    }
                    Throwable a = h54.a(obj2);
                    if (a != null) {
                        b50 b50Var2 = (b50) s1.get(i2);
                        s1.set(i2, b50.a(b50Var2, null, false, hf1.w("加载失败: ", a.getMessage()), 7));
                        fw4 fw4Var2 = f50Var.i;
                        String str2 = "频道[" + b50Var2.a + "]加载失败";
                        fw4Var2.getClass();
                        fw4Var2.i(null, str2);
                    }
                    fw4Var.getClass();
                    fw4Var.i(null, s1);
                    break;
                }
                break;
            case 2:
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    a74 a74Var = (a74) this.L;
                    boolean z5 = this.K;
                    bn0 bn0Var = new bn0(null, (tm1) obj3, a74Var, z5);
                    this.J = true;
                    Object q = a74Var.q(z5, bn0Var, this);
                    if (q == el0Var) {
                        break;
                    }
                }
                break;
            default:
                boolean z6 = this.J;
                if (z6) {
                    if (z6) {
                        mu0.V(obj);
                        break;
                    } else {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    mu0.V(obj);
                    t33 t33Var = (t33) this.L;
                    vs3 vs3Var = (vs3) obj3;
                    c32 us3Var = this.K ? new us3(vs3Var) : new ws3(vs3Var);
                    this.J = true;
                    if (t33Var.a(us3Var, this) == el0Var) {
                        break;
                    }
                }
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(f50 f50Var, String str, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = f50Var;
        this.M = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(t33 t33Var, boolean z, vs3 vs3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = t33Var;
        this.K = z;
        this.M = vs3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(boolean z, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.M = ki1Var;
    }
}

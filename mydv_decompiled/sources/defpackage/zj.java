package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zj extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public boolean K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(boolean z, List list, t43 t43Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 3;
        this.K = z;
        this.M = list;
        this.O = t43Var;
        this.N = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.O;
        Object obj4 = this.M;
        switch (b) {
            case 0:
                byte b2 = 0;
                zj zjVar = new zj(b2, fj0Var, (sb4) obj4, (ki1) obj2, (ki1) obj3, this.K);
                zjVar.L = obj;
                return zjVar;
            case 1:
                return new zj((byte) 1, fj0Var, (String) obj4, (Context) obj2, (s33) obj3, this.K);
            case 2:
                return new zj((f50) this.L, (String) obj4, (List) obj2, (bo) obj3, fj0Var);
            default:
                zj zjVar2 = new zj(this.K, (List) obj4, (t43) obj3, (ki1) obj2, fj0Var);
                zjVar2.L = obj;
                return zjVar2;
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
        return ((zj) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        Object b;
        s33 s33Var;
        Object obj2;
        boolean z;
        int i;
        byte b2 = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        el0 el0Var = el0.I;
        Object obj5 = this.O;
        switch (b2) {
            case 0:
                boolean z2 = this.K;
                dl0 dl0Var = (dl0) this.L;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    this.L = dl0Var;
                    this.J = true;
                    if (rt0.n(100L, this) == el0Var) {
                        break;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    if (z2 && ((sb4) obj4).f.h() > 0) {
                        ki1.a((ki1) obj3);
                    } else if (z2) {
                        ki1.a((ki1) obj5);
                    }
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
            case 1:
                Context context = (Context) obj3;
                s33 s33Var2 = (s33) obj5;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    if (this.K && (str = (String) obj4) != null) {
                        ri0 ri0Var = ri0.a;
                        ImageLoader imageLoader = SingletonImageLoader.get(context);
                        this.L = s33Var2;
                        this.J = true;
                        b = ri0Var.b(imageLoader, context, str, this);
                        if (b == el0Var) {
                            break;
                        } else {
                            s33Var = s33Var2;
                        }
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    s33 s33Var3 = (s33) this.L;
                    mu0.V(obj);
                    s33Var = s33Var3;
                    b = obj;
                }
                Integer num = (Integer) b;
                if (num != null) {
                    ((gk3) s33Var).i(num.intValue());
                    qg5.j = ((gk3) s33Var2).h();
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj4;
                f50 f50Var = (f50) this.L;
                boolean z5 = this.K;
                if (!z5) {
                    mu0.V(obj);
                    boolean booleanValue = ((Boolean) ((fw4) f50Var.c.g0.I).getValue()).booleanValue();
                    int i2 = str2.equals("") ? 15 : 10;
                    kq5 kq5Var = f50Var.b;
                    this.J = booleanValue;
                    this.K = true;
                    Object s = kq5Var.s(i2, this, str2);
                    if (s == el0Var) {
                        break;
                    } else {
                        obj2 = s;
                        z = booleanValue;
                    }
                } else if (!z5) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z = this.J;
                    mu0.V(obj);
                    obj2 = ((h54) obj).I;
                }
                List list = (List) obj3;
                bo boVar = (bo) obj5;
                if (!(obj2 instanceof g54)) {
                    List list2 = (List) obj2;
                    if (z) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list2) {
                            Aweme aweme = (Aweme) obj6;
                            if (aweme.getVideo().getWidth() >= aweme.getVideo().getHeight()) {
                                arrayList.add(obj6);
                            }
                        }
                        list2 = arrayList;
                    }
                    ArrayList s1 = o70.s1((Collection) f50Var.d.getValue());
                    int size = s1.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj7 = s1.get(i4);
                            i4++;
                            if (!j42.c(((b50) obj7).b, str2)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        b50 b50Var = (b50) s1.get(i3);
                        ArrayList f1 = o70.f1(b50Var.c, list2);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = f1.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj8 = f1.get(i5);
                            i5++;
                            if (hashSet.add(((Aweme) obj8).getAwemeId())) {
                                arrayList2.add(obj8);
                            }
                        }
                        i = 0;
                        s1.set(i3, b50.a(b50Var, arrayList2, false, null, 59));
                        fw4 fw4Var = f50Var.d;
                        fw4Var.getClass();
                        fw4Var.i(null, s1);
                    } else {
                        i = 0;
                    }
                    ArrayList f12 = o70.f1(list, list2);
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = f12.size();
                    while (i < size3) {
                        Object obj9 = f12.get(i);
                        i++;
                        if (hashSet2.add(((Aweme) obj9).getAwemeId())) {
                            arrayList3.add(obj9);
                        }
                    }
                    boVar.invoke(arrayList3);
                    break;
                }
                break;
            default:
                t43 t43Var = (t43) obj5;
                dl0 dl0Var2 = (dl0) this.L;
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    float f = cb0.a;
                    if (!((Boolean) t43Var.getValue()).booleanValue() && !this.K && !((List) obj4).isEmpty()) {
                        t43Var.setValue(Boolean.TRUE);
                        this.L = dl0Var2;
                        this.J = true;
                        if (rt0.n(80L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z6) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    ki1.a((ki1) obj3);
                    break;
                } catch (Throwable unused2) {
                    return wd5Var;
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(f50 f50Var, String str, List list, bo boVar, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.L = f50Var;
        this.M = str;
        this.N = list;
        this.O = boVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj(byte b, fj0 fj0Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, fj0Var);
        this.I = b;
        this.K = z;
        this.M = obj;
        this.N = obj2;
        this.O = obj3;
    }
}

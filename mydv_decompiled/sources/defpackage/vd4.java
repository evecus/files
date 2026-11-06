package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vd4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ wd2 K;
    public final /* synthetic */ List L;
    public final /* synthetic */ int M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ rm1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd4(wd2 wd2Var, List list, int i, boolean z, boolean z2, rm1 rm1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = wd2Var;
        this.L = list;
        this.M = i;
        this.N = z;
        this.O = z2;
        this.P = rm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new vd4(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 0);
            default:
                return new vd4(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 1);
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
        return ((vd4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        final int i = this.M;
        final wd2 wd2Var = this.K;
        el0 el0Var = el0.I;
        final byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    final byte b3 = 0;
                    final List list = this.L;
                    t03 t03Var = new t03(o7.p(wi4.w(new rm1() { // from class: rd4
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b4 = b3;
                            Integer num = null;
                            int i2 = i;
                            List list2 = list;
                            wd2 wd2Var2 = wd2Var;
                            switch (b4) {
                                case 0:
                                    Iterator it = wd2Var2.g().n.iterator();
                                    if (it.hasNext()) {
                                        Integer valueOf = Integer.valueOf(((md2) it.next()).a);
                                        while (true) {
                                            num = valueOf;
                                            while (it.hasNext()) {
                                                valueOf = Integer.valueOf(((md2) it.next()).a);
                                                if (num.compareTo(valueOf) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    return Boolean.valueOf((num != null ? num.intValue() : -1) >= list2.size() - (i2 * 2));
                                default:
                                    Iterator it2 = wd2Var2.g().n.iterator();
                                    if (it2.hasNext()) {
                                        Integer valueOf2 = Integer.valueOf(((md2) it2.next()).a);
                                        while (true) {
                                            num = valueOf2;
                                            while (it2.hasNext()) {
                                                valueOf2 = Integer.valueOf(((md2) it2.next()).a);
                                                if (num.compareTo(valueOf2) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    return Boolean.valueOf((num != null ? num.intValue() : -1) >= list2.size() - (i2 * 2));
                            }
                        }
                    })), (byte) 1);
                    sd4 sd4Var = new sd4(list, this.N, this.O, this.P, (byte) 0);
                    this.J = true;
                    if (t03Var.collect(sd4Var, this) == el0Var) {
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
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    final List list2 = this.L;
                    t03 t03Var2 = new t03(o7.p(wi4.w(new rm1() { // from class: rd4
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b4 = b2;
                            Integer num = null;
                            int i2 = i;
                            List list22 = list2;
                            wd2 wd2Var2 = wd2Var;
                            switch (b4) {
                                case 0:
                                    Iterator it = wd2Var2.g().n.iterator();
                                    if (it.hasNext()) {
                                        Integer valueOf = Integer.valueOf(((md2) it.next()).a);
                                        while (true) {
                                            num = valueOf;
                                            while (it.hasNext()) {
                                                valueOf = Integer.valueOf(((md2) it.next()).a);
                                                if (num.compareTo(valueOf) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    return Boolean.valueOf((num != null ? num.intValue() : -1) >= list22.size() - (i2 * 2));
                                default:
                                    Iterator it2 = wd2Var2.g().n.iterator();
                                    if (it2.hasNext()) {
                                        Integer valueOf2 = Integer.valueOf(((md2) it2.next()).a);
                                        while (true) {
                                            num = valueOf2;
                                            while (it2.hasNext()) {
                                                valueOf2 = Integer.valueOf(((md2) it2.next()).a);
                                                if (num.compareTo(valueOf2) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    return Boolean.valueOf((num != null ? num.intValue() : -1) >= list22.size() - (i2 * 2));
                            }
                        }
                    })), (byte) 5);
                    sd4 sd4Var2 = new sd4(list2, this.N, this.O, this.P, (byte) 4);
                    this.J = true;
                    if (t03Var2.collect(sd4Var2, this) == el0Var) {
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
        }
        return el0Var;
    }
}
